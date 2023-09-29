package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Models.Empleado;
public class EmpleadoController {
	
	public String createEmpleado(String apellido,String nombre,int edad,String sexo,double salario) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
			
			try{
				Empleado empleado=new Empleado(apellido,nombre,edad,sexo,salario);

				session.beginTransaction();
				session.save(empleado);
				session.getTransaction().commit();
				
				sessionFactory.close();
				return "Empleado creado correctamente";
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}	
			return "error en el registro de un Nuevo Empleado";
	}
	public String deleteEmpleado(int id) {
		SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		try {
			session.beginTransaction();
			Empleado empleado =session.get(Empleado.class,id);
			session.delete(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			return "Empleado eliminado correctamente";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "Error en la eliminacion del Empleado";
	}
	public String updateEmpleado(int id,String ape,String nom,int edad, String sexo,double sal) {
		
		SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		Session session =sessionFactory.openSession();
	    try {
	        session.beginTransaction();
	        Empleado empleado = session.get(Empleado.class, id);
	        if (empleado != null) {
	          
	        	empleado.setApellido(ape);
	        	empleado.setNombre(nom);
	        	empleado.setEdad(edad);
	        	empleado.setSexo(sexo);
	        	empleado.setSalario(sal);
	            session.update(empleado);
	            session.getTransaction().commit();
	            sessionFactory.close();
	            
	            return "Empleado actualizado correctamente";
	        } else {
	            return "No se encontró un Empleado con el ID proporcionado";
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "Error en la actualización del Empleado:(  " + e.getMessage();
	    } finally {
	        session.close();
	        sessionFactory.close();
	    }
	}
	
	public String getEmpleado(int idempleado) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Empleado empleado=session.get(Empleado.class,idempleado);
			session.getTransaction().commit();
			session.close();
			sessionFactory.close();	
			if(empleado!=null) {	
				
				return empleado.toString();
				
			}
			else {
				return "Empleado no existe";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return "Error en busqueda nuevo Empleado ";
		}
		
		
	}
}
