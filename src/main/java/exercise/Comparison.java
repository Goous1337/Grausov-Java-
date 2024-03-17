package exercise;

import java.util.Scanner;

public class Comparison {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        scanner.close();

        System.out.println(firstNumber+secondNumber +": Сложение");
        System.out.println(firstNumber-secondNumber +": Вычитание");
        System.out.println(firstNumber/secondNumber +": Деление");
        System.out.println(firstNumber*secondNumber +": Умножение");

        if (firstNumber>secondNumber){
            System.out.println("Первое число больше второго числа");
        }else if (firstNumber<secondNumber){
            System.out.println("Первое число меньше второго числа");
        }else if (firstNumber == secondNumber){
            System.out.println("Числа равны");
        }else{
            System.out.println("Числа не равны");
        }
    }
}
