package poo;

public class Auto {
	private int ruedas;
	private int largo;
	private int ancho;
	public Auto() {
		this.ruedas=3;
		this.largo=120;
		this.ancho=140;
	}
	
	public Auto(int ruedas, int largo, int ancho) {
		this.ruedas = ruedas;
		this.largo = largo;
		this.ancho = ancho;
	}

	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	@Override
	public String toString() {
		return "Auto [ruedas=" + ruedas + ", largo=" + largo + ", ancho=" + ancho + "]";
	}
	

}
