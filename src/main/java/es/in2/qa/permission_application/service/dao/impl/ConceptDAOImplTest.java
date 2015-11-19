package es.in2.qa.permission_application.service.dao.impl;

import java.util.ArrayList;
import java.util.List;

import es.in2.qa.permission_application.model.Concepto;
import es.in2.qa.permission_application.service.dao.ConceptDAO;

public class ConceptDAOImplTest implements ConceptDAO {
	
	
	private Concepto getMockConcept(){
		Concepto concepto = new Concepto();
		concepto.setConcept("Vacaciones");
		concepto.setYear(2015);
		concepto.setType("L");
		concepto.setTotal(23);
		return concepto;
	}

	@Override
	public Concepto load(Long id) {
		Concepto concepto = getMockConcept();
		concepto.setId(id);
		return concepto;
	}

	@Override
	public List<Concepto> load(Integer year) {
		List<Concepto> list = new ArrayList<Concepto>(1);
		list.add(getMockConcept());
		return list;
	}

	@Override
	public List<Concepto> loadAll() {
		List<Concepto> list = new ArrayList<Concepto>(1);
		list.add(getMockConcept());
		return list;
	}

}
