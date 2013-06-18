package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the vacacion database table.
 * 
 */
@Entity
@Table(name="vacacion")
public class Vacacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_vacacion")
	private Integer idVacacion;

	private Integer anio;

	@Column(name="cantidad_dias")
	private Integer cantidadDias;

	private Boolean estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_fin")
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inicio")
	private Date fechaInicio;

	@Column(name="id_trabajador")
	private Integer idTrabajador;

	//bi-directional many-to-one association to VacacionDetalle
	@OneToMany(mappedBy="vacacion")
	private List<VacacionDetalle> vacacionDetalles;

	public Vacacion() {
	}

	public Integer getIdVacacion() {
		return this.idVacacion;
	}

	public void setIdVacacion(Integer idVacacion) {
		this.idVacacion = idVacacion;
	}

	public Integer getAnio() {
		return this.anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Integer getCantidadDias() {
		return this.cantidadDias;
	}

	public void setCantidadDias(Integer cantidadDias) {
		this.cantidadDias = cantidadDias;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Integer getIdTrabajador() {
		return this.idTrabajador;
	}

	public void setIdTrabajador(Integer idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public List<VacacionDetalle> getVacacionDetalles() {
		return this.vacacionDetalles;
	}

	public void setVacacionDetalles(List<VacacionDetalle> vacacionDetalles) {
		this.vacacionDetalles = vacacionDetalles;
	}

}