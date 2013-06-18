/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.AsistenciaFacadeLocal;
import org.softgreen.sisca.model.Asistencia;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class AsistenciaDAO extends AbstractDAO<Asistencia> implements AsistenciaFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AsistenciaDAO() {
        super(Asistencia.class);
    }
    
}
