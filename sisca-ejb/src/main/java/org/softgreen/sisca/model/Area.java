package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the area database table.
 * 
 */
@Entity
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_area")
	private Integer idArea;

	private String denominacion;

	private Boolean estado;

	@Column(name="tipo_area")
	private String tipoArea;

	//bi-directional many-to-one association to Empresa
	@ManyToOne
	@JoinColumn(name="numero_ruc")
	private Empresa empresa;

	//bi-directional many-to-one association to TrabajadorHistorialLaboral
	@OneToMany(mappedBy="area")
	private List<TrabajadorHistorialLaboral> trabajadorHistorialLaborals;

	public Area() {
	}

	public Integer getIdArea() {
		return this.idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

	public String getDenominacion() {
		return this.denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getTipoArea() {
		return this.tipoArea;
	}

	public void setTipoArea(String tipoArea) {
		this.tipoArea = tipoArea;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<TrabajadorHistorialLaboral> getTrabajadorHistorialLaborals() {
		return this.trabajadorHistorialLaborals;
	}

	public void setTrabajadorHistorialLaborals(List<TrabajadorHistorialLaboral> trabajadorHistorialLaborals) {
		this.trabajadorHistorialLaborals = trabajadorHistorialLaborals;
	}

}