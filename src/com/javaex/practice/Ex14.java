package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;

		sc.close();

		for (int m = 1; m <= num; m++) {
			sum = sum + m;
			System.out.print(m);
			if (m < num) {
				System.out.print("+");
			}			
		}
		System.out.println();
		System.out.println("합계: " + sum);
	}

}
