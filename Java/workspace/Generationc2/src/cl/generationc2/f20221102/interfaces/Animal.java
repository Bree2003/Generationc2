package cl.generationc2.f20221102.interfaces;

public abstract class Animal {

	private float peso;
	private float altura;
	
	public Animal() {
		super();
	}

	public Animal(float peso, float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	/*public void metodoEnAnimal() {
		System.out.println("Estoy en el metodo de animal");
	}*/
	
	//definicion del metodo
	public abstract void metodoEnAnimal();
	
}
