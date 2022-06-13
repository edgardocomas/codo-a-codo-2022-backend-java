package codo.a.codo;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String[] nombres = new String[] {"nomber1","nombre2"};
		     
		    int[] array = new int[4];
           
           	array[0] = 11;
           	array[1] = 21;
           	array[2] = 12;
           	array[3] = 10;  
           	//array[4] = 10;   // ERROR
           	
           	System.out.println("FIN");
           	
           	for (int i=0;i<array.length; i++) {
           		System.out.println(array[i]);
           	}
           	System.out.println("END");
           	
           	System.out.println("Valor del indice 3 : " + array[3]);
           	
           	System.out.println("OTRA VEZ");
           	for (int aux:array) {
           		System.out.println(aux);
           	}
	}


}
