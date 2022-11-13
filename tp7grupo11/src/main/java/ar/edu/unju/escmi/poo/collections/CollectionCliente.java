package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Cliente;

public abstract class CollectionCliente {
	public static List<Cliente> clientes;
	
	public CollectionCliente() {
		// TODO Auto-generated constructor stub
	}

	public static List<Cliente> getClientes() {
		if(clientes==null) {
			clientes = new ArrayList<Cliente>();
			clientes.add(new Cliente(44949820,"agustina","maraz","av. alvear 110",3885056));
			clientes.add(new Cliente(45852963,"emilio","soruco","b° alto comedero",3888524));
			clientes.add(new Cliente(44741852,"emilia","valeriano","b° palpala",3889632));
			clientes.add(new Cliente(40963852,"anahi","avendano","calle la rosa 929",388741));
		}
		return clientes;
	}

	public static void setClientes(List<Cliente> clientes) {
		CollectionCliente.clientes = clientes;
	}
	
	public static Cliente buscarCliente(long dni) {
		Cliente c=null;
		for(int i = 0; i < clientes.size();i++) {
			if(clientes.get(i).getDni()==dni) {
				c = clientes.get(i);
			}
		}
		return c;
	}

}
