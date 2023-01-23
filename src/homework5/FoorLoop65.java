package homework5;

import java.util.Scanner;

public class FoorLoop65 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int z = inp.nextInt();
        //write your code below
        for (int i = z - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print("In:");
        int l = inp.nextInt();
        for (int j = l - 1; j >= 0; j--) {
            System.out.print(j + " ");
        }
        System.out.print("In:");
        int m = inp.nextInt();
        for (int j = m - 1; j >= 0; j--) {
            System.out.print(j + " ");
        }
    }
}


