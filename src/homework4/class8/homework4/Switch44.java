package homework4.class8.homework4;

import java.util.Scanner;

public class Switch44 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carOrigin= scanner.nextLine();
        switch (carOrigin) {
            case "BMW":
                System.out.println("Yor favorite car "+"german car");
                    String name=scanner.nextLine();
                System.out.println("Yor favorite car "+"BMW");
                break;
            case "Toyota":
                System.out.println(" japanese car");
                break;
            case "Maserati":
                System.out.println("italian car");
                break;
            default:
                System.out.println("unknown" );

        }
    }
}


