package pe.edu.upc.covid19.model.entity;

public class Customer {
	private int id;
	private String name;
	private String lastname;
	private String dni;
	
	public Customer() {
		
	}

	public Customer(int id, String name, String lastname, String dni) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.dni = dni;
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
}
