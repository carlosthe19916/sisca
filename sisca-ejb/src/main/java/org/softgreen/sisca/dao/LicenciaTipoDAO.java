/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.LicenciaTipoFacadeLocal;
import org.softgreen.sisca.model.LicenciaTipo;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class LicenciaTipoDAO extends AbstractDAO<LicenciaTipo> implements LicenciaTipoFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LicenciaTipoDAO() {
        super(LicenciaTipo.class);
    }
    
}
