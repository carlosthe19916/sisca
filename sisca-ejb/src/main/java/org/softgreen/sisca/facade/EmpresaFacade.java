package org.softgreen.sisca.facade;

import java.util.List;

import javax.ejb.Local;

import org.softgreen.sisca.model.Empresa;

@Local
public interface EmpresaFacade {

	public abstract void save(Empresa empresa);

	public abstract Empresa update(Empresa empresa);

	public abstract void delete(Empresa empresa);

	public abstract Empresa find(int entityID);

	public abstract List<Empresa> findAll();

}
