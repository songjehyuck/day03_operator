package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int su;
		System.out.print("���� �Է��Ͻÿ�:");
		su = input.nextInt();
		String s = (su%2==0)?"¦��":"Ȧ��";
		System.out.println(su+"="+s);
		String s1 = (su%3==0)?"3�� ����̴�":"3�� ����� �ƴϴ�";
		System.out.println(su+"="+s1);
		int num1,num2;
		System.out.print("�� �� �Է�:");
		num1=input.nextInt();
		num2=input.nextInt();
		System.out.println("num1:"+num1+","+"num2:"+num2);
		String s2 = (num1>num2)?"num1�� num2���� ũ��":"num2�� num1���� ũ��";
		System.out.println(s2);
	}
	
}
