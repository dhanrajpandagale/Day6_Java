package Day6_Java;

import java.util.Scanner;

public class Fibbonacci_Series {

	public static void main(String[] args) {
		int number1 = 0, number2 = 1, number3, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Range");
        int n = sc.nextInt();
        System.out.print(number1 + " " + number2);
        for (i = 0; i < n; i++) {
            number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;
		// TODO Auto-generated method stub

        }
	}
}