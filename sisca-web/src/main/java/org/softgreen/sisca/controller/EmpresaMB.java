package org.softgreen.sisca.controller;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.softgreen.sisca.facade.EmpresaFacade;
import org.softgreen.sisca.model.Empresa;

//import org.softgreen.sisca.facade.EmpresaFacade;
//import org.softgreen.sisca.model.Empresa;

@ManagedBean(name="empresaMB")
@RequestScoped
public class EmpresaMB {

	@EJB
	private EmpresaFacade empresaFacade;
	private Empresa empresa;

	//private List<Area> areas;
	//private List<Sucursal> sucursals;

	public EmpresaMB() {
	}

	public void saveEmpresa() {
		System.out.println(empresa.getRazonSocial()+"sssssssssssssss");
		empresaFacade.save(empresa);
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}