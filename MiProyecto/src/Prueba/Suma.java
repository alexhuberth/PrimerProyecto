package Prueba;
import javax.swing.JOptionPane;

public class Suma {

	public static void main(String[] args) {
		//String nombre="";
		String sexo="";
		int peso=0;
		boolean respuesta=true;
		do {
			sexo=JOptionPane.showInputDialog("Ingresa su Sexo(H/M):");
			if(sexo.equalsIgnoreCase("H")||sexo.equalsIgnoreCase("M")) {
				System.out.println("Correcto");
				respuesta=false;
			}
		}while(respuesta);
		if(sexo.equalsIgnoreCase("H")) {
			peso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura: "));
			peso=peso-110;
			
		}else if(sexo.equalsIgnoreCase("M")) {
			peso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su altura: "));
			peso=peso-120;
		}
		System.out.println("Su peso es: "+peso);
		System.out.println("Hola");

	}

}
