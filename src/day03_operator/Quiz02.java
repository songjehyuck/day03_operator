package day03_operator;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int num1;
		System.out.print("수 입력:");
		num1 = input.nextInt();
		if(num1%3==0) {
			System.out.println(num1+"은 3의 배수이다");
		}
		System.out.print("수 입력:");
		num1 = input.nextInt();
		if(num1>=0) {
			System.out.println(num1);
		}
		if(num1<0) {
			System.out.println(num1*=-1);
		}
		int num2;
		System.out.print("수 입력:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if(num1>num2) {
			System.out.println("두 수 중 큰 수는 "+num1+"이다.");
		}
		if(num1<num2) {
			System.out.println("두 수 중 큰 수는 "+num2+"이다.");
		}
		int num3;
		System.out.print("수 입력:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		if((num1>num2)&&(num1>num3)) {
			System.out.println("세 수 중 가장 큰 수는 "+num1+"이다.");
		}
		if((num2>num1)&&(num2>num3)) {
			System.out.println("세 수 중 가장 큰 수는 "+num2+"이다.");
		}
		if((num3>num1)&&(num3>num2)) {
			System.out.println("세 수 중 가장 큰 수는 "+num3+"이다.");
		}
		System.out.print("수 입력 : ");
		num1= input.nextInt();
		num2= input.nextInt();
		if((num1>num2)&&(num1%2==0)){
			System.out.println(num1);
		}
		if((num2>num1)&&(num2%2==0)) {
			System.out.println(num2);
		}
		System.out.print("수 입력 : ");
		num1=input.nextInt();
		num2=input.nextInt();
		if(((num1+num2)%2==0)&&((num1+num2)%3==0)) {
			System.out.println((num1+num2)+"는 합이 짝수이고 3의 배수이다.");
		}
	}
}
