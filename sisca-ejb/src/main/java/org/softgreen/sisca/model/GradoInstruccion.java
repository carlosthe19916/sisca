package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the grado_instruccion database table.
 * 
 */
@Entity
@Table(name="grado_instruccion")
public class GradoInstruccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_grado_instruccion")
	private Integer idGradoInstruccion;

	private String abreviatura;

	private String denominacion;

	private Boolean estado;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="gradoInstruccion")
	private List<Persona> personas;

	public GradoInstruccion() {
	}

	public Integer getIdGradoInstruccion() {
		return this.idGradoInstruccion;
	}

	public void setIdGradoInstruccion(Integer idGradoInstruccion) {
		this.idGradoInstruccion = idGradoInstruccion;
	}

	public String getAbreviatura() {
		return this.abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
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

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

}