package EstructuraSimple;

import java.util.Scanner;

public class NumeroDivisible2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int num = sc.nextInt();
		
		if (num%2==0)
		{
			System.out.println("El numero "+num+" es par");
		}else {
			System.out.println("El numero "+num+" es impar");
		}
		
	}
}
