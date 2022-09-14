package EstructuraSimple;

import javax.swing.JOptionPane;

public class NumeroDivisibleApp 
{
	public static void main(String[] args) 
	{
		String mensaje;
		String texto = JOptionPane.showInputDialog("Ingrese un numero");
		int num = Integer.parseInt(texto);
		
		if (num%2==0)
		{
			mensaje = "El numero "+num+" es par";
		}else {
			mensaje = "El numero "+num+" es impar";
		}
		
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
