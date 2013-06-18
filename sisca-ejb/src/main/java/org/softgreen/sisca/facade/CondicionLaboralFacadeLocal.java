/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.softgreen.sisca.facade;

import java.util.List;
import javax.ejb.Local;
import org.softgreen.sisca.model.CondicionLaboral;

/**
 *
 * @author Carlos-PC
 */
@Local
public interface CondicionLaboralFacadeLocal {

    void create(CondicionLaboral condicionLaboral);

    void edit(CondicionLaboral condicionLaboral);

    void remove(CondicionLaboral condicionLaboral);

    CondicionLaboral find(Object id);

    List<CondicionLaboral> findAll();

    List<CondicionLaboral> findRange(int[] range);

    int count();
    
}
