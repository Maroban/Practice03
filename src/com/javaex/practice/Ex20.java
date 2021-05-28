package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==============================");
		System.out.println("    [숫자 맞추기 게임시작]");
		System.out.println("==============================");

		boolean flag = true;
		int m = 0;
		int answer = 29;

		while (flag) {
			System.out.print(" >> ");
			m = sc.nextInt();
			if (m == answer) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까? (y/n) >>  ");
				char end = sc.next().charAt(0);
				switch (end) {
				case 'y':
					System.out.println("==============================");
					System.out.println("    [숫자 맞추기 게임종료]");
					System.out.println("==============================");
					flag = false;
					break;
				default:
					break;
				}
			} else if (m < answer) {
				System.out.println("더 높게");
			} else {
				System.out.println("더 낮게");
			}
		}

		sc.close();

	}

}
