package codo.a.codo;
import java.util.Scanner;
public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nota");
        int n = teclado.nextInt();
        
        for(int i=0;i<n;i++) {
        	System.out.println(i);
        }
        
        
        // cierro el teclado
        teclado.close();
	}

}
