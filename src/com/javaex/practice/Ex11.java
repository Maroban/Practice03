package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int num = sc.nextInt();
		
		sc.close();

		if (num % 2 == 0) {
			for (int m = 1; m <= num; m++) {
				sum = (m + 1) / 2 + sum;
			}

		} else {
			for (int n = 1; n <= num; n++) {
				sum = (n + 1) / 2 + sum;
			}
		}
		System.out.println("결과값: " + sum);
	}
	
}
