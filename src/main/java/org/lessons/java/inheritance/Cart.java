package org.lessons.java.inheritance;
import java.util.Scanner;
import java.util.ArrayList;


public class Cart {

    public static void main(String[] args) {
    	
        //Creo ArrayList Product dove memorizzo i prodotti inseriti.
        ArrayList<Product> Cart = new ArrayList <>();

        // Inizializzo lo scanner
        Scanner cart = new Scanner(System.in);

        // Variabile per fermare il ciclo
        boolean isCartFull;

        do {
            // Dichiaro product e la utilizzo per memorizzare il prodotto nel carrello.
            String product;
            System.out.println("Che tipo di prodotto vuoi inserire nel carrello?");
            System.out.print("Scegli tra Smartphone / TV / Cuffie : ");
            product = cart.nextLine().toLowerCase();

            // Dichiaro la variabile che riutilizzo per ogni Input. Effettuo parse quando necessario per il tipo.
            String userInput;

            switch (product) {
                case "smartphone":
                	Smartphone smartphone = new Smartphone();
                    // Product Name
                    System.out.print("Inserisci il nome del prodotto : ");
                    userInput = cart.nextLine();
                    smartphone.setProductName(userInput);

                    // Brand Name
                    System.out.print("Inserisci il Brand : ");
                    userInput = cart.nextLine();
                    smartphone.setBrandName(userInput);

                    // Memory size GB
                    System.out.print("Inserisci la capacità :");
                    userInput = cart.nextLine();
                    smartphone.setMemorySize(Integer.parseInt(userInput));

                    // Price
                    System.out.print("Inserisci il prezzo : ");
                    userInput = cart.nextLine();
                    smartphone.setPrice(Double.parseDouble(userInput));
                    System.out.println("\n");
                    
                    //Insert into ArrayList
                    Cart.add(smartphone);
                    break;

                case "tv":
                	TV tv = new TV();
                    // Product Name
                    System.out.print("Inserisci il nome del prodotto : ");
                    userInput = cart.nextLine();
                    tv.setProductName(userInput);

                    // Brand Name
                    System.out.print("Inserisci il Brand : ");
                    userInput = cart.nextLine();
                    tv.setBrandName(userInput);

                    // Screen Size
                    System.out.print("Inserisci la dimensione dello schermo : ");
                    userInput = cart.nextLine();
                    tv.setScreenSize(Integer.parseInt(userInput));

                    // Smart
                    System.out.print("Smart : ");
                    userInput = cart.nextLine();
                    tv.setSmart(Boolean.parseBoolean(userInput));

                    // Price
                    System.out.print("Inserisci il prezzo : ");
                    userInput = cart.nextLine();
                    tv.setPrice(Double.parseDouble(userInput));
                    System.out.println("\n");
                    
                    //Insert into ArrayList
                    Cart.add(tv);
                    break;

                case "cuffie":
                	Headset headset = new Headset();
                    // Product Name
                    System.out.print("Inserisci il nome del prodotto : ");
                    userInput = cart.nextLine();
                    headset.setProductName(userInput);

                    // Brand Name
                    System.out.print("Inserisci il Brand : ");
                    userInput = cart.nextLine();
                    headset.setBrandName(userInput);

                    // Color
                    System.out.print("Inserisci il colore : ");
                    userInput = cart.nextLine();
                    headset.setColor(userInput);

                    // is Wireless?
                    System.out.print("Wireless : ");
                    userInput = cart.nextLine();
                    headset.setWireless(Boolean.parseBoolean(userInput));

                    // Price
                    System.out.println("Inserisci il prezzo : ");
                    userInput = cart.nextLine();
                    headset.setPrice(Double.parseDouble(userInput));
                    System.out.println("\n");
                    
                    //Insert into ArrayList
                    Cart.add(headset);
                    break;

                default:
                    System.out.print("Prodotto non valido. Riprova" +"\n"+"\n");
            }

            System.out.print("Vuoi aggiungere altri prodotti? si/no : " + "\n");
            isCartFull = cart.nextLine().equalsIgnoreCase("no");

        } while (!isCartFull);
        
        //Itero sull'ArrayList e utilizzo il metodo getInfo() per recuperare le informazioni del singolo elemento.
        for (Product element : Cart) {
        	element.getInfo();
        }
        
        cart.close();
    }
}
