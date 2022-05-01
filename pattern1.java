import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        // this is for the printing withouttaking user input
        // for(int i = 1; i <= 4; i++){
        //     // System.out.print("*");
        //     for(int j = 1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        //this is for taking user input 
        
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows :");
        int n = sc.nextInt();

        System.out.println("Enter number of columns :");
        int m = sc.nextInt();

        System.out.println("Enter the symbol to be printed :");
        String symbol = sc.next();

        //outer for loop
        for(int i = 1; i <= n; i++){
            //inner for loop
            for(int j = 1; j <= m; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        sc.close();    
        }
    }

