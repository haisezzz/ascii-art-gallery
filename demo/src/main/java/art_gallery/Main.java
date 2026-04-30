package art_gallery;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== ASCII ART GALLERY ===");
            System.out.println("1. Skull");
            System.out.println("2. Sword");
            System.out.println("3. Dragon");
            System.out.println("4. Exit");
            System.out.print("Pick one: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1" -> printSkull();
                case "2" -> printSword();
                case "3" -> printDragon();
                case "4" -> running = false;
                default -> System.out.println("Invalid choice, try again.");
            }
        }

        System.out.println("Goodbye!");
    }

    private static void printSkull() {
        System.out.println("""
                
             d$$$$$$,
            $$$$$$$$$k
            $$$´ $$ $$
             `$$$S$$7
               `$.$.$
            

                """);
    }

    private static void printSword() {
        System.out.println("""
                   
                $l
                $l
              $$$SSS
                jk
                jk
                jk
                jk
                jk
                jk
                j

                """);
    }

    private static void printDragon() {
        System.out.println("""


            
                """);
    }
}