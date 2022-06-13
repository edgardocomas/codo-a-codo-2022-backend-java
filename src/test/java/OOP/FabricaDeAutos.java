package OOP;

public class FabricaDeAutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Auto fiatUno = new Auto();  // es el constructor
			// quiero ver la velocidad del auto
			System.out.println("velocidad actual = " + fiatUno.velocidad);
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
