package ar.edu.unju.escmi.poo.dominio;

public class Detalle {
	private int cantidad;
	private double importe;
	private Producto producto;
	
	public Detalle() {
		// TODO Auto-generated constructor stub
	}
	
	public Detalle(int cantidad, Producto producto) {
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

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public void calcularImporte() {
		this.importe = (this.cantidad*(this.producto.getPrecioUnitario()));
	}

	@Override
	public String toString() {
		return "Detalle [cantidad=" + cantidad + ", importe=" + importe + ", producto=" + producto + "]";
	}
	
	
}
