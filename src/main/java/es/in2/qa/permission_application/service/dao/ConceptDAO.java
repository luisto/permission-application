package es.in2.qa.permission_application.service.dao;

import java.util.List;

import es.in2.qa.permission_application.model.Concepto;

public interface ConceptDAO {
	
	public Concepto load(Long id);
	public List<Concepto> load(Integer year);
	public List<Concepto> loadAll();

}
