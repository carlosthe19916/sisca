/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.VacacionFacadeLocal;
import org.softgreen.sisca.model.Vacacion;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class VacacionDAO extends AbstractDAO<Vacacion> implements VacacionFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VacacionDAO() {
        super(Vacacion.class);
    }
    
}
