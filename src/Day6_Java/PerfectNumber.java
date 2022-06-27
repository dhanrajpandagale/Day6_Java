package Day6_Java;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int number = sc.nextInt();
        int i, sum = 0;
        for (i = 1; i <= (number / 2); i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (number == sum) {
            System.out.println(number + " is a Perfect Number");
        } else {
            System.out.println(number + " is not a Perfect Number");
        }
    }
}
		// TODO Auto-generated method stub
