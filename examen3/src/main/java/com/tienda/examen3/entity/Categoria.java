package com.tienda.examen3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Categoria")
@Table(name="Categoria")
public class Categoria {
	@Id 
 int idcategoria;
 String nombre;
 String descripsion;
 String condicion;
public Categoria() {
	super();
}
public Categoria(int idcategoria, String nombre, String descripsion, String condicion) {
	super();
	this.idcategoria = idcategoria;
	this.nombre = nombre;
	this.descripsion = descripsion;
	this.condicion = condicion;
}
public int getIdcategoria() {
	return idcategoria;
}
public void setIdcategoria(int idcategoria) {
	this.idcategoria = idcategoria;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripsion() {
	return descripsion;
}
public void setDescripsion(String descripsion) {
	this.descripsion = descripsion;
}
public String getCondicion() {
	return condicion;
}
public void setCondicion(String condicion) {
	this.condicion = condicion;
}
 
}

