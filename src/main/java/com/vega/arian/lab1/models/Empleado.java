package com.vega.arian.lab1.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t__empleado")
public class Empleado {
	@Id
	@Column(name = "c__id")
	private int id;
	@Column(name = "c__apellidos")
	private String apellidos;
	@Column(name = "c__nombres")
	private String nombres;
	@Column(name = "c__edad")
	private byte edad;
	@Column(name = "c__sexo")
	private String sexo;
	@Column(name = "c__salario")
	private double salario;

	public Empleado() {
	}

	public Empleado(String apellidos, String nombres, byte edad, String sexo, double salario) {
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {
		return "Empleado [apellidos=" + apellidos + ", nombres=" + nombres + ", edad=" + edad + ", sexo=" + sexo
				+ ", salario=" + salario + "]";
	}
}
