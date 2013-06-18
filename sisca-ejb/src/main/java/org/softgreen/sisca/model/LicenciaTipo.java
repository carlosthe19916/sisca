package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the licencia_tipo database table.
 * 
 */
@Entity
@Table(name="licencia_tipo")
public class LicenciaTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_licencia_tipo")
	private Integer idLicenciaTipo;

	private String denominacion;

	private Boolean estado;

	private String observacion;

	private Boolean remunerado;

	//bi-directional many-to-one association to Licencia
	@OneToMany(mappedBy="licenciaTipo")
	private List<Licencia> licencias;

	public LicenciaTipo() {
	}

	public Integer getIdLicenciaTipo() {
		return this.idLicenciaTipo;
	}

	public void setIdLicenciaTipo(Integer idLicenciaTipo) {
		this.idLicenciaTipo = idLicenciaTipo;
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

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Boolean getRemunerado() {
		return this.remunerado;
	}

	public void setRemunerado(Boolean remunerado) {
		this.remunerado = remunerado;
	}

	public List<Licencia> getLicencias() {
		return this.licencias;
	}

	public void setLicencias(List<Licencia> licencias) {
		this.licencias = licencias;
	}

}