package OOP;

public class FabricaDeAutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    Motor motorDesdeAfuera = new Motor("MCLAREN",150f);
			Auto fiatUno = new Auto(220f,"RENAULT",motorDesdeAfuera);  // es el constructor
			// quiero ver la velocidad del auto
			System.out.println("velocidad actual = " + fiatUno.getVelocidad());
			fiatUno.encender();
			fiatUno.encender();
			fiatUno.apagar();
			fiatUno.apagar();
			fiatUno.encender();
			fiatUno.acelerar();
			fiatUno.verVelocidad();
			fiatUno.acelerar();
			fiatUno.verVelocidad();
			fiatUno.acelerar();
			fiatUno.verVelocidad();
			fiatUno.acelerar();
			fiatUno.verVelocidad();
			fiatUno.acelerar();
			fiatUno.verVelocidad();
			fiatUno.frenar();
			fiatUno.verVelocidad();
			fiatUno.apagar();
			System.out.println("FIN");
	}

}
