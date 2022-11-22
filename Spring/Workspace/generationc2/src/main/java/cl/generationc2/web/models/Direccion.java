package cl.generationc2.web.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="direcciones")
public class Direccion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String calle;
	
	@NotNull
	private String numero;
	
	//relacion many to one
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy_MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy_MM-dd")
	private Date updatedAt;
	

	

	public Direccion() {
		super();
	}

	public Direccion(Long id, @NotNull String calle, @NotNull String numero, Usuario usuario, Date createdAt,
			Date updatedAt) {
		super();
		this.id = id;
		this.calle = calle;
		this.numero = numero;
		this.usuario = usuario;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	//atributos de control
	//agrega a la columna la fecha antes de insertar
	@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	//fecha en la que se actualiza
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	    

}
