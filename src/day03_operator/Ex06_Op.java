package day03_operator;

public class Ex06_Op {
	public static void main(String[] args) {
		/*
		 ++ : �ڱ��ڽ��� 1 ��������
		 -- : �ڱ��ڽ��� 1 ���ҽ���
		 - a= a-1, a=a+1
		 */
		int su1=5;
		su1 ++; //��ġ �Ǵ� ����
		System.out.println(su1);//6
		++su1; // ��ġ �Ǵ� ����
		System.out.println(su1);//7
		
		int n1, n2, n3;
		n1 =10;
		n2 =++n1;//11 ��� ���꺸�� �ڱ��ڽ��� ���� ����
		n1 =10;
		n3 =n1++;//10 ��� ������ ���������� �ڱ��ڽ��� ����
		System.out.println(n2);
		System.out.println(n3);
		
	}
}
