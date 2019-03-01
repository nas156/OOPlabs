import java.util.Scanner;
public class Labor2 {
        public static void main(String[] args) {
            boolean flag=false;
            int a=0;
            final double[][] c = {
                    {1, 2, 3, 4, 5},
                    {1, 2, 3, 4, 5},
                    {1, 2, 3, 4, 5},
                    {1, 2, 3, 4, 5}};
            double[][] z= new double[c.length][c[0].length];
            Scanner scanner = new Scanner(System.in);
            while (!flag){
                System.out.println("Enter a: ");
                if (scanner.hasNextInt()) {
                    a = scanner.nextInt();
                    flag = true;
                }
                else {
                    System.out.println("You have to enter an int");
                    scanner.next();
                }
            }
            System.out.println("\nMatrix A:");
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    System.out.print(c[i][j] + " ");

                }
                System.out.println();
            }
            System.out.println("\nMatrix C:");

            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    z[i][j]=c[i][j] * a;
                    System.out.print(z[i][j] + " ");
                }
                System.out.println();
            }
            double columnMax, S = 0;
            for (int i = 0; i < c[0].length; i++) {
                columnMax = z[0][i];
                for (int j = 1; j < c.length; j++) {
                    if (z[j][i] > columnMax) {
                        columnMax = z[j][i];
                    }
                }
                S += columnMax;
            }
            System.out.println("\nResult: " + S);
        }
    }

