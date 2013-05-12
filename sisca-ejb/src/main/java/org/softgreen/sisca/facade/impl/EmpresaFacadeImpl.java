package org.softgreen.sisca.facade.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.softgreen.sisca.dao.impl.EmpresaDAO;
import org.softgreen.sisca.facade.EmpresaFacade;
import org.softgreen.sisca.model.Empresa;

@Stateless
public class EmpresaFacadeImpl implements EmpresaFacade {

	@EJB
	private EmpresaDAO empresaDAO;

	@Override
	public void save(Empresa empresa) {
		isEmpresaWithAllData(empresa);

		empresaDAO.save(empresa);
	}

	@Override
	public Empresa update(Empresa empresa) {
		isEmpresaWithAllData(empresa);

		return empresaDAO.update(empresa);
	}

	@Override
	public void delete(Empresa empresa) {
		empresaDAO.delete(empresa);
	}

	@Override
	public Empresa find(int entityID) {
		return empresaDAO.find(entityID);
	}

	@Override
	public List<Empresa> findAll() {
		return empresaDAO.findAll();
	}

	private void isEmpresaWithAllData(Empresa empresa) {
		boolean hasError = false;

		if (empresa == null) {
			hasError = true;
		}
		/*
		 * if (empresa.getName() == null || "".equals(empresa.getName().trim()))
		 * { hasError = true; }
		 * 
		 * if (empresa.getWeight() <= 0) { hasError = true; }
		 * 
		 * if (hasError) { throw new IllegalArgumentException(
		 * "The dog is missing data. Check the name and weight, they should have value."
		 * ); }
		 */
	}
}
