package com.uca.capas.modelo.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {

	
	@Size(min=12, max=12,  message = "El campo codigo debe tener una longitud exactamente de 12 digitos.")
	@Digits(integer=12,fraction=0, message="El campo codigo solo acepta digitos")
	String codigo;
	@Size(min=1, max=100, message = "El campo usuario debe tener una longitud entre 1 y 100 caracteres.")
	String nombre;
	@Size(min=1, max=100, message = "El campo usuario debe tener una longitud entre 1 y 100 caracteres.")
	String marca;
	@Size(min=1, max=500, message="El campo usuario debe tener una longitud entre 1 y 500 caracteres.")
	String descripcion;
	@Digits(fraction = 0, message="Solo  numeros enteros", integer = 40)
	Integer existencias;
	@Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", message ="Fecha erronea. El formato es dd/mm/yyyy")
	String fechaIngreso;

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getExistencias() {
		return existencias;
	}
	public void setExistencias(Integer existencias) {
		this.existencias = existencias;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	

}