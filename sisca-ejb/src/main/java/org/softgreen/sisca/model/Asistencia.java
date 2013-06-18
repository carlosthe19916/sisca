package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the asistencia database table.
 * 
 */
@Entity
@Table(name="asistencia")
public class Asistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_asistencia")
	private Integer idAsistencia;

	private Boolean estado;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private Time hora;

	@Column(name="id_trabajador_historial_laboral")
	private Integer idTrabajadorHistorialLaboral;

	public Asistencia() {
	}

	public Integer getIdAsistencia() {
		return this.idAsistencia;
	}

	public void setIdAsistencia(Integer idAsistencia) {
		this.idAsistencia = idAsistencia;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return this.hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public Integer getIdTrabajadorHistorialLaboral() {
		return this.idTrabajadorHistorialLaboral;
	}

	public void setIdTrabajadorHistorialLaboral(Integer idTrabajadorHistorialLaboral) {
		this.idTrabajadorHistorialLaboral = idTrabajadorHistorialLaboral;
	}

}