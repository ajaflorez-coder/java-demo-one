package pe.edu.upc.covid19.controller;

import pe.edu.upc.covid19.model.entity.Employee;

public interface ManagerEmployee {
	public void registrarEmployee( Employee employee );
	public void trabajar();
	public int descanzar(int entero);
	public String digitar(String cadena);
}
