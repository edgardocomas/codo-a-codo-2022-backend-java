package OOP;

public class Auto {
    // atributos de la clase deben ser privados
	private String color;
	private int anio;
	private long serie;
	private String marca;
	private String modelo;
	private float velocidad;
	private float velocidadMaxima;
	private boolean encendido;
	
	private Motor motor;
	private Estereo estereo;
	
	// nacimiento del objeto: constructor
	public Auto(float velocidadMaxima, String marca, Motor motor) {
		this.setVelocidadMaxima(velocidadMaxima);
		this.setVelocidad(0); // velocidad = 0;
		this.setAnio(2022);  // anio      = 2022;
		this.setEncendido(false);// encendido = false;
		this.setMarca(marca);
		this.setMotor(motor);
	}
	public void setMotor(Motor motor) {
		if(motor==null) {
			Motor motorInterno = new Motor("default",100f);
			this.motor = motorInterno;
		} else {
			this.motor = motor;	
		}
	}
	
	public Motor getMotor() {
		return this.motor;
	}
	
	public void setEstereo(Estereo nuevoestereo) {
		this.estereo = nuevoestereo;
	}
	
	//metodos
	public void encender() {
		if(encendido) {
			System.out.println("Ya esta encendido el auto!!");
		} else {
		    System.out.println("Se ha encendido el auto");
		    encendido = true;
		}
	}

	public void apagar() {
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
	
	public void acelerar() {
		if (this.isEncendido()) {
			if (this.getVelocidad()<this.getVelocidadMaxima()) {
				this.setVelocidad(this.getVelocidad()+1);
			}else {
				System.out.println("Se alcanzo la velociad maxima !!");
			}
		} else {
			System.out.println("El auto esta esta apagado !!");
		}
		
	}
	public void verVelocidad() {
		System.out.println("Veocidad = " + velocidad);
	}
	
	public void frenar() {
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
	
	public String getMarca() {
		// logica oculta al mundo exterior
		// wrapper: clases que guardan datos primitivos y contienen metodos 
		// byte < short < int < long < float < double
		// boolean
		// char
		// String edad = "10";
		// wraper
		//  int edadInt = Integer.parseInt(edad);
		//  String algo;        // por defecto vale null
		//  Integer otraCosa;  // por defecto vale null
		// int algoInt;       // vale 0 por el tipo de dato
		// return marca;
		
		return marca == null ? "" : marca;
		
	}
	
	public void setMarca(String Marca) {
	     this.marca = marca;	// this accedo adentro de la clase
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public long getSerie() {
		return serie;
	}

	private void setSerie(long serie) {
		this.serie = serie;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getVelocidad() {
		return velocidad;
	}

	private void setVelocidad(float velocidad) {
		if (velocidad < 0) {
			this.velocidad = 0;
		} else {
			this.velocidad = velocidad;
		}
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	private void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
                   // es un primitivo se genera un is si es un WRAPPER se genera un get
	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
}
