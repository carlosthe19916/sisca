package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sucursal database table.
 * 
 */
@Entity
public class Sucursal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_sucursal")
	private Integer idSucursal;

	private String denominacion;

	private String direccion;

	private Boolean estado;

	private String ubigeo;

	//bi-directional many-to-one association to Local
	@OneToMany(mappedBy="sucursal")
	private List<Local> locals;

	//bi-directional many-to-one association to Empresa
	@ManyToOne
	@JoinColumn(name="numero_ruc")
	private Empresa empresa;

	public Sucursal() {
	}

	public Integer getIdSucursal() {
		return this.idSucursal;
	}

	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
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

	public List<Local> getLocals() {
		return this.locals;
	}

	public void setLocals(List<Local> locals) {
		this.locals = locals;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}