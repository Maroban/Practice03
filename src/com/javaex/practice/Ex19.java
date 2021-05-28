package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		int m = 0;
		int n = 0;

		while (flag) {
			System.out.println("--------------------------------------");
			System.out.println("  1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("예금액> ");
				m = sc.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				n = sc.nextInt();
				m = m - n;
				break;
			case 3:
				System.out.println("잔고액> " + m);
				break;
			case 4:
				System.out.println("프로그램 종료");
				flag = false;
				break;
			default:
				System.out.println("다시 입력해주세요");
			}
		}
		sc.close();
	}

}
