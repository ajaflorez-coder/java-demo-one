package two;

public class Ajaflorez extends Abstracta  {
	private int entero;
	private String cadena;
	private Long longitud;
	private Double doble;
	private char cartacter;
	private boolean logico;
	
	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		
	}

	public Ajaflorez(int entero, String cadena, Long longitud, Double doble, char cartacter, boolean logico) {
		this.entero = entero;
		this.cadena = cadena;
		this.longitud = longitud;
		this.doble = doble;
		this.cartacter = cartacter;
		this.logico = logico;
	}

	public int getEntero() {
		return entero;
	}

	public void setEntero(int entero) {
		this.entero = entero;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public Long getLongitud() {
		return longitud;
	}

	public void setLongitud(Long longitud) {
		this.longitud = longitud;
	}

	public Double getDoble() {
		return doble;
	}

	public void setDoble(Double doble) {
		this.doble = doble;
	}

	public char getCartacter() {
		return cartacter;
	}

	public void setCartacter(char cartacter) {
		this.cartacter = cartacter;
	}

	public boolean isLogico() {
		return logico;
	}

	public void setLogico(boolean logico) {
		this.logico = logico;
	}
	
	
	
	
}
