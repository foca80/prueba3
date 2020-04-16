package pe.upc.basico.main;

import java.util.ArrayList;
import java.util.List;

import pe.up.basico.entidades.Producto;

public class App06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Producto>  lista = new ArrayList<>();
		Producto producto1 = new Producto();
		producto1.setCodigo(100);
		producto1.setDescripcion("Fanta");
		producto1.setPrecio(2.0);
		lista.add(producto1);
		Producto producto2 = new Producto();
		producto2.setCodigo(200);
		producto2.setDescripcion("Coca Cola");
		producto2.setPrecio(2.5);
		lista.add(producto2);
		
		for (Producto p:lista) {
			System.out.println(p.getCodigo() + "   " + p.getDescripcion() + "  " + p.getPrecio());
		}
		

	}

}
