/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.TrabajadorHistorialLaboralFacadeLocal;
import org.softgreen.sisca.model.TrabajadorHistorialLaboral;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class TrabajadorHistorialLaboralDAO extends AbstractDAO<TrabajadorHistorialLaboral> implements TrabajadorHistorialLaboralFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TrabajadorHistorialLaboralDAO() {
        super(TrabajadorHistorialLaboral.class);
    }
    
}
