package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trabajador_historial_horarios database table.
 * 
 */
@Entity
@Table(name="trabajador_historial_horarios")
public class TrabajadorHistorialHorario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_trabajador_historial_horarios")
	private Integer idTrabajadorHistorialHorarios;

	@Column(name="id_trabajador_historial_laboral")
	private Integer idTrabajadorHistorialLaboral;

	//bi-directional many-to-one association to Horario
	@ManyToOne
	@JoinColumn(name="id_horario")
	private Horario horario;

	public TrabajadorHistorialHorario() {
	}

	public Integer getIdTrabajadorHistorialHorarios() {
		return this.idTrabajadorHistorialHorarios;
	}

	public void setIdTrabajadorHistorialHorarios(Integer idTrabajadorHistorialHorarios) {
		this.idTrabajadorHistorialHorarios = idTrabajadorHistorialHorarios;
	}

	public Integer getIdTrabajadorHistorialLaboral() {
		return this.idTrabajadorHistorialLaboral;
	}

	public void setIdTrabajadorHistorialLaboral(Integer idTrabajadorHistorialLaboral) {
		this.idTrabajadorHistorialLaboral = idTrabajadorHistorialLaboral;
	}

	public Horario getHorario() {
		return this.horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

}