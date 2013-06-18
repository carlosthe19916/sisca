/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.facade;

import java.util.List;
import javax.ejb.Local;
import org.softgreen.sisca.model.GradoInstruccion;

/**
 *
 * @author Carlos-PC
 */
@Local
public interface GradoInstruccionFacadeLocal {

    void create(GradoInstruccion gradoInstruccion);

    void edit(GradoInstruccion gradoInstruccion);

    void remove(GradoInstruccion gradoInstruccion);

    GradoInstruccion find(Object id);

    List<GradoInstruccion> findAll();

    List<GradoInstruccion> findRange(int[] range);

    int count();
    
}
