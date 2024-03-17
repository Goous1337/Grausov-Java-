package exercise;

import java.util.Scanner;

public class Comparison {
    public static void main (String [] args){

        Scanner s =  new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int A = s.nextInt();
        System.out.println("Введите второе число: ");
        int B = s.nextInt();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(B/A);
        System.out.println(A*B);

        String a = "JAVA";
        String b = "java";

        if (A>B){
            System.out.println("Число А больше числа Б");
        }else{
            System.out.println("Число А меньше числа Б ");
        }

        if (a.equalsIgnoreCase(b)){
            System.out.println("Строки идентичны");
        }else{
            System.out.println("Строки неидентичны");
        }
    }
}
