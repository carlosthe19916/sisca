package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;


/**
 * The persistent class for the horario_detalle database table.
 * 
 */
@Entity
@Table(name="horario_detalle")
public class HorarioDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_horario_detalle")
	private Integer idHorarioDetalle;

	private Boolean domingo;

	private Boolean estado;

	@Column(name="hora_fin")
	private Time horaFin;

	@Column(name="hora_inicio")
	private Time horaInicio;

	private Boolean jueves;

	private Boolean lunes;

	private Boolean martes;

	private Boolean miercoles;

	private Boolean sabado;

	private Boolean viernes;

	//bi-directional many-to-one association to Horario
	@ManyToOne
	@JoinColumn(name="id_horario")
	private Horario horario;

	public HorarioDetalle() {
	}

	public Integer getIdHorarioDetalle() {
		return this.idHorarioDetalle;
	}

	public void setIdHorarioDetalle(Integer idHorarioDetalle) {
		this.idHorarioDetalle = idHorarioDetalle;
	}

	public Boolean getDomingo() {
		return this.domingo;
	}

	public void setDomingo(Boolean domingo) {
		this.domingo = domingo;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Time getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Time horaFin) {
		this.horaFin = horaFin;
	}

	public Time getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Time horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Boolean getJueves() {
		return this.jueves;
	}

	public void setJueves(Boolean jueves) {
		this.jueves = jueves;
	}

	public Boolean getLunes() {
		return this.lunes;
	}

	public void setLunes(Boolean lunes) {
		this.lunes = lunes;
	}

	public Boolean getMartes() {
		return this.martes;
	}

	public void setMartes(Boolean martes) {
		this.martes = martes;
	}

	public Boolean getMiercoles() {
		return this.miercoles;
	}

	public void setMiercoles(Boolean miercoles) {
		this.miercoles = miercoles;
	}

	public Boolean getSabado() {
		return this.sabado;
	}

	public void setSabado(Boolean sabado) {
		this.sabado = sabado;
	}

	public Boolean getViernes() {
		return this.viernes;
	}

	public void setViernes(Boolean viernes) {
		this.viernes = viernes;
	}

	public Horario getHorario() {
		return this.horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

}