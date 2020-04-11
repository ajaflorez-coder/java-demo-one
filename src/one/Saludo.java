package one;

import pe.edu.upc.covid19.controller.CapacitacionEmployee;
import pe.edu.upc.covid19.controller.DeportesEmployee;
import pe.edu.upc.covid19.controller.HHRREmployee;
import pe.edu.upc.covid19.controller.ManagerEmployee;
import pe.edu.upc.covid19.controller.SaludEmployee;
import pe.edu.upc.covid19.controller.TeacherEmployee;
import pe.edu.upc.covid19.model.entity.Employee;

public class Saludo {

	public static void main(String[] args) {
		/*int edad;
		edad = 24;
		String apellido = "Rivas";
		boolean vacunado = true;
		char estadoCivil = 'D';
		int contador = 1;
		
		System.out.println("Hello Programmers " + apellido);
		System.out.println("My name is Juan and my age is " + edad);
		System.out.println();

		if(edad >= 18 ) {
			System.out.println("Mayor de edad");
		} else {
			System.out.println("Menor de edad");
		}
		
		switch(estadoCivil) {
			case 'S': System.out.println("Soltero"); break;
			case 'C': System.out.println("Casado"); break;
			case 'D': System.out.println("Divorciado"); break;
		}
		
		while(contador < 11) {
			System.out.println(contador);
			contador++;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// Objetos
		// 1. Declaraci�n 
		Employee carlos;
		// 2. Instanciaci�n, crear el objeto, llamar al constructor
		carlos = new Employee();
		carlos.setName("Carlos");
		Employee rosa = new Employee();
		
		System.out.println("Se llama: " + carlos.getName());
		carlos.saludar("Hola gente");
		*/
		
		HHRREmployee hhrrEmployee = new HHRREmployee() ;
		int retorno = hhrrEmployee.metodo2(5);
		String cadena = hhrrEmployee.metodo3("Hola");
		testearEmployee(hhrrEmployee);
		
		TeacherEmployee teacherEmployee = new TeacherEmployee();
		retorno = teacherEmployee.metodo2(5);
		cadena = teacherEmployee.metodo3("Hola");
		testearEmployee(teacherEmployee);
		
		ManagerEmployee managerEmployee;
		managerEmployee = new SaludEmployee();
		testearEmployee(managerEmployee);
				
		ManagerEmployee managerEmployeec;
		managerEmployeec = new CapacitacionEmployee();
		testearEmployee(managerEmployeec);
		
		DeportesEmployee deportesEmployee = new DeportesEmployee();
		testearEmployee(deportesEmployee);

	}
	public static void testearEmployee(ManagerEmployee managerEmployeec) {
		
	}
}










