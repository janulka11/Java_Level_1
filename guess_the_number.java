package lesson3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class guess_the_number {
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            int nxt = random.nextInt(10);
            System.out.println("Угдай число  от 0 до 9 с трех попыток");
            for (int i = 3; i > 0; i--) {
                System.out.println ("Введите число");
                int question = scanner.nextInt();
                if (question == nxt ) {
                    System.out.println("Вы угадали число, победа!");
                    break;
                }
                System.out.println(question > nxt ? "Введенное число больше " : "Введенное число меньше ");
                System.out.println ((i-1 >0)  ? " у вас осталось " + (i-1) + " попытки." : "Попытки закончились, вы проиграли.");
            }
            System.out.println("Повторить игру еще раз? 6(1 – повторить, 0 – нет)");
        }
        while (scanner.nextInt() == 1);


    }

}




