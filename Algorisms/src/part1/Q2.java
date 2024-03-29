package part1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		System.out.println("세 정수의 최소값을 구합니다.");
		
		System.out.print("a의 값：");
		a = sc.nextInt();
		
		System.out.print("b의 값：");
		b = sc.nextInt();
		
		System.out.print("c의 값：");
		c = sc.nextInt();
		
		// a, b, c의 최소값
		int min = min(a, b, c); 	

		System.out.println("최소값은 " + min + "입니다.");
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
