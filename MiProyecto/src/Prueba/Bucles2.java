package Prueba;

public class Bucles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[]=new int [10];
		for(int i=0;i<matriz.length;i++) {
			matriz[i]=(int)Math.round(Math.random()*100);
		}
		for(int i:matriz) {
			System.out.println("Numero: "+i);
		}

	}

}
