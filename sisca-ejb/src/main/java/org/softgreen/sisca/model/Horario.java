package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.List;


/**
 * The persistent class for the horario database table.
 * 
 */
@Entity
@Table(name="horario")
public class Horario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_horario")
	private Integer idHorario;

	private String denominacion;

	private Boolean estado;

	@Column(name="tipo_horario")
	private String tipoHorario;

	@Column(name="total_horas_semana")
	private Time totalHorasSemana;

	//bi-directional many-to-one association to HorarioDetalle
	@OneToMany(mappedBy="horario")
	private List<HorarioDetalle> horarioDetalles;

	//bi-directional many-to-one association to TrabajadorHistorialHorario
	@OneToMany(mappedBy="horario")
	private List<TrabajadorHistorialHorario> trabajadorHistorialHorarios;

	public Horario() {
	}

	public Integer getIdHorario() {
		return this.idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
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

	public String getTipoHorario() {
		return this.tipoHorario;
	}

	public void setTipoHorario(String tipoHorario) {
		this.tipoHorario = tipoHorario;
	}

	public Time getTotalHorasSemana() {
		return this.totalHorasSemana;
	}

	public void setTotalHorasSemana(Time totalHorasSemana) {
		this.totalHorasSemana = totalHorasSemana;
	}

	public List<HorarioDetalle> getHorarioDetalles() {
		return this.horarioDetalles;
	}

	public void setHorarioDetalles(List<HorarioDetalle> horarioDetalles) {
		this.horarioDetalles = horarioDetalles;
	}

	public List<TrabajadorHistorialHorario> getTrabajadorHistorialHorarios() {
		return this.trabajadorHistorialHorarios;
	}

	public void setTrabajadorHistorialHorarios(List<TrabajadorHistorialHorario> trabajadorHistorialHorarios) {
		this.trabajadorHistorialHorarios = trabajadorHistorialHorarios;
	}

}