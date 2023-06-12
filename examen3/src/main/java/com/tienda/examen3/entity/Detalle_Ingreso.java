package com.tienda.examen3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Detalle_Ingreso")
@Table(name="Detalle_Ingreso")
public class Detalle_Ingreso {
	@Id
	int iddetalle_ingreso;
	int idingreso;
	int idarticulo;
	int cantidad;
	double precio_compra;
	double precio_venta;
	public Detalle_Ingreso() {
		super();
	}
	public Detalle_Ingreso(int iddetalle_ingreso, int idingreso, int idarticulo, int cantidad, double precio_compra,
			double precio_venta) {
		super();
		this.iddetalle_ingreso = iddetalle_ingreso;
		this.idingreso = idingreso;
		this.idarticulo = idarticulo;
		this.cantidad = cantidad;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
	}
	public int getIddetalle_ingreso() {
		return iddetalle_ingreso;
	}
	public void setIddetalle_ingreso(int iddetalle_ingreso) {
		this.iddetalle_ingreso = iddetalle_ingreso;
	}
	public int getIdingreso() {
		return idingreso;
	}
	public void setIdingreso(int idingreso) {
		this.idingreso = idingreso;
	}
	public int getIdarticulo() {
		return idarticulo;
	}
	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
}