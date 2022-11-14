package ar.edu.unju.escmi.poo.principal;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.escmi.poo.collections.CollectionCliente;
import ar.edu.unju.escmi.poo.collections.CollectionFactura;
import ar.edu.unju.escmi.poo.collections.CollectionProducto;
import ar.edu.unju.escmi.poo.collections.CollectionStock;
import ar.edu.unju.escmi.poo.collections.CollectionTarjetaCredito;
import ar.edu.unju.escmi.poo.dominio.Cliente;
import ar.edu.unju.escmi.poo.dominio.Credito;
import ar.edu.unju.escmi.poo.dominio.Detalle;
import ar.edu.unju.escmi.poo.dominio.Factura;
import ar.edu.unju.escmi.poo.dominio.Producto;
import ar.edu.unju.escmi.poo.dominio.TarjetaCredito;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int opcion=0,codigo; boolean band; String seguir;
		
		CollectionProducto.getProductos();
		CollectionStock.getStocks();
		CollectionCliente.getClientes();
		CollectionFactura.getFacturas();
		CollectionTarjetaCredito.getTarjetas();
		
		do {
			System.out.println("\n------------------ MENÚ ----------------");
			System.out.println("1. Realizar una venta con programa Ahora 30");
			System.out.println("2. Compras realizadas por el cliente (ingresar dni)");
			System.out.println("3. Lista de los electrodomésticos que se pueden comprar con el programa Ahora 30");
			System.out.println("4. Consultar stock de los electrodomésticos que están incluidos en el programa");
			System.out.println("5. Salir");
			System.out.println("Ingrese opción: ");
			opcion = scanner.nextInt();
			
			switch (opcion) {
			case 1:
			
				Factura factura = new Factura();
				factura.setNroFactura((int)(Math. random()*100+1));
				factura.setFecha(LocalDate.now());
				
				System.out.println("Ingrese dni del cliente: ");
				Cliente c = CollectionCliente.buscarCliente(scanner.nextLong());
				
				if(c==null) {
					System.out.println("No se encontró el cliente");
				}else {
					factura.setCliente(c);
					
					do {
						System.out.println("--------------- LISTA DE PRODUCTOS AHORA 30 ---------------");
						CollectionProducto.buscarProductosAhora30(CollectionProducto.getProductos()).stream().forEach(System.out::println);
						System.out.println("\nDigite codigo del producto que desea comprar: ");
						codigo = scanner.nextInt();
						Producto prod = new Producto();
						prod = CollectionProducto.buscarProductoPorCodigoAhora30(codigo,CollectionProducto.buscarProductosAhora30(CollectionProducto.getProductos()));
						
						if(prod==null) {
							System.out.println("¡¡EL CODIGO NO COINCIDE CON NINGUNO PRODUCTO!!");
						}else {
								Detalle detalle = new Detalle();
								System.out.println("¿Cuántas unidades del producto va a comprar?");
								detalle.setCantidad(scanner.nextInt());
								
								band = CollectionStock.decrementarStockProducto(codigo, detalle.getCantidad());
								if(!band) {
									System.out.println("No hay stock suficiente o ingresó una cantidad inválida");
								}else {
									detalle.setProducto(prod);
									detalle.setImporte(detalle.calcularImporte());
									factura.agregarDetalle(detalle);
									
									TarjetaCredito tarjeta = CollectionTarjetaCredito.buscarTarjeta(c);
									
									if(factura.calcularTotal() > 0 && factura.calcularTotal() < 200000 && CollectionTarjetaCredito.decrementarLimiteCompra(tarjeta.getNumero(), factura.calcularTotal())) {
										CollectionFactura.agregarFactura(factura);
										System.out.println("\n\n ********************************* FACTURA N° "+factura.getNroFactura()+" **************************************");
										System.out.println(factura);
										
										Credito credito = new Credito(factura,CollectionTarjetaCredito.buscarTarjetaPorNroTarjeta(tarjeta.getNumero()));
										
										System.out.println("\n### CREDITO ###\n" + credito);
									}else {
										System.out.println("¡Pasó el limite de compra de $200.000 o Tiene saldo insuficiente en su tarjeta!");
										factura.getDetalles().remove(detalle);
									}

								}
							}
							
							
						
						System.out.println("\n\n¿Desea comprar otro producto? SI/NO");
						seguir = scanner.next();
					}while(seguir.equals("SI")||seguir.equals("si")||seguir.equals("s"));
				}
				
				break;
			case 2:
				System.out.println("Ingresar dni: ");
				CollectionFactura.mostrarFacturas(scanner.nextLong());
				break;
			case 3:
				System.out.println("--------------- LISTA DE PRODUCTOS AHORA 30 ---------------");
				CollectionProducto.buscarProductosAhora30(CollectionProducto.getProductos()).stream().forEach(System.out::println);
				break;
			case 4:
				CollectionStock.mostrarStocksAhora30();
				break;
			case 5:
				System.out.println("Saliendo del menu...");
				break;
			default:
				System.out.println("¡OPCIÓN INCORRECTA!");
				break;
			}
		}while(opcion!=5);
		
		scanner.close();
	}

}
