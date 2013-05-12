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

	@Column(name="condicion_laboral")
	private String condicionLaboral;

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

	//bi-directional many-to-one association to Area
	@ManyToOne
	@JoinColumn(name="id_area")
	private Area area;

	//bi-directional many-to-one association to Local
	@ManyToOne
	@JoinColumn(name="id_local")
	private Local local;

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

	public String getCondicionLaboral() {
		return this.condicionLaboral;
	}

	public void setCondicionLaboral(String condicionLaboral) {
		this.condicionLaboral = condicionLaboral;
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

	public Area getArea() {
		return this.area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Local getLocal() {
		return this.local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Trabajador getTrabajador() {
		return this.trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

}