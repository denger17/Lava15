package class7;

import java.util.Scanner;

public class doWhileLoops1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number=5;
        do {
            System.out.println("Please Enter a number");
            number = scanner.nextInt();
        }while (number!=5);

        int number2=0;
        while (number2!=5){
            System.out.println("Please Enter a number : ");
            number2 = scanner.nextInt();
        }



        }
    }

