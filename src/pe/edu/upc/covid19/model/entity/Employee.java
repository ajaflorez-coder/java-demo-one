package pe.edu.upc.covid19.model.entity;

import java.util.Date;

// Employee -> Cammel
public class Employee {
	// Atributos - Encapsulamiento (1)
	private int id;
	private String name;
	private double salary;
	private Date fechaNacimiento; // lowerCase
	
	
	// Constructor por defecto
	public Employee() {
		this.id = 1;
		this.name = "";
		this.salary = 0;
		this.fechaNacimiento = null;
	}
	
	// Constructor con parametros
	public Employee(int id, String name, double salary, Date fechaNacimiento) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.fechaNacimiento = fechaNacimiento;
	}
	// getter y setter
	public void saludar(String message) {
		System.out.println(this.name + " dice: " + message);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
	
}
