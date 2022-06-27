package Day6_Java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        int i, flag = 0;
        for (i = 2; i < (number / 2); i++) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }
}
		// TODO Auto-generated method stub