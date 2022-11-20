package cl.generationc2.web.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="ventas")
public class Venta {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Float monto;
	
	//many to may
	@JsonIgnore
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="autos_ventas", //nombre de la tabla relacional
			joinColumns=@JoinColumn(name="venta_id"),
			inverseJoinColumns=@JoinColumn(name="auto_id")
			)
	private List<Auto> autos;
	
	

}
