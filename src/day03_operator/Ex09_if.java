package day03_operator;

import java.util.Scanner;

public class Ex09_if {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("�� �Է�:");
		num = input.nextInt();
		if(num>10) {
			System.out.println("1���� ���� ����");
			System.out.println("2���� ���� ����");	
			System.out.println("3���� ���� ����");
			System.out.println("4���� ���� ����");
			System.out.println("5���� ���� ����");
		}
		System.out.println("���� ����� ����");
	}
}

