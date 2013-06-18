package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the trabajador_historial_laboral database table.
 * 
 */
@Entity
@Table(name="trabajador_historial_laboral")
public class TrabajadorHistorialLaboral implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_trabajador_historial_laboral")
	private Integer idTrabajadorHistorialLaboral;

	private String cargo;

	@Column(name="codigo_biometrico")
	private String codigoBiometrico;

	@Column(name="documento_contrato")
	private String documentoContrato;

	private Boolean estado;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_cese")
	private Date fechaCese;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_contrato")
	private Date fechaContrato;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_ingreso")
	private Date fechaIngreso;

	@Column(name="id_area")
	private Integer idArea;

	@Column(name="id_local")
	private Integer idLocal;

	//bi-directional many-to-one association to CondicionLaboral
	@ManyToOne
	@JoinColumn(name="id_condicion_laboral")
	private CondicionLaboral condicionLaboral;

	//bi-directional many-to-one association to Trabajador
	@ManyToOne
	@JoinColumn(name="id_trabajador")
	private Trabajador trabajador;

	public TrabajadorHistorialLaboral() {
	}

	public Integer getIdTrabajadorHistorialLaboral() {
		return this.idTrabajadorHistorialLaboral;
	}

	public void setIdTrabajadorHistorialLaboral(Integer idTrabajadorHistorialLaboral) {
		this.idTrabajadorHistorialLaboral = idTrabajadorHistorialLaboral;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCodigoBiometrico() {
		return this.codigoBiometrico;
	}

	public void setCodigoBiometrico(String codigoBiometrico) {
		this.codigoBiometrico = codigoBiometrico;
	}

	public String getDocumentoContrato() {
		return this.documentoContrato;
	}

	public void setDocumentoContrato(String documentoContrato) {
		this.documentoContrato = documentoContrato;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Date getFechaCese() {
		return this.fechaCese;
	}

	public void setFechaCese(Date fechaCese) {
		this.fechaCese = fechaCese;
	}

	public Date getFechaContrato() {
		return this.fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getIdArea() {
		return this.idArea;
	}

	public void setIdArea(Integer idArea) {
		this.idArea = idArea;
	}

	public Integer getIdLocal() {
		return this.idLocal;
	}

	public void setIdLocal(Integer idLocal) {
		this.idLocal = idLocal;
	}

	public CondicionLaboral getCondicionLaboral() {
		return this.condicionLaboral;
	}

	public void setCondicionLaboral(CondicionLaboral condicionLaboral) {
		this.condicionLaboral = condicionLaboral;
	}

	public Trabajador getTrabajador() {
		return this.trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

}