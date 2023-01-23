package class12;

public class Class {
    public static void main(String[] args) {


        String[][] contries = {{"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Peru", "Columbia", "Chile"},
                {"Germany", "United", "Kingdom", "France", "Spain"},
                {"China", "India", "Japan", "Russia"},

        };
        int counter=0;
        for (int i = 0; i < contries.length; i++) {
            for (int j = 0; j < contries[i].length; j++) {
                System.out.print(contries[i][j]+" ");
                counter++;

            }
            System.out.println();

        }
        System.out.println("Total countries"+counter);
    }
}