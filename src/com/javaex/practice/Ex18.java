package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();

		sc.close();

		int x = 1;
		for (int m = 1; m <= num; m++) {
			for (int n = x; n <= num; n++) {
				System.out.print("*");
			}
			System.out.println();
			x++;
		}
		
		for (int y = 1; y < num; y++) {
			for (int z = 0; z <= y; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
