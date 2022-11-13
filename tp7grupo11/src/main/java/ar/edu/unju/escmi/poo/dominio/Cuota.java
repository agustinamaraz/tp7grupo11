package ar.edu.unju.escmi.poo.dominio;

import java.time.LocalDate;

public class Cuota {
	private double monto;
	private int nroCuota;
	private LocalDate fechaGeneracion, fechaVencimiento;
	
	public Cuota() {
		// TODO Auto-generated constructor stub
	}

	public Cuota(double monto, int nroCuota, LocalDate fechaGeneracion, LocalDate fechaVencimiento) {
		super();
		this.monto = monto;
		this.nroCuota = nroCuota;
		this.fechaGeneracion = fechaGeneracion;
		this.fechaVencimiento = fechaVencimiento;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public int getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}

	public LocalDate getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(LocalDate fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Override
	public String toString() {
		return "Cuota [monto=" + monto + ", nroCuota=" + nroCuota + ", fechaGeneracion=" + fechaGeneracion
				+ ", fechaVencimiento=" + fechaVencimiento + "]";
	}
	
}
