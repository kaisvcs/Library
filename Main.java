import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addAnime(new Anime("Your Name"));

        while (true) {
            printMenu();

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                if ( choice >= 0 && choice <= 3)
                    switch(choice) {
                        case 1:
                            System.out.println("choice 1!");
                            library.displayAnime();
                            break;
                        case 2:
                            System.out.print("Please Enter Title: ");
                            String newTitle = scanner.nextLine();
                            library.addAnime(new Anime(newTitle));
                            break;
                        case 3:
                            System.out.print("Rating Title: ");
                            String rateTitle = scanner.nextLine();

                            Anime animeToRate = library.findBookByTitle(rateTitle);
                            
                            if (animeToRate == null) {
                                System.out.println("Anime not found.");
                            } else {
                                System.out.print("Enter rating (1-10): ");

                                if (scanner.hasNextDouble()) {
                                double rating = scanner.nextDouble();
                                scanner.nextLine(); // clear newline
                                animeToRate.setRating(rating);
                                } else {
                                    System.out.println("Invalid rating.");
                                    scanner.next(); // discard bad input
                                }
                                library.displayAnime();
                            }
                            break;
                        case 0:
                            System.out.println("Exting Library...");
                            return;
                        default:
                            System.out.println("double invalid");
                    }

            } else {
                System.out.println("Invalid input");
                scanner.next();
                continue;
            }
        
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
