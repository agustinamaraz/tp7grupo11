package ar.edu.unju.escmi.poo.collections;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.escmi.poo.dominio.Stock;

public abstract class CollectionStock {
	public static List<Stock> stocks;
	public CollectionStock() {
		// TODO Auto-generated constructor stub
	}
	public static List<Stock> getStocks() {
		if(stocks==null) {
			stocks = new ArrayList<Stock>();
		}
		
		stocks.add(new Stock(150,CollectionProducto.buscarProductoPorCodigo(1)));
		stocks.add(new Stock(100,CollectionProducto.buscarProductoPorCodigo(2)));
		stocks.add(new Stock(200,CollectionProducto.buscarProductoPorCodigo(3)));
		stocks.add(new Stock(150,CollectionProducto.buscarProductoPorCodigo(4)));
		stocks.add(new Stock(160,CollectionProducto.buscarProductoPorCodigo(5)));
		stocks.add(new Stock(200,CollectionProducto.buscarProductoPorCodigo(6)));
		stocks.add(new Stock(140,CollectionProducto.buscarProductoPorCodigo(7)));
		stocks.add(new Stock(130,CollectionProducto.buscarProductoPorCodigo(8)));
		stocks.add(new Stock(180,CollectionProducto.buscarProductoPorCodigo(9)));
		stocks.add(new Stock(150,CollectionProducto.buscarProductoPorCodigo(10)));
		stocks.add(new Stock(199,CollectionProducto.buscarProductoPorCodigo(11)));
		stocks.add(new Stock(230,CollectionProducto.buscarProductoPorCodigo(12)));
		stocks.add(new Stock(240,CollectionProducto.buscarProductoPorCodigo(13)));
		stocks.add(new Stock(180,CollectionProducto.buscarProductoPorCodigo(14)));
		stocks.add(new Stock(170,CollectionProducto.buscarProductoPorCodigo(15)));
		stocks.add(new Stock(200,CollectionProducto.buscarProductoPorCodigo(16)));
		stocks.add(new Stock(100,CollectionProducto.buscarProductoPorCodigo(17)));
		stocks.add(new Stock(75,CollectionProducto.buscarProductoPorCodigo(18)));
		stocks.add(new Stock(80,CollectionProducto.buscarProductoPorCodigo(19)));
		stocks.add(new Stock(160,CollectionProducto.buscarProductoPorCodigo(20)));
		stocks.add(new Stock(150,CollectionProducto.buscarProductoPorCodigo(21)));
		stocks.add(new Stock(100,CollectionProducto.buscarProductoPorCodigo(22)));
		stocks.add(new Stock(150,CollectionProducto.buscarProductoPorCodigo(23)));
		stocks.add(new Stock(150,CollectionProducto.buscarProductoPorCodigo(24)));
		stocks.add(new Stock(160,CollectionProducto.buscarProductoPorCodigo(25)));
		stocks.add(new Stock(131,CollectionProducto.buscarProductoPorCodigo(26)));
		stocks.add(new Stock(166,CollectionProducto.buscarProductoPorCodigo(27)));
		stocks.add(new Stock(170,CollectionProducto.buscarProductoPorCodigo(28)));
		stocks.add(new Stock(200,CollectionProducto.buscarProductoPorCodigo(29)));
		stocks.add(new Stock(300,CollectionProducto.buscarProductoPorCodigo(30)));
		
		return stocks;
	}
	public static void setStocks(List<Stock> stocks) {
		CollectionStock.stocks = stocks;
	}
	
	/*public List<Stock> mostrarStock(){
		return arrayList<Stock>();
	}*/
	
	public static boolean decrementarStockProducto(long codigo, int cantidad) {
		boolean decrementoPosible=false;
		for(int i=0;i<stocks.size();i++) {
			if(stocks.get(i).getProducto().getCodigo() == codigo) {
				if(stocks.get(i).getCantidad()>=cantidad && stocks.get(i).getCantidad()-cantidad >= 0 && cantidad>0) {
					stocks.get(i).setCantidad(stocks.get(i).getCantidad()-cantidad);
					decrementoPosible=true;
				}
			}
		}
		return decrementoPosible;
	}
	
}
