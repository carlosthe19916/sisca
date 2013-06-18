/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.GradoInstruccionFacadeLocal;
import org.softgreen.sisca.model.GradoInstruccion;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class GradoInstruccionDAO extends AbstractDAO<GradoInstruccion> implements GradoInstruccionFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GradoInstruccionDAO() {
        super(GradoInstruccion.class);
    }
    
}
