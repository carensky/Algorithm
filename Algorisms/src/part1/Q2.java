package part1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.println("�� ������ �ּҰ��� ���մϴ�.");
		
		System.out.print("a�� ����");
		a = sc.nextInt();
		
		System.out.print("b�� ����");
		b = sc.nextInt();
		
		System.out.print("c�� ����");
		c = sc.nextInt();
		
		// a, b, c�� �ּҰ�
		int min = min(a, b, c); 	

		System.out.println("�ּҰ��� " + min + "�Դϴ�.");
	}

	static int min(int a, int b, int c)
	{
		int min = a;
		
		if(b < min)
		{
			min = b;
		}
		
		if(c < min)
		{
			min = c;
		}
		
		return min;
	}
}