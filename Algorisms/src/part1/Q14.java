package part1;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사각형을 출력합니다.");
		
		System.out.println("단수 : ");
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
