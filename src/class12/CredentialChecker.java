package class12;

import java.util.Scanner;

public class CredentialChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your usersName");
        String userName=scanner.next();
        System.out.println("Please enter your password");
        String password=scanner.next();
        System.out.println("Please Enter your password again");
        String confirmPassword=scanner.next();
        if (userName.isEmpty()||password.isEmpty()){
            System.out.println("UserName and Password cannot be empty");
        } else if (password.length()<8) {
            System.out.println("Password is to short");
        } else if (password.contains(userName)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirmPassword)) {
            System.out.println("Password do not match");
        } else{
            System.out.println("your Pass god ");

        }

    }

    }



