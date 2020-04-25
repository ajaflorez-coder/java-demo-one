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
	public void trabajar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int descanzar(int entero) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String digitar(String cadena) {
		// TODO Auto-generated method stub
		return null;
	}
}
