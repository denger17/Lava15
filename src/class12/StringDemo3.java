package class12;

public class StringDemo3 {
    public static void main(String[] args) {
        String firstName="Akhter";
        String LastName ="Lava";
        String fullName=firstName+" "+LastName;
        System.out.println(fullName);
        System.out.println(firstName+" "+LastName);
        System.out.println(firstName.concat(" "+ LastName));
    }
}
