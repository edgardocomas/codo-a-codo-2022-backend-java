package OOP;

public class Auto {
    // atributos de la clase
	String color;
	int anio;
	long serie;
	String marca;
	String modelo;
	float velocidad;
	float velocidadMaxima;
	boolean encendido;
	
	// nacimiento del objeto: constructor
	Auto() {
		velocidad = 0;
		anio      = 2022;
		marca     = "sin marca";
		modelo    = "sin modelo";
		encendido = false;
		velocidadMaxima = 3;
	}
	
	//metodos
	void encender() {
		if(encendido) {
			System.out.println("Ya esta encendido el auto!!");
		} else {
		    System.out.println("Se ha encendido el auto");
		    encendido = true;
		}
	}

	void apagar() {
		if (encendido) {
			System.out.println("Se ha apagado el auto");
			
			while (velocidad>0) {
				System.out.println("Frenando");
				frenar();
			}
			encendido = false;
		} else {
			System.out.println("Ya esta apagado el auto!!");
		}
		
	}
	
	void acelerar() {
		if (encendido) {
			if (velocidad<velocidadMaxima) {
				velocidad++;
			}else {
				System.out.println("Se alcanzo la velociad maxima !!");
			}
		} else {
			System.out.println("El auto esta esta apagado !!");
		}
		
	}
	void verVelocidad() {
		System.out.println("Veocidad = " + velocidad);
	}
	
	void frenar() {
		if (encendido) {
			if (velocidad>0) {
				velocidad--;
			}else {
				System.out.println("El auto esta parado !!");
			}
		} else {
			System.out.println("El auto esta esta apagado !!");
		}	
	}
	
}
