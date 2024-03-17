package exercise;

public class Array {

    public static void main(String [] args){

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a;
        for (int j : array) {
            if ((j % 2) == 0) {
                a = j;
                System.out.println(a);
            }
        }
    }
}
