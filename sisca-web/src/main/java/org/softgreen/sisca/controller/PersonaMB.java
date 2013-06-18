package org.softgreen.sisca.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;

import org.softgreen.sisca.facade.PersonaFacadeLocal;
import org.softgreen.sisca.model.Persona;

public class PersonaMB implements Serializable{

	private static final long serialVersionUID = 1L;

	@EJB
	private PersonaFacadeLocal personaFacade;
	private Persona persona;
	private List<Persona> listaPersonas;
	
	public PersonaMB(){
		this.persona = new Persona();
		this.setListaPersonas(new ArrayList<Persona>());
	}
	
	public void savePersona(){
		this.personaFacade.create(persona);
	}
	
	public void updatePersona(){
		this.personaFacade.edit(persona);
	}
	
	public void detelePersona(){
		this.personaFacade.remove(persona);
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	private List<Persona> getListaPersonas() {
		return listaPersonas;
	}

	private void setListaPersonas(List<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}

	
}
