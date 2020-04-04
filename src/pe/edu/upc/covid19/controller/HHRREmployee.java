package pe.edu.upc.covid19.controller;

import pe.edu.upc.covid19.model.entity.Employee;

public class HHRREmployee implements ManagerEmployee{
	private Employee employee;
	
	public void registrarEmployee( Employee employee ) {
		this.employee = employee;
	}
	public void editarEmloyee() {
		
	}
	@Override
	public void metodo1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int metodo2(int entero) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String metodo3(String cadena) {
		// TODO Auto-generated method stub
		return null;
	}
}
