package class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please");
        char gender=scanner.next().charAt(0);



        switch (gender){

            case 'f':
                System.out.println("Famale");
                break;
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
            case 'm':
                System.out.println("male");
                break;
            default:
                System.out.println("not spicified");
        }

    }
}
