package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the local database table.
 * 
 */
@Entity
public class Local implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_local")
	private Integer idLocal;

	private String denominacion;

	private String direccion;

	private Boolean estado;

	private String ubigeo;

	//bi-directional many-to-one association to Sucursal
	@ManyToOne
	@JoinColumn(name="id_sucursal")
	private Sucursal sucursal;

	//bi-directional many-to-one association to TrabajadorHistorialLaboral
	@OneToMany(mappedBy="local")
	private List<TrabajadorHistorialLaboral> trabajadorHistorialLaborals;

	public Local() {
	}

	public Integer getIdLocal() {
		return this.idLocal;
	}

	public void setIdLocal(Integer idLocal) {
		this.idLocal = idLocal;
	}

	public String getDenominacion() {
		return this.denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getUbigeo() {
		return this.ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public Sucursal getSucursal() {
		return this.sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public List<TrabajadorHistorialLaboral> getTrabajadorHistorialLaborals() {
		return this.trabajadorHistorialLaborals;
	}

	public void setTrabajadorHistorialLaborals(List<TrabajadorHistorialLaboral> trabajadorHistorialLaborals) {
		this.trabajadorHistorialLaborals = trabajadorHistorialLaborals;
	}

}