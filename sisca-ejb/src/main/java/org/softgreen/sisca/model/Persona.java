package org.softgreen.sisca.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
@Table(name="persona")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="numero_dni")
	private String numeroDni;

	private String direccion;

	@Column(name="estado_civil")
	private String estadoCivil;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;

	private String prenombres;

	@Column(name="primer_apellido")
	private String primerApellido;

	@Column(name="segundo_apellido")
	private String segundoApellido;

	private String sexo;

	private String ubigeo;

	//bi-directional many-to-one association to GradoInstruccion
	@ManyToOne
	@JoinColumn(name="id_grado_instruccion")
	private GradoInstruccion gradoInstruccion;

	//bi-directional many-to-one association to Trabajador
	@OneToMany(mappedBy="persona")
	private List<Trabajador> trabajadors;

	public Persona() {
	}

	public String getNumeroDni() {
		return this.numeroDni;
	}

	public void setNumeroDni(String numeroDni) {
		this.numeroDni = numeroDni;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getPrenombres() {
		return this.prenombres;
	}

	public void setPrenombres(String prenombres) {
		this.prenombres = prenombres;
	}

	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getUbigeo() {
		return this.ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public GradoInstruccion getGradoInstruccion() {
		return this.gradoInstruccion;
	}

	public void setGradoInstruccion(GradoInstruccion gradoInstruccion) {
		this.gradoInstruccion = gradoInstruccion;
	}

	public List<Trabajador> getTrabajadors() {
		return this.trabajadors;
	}

	public void setTrabajadors(List<Trabajador> trabajadors) {
		this.trabajadors = trabajadors;
	}

}