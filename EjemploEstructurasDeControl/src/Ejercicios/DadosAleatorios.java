package Ejercicios;

//import java.util.Arrays;
import java.util.Random;
//import java.util.stream.IntStream;

public class DadosAleatorios {
	
	public static int[] TirarDados(int l, int t) {
		int[] lista = {0,0,0,0,0,0,0,0,0,0,0,0};
		int lados = l;
		int tiros = t;
		Random Generador = new Random();
		
		for (int i=0; i<tiros; i++) {
			int num_a = Generador.nextInt(lados) + 1;
			int num_b = Generador.nextInt(lados) + 1;
//			System.out.println(num_a + "-" + num_b);
			int suma = num_a + num_b;
			
			lista[suma-1] = lista[suma-1]+1;
		}
		
		return lista;
		
		
	}

	public static void main(String[] args) {
		
		int[] lista = TirarDados(6, 10);
//		System.out.println(Arrays.toString(lista));
//		Arrays.stream(lista).forEach(System.out::println);
		System.out.println("Suma | N de veces");
		System.out.println("_________________");
		for (int i=0; i<lista.length; i++) {
			if (i<9) {
				System.out.println("0" + (i+1) + "   |  " + lista[i]);
			}else {
				System.out.println((i+1) + "   |  " + lista[i]);
			}
		}
		
	}

}
