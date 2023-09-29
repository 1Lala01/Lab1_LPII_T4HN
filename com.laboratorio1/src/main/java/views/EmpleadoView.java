package views;

import controllers.EmpleadoController;

public class EmpleadoView {
	public static void main(String args[]) {
		
		
		//String empleado = new EmpleadoController().createEmpleado("Hernandez","Camila",18,"Femenino",1500.60);
		
		//String empleado = new EmpleadoController().deleteEmpleado(4);
		
		String empleado = new EmpleadoController().updateEmpleado(1,"Cubas","Lorenita",18,"Femenino",5000);
		
		//String empleado = new EmpleadoController().getEmpleado(2);
		
		System.out.println(empleado);
		
		
	}
	 
}
