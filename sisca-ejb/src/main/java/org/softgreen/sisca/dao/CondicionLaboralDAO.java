/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.CondicionLaboralFacadeLocal;
import org.softgreen.sisca.model.CondicionLaboral;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class CondicionLaboralDAO extends AbstractDAO<CondicionLaboral> implements CondicionLaboralFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CondicionLaboralDAO() {
        super(CondicionLaboral.class);
    }
    
}
