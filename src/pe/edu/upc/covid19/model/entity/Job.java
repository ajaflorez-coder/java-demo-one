package pe.edu.upc.covid19.model.entity;

public class Job {
	private int id;
	private String role;
	private double salary;
	
	public Job(int id, String role, double salary) {
		this.id = id;
		this.role = role;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
