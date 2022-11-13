package ar.edu.unju.escmi.poo.dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.escmi.poo.collections.CollectionCliente;
import ar.edu.unju.escmi.poo.collections.CollectionCredito;
import ar.edu.unju.escmi.poo.collections.CollectionFactura;
import ar.edu.unju.escmi.poo.collections.CollectionProducto;
import ar.edu.unju.escmi.poo.collections.CollectionStock;
import ar.edu.unju.escmi.poo.collections.CollectionTarjetaCredito;

class CreditoTest {
	Credito credito;
	
	@BeforeEach
	void setUp() throws Exception {
		CollectionCliente.getClientes();
		CollectionTarjetaCredito.getTarjetas(); //necesita clientes por eso se debe invocar antes a la collectionCliente
		CollectionProducto.getProductos(); 
		CollectionStock.getStocks(); // necesita productos
		CollectionFactura.getFacturas(); //necesita detalles que a su vez necesita productos
		CollectionCredito.getCreditos(); // necesita tarjeta de credito y factura
		
		credito=CollectionCredito.creditos.get(0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testGenerarCuotas() {
		assertEquals(30,credito.getCuotas().size());
	}
	//Test que valide que la cantidad de cuotas generadas no supere la cantidad de cuotas permitidas
	@Test
	void testGenerarCuotas2() {
		assertTrue(credito.getCuotas().size()<31);
	}
	//Test que permita validar que la lista de cuotas que se generan no es un valor null
	@Test
	void testGenerarCuotas3() {
		assertNotNull(30,credito.getCuotas().toString());
	}

}
