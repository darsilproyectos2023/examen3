package com.tienda.examen3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Articulo")
@Table(name="Articulo")

public class Articulo {
    @Id
	int idarticulo;
	String codigo;
	String nombre;
	int stock;
	String descripsion;
	String imagen;
	String estado;
	public Articulo() {
		super();
	}
	public Articulo(int idarticulo, String codigo, String nombre, int stock, String descripsion, String imagen,
			String estado) {
		super();
		this.idarticulo = idarticulo;
		this.codigo = codigo;
		this.nombre = nombre;
		this.stock = stock;
		this.descripsion = descripsion;
		this.imagen = imagen;
		this.estado = estado;
	}
	public int getIdarticulo() {
		return idarticulo;
	}
	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDescripsion() {
		return descripsion;
	}
	public void setDescripsion(String descripsion) {
		this.descripsion = descripsion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}