package class6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("Please enter three Numbers");
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();

        if(number1>number2&&number1>number3) {
            System.out.println("the Largest Number is " + number1);
        } else if (number2>number3&& number2>number1) {
            System.out.println("the Largest Numberis " + number2);
        } else if (number3>number2&&number3>number1) {
            System.out.println("large number is "+ number3);

        }


    }
    }

