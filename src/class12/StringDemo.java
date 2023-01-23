package class12;

public class StringDemo {
    public static void main(String[] args) {
        String strObj=new String("Java");
        String strobj2="Java";
        System.out.println(strobj2.length());
        String str="Banana ";
        int len=str.length();
        System.out.println(len);
        String name="RHamid poya";
        if (name.length()>10){
            System.out.println("Name cant be more than 10 letters");
        }
    }
}
