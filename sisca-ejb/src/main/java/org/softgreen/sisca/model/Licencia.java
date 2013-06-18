package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the licencia database table.
 * 
 */
@Entity
@Table(name="licencia")
public class Licencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_licencia")
	private Integer idLicencia;

	private String documento;

	private Boolean estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_fin")
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inicio")
	private Date fechaInicio;

	@Column(name="id_trabajador_historial_laboral")
	private Integer idTrabajadorHistorialLaboral;

	private String observacion;

	//bi-directional many-to-one association to LicenciaTipo
	@ManyToOne
	@JoinColumn(name="id_licencia_tipo")
	private LicenciaTipo licenciaTipo;

	public Licencia() {
	}

	public Integer getIdLicencia() {
		return this.idLicencia;
	}

	public void setIdLicencia(Integer idLicencia) {
		this.idLicencia = idLicencia;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
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

	public Integer getIdTrabajadorHistorialLaboral() {
		return this.idTrabajadorHistorialLaboral;
	}

	public void setIdTrabajadorHistorialLaboral(Integer idTrabajadorHistorialLaboral) {
		this.idTrabajadorHistorialLaboral = idTrabajadorHistorialLaboral;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public LicenciaTipo getLicenciaTipo() {
		return this.licenciaTipo;
	}

	public void setLicenciaTipo(LicenciaTipo licenciaTipo) {
		this.licenciaTipo = licenciaTipo;
	}

}