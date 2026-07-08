package Patterns;

public class Patterns {
    public static void main(String[] args) {

        // 1
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // leave one line
        System.out.println("--------------------------------");

        // 2
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        // leave one line
        System.out.println("--------------------------------");

        // 3(rhombus)
        for (int row = 1; row <= 5; row++) {
            // print spaces
            for (int col = 1; col <= 5 - row; col++) {
                System.out.print(" ");
            }
            // print stars
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("--------------------------------");

        // 4(inverted right angle triangle)
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5 - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("--------------------------------");

        // 5 pyramid
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5 - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        // 6 inverted pyramid
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * (5 - row) + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        // hollow square
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                if (row == 1 || row == 5 || col == 1 || col == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        // hollow right angle triangle
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                if (col == 1 || col == row || row == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        // hollow pyramid
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5 - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1 || row == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        // hollow inverted pyramid
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * (5 - row) + 1; col++) {
                if (col == 1 || col == 2 * (5 - row) + 1 || row == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        // diamond
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5 - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= 5; row++) {
            if (row == 1) {
                continue;
            }
            for (int col = 1; col <= row - 1; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * (5 - row) + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        // hollow diamond
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5 - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1 || col == 2 * row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = 1; row <= 5 - 1; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            if (row == 5 - 1) {
                System.out.print("* ");
            } else {
                System.out.print("* ");

                for (int col = 1; col <= 2 * (5 - row) - 3; col++) {
                    System.out.print("  ");
                }

                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("--------------------------------");

        // butterfly
        int k = 5;
        // 1st half
        for (int row = 1; row <= k; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= 2 * (k - row); col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 2nd half
        for (int row = k; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= 2 * (k - row); col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        // number triangle
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }

        System.out.println("--------------------------------");

        // number triangle with continuous numbers
        int number = 1;
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
