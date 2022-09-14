package EstructuraSimple;

import javax.swing.JOptionPane;

public class AreaCirculoApp 
{
	public static void main(String[] args) 
	{
		String texto = JOptionPane.showInputDialog("Ingrese un radio: ");		
		double radio = Double.parseDouble(texto);
		
		double area = Math.PI * Math.pow(radio, 2);
		
		JOptionPane.showMessageDialog(null, area);
		
	}
}
