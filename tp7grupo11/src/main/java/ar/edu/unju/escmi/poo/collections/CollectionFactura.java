package ar.edu.unju.escmi.poo.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Detalle;
import ar.edu.unju.escmi.poo.dominio.Factura;

public abstract class CollectionFactura {
	public static List<Factura> facturas;
	
	public CollectionFactura() {
		// TODO Auto-generated constructor stub
	}

	public static List<Factura> getFacturas() {
		if(facturas==null) {
			facturas = new ArrayList<Factura>();
			List<Detalle> detalles = new ArrayList<Detalle>();
			detalles.add(new Detalle(1,CollectionProducto.buscarProductoPorCodigo(2)));
			facturas.add(new Factura(LocalDate.now(),1,CollectionCliente.buscarCliente(44949820),detalles));
			detalles.clear();
			detalles.add(new Detalle(2,CollectionProducto.buscarProductoPorCodigo(12)));
			facturas.add(new Factura(LocalDate.now(),2,CollectionCliente.buscarCliente(45852963),detalles));
			detalles.clear();
			detalles.add(new Detalle(1,CollectionProducto.buscarProductoPorCodigo(25)));
			facturas.add(new Factura(LocalDate.now(),3,CollectionCliente.buscarCliente(44741852),detalles));
			detalles.clear();
			detalles.add(new Detalle(2,CollectionProducto.buscarProductoPorCodigo(28)));
			facturas.add(new Factura(LocalDate.now(),4,CollectionCliente.buscarCliente(40963852),detalles));
		}
		return facturas;
	}

	public static void setFacturas(List<Factura> facturas) {
		CollectionFactura.facturas = facturas;
	}
	
	
}
