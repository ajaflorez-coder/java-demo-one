package pe.edu.upc.covid19.model.entity;

import java.util.Date;

public class Person {
	private int id;
	private String nombres;
	private String apellidos;

	// Constructor por defecto
	public Person(int id, String nombres, String apellidos) {
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
	}

}
