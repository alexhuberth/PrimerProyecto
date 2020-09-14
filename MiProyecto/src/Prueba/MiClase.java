package Prueba;
import java.util.Scanner;
public class MiClase {

	public static void main(String[] args) {
		Scanner dato=new Scanner(System.in);
		int aleatorio=(int)(Math.random()*100);
		int numero=0;
		int cont=0;
		while(numero!=aleatorio) {
			cont++;
			System.out.print("Ingrese un numero: ");
			numero=dato.nextInt();
			if(numero>aleatorio) {
				System.out.println("Mas bajo! ");
				
			}else if(numero<aleatorio) {
				System.out.println("Mas alto! ");
			}
		}
		
		System.out.println("Correcto lo lograste en "+cont+" intentos!");
	}

}
