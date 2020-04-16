package pe.upc.basico.main;

import pe.up.basico.entidades.Producto;
import pe.up.basico.negocio.Negocio;

public class App05 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto = new Producto();
		producto.setCodigo(20);
		producto.setDescripcion("Gasesosa");
		producto.setPrecio(2.50);
		
		Negocio negocio = new Negocio();
		double descuento;
		descuento = negocio.obtenerDescuento(producto);
		System.out.println("Descuento:" + descuento);
		
	

	}

}
