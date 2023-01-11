package class6;

public class LogicaLNotDemo {
    public static void main(String[] args) {


        System.out.println(false);
        System.out.println(!false);
        boolean condition=!true;
        System.out.println(condition);


        String password="gfdhshrtjr";
        System.out.println(password.equals("pass123"));
        if (!password.equals("Pass123")){
            System.out.println("Wrong pasword");

        }

        boolean isRaining=true;

        if (!isRaining) {
            System.out.println("Lets go for a walk");
        }else {
            System.out.println("let take the umbrella");
        }

    }
}
