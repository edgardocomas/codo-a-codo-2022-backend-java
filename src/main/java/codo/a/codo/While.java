package codo.a.codo;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int contador = 10;
		while (contador>0) {
			System.out.println("contador:" + contador);
			
			if (contador==3) {
				continue; /* en este caso se salta las lineas siguientes entramos en un lazo infinito.*/
			}
			
			if (contador % 2 == 0) {
				System.out.println("contador par:" + contador);
			} else {
				System.out.println("contador impar:" + contador);
			}

			if (contador==3) {
				break;
			}
			
			contador--;

			
		}

	}

}
