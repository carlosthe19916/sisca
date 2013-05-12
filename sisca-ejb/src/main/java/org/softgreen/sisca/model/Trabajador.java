package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the trabajador database table.
 * 
 */
@Entity
public class Trabajador implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_trabajador")
	private Integer idTrabajador;

	private String celular;

	private String email;

	private String especialidad;

	private Boolean estado;

	@Column(name="numero_ruc")
	private String numeroRuc;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="numero_dni")
	private Persona persona;

	//bi-directional many-to-one association to TrabajadorHistorialLaboral
	@OneToMany(mappedBy="trabajador")
	private List<TrabajadorHistorialLaboral> trabajadorHistorialLaborals;

	public Trabajador() {
	}

	public Integer getIdTrabajador() {
		return this.idTrabajador;
	}

	public void setIdTrabajador(Integer idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getNumeroRuc() {
		return this.numeroRuc;
	}

	public void setNumeroRuc(String numeroRuc) {
		this.numeroRuc = numeroRuc;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<TrabajadorHistorialLaboral> getTrabajadorHistorialLaborals() {
		return this.trabajadorHistorialLaborals;
	}

	public void setTrabajadorHistorialLaborals(List<TrabajadorHistorialLaboral> trabajadorHistorialLaborals) {
		this.trabajadorHistorialLaborals = trabajadorHistorialLaborals;
	}

}