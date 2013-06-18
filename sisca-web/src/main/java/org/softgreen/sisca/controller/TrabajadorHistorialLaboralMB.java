package org.softgreen.sisca.controller;

import java.io.Serializable;

import javax.ejb.EJB;

import org.softgreen.sisca.facade.PersonaFacadeLocal;
import org.softgreen.sisca.model.Persona;

public class TrabajadorHistorialLaboralMB implements Serializable{

	private static final long serialVersionUID = 1L;

	@EJB
	private PersonaFacadeLocal personaFacade;
	private Persona persona;
	
}
