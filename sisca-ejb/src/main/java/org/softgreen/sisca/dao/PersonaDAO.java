/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.PersonaFacadeLocal;
import org.softgreen.sisca.model.Persona;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class PersonaDAO extends AbstractDAO<Persona> implements PersonaFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaDAO() {
        super(Persona.class);
    }
    
}
