package ar.edu.unju.escmi.poo.dominio;

import java.time.LocalDate;

public class TarjetaCredito {
	private long numero;
	private LocalDate fechaVencimiento;
	private Cliente cliente;
	private double limiteCompra;
	
	public TarjetaCredito() {
		// TODO Auto-generated constructor stub
	}

	public TarjetaCredito(long numero, LocalDate fechaVencimiento,Cliente cliente, double limiteCompra) {
		super();
		this.numero = numero;
		this.fechaVencimiento = fechaVencimiento;
		this.cliente = cliente;
		this.limiteCompra = limiteCompra;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getLimiteCompra() {
		return limiteCompra;
	}

	public void setLimiteCompra(double limiteCompra) {
		this.limiteCompra = limiteCompra;
	}

	@Override
	public String toString() {
		return "TarjetaCredito [numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", limiteCompra="
				+ limiteCompra + "]";
	}
	
	
}
