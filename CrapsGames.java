
import java.util.Random;
import java.util.Scanner;

    public class CrapsGames {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            String playAgain;

            do {
                int roll = rollDice(random);
                System.out.println("Primera Jugada: " + roll);

                if (roll == 7 || roll == 11) {
                    System.out.println("Bien parce, ganaste");
                } else if (roll == 2 || roll == 3 || roll == 12) {
                    System.out.println("NO parce, perdiste    Eso es Craps.");
                } else {
                    int point = roll;
                    System.out.println("Tu punto es: " + point);
                    while (true) {
                        roll = rollDice(random);
                        System.out.println("Nueva tirada: " + roll);
                        if (roll == point) {
                            System.out.println("¡Parce hiciste tu punto! ¡Ganaste!");
                            break;
                        } else if (roll == 7) {
                            System.out.println("Parce, salió un 7. ¡Perdiste!");
                            break;
                        }
                    }
                }

                System.out.print("¿oyee, te quieres rendir tan rapido? (si, ya no quiero jugar mas/no, ni en chiste): ");
                playAgain = scanner.next();
            }
            while (playAgain.equalsIgnoreCase("no"));

            System.out.println("Parce, Dios le pague por jugar. ¡Hasta la próxima!");
            scanner.close();
        }

        private static int rollDice(Random random) {
            return random.nextInt(6) + 1 + random.nextInt(6) + 1;
        }
    }


