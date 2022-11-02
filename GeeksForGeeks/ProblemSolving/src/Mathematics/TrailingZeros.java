package Mathematics;

import java.util.Scanner;

public class TrailingZeros {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        //getting the last digit
        int last_digit = n%10;
        int count = 0;
        while(last_digit==0){
            count++;
            n = n/10;
            last_digit = n%10;
        }
        System.out.println(count);

        //getting the value reduced after last digit


    }
}
