package homework6;

public class StringHomework2 {
    public static void main(String[] args) {
        //Create a String and print it in reverse order (Sunday → yadnuS).
                String day = "Sunday";
                String reversedString = "";

                for(int i = day.length()-1; i>=0; i--){
                    reversedString = reversedString + day.charAt(i);
                }

                System.out.print("The reversed string of the '"+day+"' is: " );
                System.out.println(reversedString);
            }
        }
