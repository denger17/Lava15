package homework2;

import java.util.Scanner;

public class ScannerhomeW20 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.nextLine();
        System.out.println("Enter your mobile number");
        String number=input.nextLine();
        System.out.println("Enter your age");
        String age=input.nextLine();
        System.out.println("Your name is " +name+ ", your age is " +age+ " and your mobile number is " +number+"");




    }
}
