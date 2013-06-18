/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.TrabajadorFacadeLocal;
import org.softgreen.sisca.model.Trabajador;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class TrabajadorDAO extends AbstractDAO<Trabajador> implements TrabajadorFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TrabajadorDAO() {
        super(Trabajador.class);
    }
    
}
