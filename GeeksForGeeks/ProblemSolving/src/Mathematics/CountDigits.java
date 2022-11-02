package Mathematics;

import java.util.Scanner;

public class CountDigits {
    /*
    Count the number of digits in a number
     */

    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);

    int count = 0;

    int number = scanner.nextInt();

    while(number>0)

    {
        number = number / 10;
        count++;
    }

        System.out.println(count);

}

}
