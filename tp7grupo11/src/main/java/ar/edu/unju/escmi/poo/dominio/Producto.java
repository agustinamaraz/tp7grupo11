package ar.edu.unju.escmi.poo.dominio;

public class Producto {
	private long codigo;
	private String nombreProducto;
	private String descripcion;
	private double precioUnitario;
	private String origen;
	private String marca;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public Producto(long codigo,String nombreProducto, String descripcion, double precioUnitario, String origen, String marca) {
		super();
		this.codigo = codigo;
		this.nombreProducto = nombreProducto;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.origen = origen;
		this.marca = marca;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario
				+ ", origen=" + origen + ", marca=" + marca + "]";
	}
	
}
