package ie.groupproject;

import java.util.Scanner;

public class ProductList {
    private String author;
    private String title;
    static int running = 0;
    static Scanner scanner = new Scanner(System.in);
    String input = null;

    public static void main(String args[]) {

        (new ProductList()).run();

    }

    public void run() {
        while (true) {
            System.out.println("********************Welcome to the Online Book Store!********************");
            System.out.println("              Please Select From The Following Options:               ");
            System.out.println("**********************************************************************");


            System.out.println("1: User Login ");
            System.out.println("0: Exit");
            int option = scanner.nextInt();
            switch (option) {

                case 1:
                    userLogin();
                    break;
                case 0:
                    System.exit(option);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Wrong option, try again.");
            }

        }

    }

    private void userLogin() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your username ");
        String user = keyboard.nextLine();
        System.out.println("Enter your password ");
        String pass = keyboard.nextLine(); // looks at selected file in scan


        if (user.equals("Evan") && pass.equals("12345678")) {
            System.out.println("********************Welcome Home, User!********************");
            System.out.println("              Please Select From The Following Options:               ");
            System.out.println("**********************************************************************");
            System.out.println("1: checkout a book:");
            System.out.println("2: search a book:");
            System.out.println("3: exit library:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    checkOutBook();
                    break;
                case 2:
                    searchBooks("Java");
                    break;
                case 3:
                    shoppingCart();
                    break;
                case 4:
                    System.exit(0);
            }
        } else {
            System.out.print("Try again");
        }
    }

    public void searchBooks(String productCode) {

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        //item myBook = new item();

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter book code: ");
            String bookCode = sc.nextLine();  // read the book code

            // get the book object
            item yourBook = itemDB.getitem(bookCode);

            // display the output
            System.out.println();
            if (yourBook != null) {
                System.out.println("Description: " + yourBook.toString());
                System.out.println("Price:       " + yourBook.getPrice());

                System.out.println(" Press 1: checkout a book:");
                System.out.println(" Press 2: Continue:");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        checkOutBook();
                        break;
                    case 2:
                        searchBooks("Java");
                        break;
                }
            } else {
                System.out.println("No book matches this book code.");
            }

            System.out.println();
            System.out.println("Book count: " + item.getCount() + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");


            choice = sc.nextLine();
            System.out.println();

        }
    }

    public String checkOutBook() {

        searchBooks("Java");
        String Standard = "6.50";
        String international = "10.50";
        String name = "";
        String address = "";
        String shippingCharge = "";

        Scanner user = new Scanner(System.in);

        System.out.println("***********Welcome to check out********");

        while (true) {
            System.out.print("Place your details: ");

            System.out.print("Enter your name : " + name);

}

    }

    public void shoppingCart(){

    }

    }

