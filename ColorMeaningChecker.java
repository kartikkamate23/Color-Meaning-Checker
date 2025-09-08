import java.util.Scanner;
public class ColorMeaningChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter a color name: ");
            String color = sc.nextLine().toLowerCase();

            switch (color) {
                case "red":
                    System.out.println("Red → Passion, Energy, Confidence");
                    break;
                case "blue":
                    System.out.println("Blue → Calmness, Trust, Intelligence");
                    break;
                case "green":
                    System.out.println("Green → Growth, Balance, Harmony");
                    break;
                case "yellow":
                    System.out.println("Yellow → Happiness, Optimism, Creativity");
                    break;
                case "black":
                    System.out.println("Black → Power, Mystery, Elegance");
                    break;
                case "white":
                    System.out.println("White → Purity, Simplicity, Peace");
                    break;
                default:
                    System.out.println("Sorry, meaning not found for this color.");
            }

            System.out.print("Do you want to check another color? (yes/no): ");
            choice = sc.nextLine().toLowerCase();
        } while (choice.equals("yes"));

        System.out.println("Thank you for using Color Meaning Checker!");
        sc.close();
    }
}


