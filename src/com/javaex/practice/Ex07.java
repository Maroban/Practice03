package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int m = 0; m<=num; m++) {
			for(int n = 1; n<=m; n++) {
				System.out.print(m);
			}
			System.out.println("");
		}
		
		
		
		
		
		sc.close();
	}

}
