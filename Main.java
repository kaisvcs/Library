import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addAnime( "Your Name");

        while (true) {
            printMenu();

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                if ( choice >= 0 && choice <= 3)
                    switch(choice) {
                        case 1:
                            System.out.println("choice 1!");
                            library.displayAnime();
                            break;
                        default:
                            System.out.println("double invalid");
                    }

            } else {
                System.out.println("Invalid input");
                scanner.next();
                continue;
            }

            return;
        }
    }
    public static void printMenu() {
        System.out.println("\nLibrary Menu: ");
        System.out.println("1. Display List");
        System.out.println("2. Add a Title");
        System.out.println("3. Rate a Title");
        System.out.println("0. Exit");
        System.out.print("Please enter an option 0-3: ");
    }
}
