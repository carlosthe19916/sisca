/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.softgreen.sisca.facade.TrabajadorHistorialHorariosFacadeLocal;
import org.softgreen.sisca.model.TrabajadorHistorialHorario;

/**
 *
 * @author Carlos-PC
 */
@Stateless
public class TrabajadorHistorialHorariosDAO extends AbstractDAO<TrabajadorHistorialHorario> implements TrabajadorHistorialHorariosFacadeLocal {
    @PersistenceContext(unitName = "SiscaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TrabajadorHistorialHorariosDAO() {
        super(TrabajadorHistorialHorario.class);
    }
    
}
