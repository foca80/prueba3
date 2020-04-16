package pe.up.basico.negocio;

import pe.up.basico.entidades.Producto;

public class Negocio {
    public double obtenerDescuento(Producto producto) {
    	return producto.getPrecio()*0.10;
    }
    public double calcularTotal(Producto producto) {
    	double descuento;
    	descuento = producto.getPrecio() - obtenerDescuento(producto);
    	return descuento;
    }
}
