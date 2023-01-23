package homework4.class8.homework4;

import java.util.Scanner;

public class Switch43 {
    public static void main(String[] args) {
        boolean condition=true;
        Scanner scanner=new Scanner(System.in);
        int number=12;
        while (condition){
            System.out.println("Input a number between 1-12");
            int userInput= scanner.nextInt();
            if (userInput>number) {
                System.out.println("Invalid");
            } else if (userInput<number) {
                System.out.println("January");

            }else {
                System.out.println("December");
                condition=false;




            }


        }
        }
    }


