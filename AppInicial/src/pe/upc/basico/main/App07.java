package pe.upc.basico.main;

import pe.up.basico.entidades.Producto;
import pe.up.basico.negocio.Negocio;

public class App07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto = new Producto();
		producto.setCodigo(100);
		producto.setDescripcion("Mouse");
		producto.setPrecio(20);
		
		Negocio negocio = new Negocio();
		double descuento, total;
		descuento = negocio.obtenerDescuento(producto);
		total = negocio.calcularTotal(producto);
		System.out.println("Descuento:" + descuento + " Total:" + total);

	}

}
