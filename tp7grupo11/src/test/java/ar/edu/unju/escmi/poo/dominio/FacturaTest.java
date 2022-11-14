package ar.edu.unju.escmi.poo.dominio;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.escmi.poo.collections.CollectionCliente;
import ar.edu.unju.escmi.poo.collections.CollectionProducto;
import ar.edu.unju.escmi.poo.collections.CollectionStock;

class FacturaTest {
	Cliente cliente;
	Factura factura;
	List<Detalle> detalles;

	@BeforeEach
	void setUp() throws Exception {
		CollectionCliente.getClientes();
		CollectionProducto.getProductos(); 
		CollectionStock.getStocks();
		
		factura = new Factura();
		cliente = new Cliente();
		detalles = new ArrayList<Detalle>();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	//Test que valide que el monto total del crédito no supere el monto permitido
	@Test
	void testCalcularTotal() {
		
		cliente = CollectionCliente.buscarCliente(44949820);
		detalles.add(new Detalle(1,CollectionProducto.buscarProductoPorCodigo(25),1*CollectionProducto.buscarProductoPorCodigo(25).getPrecioUnitario()));
		detalles.add(new Detalle(1,CollectionProducto.buscarProductoPorCodigo(9),1*CollectionProducto.buscarProductoPorCodigo(9).getPrecioUnitario()));
		factura.setCliente(cliente);
		//System.out.println(cliente); para controlar
		factura.setDetalles(detalles);
		//System.out.println(detalles);
		factura.setFecha(LocalDate.now());
		factura.setNroFactura(1655);
		double obtenido = factura.calcularTotal();
		//System.out.println(factura);
		
		assertTrue(obtenido > 0 && obtenido <= 200000);
	}

}
