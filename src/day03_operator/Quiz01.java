package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int su;
		System.out.print("수를 입력하시오:");
		su = input.nextInt();
		String s = (su%2==0)?"짝수":"홀수";
		System.out.println(su+"="+s);
		String s1 = (su%3==0)?"3의 배수이다":"3의 배수가 아니다";
		System.out.println(su+"="+s1);
		int num1,num2;
		System.out.print("두 수 입력:");
		num1=input.nextInt();
		num2=input.nextInt();
		System.out.println("num1:"+num1+","+"num2:"+num2);
		String s2 = (num1>num2)?"num1이 num2보다 크다":"num2가 num1보다 크다";
		System.out.println(s2);
	}
	
}
