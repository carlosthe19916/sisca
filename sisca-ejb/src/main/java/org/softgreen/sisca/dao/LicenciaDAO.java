/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.LicenciaFacadeLocal;
import org.softgreen.sisca.model.Licencia;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class LicenciaDAO extends AbstractDAO<Licencia> implements LicenciaFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LicenciaDAO() {
        super(Licencia.class);
    }
    
}
