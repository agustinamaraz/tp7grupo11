package ar.edu.unju.escmi.poo.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Credito {
	private Factura factura;
	private TarjetaCredito tarjetaCredito;
	private List<Cuota> cuotas;
	
	public Credito() {
		// TODO Auto-generated constructor stub
	}

	public Credito(Factura factura, TarjetaCredito tarjetaCredito) {
		super();
		this.factura = factura;
		this.tarjetaCredito = tarjetaCredito;
		generarCuotas();
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public TarjetaCredito getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public List<Cuota> getCuotas() {
		return cuotas;
	}

	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}
	
	private void generarCuotas() {
		double montoCuota = this.factura.calcularTotal() / 30;
		LocalDate fechaActual = LocalDate.now();
		int nroCuota=0;
		Cuota cuota;
		if(this.cuotas==null) {
			cuotas = new ArrayList<Cuota>();
		}
		
		LocalDate fechaAux = LocalDate.now();
		for(int i=0;i<30;i++) {
			nroCuota++;
			cuota = new Cuota();
			cuota.setMonto(montoCuota);
			cuota.setNroCuota(nroCuota);
			cuota.setFechaGeneracion(fechaActual);
			fechaAux = fechaAux.plusMonths(1);
			cuota.setFechaVencimiento(fechaAux);
			fechaAux = cuota.getFechaVencimiento();
			cuotas.add(cuota)
;		}
	}

	@Override
	public String toString() {
		return "Credito [factura=" + factura + ", tarjetaCredito=" + tarjetaCredito + ", cuotas=" + cuotas + "]";
	}
	
}
