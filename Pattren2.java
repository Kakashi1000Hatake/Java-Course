import java.util.Scanner;

public class Pattren2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows :");
        int n = sc.nextInt();

        System.out.println("Enter number of columns :");
        int m = sc.nextInt();

        System.out.println("Enter the symbol to be printed :");
        String symbol = sc.next();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print(symbol);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
