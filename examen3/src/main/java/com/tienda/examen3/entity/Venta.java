package com.tienda.examen3.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Venta")
@Table(name="Venta")

public class Venta {
	@Id
	int idventa;
	int idcliente;
	int idusuario;
	String tipo_comprobante;
	String serie_comprobante;
	String num_comprobnte;
	String fecha_hora;
	double impuesto;
	double total_venta;
	String estado;
	public Venta() {
		super();
	}
	public Venta(int idventa, int idcliente, int idusuario, String tipo_comprobante, String serie_comprobante,
			String num_comprobnte, String fecha_hora, double impuesto, double total_venta, String estado) {
		super();
		this.idventa = idventa;
		this.idcliente = idcliente;
		this.idusuario = idusuario;
		this.tipo_comprobante = tipo_comprobante;
		this.serie_comprobante = serie_comprobante;
		this.num_comprobnte = num_comprobnte;
		this.fecha_hora = fecha_hora;
		this.impuesto = impuesto;
		this.total_venta = total_venta;
		this.estado = estado;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getTipo_comprobante() {
		return tipo_comprobante;
	}
	public void setTipo_comprobante(String tipo_comprobante) {
		this.tipo_comprobante = tipo_comprobante;
	}
	public String getSerie_comprobante() {
		return serie_comprobante;
	}
	public void setSerie_comprobante(String serie_comprobante) {
		this.serie_comprobante = serie_comprobante;
	}
	public String getNum_comprobnte() {
		return num_comprobnte;
	}
	public void setNum_comprobnte(String num_comprobnte) {
		this.num_comprobnte = num_comprobnte;
	}
	public String getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public double getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}