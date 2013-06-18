/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.LocalFacadeLocal;
import org.softgreen.sisca.model.Local;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class LocalDAO extends AbstractDAO<Local> implements LocalFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LocalDAO() {
        super(Local.class);
    }
    
}
