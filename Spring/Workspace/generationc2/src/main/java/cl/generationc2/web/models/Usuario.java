package cl.generationc2.web.models;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity 
@Table(name="usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=3, max=15,message="Error en el ingreso del nombre")
	private String nombre;
	
	@NotNull
	private String correo;
	
	@NotNull
	private String password;
	
	//relacion one to one
	@JsonIgnore
	@OneToOne(mappedBy = "usuario",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Auto auto;
	
	//relacion one to many persistencia->actualizar,guardar,eliminar
	@JsonIgnore
	@OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Direccion> direcciones;
	
	//ManyToMany
		@ManyToMany(fetch = FetchType.LAZY)
		@JsonIgnore
		@JoinTable(
				name="roles_usuarios",//nombre de la tabla relacional 
				joinColumns = @JoinColumn(name="usuario_id"),
				inverseJoinColumns = @JoinColumn(name="rol_id")
				)
		private List<Rol> roles;

	@Transient
	private String password2;
	private String nick;
	
	@Range(min=40,max=300,message="Peso fuera de rango")
	private Float peso;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy_MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy_MM-dd")
	private Date updatedAt;
	
	
	
	 public Usuario() {
		super();
	}
	 
	

	


	


	public Usuario(Long id, @NotNull @Size(min = 3, max = 15, message = "Error en el ingreso del nombre") String nombre,
			@NotNull String correo, @NotNull String password, Auto auto, List<Direccion> direcciones, List<Rol> roles,
			String password2, String nick, @Range(min = 40, max = 300, message = "Peso fuera de rango") Float peso,
			Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.auto = auto;
		this.direcciones = direcciones;
		this.roles = roles;
		this.password2 = password2;
		this.nick = nick;
		this.peso = peso;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}









	public Long getId() {
		return id;
	}









	public void setId(Long id) {
		this.id = id;
	}









	public String getNombre() {
		return nombre;
	}









	public void setNombre(String nombre) {
		this.nombre = nombre;
	}









	public String getCorreo() {
		return correo;
	}









	public void setCorreo(String correo) {
		this.correo = correo;
	}









	public String getPassword() {
		return password;
	}









	public void setPassword(String password) {
		this.password = password;
	}









	public Auto getAuto() {
		return auto;
	}









	public void setAuto(Auto auto) {
		this.auto = auto;
	}









	public List<Direccion> getDirecciones() {
		return direcciones;
	}









	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}









	public List<Rol> getRoles() {
		return roles;
	}









	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}









	public String getPassword2() {
		return password2;
	}









	public void setPassword2(String password2) {
		this.password2 = password2;
	}









	public String getNick() {
		return nick;
	}









	public void setNick(String nick) {
		this.nick = nick;
	}









	public Float getPeso() {
		return peso;
	}









	public void setPeso(Float peso) {
		this.peso = peso;
	}









	public Date getCreatedAt() {
		return createdAt;
	}









	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}









	public Date getUpdatedAt() {
		return updatedAt;
	}









	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
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
