package ar.edu.unju.escmi.poo.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
	private LocalDate fecha;
	private long nroFactura;
	private Cliente cliente = new Cliente();
	private List<Detalle> detalles = new ArrayList<Detalle>();
	
	public Factura() {
		// TODO Auto-generated constructor stub
	}

	public Factura(LocalDate fecha, long nroFactura, Cliente cliente, List<Detalle> detalles) {
		super();
		this.fecha = fecha;
		this.nroFactura = nroFactura;
		this.cliente = cliente;
		this.detalles = detalles;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public long getNroFactura() {
		return nroFactura;
	}

	public void setNroFactura(long nroFactura) {
		this.nroFactura = nroFactura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	
	public void agregarDetalle(Detalle nuevoDetalle) {
		detalles.add(nuevoDetalle);
	}
	
	public double calcularTotal() {
		double total=0;
		
		for(Detalle det : detalles) {
			total+=det.getImporte();
		}
		
		return total;
	}

	@Override
	public String toString() {
		return "Factura [fecha=" + fecha + ", nroFactura=" + nroFactura + ", cliente=" + cliente + ", detalles="
				+ detalles + ", calcularTotal()=" + calcularTotal() + "]";
	}
	
}
