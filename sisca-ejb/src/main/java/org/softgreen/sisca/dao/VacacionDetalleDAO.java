/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.VacacionDetalleFacadeLocal;
import org.softgreen.sisca.model.VacacionDetalle;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class VacacionDetalleDAO extends AbstractDAO<VacacionDetalle> implements VacacionDetalleFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VacacionDetalleDAO() {
        super(VacacionDetalle.class);
    }
    
}
