package oop2;

import OOP.Auto;
import OOP.Motor;
import OOP.Estereo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ahora Auto tiene un constructor publico
		// composicion
		Motor motorDesdeAfuera = new Motor("MCLAREN",150f);
		Auto auto = new Auto(220f,"RENAULT",motorDesdeAfuera);
		
		// asociacion
		Estereo e 	= new Estereo();
		auto.setEstereo(e);
		
		// defino la marca
		auto.setMarca("RENAULT");
		auto.getMarca();
	}

}
