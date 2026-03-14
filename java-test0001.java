public class Pattern {
    public static void main(String[] args) {

        int n = 5;

        // Upper part
        for (int i = 1; i <= n; i++) {

            // leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            // inner spaces
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {

            // leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // first star
            System.out.print("*");

            // inner spaces
            if (i > 1) {
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
