package com.senati.familia;

public class Mascota {
	
	int idmascota;
	String nombre;
	String genero;
	int edad;
	String tipo;
	
	public Mascota(int idmascota, String nombre, String genero, int edad, String tipo) {
		super();
		this.idmascota = idmascota;
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.tipo = tipo;
	}

	public Mascota() {
		super();
	}

	public int getIdmascota() {
		return idmascota;
	}

	public void setIdmascota(int idmascota) {
		this.idmascota = idmascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

	@Override
	public String toString() {
		return "Mascota [idmascota=" + idmascota + ", nombre=" + nombre + ", genero=" + genero + ", edad=" + edad
				+ ", tipo=" + tipo + "]";
	}
	
	
	

}
