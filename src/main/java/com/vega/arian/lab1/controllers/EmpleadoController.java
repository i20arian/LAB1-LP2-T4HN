package com.vega.arian.lab1.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vega.arian.lab1.models.Empleado;

public class EmpleadoController {
	public String createEmpleado(String apellidos, String nombres, byte edad, String sexo, double salario) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Empleado.class)
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			Empleado empleado = new Empleado(apellidos, nombres, edad, sexo, salario);
			transaction = session.beginTransaction();
			session.persist(empleado);
			transaction.commit();
			return "El Empleado ha sido creado";
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}

		return "El Empleado no pudo ser creado";
	}

	public String readEmpleado(int id) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Empleado.class)
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			Empleado empleado = session.get(Empleado.class, id);
			transaction = session.beginTransaction();
			transaction.commit();
			return empleado.toString();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}

		return "El Empleado no se pudo leer";
	}

	public String updateEmpleado(int id, String apellidos, String nombres, byte edad, String sexo, double salario) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Empleado.class)
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			Empleado empleado = session.get(Empleado.class, id);
			transaction = session.beginTransaction();

			empleado.setApellidos(apellidos);
			empleado.setNombres(nombres);
			empleado.setEdad(edad);
			empleado.setSexo(sexo);
			empleado.setSalario(salario);

			session.merge(empleado);
			transaction.commit();
			return "El Empleado ha sido actualizado";
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}

		return "El Empleado no se pudo actualizar";
	}

	public String deleteEmpleado(int id) {
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Empleado.class)
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			Empleado empleado = session.get(Empleado.class, id);
			transaction = session.beginTransaction();
			session.remove(empleado);
			transaction.commit();
			return "El Empleado ha sido eliminado";
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}

		return "El Empleado no se pudo eliminar";
	}
}
