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

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="autos_ventas")
public class AutosVentas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Integer cantidad;
	
	private Float valorUnitario;
	
	private Float total; //cantidad*valorunitario
	
	//relacion many to many = 2 many to one
	
	//1 many to one
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="auto_id")
	private Auto auto;
	
	//2 many to one
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="venta_id")
	private Venta venta;
	

	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy_MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy_MM-dd")
	private Date updatedAt;
	

	public AutosVentas() {
		super();
	}

	public AutosVentas(Long id, Integer cantidad, Float valorUnitario, Float total, Auto auto, Venta venta) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
		this.total = total;
		this.auto = auto;
		this.venta = venta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Float getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
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
