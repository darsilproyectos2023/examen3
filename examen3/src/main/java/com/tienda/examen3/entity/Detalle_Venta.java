package com.tienda.examen3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Detalle_Venta")
@Table(name="Detalle_Venta")

public class Detalle_Venta {
	@Id
	int iddetalle_venta;
	int idventa;
	int idarticulo;
	int cantidad;
	double precio_venta;
	double descuento;
	public Detalle_Venta() {
		super();
	}
	public Detalle_Venta(int iddetalle_venta, int idventa, int idarticulo, int cantidad, double precio_venta,
			double descuento) {
		super();
		this.iddetalle_venta = iddetalle_venta;
		this.idventa = idventa;
		this.idarticulo = idarticulo;
		this.cantidad = cantidad;
		this.precio_venta = precio_venta;
		this.descuento = descuento;
	}
	public int getIddetalle_venta() {
		return iddetalle_venta;
	}
	public void setIddetalle_venta(int iddetalle_venta) {
		this.iddetalle_venta = iddetalle_venta;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
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
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	
}