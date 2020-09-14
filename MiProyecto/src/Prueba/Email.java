package Prueba;
import javax.swing.JOptionPane;

public class Email {

	public static void main(String[] args) {
		int cont=0;
		String email=JOptionPane.showInputDialog("Ingrese su email: ");
		for(int i = 0;i<email.length();i++) {
			if(email.charAt(i)=='@') {
				cont++;
			}
		}
		if(cont==1) {
			System.out.println("Email correcto");
		}else {
			System.out.println("Email incorrecto");
		}

	}

}
