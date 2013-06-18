/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.HorarioDetalleFacadeLocal;
import org.softgreen.sisca.model.HorarioDetalle;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class HorarioDetalleDAO extends AbstractDAO<HorarioDetalle> implements HorarioDetalleFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HorarioDetalleDAO() {
        super(HorarioDetalle.class);
    }
    
}
