package pe.edu.upc.covid19.model.entity;

public class Personaje {
	private int vidas;
	private int puntaje;
	
	public Personaje() {
		vidas = 10;
		puntaje = 0;
	}
	public Personaje(int vidas, int puntaje) {
		this.vidas=vidas;
		this.puntaje=puntaje;
	}
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
}
