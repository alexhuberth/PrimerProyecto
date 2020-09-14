package Prueba;
import javax.swing.JOptionPane;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[]=new int[10];
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+(1+i)));
		}
		for(int i:numeros) {
			System.out.println("El numero: "+i);
		}

	}

}
