package Prueba;

public class Bucles3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]=new int[20][20];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				matrix[i][j]=(int)Math.round(Math.random()*100);
			}
		}
		for(int fila[]:matrix) {
			for(int columna:fila) {
				System.out.print(" "+columna);
			}
			System.out.println(" ");
		}

	}

}
