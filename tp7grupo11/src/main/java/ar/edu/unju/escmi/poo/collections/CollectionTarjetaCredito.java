package ar.edu.unju.escmi.poo.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Cliente;
import ar.edu.unju.escmi.poo.dominio.TarjetaCredito;

public abstract class CollectionTarjetaCredito {
	public static List<TarjetaCredito> tarjetas;
	public CollectionTarjetaCredito() {
		// TODO Auto-generated constructor stub
	}
	public static List<TarjetaCredito> getTarjetas() {
		if(tarjetas==null) {
			tarjetas= new ArrayList<TarjetaCredito>();
		}
		
		tarjetas.add(new TarjetaCredito(1111,LocalDate.of(2026, 5, 10),CollectionCliente.buscarCliente(44949820),600000));
		tarjetas.add(new TarjetaCredito(2222,LocalDate.of(2025, 6, 11),CollectionCliente.buscarCliente(45852963),500000));
		tarjetas.add(new TarjetaCredito(3333,LocalDate.of(2027, 7, 12),CollectionCliente.buscarCliente(44741852),200000));
		tarjetas.add(new TarjetaCredito(4444,LocalDate.of(2024, 8, 15),CollectionCliente.buscarCliente(40963852),300000));
		
		return tarjetas;
	}
	public static void setTarjetas(List<TarjetaCredito> tarjetas) {
		CollectionTarjetaCredito.tarjetas = tarjetas;
	}
	
	public static TarjetaCredito buscarTarjetaPorNroTarjeta(long nro) {
		TarjetaCredito tar=new TarjetaCredito();
		for(TarjetaCredito t: tarjetas) {
			if(t.getNumero() == nro) {
				tar=t;
			}
		}
		return tar;
	}
	
	public static TarjetaCredito buscarTarjeta(Cliente cliente) {
		TarjetaCredito encontrada=null;
		for(TarjetaCredito t: tarjetas) {
			if(t.getCliente().equals(cliente)) {
				encontrada = t;
			}
		}
		return encontrada;
	}
	
	public static boolean decrementarLimiteCompra(long numero, double monto) {
		boolean decrementoPosible=false;
		for(int i=0;i<tarjetas.size();i++) {
			if(tarjetas.get(i).getNumero() == numero) {
				if(tarjetas.get(i).getLimiteCompra()>=monto && tarjetas.get(i).getLimiteCompra()-monto >= 0) {
					tarjetas.get(i).setLimiteCompra(tarjetas.get(i).getLimiteCompra()-monto);
					decrementoPosible=true;
				}
			}
		}
		return decrementoPosible;
	}
}
