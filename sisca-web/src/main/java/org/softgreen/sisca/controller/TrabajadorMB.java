package org.softgreen.sisca.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import org.softgreen.sisca.facade.TrabajadorFacadeLocal;
import org.softgreen.sisca.model.Trabajador;

@ManagedBean
public class TrabajadorMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private TrabajadorFacadeLocal trabajadorFacade;	
	private Trabajador trabajador;
	private List<Trabajador> listaTrabajadores;
		
	@ManagedProperty("#{persona}")
    private PersonaMB persona;
	
	@ManagedProperty("#{trabajadorHistorialLaboral}")
    private TrabajadorHistorialLaboralMB trabajadorHistorialLaboral;
	
	public TrabajadorMB(){
		this.trabajador = new Trabajador();
		this.listaTrabajadores = new ArrayList<Trabajador>();
		this.trabajador.setPersona(persona.getPersona());
	}
	
	public void saveTrabajador(){
		this.trabajadorFacade.create(trabajador);
	}
	
	public void updateTrabajador(){
		this.trabajadorFacade.edit(trabajador);
	}
	
	public void deteleTrabajador(){
		this.trabajadorFacade.remove(trabajador);
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	public List<Trabajador> getListaTrabajadores() {
		return listaTrabajadores;
	}

	public void setListaTrabajadores(List<Trabajador> listaTrabajadores) {
		this.listaTrabajadores = listaTrabajadores;
	}

}
