package cl.generationc2.web.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name="roles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rol {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private String descripcion;
	
	//ManyToMany rol
		
		@ManyToMany(mappedBy = "roles",fetch = FetchType.LAZY)
		private List<Usuario> usuarios;


		

}
