package homework5;

public class NestedForLoops69 {
    public static void main(String[] args) {
        int rows = 7;
        int row = 6;

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {

                for (int z = 1; z <= row; ++z) {
                    for (int k = 1; k <= z; ++k) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }

            }
        }
    }
}




