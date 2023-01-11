package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);



        System.out.println("Please Enter your age");
        int age= scanner.nextInt();
        System.out.println("your are "+age+" years old");
        System.out.println("Please Enter your weight");
        double weight= scanner.nextDouble();
        System.out.println("you weight is "+weight+ " Kgs");
        System.out.println("Are you hungry");
        boolean hungry= scanner.nextBoolean();
        System.out.println("hungry "+hungry);
        scanner.nextInt();

        //System.out.println("Please enter your gender");
        //char gender=Scanner.next().charAt(0);
        //System.out.println("Your gender is "+gender);//

        System.out.println("Please Enter your name");
        String name= scanner.next();
        System.out.println("Your name is "+name);
        scanner.nextLine();

        System.out.println("Please enter your full name");
        String fullName= scanner.nextLine();
        System.out.println("your full name is "+fullName);

        scanner.close();

        Scanner scanner1=new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter your full name");
        String fullsName= scanner.nextLine();
        System.out.println("your full name is "+fullsName);



    }
}
