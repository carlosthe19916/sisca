package org.softgreen.sisca.controller;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import org.softgreen.sisca.facade.PersonaFacadeLocal;
import org.softgreen.sisca.facade.TrabajadorFacadeLocal;
import org.softgreen.sisca.facade.TrabajadorHistorialLaboralFacadeLocal;
import org.softgreen.sisca.model.Persona;
import org.softgreen.sisca.model.Trabajador;
import org.softgreen.sisca.model.TrabajadorHistorialLaboral;

@ManagedBean
public class TrabajadorHistorialLaboralMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
	private TrabajadorHistorialLaboralFacadeLocal trabajadorHistorialLaboralFacadeLocal;
	private TrabajadorHistorialLaboral trabajadorHistorialLaboral;
	private List<Trabajador> listaTrabajadorHistorialLaboral;

	public TrabajadorHistorialLaboral getTrabajadorHistorialLaboral() {
		return trabajadorHistorialLaboral;
	}

	public void setTrabajadorHistorialLaboral(
			TrabajadorHistorialLaboral trabajadorHistorialLaboral) {
		this.trabajadorHistorialLaboral = trabajadorHistorialLaboral;
	}

	public List<Trabajador> getListaTrabajadorHistorialLaboral() {
		return listaTrabajadorHistorialLaboral;
	}

	public void setListaTrabajadorHistorialLaboral(
			List<Trabajador> listaTrabajadorHistorialLaboral) {
		this.listaTrabajadorHistorialLaboral = listaTrabajadorHistorialLaboral;
	}

}
