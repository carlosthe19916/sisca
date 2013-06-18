package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the vacacion_detalle database table.
 * 
 */
@Entity
@Table(name = "vacacion_detalle")
public class VacacionDetalle implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_vacacion_detalle")
	private Integer idVacacionDetalle;

	private Integer estado;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_tomada")
	private Date fechaTomada;

	private String tipo;

	// bi-directional many-to-one association to Vacacion
	@ManyToOne
	@JoinColumn(name = "id_vacacion")
	private Vacacion vacacion;

	public VacacionDetalle() {
	}

	public Integer getIdVacacionDetalle() {
		return this.idVacacionDetalle;
	}

	public void setIdVacacionDetalle(Integer idVacacionDetalle) {
		this.idVacacionDetalle = idVacacionDetalle;
	}

	public Integer getEstado() {
		return this.estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public Date getFechaTomada() {
		return this.fechaTomada;
	}

	public void setFechaTomada(Date fechaTomada) {
		this.fechaTomada = fechaTomada;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Vacacion getVacacion() {
		return this.vacacion;
	}

	public void setVacacion(Vacacion vacacion) {
		this.vacacion = vacacion;
	}

}