/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.EmpresaFacadeLocal;
import org.softgreen.sisca.model.Empresa;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class EmpresaDAO extends AbstractDAO<Empresa> implements EmpresaFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpresaDAO() {
        super(Empresa.class);
    }
    
}
