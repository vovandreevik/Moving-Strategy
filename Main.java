import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a transportation strategy (walk, ride, drive, fly) or 'exit' to quit:");
            String strategy = scanner.nextLine();

            switch (strategy.toLowerCase()) {
                case "walk":
                    hero.setMovingStrategy(new Walking());
                    break;
                case "ride":
                    hero.setMovingStrategy(new HorseRiding());
                    break;
                case "drive":
                    hero.setMovingStrategy(new CarDriving());
                    break;
                case "fly":
                    hero.setMovingStrategy(new PlaneFlying());
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid strategy. Please try again.");
                    continue;
            }
            hero.move();
        }
    }
}