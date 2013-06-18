/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.JustificacionFacadeLocal;
import org.softgreen.sisca.model.Justificacion;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class JustificacionDAO extends AbstractDAO<Justificacion> implements JustificacionFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JustificacionDAO() {
        super(Justificacion.class);
    }
    
}
