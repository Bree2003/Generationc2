package cl.generationc2.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		//instancia de clase->creacion o referencia de un nuevo objeto
		Auto auto1 = new Auto(); //aqui estamos inicializando/parentesis es el constructor
		//asignar valores a los atributos privados
		auto1.setColor("rojo"); //solo a traves del metodo setter
		auto1.setMarca("Peugeot");
		
		//consultar el contenido de los atributos
		System.out.println(auto1.getColor());
		System.out.println(auto1.getModelo());
		auto1.setColor("blanco");
		System.out.println(auto1.getColor());
		//saber contenido de los atributos
		System.out.println(auto1);
		//nueva instancia de Auto
		Auto car = new Auto("Nissan","Negro","Qasqai",1.6f,10.0f,240f);
		System.out.println(car);
		System.out.println(car.toString());
	}

}
