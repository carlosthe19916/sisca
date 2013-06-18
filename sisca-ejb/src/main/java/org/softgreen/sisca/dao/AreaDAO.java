/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.AreaFacadeLocal;
import org.softgreen.sisca.model.Area;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class AreaDAO extends AbstractDAO<Area> implements AreaFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AreaDAO() {
        super(Area.class);
    }
    
}
