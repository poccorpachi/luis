package com.senati.familia;

public class Hijos extends Datos {
	
	String genero;

	public Hijos(String genero) {
		super();
		this.genero = genero;
	}

	public Hijos() {
		super();
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	

	@Override
	public String toString() {
		return "Hijos [genero=" + genero + ", id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad="
				+ edad + "]";
	}

	

}
