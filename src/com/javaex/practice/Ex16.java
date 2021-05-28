package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		int n = 0;

		sc.close();

		for (int m = 1; m <= num; m++) {
			if (m % 5 == 0) {
				sum = sum + m;
				n = n + 1;
			}
		}
		System.out.println("5의배수의 개수 : " + n);
		System.out.println("5의배수의 합 : " + sum);
	}

}
