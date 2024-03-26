package curso2;

import java.util.Scanner;
import java.util.Random;
public class PrimeiraClasse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int randomNumber = 0;
        int currentTry = 0;
        int attempts = 0;

        randomNumber = new Random().nextInt(100);

        for(int i = 0; attempts < 5; i++) {
            System.out.println("Tente adivinhar o número que gerei!");
            currentTry = reader.nextInt();

            if (currentTry == randomNumber) {
                System.out.println("Parabéns, você adivinhou!!");
                break;
            } else if (currentTry > randomNumber) {
                System.out.println("O número é menor que " + currentTry);
            } else {
                System.out.println("O número é maior que "  + currentTry);
            }

            attempts++;
        }

        if (attempts == 5) {
            System.out.println("Infelizmente você não acertou.");
        }

    }
}