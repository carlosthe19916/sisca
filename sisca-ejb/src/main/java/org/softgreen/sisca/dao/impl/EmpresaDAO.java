package org.softgreen.sisca.dao.impl;

import javax.ejb.Stateless;

import org.softgreen.sisca.dao.GenericDAO;
import org.softgreen.sisca.model.Empresa;

@Stateless
public class EmpresaDAO extends GenericDAO<Empresa> {

	public EmpresaDAO() {
		super(Empresa.class);
	}

}
