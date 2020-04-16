package pe.upc.basico.main;

public class App04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("----------------");
		i=0;
		
		while (true) {
			System.out.println(i);
			i++;
			if (i==10)
				break; //sale del switch, while, for, do while
		}
		
		System.out.println("Fin!");

	}

}
