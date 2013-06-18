package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the justificacion database table.
 * 
 */
@Entity
@Table(name="justificacion")
public class Justificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_justificacion")
	private Integer idJustificacion;

	public Justificacion() {
	}

	public Integer getIdJustificacion() {
		return this.idJustificacion;
	}

	public void setIdJustificacion(Integer idJustificacion) {
		this.idJustificacion = idJustificacion;
	}

}