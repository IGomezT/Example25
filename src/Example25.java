import java.util.Scanner;

public class Example25 {
    public static void main(String[] argv) {
        int num;


        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Write a number");
        num = inputValue.nextInt();

        for(int i =1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = "+ num * i);

        }

    }
}
