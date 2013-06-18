package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the condicion_laboral database table.
 * 
 */
@Entity
@Table(name="condicion_laboral")
public class CondicionLaboral implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_condicion_laboral")
	private Integer idCondicionLaboral;

	private String denominacion;

	private Boolean estado;

	private String observacion;

	//bi-directional many-to-one association to TrabajadorHistorialLaboral
	@OneToMany(mappedBy="condicionLaboral")
	private List<TrabajadorHistorialLaboral> trabajadorHistorialLaborals;

	public CondicionLaboral() {
	}

	public Integer getIdCondicionLaboral() {
		return this.idCondicionLaboral;
	}

	public void setIdCondicionLaboral(Integer idCondicionLaboral) {
		this.idCondicionLaboral = idCondicionLaboral;
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

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public List<TrabajadorHistorialLaboral> getTrabajadorHistorialLaborals() {
		return this.trabajadorHistorialLaborals;
	}

	public void setTrabajadorHistorialLaborals(List<TrabajadorHistorialLaboral> trabajadorHistorialLaborals) {
		this.trabajadorHistorialLaborals = trabajadorHistorialLaborals;
	}

}