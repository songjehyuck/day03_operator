package day03_operator;

public class Ex05_Op {
	public static void main(String[] args) {
		/*
		 �� ������
		 -�� �Ǵ� ������ ǥ��
		 - ||(or) : �ϳ��� ���� �����ϸ� ����� ��
		 	-true || false :true
		 	-false || false : false
		 	-((10>20) || (20==20)) : true
		 - &&(and) : ��ΰ� ���� �� ��, �ϳ��� ������ ������ ����
		 	-true && false : false
		 	-true && true : true
		 	-((10>20) && (20==20)): false
		 - !(not) : ����� ���������ش�.
		 	-!false : true
		 	-!true : false
		 */
		System.out.println(false||true);//true
		System.out.println(true||true);//true
		System.out.println(true&&true);//true
		System.out.println(true&&false);//false
		System.out.println(!true);//false
		
	}
}
