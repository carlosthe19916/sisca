/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.SucursalFacadeLocal;
import org.softgreen.sisca.model.Sucursal;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class SucursalDAO extends AbstractDAO<Sucursal> implements SucursalFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SucursalDAO() {
        super(Sucursal.class);
    }
    
}
