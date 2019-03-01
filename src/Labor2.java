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
            while (!flag){
                System.out.println("Enter a: ");
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    a = scanner.nextInt();
                    flag = true;
                }
                else {
                    System.out.println("You have to enter an int");
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
            double n = z[0][0], S = 0;
            for (int i = 0; i < c[0].length; i++) {
                for (int j = 0; j < c.length; j++) {
                    if (z[j][i] > n) {
                        n = z[j][i];
                    }
                }
                S += n;
            }
            System.out.println("\nResult: " + S);
        }
    }

