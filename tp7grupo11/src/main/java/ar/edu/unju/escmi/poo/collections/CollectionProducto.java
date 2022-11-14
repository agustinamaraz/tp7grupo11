package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Producto;

public abstract class CollectionProducto {
	public static List<Producto> productos;
	
	public CollectionProducto() {
		// TODO Auto-generated constructor stub
	}

	public static List<Producto> getProductos() {
		if(productos==null) {
			productos = new ArrayList<Producto>();
			productos.add(new Producto(1,"Heladera","2 PUERTAS COLOR BLANCA - VERSIÓN INVERTER",12200.0,"ARGENTINA","BRIKET"));
			productos.add(new Producto(2,"Heladera","Heladera con Freezer 414 lts blanca",30000.0,"CHINA","Hisense"));
			productos.add(new Producto(3,"Heladera","CICLICA",40000.0,"ARGENTINA","BRIKET"));
			productos.add(new Producto(4,"Heladera","NO FROST",60000.0,"ARGENTINA","Hisense"));
			productos.add(new Producto(5,"Heladera","Heladera con Freezer 414 lts acero",50200.0,"ARGENTINA","BRIKET"));
			productos.add(new Producto(6,"Aire Acondicionado","Split On/Off 2750W FC",699999.0,"CHINA","Hisense"));
			productos.add(new Producto(7,"Aire Acondicionado","Inverter 3300W FC",130000.0,"ARGENTINA","Philco"));
			productos.add(new Producto(8,"Aire Acondicionado","TECNOLOGÍA ON/OFF, GAS R410a, MODELO HY8-3200FC, GENERACION 8, CAPACIDAD 3520W, FRIO/CALOR",15000,"ARGENTINA","Philco"));
			productos.add(new Producto(9,"Aire Acondicionado","A.A.SP CARRIER IN 53HVA120 3000FC",14000.0,"CHINA","HYUNDAI"));
			productos.add(new Producto(10,"Aire Acondicionado","Split Surrey 2348 kcal/h Frío Calor",45000.0,"CHINA","HYUNDAI"));
			productos.add(new Producto(11,"Celular","Moto G41 Negro Onix",60000.0,"ARGENTINA","MOTOROLA"));
			productos.add(new Producto(12,"Celular","Galaxy A33",120000.0,"ARGENTINA","SAMSUNG"));
			productos.add(new Producto(13,"Celular","SM-A325/4+128",100200.0,"ARGENTINA","SAMSUNG"));
			productos.add(new Producto(14,"Celular","Moto G52 Negro Azul",170000.0,"ARGENTINA","MOTOROLA"));
			productos.add(new Producto(15,"Celular","Smartphone 6' 32GB+1GB",160000.0,"ARGENTINA","SAMSUNG"));
			productos.add(new Producto(16,"Lavarropas","Lavarropas semi 7 kgs",75000.0,"ARGENTINA","GAFA"));
			productos.add(new Producto(17,"Lavarropas","NEXT 10·12 P ECO",13500.0,"ARGENTINA","PATRIOT"));
			productos.add(new Producto(18,"Lavarropas","LAVARROPAS CARGA SUPERIOR DIGI FIT BLANCO",15000.0,"ARGENTINA","DREAN"));
			productos.add(new Producto(19,"Lavarropas","LAVARROPAS CARGA SUPERIOR FUZZY FIT BLANCO",17999.0,"ARGENTINA","DREAN"));
			productos.add(new Producto(20,"Lavarropas","LAVARROPAS CARGA SUPERIOR GAFA FUZZY FIT PLATA",13900.0,"ARGENTINA","Columbia"));
			productos.add(new Producto(21,"Lavasecarropas","GVSW 286TC3-12",12200.0,"ARGENTINA","CANDY"));
			productos.add(new Producto(22,"Televisores","TV MOTOROLA 50\"",45000.0,"ARGENTINA","MOTOROLA"));
			productos.add(new Producto(23,"Televisores","50\" - ULTRA HD Smart",20000.0,"ARGENTINA","LG"));
			productos.add(new Producto(24,"Televisores","Split On/Off 2750W FC",50000.0,"ARGENTINA","NOBLEX"));
			productos.add(new Producto(25,"Televisores","TV.LED 55\"LG 55UP7750PSB 4K.",60200.0,"ARGENTINA","SAMSUNG"));
			productos.add(new Producto(26,"Televisores","Smart TV 4K 50´ Sist Operativo Vidaa",30000.0,"ARGENTINA","SAMGUNG"));
			productos.add(new Producto(27,"Televisores","Smart TV 4K 50´ Sist Operativo Android Tv",10200.0,"ARGENTINA","SAMSUNG"));
			productos.add(new Producto(28,"Televisores","TELEVISOR HYUNDAI 50 PULGADAS. DEFINICION ULTRA HD. TECNOLOGÍA ANDROID TV.",15000.0,"ARGENTINA","HYUNDAI"));
			productos.add(new Producto(29,"Televisores","TCL LED L55P725 UHD Google TV-RV",35200.0,"ARGENTINA","TCL"));
			productos.add(new Producto(30,"Televisores","TCL LED L55P735 UHD Google TV",12000.0,"ARGENTINA","TCL"));
		}
		return productos;
	}

	public static void setProductos(List<Producto> productos) {
		CollectionProducto.productos = productos;
	}
	
	public static List<Producto> buscarProductosAhora30(List<Producto> listaNormal ){
		List<Producto> lista = new ArrayList<Producto>();
		for(Producto p: productos) {
			if(p.getOrigen().equals("ARGENTINA")) {
				lista.add(p);
			}
		}
		return lista;
	}
	
	public static Producto buscarProductoPorCodigo(int codigo){
		Iterator<Producto> iterator = productos.iterator();
		Producto encontrado=null;
		while(iterator.hasNext()){
		    Producto p = (Producto) iterator.next();
		    if(p.getCodigo() == codigo){
		    	encontrado=p;
		    }
		}
		return encontrado;
	}
	
	public static Producto buscarProductoPorCodigoAhora30(int codigo,List<Producto>listaAhora30){
		List<Producto> lista = CollectionProducto.buscarProductosAhora30(listaAhora30);
		
		Iterator<Producto> iterator = lista.iterator();
		Producto encontrado=null;
		while(iterator.hasNext()){
		    Producto p = (Producto) iterator.next();
		    if(p.getCodigo() == codigo){
		    	encontrado=p;
		    }
		}
		return encontrado;
	}
}
