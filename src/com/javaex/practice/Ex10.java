package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int max = 0;
		int num = 0;

		System.out.println("숫자를 입력하세요");

		for (int i = 0; i < 5; i++) {
			System.out.print("숫자: ");
			num = sc.nextInt();     //num에 숫자 저장
			if (num > max) {        //max=0 | num이 max보다 클 경우 그 값을 max에 저장
				max = num;          // max=큰 값 | 반복. 
			}
		}
		System.out.println("최대값: " + max);

		sc.close();

	}

}
