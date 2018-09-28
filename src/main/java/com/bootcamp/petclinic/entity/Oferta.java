package com.bootcamp.petclinic.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = " ofertas")
public class Oferta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "detalle")
	private String detalle;
	
	@Column(name = "descuento")
	private Double descuento;
	
	@Column(name = "fechaCaducidad")
	@Temporal(TemporalType.DATE)
	private Date fechaCaducidad;
	
	public Oferta() {
		// TODO Auto-generated constructor stub
	}
	

	public Oferta(String titulo, String detalle, Double descuento, Date fechaCaducidad) {
		super();
		this.titulo = titulo;
		this.detalle = detalle;
		this.descuento = descuento;
		this.fechaCaducidad = fechaCaducidad;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}


	@Override
	public String toString() {
		return "Oferta [titulo=" + titulo + ", detalle=" + detalle + ", descuento=" + descuento + ", fechaCaducidad="
				+ fechaCaducidad + "]";
	}
	
	

}
