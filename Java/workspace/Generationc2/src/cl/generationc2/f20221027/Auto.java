package cl.generationc2.f20221027;

public class Auto { //hemos creado nuestro primer objeto

	//atributos
	private  String marca; //Nissan
	private String color; //negro
	private String modelo; //ñuñuqui
	private Float cilindrada; //1.6 o 2.4
	private Float rendimiento; //10.5km/l
	private Float velocidad; //km/l
	

	
	//private->restringe la entrada al dato (encapsulamiento, herencia)
	
	//constructor
	//permite instanciar al objeto
	//nos permite inicializar los atributos
	
	public Auto() {
		super();
		
	}



	public Auto(String marca, String color, String modelo, Float cilindrada, Float rendimiento, Float velocidad) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.rendimiento = rendimiento;
		this.velocidad = velocidad;
	}

	//getters y setters (accesador y mutador)

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public Float getCilindrada() {
		return cilindrada;
	}



	public void setCilindrada(Float cilindrada) {
		this.cilindrada = cilindrada;
	}



	public Float getRendimiento() {
		return rendimiento;
	}



	public void setRendimiento(Float rendimiento) {
		this.rendimiento = rendimiento;
	}



	public Float getVelocidad() {
		return velocidad;
	}



	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}
	
	//metodos del objeto(acciones)
	
	public void avanzar()
	{
		System.out.println("Estoy en el metodo avanzar del objeto");
	}



	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ ", rendimiento=" + rendimiento + ", velocidad=" + velocidad + "]";
	}
	
}
