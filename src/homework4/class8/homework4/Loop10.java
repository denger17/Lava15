package homework4.class8.homework4;

import java.util.Scanner;

public class Loop10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the starting number");
        int a = input.nextInt();
        System.out.println("Please enter the ending number");
        int b = input.nextInt();
        int evensum= 0, oddsum =0;
        for (int i = a; i <=b; i++) {
            if (i%2==0) {
                evensum += i;
            } else if (i%2!=0) {
                oddsum+=1;


            }
        }
        System.out.println("sum of even number:"+evensum);
        System.out.println("Sum of add number"+oddsum);
        }

    }


