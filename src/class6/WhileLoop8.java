package class6;

public class WhileLoop8 {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 16) {
            if (number % 5 != 0) {
                System.out.println(number);
            }
            number++;
        }
        System.out.println("**********");

        int number2 = 1;
        while (number2 <= 16) {

            if (number2 % 5!=0) {
                System.out.println(number2);

            }
            number2++;
        }
    }
}

