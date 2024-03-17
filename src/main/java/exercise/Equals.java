package exercise;

import java.util.Scanner;

public class Equals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String firstWord  = scanner.next();
        System.out.println("Введите второе слово: ");
        String secondWord = scanner.next();
        scanner.close();

        if (firstWord.equals(secondWord)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }
    }
}
