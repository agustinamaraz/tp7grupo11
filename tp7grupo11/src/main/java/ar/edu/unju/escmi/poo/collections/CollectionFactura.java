package ar.edu.unju.escmi.poo.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Detalle;
import ar.edu.unju.escmi.poo.dominio.Factura;
import ar.edu.unju.escmi.poo.dominio.Producto;

public abstract class CollectionFactura {
	public static List<Factura> facturas;
	
	public CollectionFactura() {
		// TODO Auto-generated constructor stub
	}

	public static List<Factura> getFacturas() {
		if(facturas==null) {
			facturas = new ArrayList<Factura>();
			/*
			 * DESCOMENTAR PARA LA PRUEBA UNITARIA
			 * List<Detalle> detalles = new ArrayList<Detalle>();
			detalles.add(new Detalle(1,CollectionProducto.buscarProductoPorCodigo(2),1*CollectionProducto.buscarProductoPorCodigo(2).getPrecioUnitario()));
			facturas.add(new Factura(LocalDate.now(),1,CollectionCliente.buscarCliente(44949820),detalles));
			detalles.clear();
			detalles.add(new Detalle(2,CollectionProducto.buscarProductoPorCodigo(12),2*CollectionProducto.buscarProductoPorCodigo(12).getPrecioUnitario()));
			facturas.add(new Factura(LocalDate.now(),2,CollectionCliente.buscarCliente(45852963),detalles));
			detalles.clear();
			detalles.add(new Detalle(1,CollectionProducto.buscarProductoPorCodigo(25),1*CollectionProducto.buscarProductoPorCodigo(25).getPrecioUnitario()));
			facturas.add(new Factura(LocalDate.now(),3,CollectionCliente.buscarCliente(44741852),detalles));
			detalles.clear();
			detalles.add(new Detalle(2,CollectionProducto.buscarProductoPorCodigo(28),2*CollectionProducto.buscarProductoPorCodigo(28).getPrecioUnitario()));
			facturas.add(new Factura(LocalDate.now(),4,CollectionCliente.buscarCliente(40963852),detalles));*/
		}
		return facturas;
	}

	public static void setFacturas(List<Factura> facturas) {
		CollectionFactura.facturas = facturas;
	}
	
	public static void agregarFactura(Factura nuevaFac) {
		facturas.add(nuevaFac);
	}
	
	public static void mostrarFacturas(long dni){
		boolean band=false;
		
		for(Factura f: facturas) {
			if(f.getCliente().getDni()==dni) {
				System.out.println(f);
				band=true;
			}
		}
		
		if(band==false) {
			System.out.println("No hay ventas realizadas a este cliente");
		}
	}
}
