import java.util.Scanner;

/**
 * factorial
 */
public class factorial {

    public static int factro(int n){

        int m = 1;
        for (int i=n; i>=1; i--){
            m = m * i;
        }

        return m;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n value = ");int n = sc.nextInt();

        System.out.println("Factorial of " + n + " = " + factro(n));
    }
}