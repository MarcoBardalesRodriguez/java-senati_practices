package EstructuraSimple;

import java.util.Scanner;

public class AreaCirculo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("ingrese el valor del radio: ");
		double radio = sc.nextDouble();
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El area del circulo es: " + area);
		
	}
}
