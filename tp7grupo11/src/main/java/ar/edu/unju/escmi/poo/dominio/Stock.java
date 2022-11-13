package ar.edu.unju.escmi.poo.dominio;

public class Stock {
	private int cantidad;
	private Producto producto;
	
	public Stock() {
		// TODO Auto-generated constructor stub
	}

	public Stock(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Stock [cantidad=" + cantidad + ", producto=" + producto + "]";
	}
	
}
