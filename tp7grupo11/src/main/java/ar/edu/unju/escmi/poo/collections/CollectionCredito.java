package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Credito;

public abstract class CollectionCredito {
	public static List<Credito> creditos;
	public CollectionCredito() {
		// TODO Auto-generated constructor stub
	}
	public static List<Credito> getCreditos() {
		if(creditos==null) {
			creditos = new ArrayList<Credito>();
			
			creditos.add(new Credito(CollectionFactura.getFacturas().get(0),CollectionTarjetaCredito.getTarjetas().get(0)));
			creditos.add(new Credito(CollectionFactura.getFacturas().get(1),CollectionTarjetaCredito.getTarjetas().get(1)));
			creditos.add(new Credito(CollectionFactura.getFacturas().get(2),CollectionTarjetaCredito.getTarjetas().get(2)));
			creditos.add(new Credito(CollectionFactura.getFacturas().get(3),CollectionTarjetaCredito.getTarjetas().get(3)));
			
		}
		return creditos;
	}
	public static void setCreditos(List<Credito> creditos) {
		CollectionCredito.creditos = creditos;
	}
	
}
