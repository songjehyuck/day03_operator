package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int num1;
		System.out.print("�� �Է�:");
		num1 = input.nextInt();
		if(num1%3==0) {
			System.out.println(num1+"�� 3�� ����̴�");
		}
		System.out.print("�� �Է�:");
		num1 = input.nextInt();
		if(num1>=0) {
			System.out.println(num1);
		}
		if(num1<0) {
			System.out.println(num1*=-1);
		}
		int num2;
		System.out.print("�� �Է�:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if(num1>num2) {
			System.out.println("�� �� �� ū ���� "+num1+"�̴�.");
		}
		if(num1<num2) {
			System.out.println("�� �� �� ū ���� "+num2+"�̴�.");
		}
		int num3;
		System.out.print("�� �Է�:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		if((num1>num2)&&(num1>num3)) {
			System.out.println("�� �� �� ���� ū ���� "+num1+"�̴�.");
		}
		if((num2>num1)&&(num2>num3)) {
			System.out.println("�� �� �� ���� ū ���� "+num2+"�̴�.");
		}
		if((num3>num1)&&(num3>num2)) {
			System.out.println("�� �� �� ���� ū ���� "+num3+"�̴�.");
		}
		System.out.print("�� �Է� : ");
		num1= input.nextInt();
		num2= input.nextInt();
		if((num1>num2)&&(num1%2==0)){
			System.out.println(num1);
		}
		if((num2>num1)&&(num2%2==0)) {
			System.out.println(num2);
		}
		System.out.print("�� �Է� : ");
		num1=input.nextInt();
		num2=input.nextInt();
		if(((num1+num2)%2==0)&&((num1+num2)%3==0)) {
			System.out.println((num1+num2)+"�� ���� ¦���̰� 3�� ����̴�.");
		}
	}
}
