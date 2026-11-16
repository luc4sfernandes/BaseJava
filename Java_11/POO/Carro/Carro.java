public class Carro {
	Motor motor = new Motor();

	public void acelerar() {
		if(motor.fatorInjecao < 2.6){
			motor.fatorInjecao += 0.4;	
		}
	}

	public void frear() {
		if(motor.fatorInjecao > 0.5){
			motor.fatorInjecao -= 0.4;	
		}
	}

	public void ligar() {
		motor.ligado = true;
	}

	public void desligar() {
		motor.ligado = false;
	}

	public boolean estaLigado(){
		return motor.ligado;
	}
}
