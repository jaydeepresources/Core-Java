package arrays;

import java.util.Scanner;

public class TestArrays {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		
		System.out.println("=====Enter elements=====");
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		System.out.println("=====Displaying the values=====");
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
