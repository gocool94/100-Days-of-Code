package Mathematics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        prime(n);

    }

    public static String prime(int n){

        for (int i = 2;i<=n/2;i++){
            if (n%i==0){
                System.out.println("Not a prime");
                return "Not a prime" ;
            }
        }
        System.out.println("Prime Number");
        return "prime";
    }
}
