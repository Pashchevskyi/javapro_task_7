package ua.ithillel.lms;

import ua.ithillel.lms.javapro.pavlopashchevskyi.task7.StringWizard;
import ua.ithillel.lms.javapro.pavlopashchevskyi.task7.WordPlayer;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //subtasks 2-5
        StringWizard sw = new StringWizard();

        System.out.println("findSymbolOccurance() example");
        String testStr = "Слава Україні";
        int times = sw.findSymbolOccurance(testStr, 'а');
        System.out.println(times);
        System.out.println();

        String testStrSource = "Apollo";
        String testStrTarget = "pollo";
        System.out.println("findWordPosition() example #1");
        System.out.println(sw.findWordPosition(testStrSource, testStrTarget));
        System.out.println("findWordPosition() example #2");
        System.out.println(sw.findWordPosition("Apple", "Plant"));

        System.out.println("stringReverse() example");
        System.out.println(sw.stringReverse("Hello"));
        System.out.println();

        System.out.println("isPalindrome() example #1");
        System.out.println(sw.isPalindrome("ERE"));
        System.out.println("isPalindrome() example #2");
        System.out.println(sw.isPalindrome("Allo"));
        System.out.println();

        //subtask 6
        while (true) {
            System.out.println("Будь ласка, введіть англійською слово, яке я загадав, або q для виходу ");
            System.out.println("(використовуйте тільки маленькі латинські літери): ");
            Scanner sc = new Scanner(System.in);
            try {
                String userWord = sc.nextLine();
                if (userWord.equals("Q") || userWord.equals("q")) {
                    System.out.println("До побачення!");
                    System.exit(0);
                }
                WordPlayer wp = new WordPlayer();
                StringBuilder sb = new StringBuilder();
                while (!wp.isWordGuessed(userWord)) {
                    sb.delete(0, sb.length());
                    sb.append("Ви не вгадали. Маленька підказка:\n");
                    sb.append(wp.getHint());
                    sb.append("\nБудь ласка, введіть ще раз: ");
                    System.out.println(sb.toString());
                    userWord = sc.nextLine();
                }
                sb.delete(0, sb.length());
                sb.append("Ви ввели слово: \"");
                sb.append(userWord);
                sb.append("\". І Ви вгадали! Вітаю Вас!\nЗіграємо ще раз?");
                System.out.println(sb.toString());
                userWord = sc.nextLine();
                if (userWord.equals("n") || userWord.equals("N") || userWord.equals("н") || userWord.equals("Н")) {
                    System.out.println("Дякую за цікаву гру. До побачення!");
                    System.exit(0);
                }
            } catch (NoSuchElementException | IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
