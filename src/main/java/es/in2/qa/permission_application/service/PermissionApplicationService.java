package es.in2.qa.permission_application.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import es.in2.qa.permission_application.DateFormatException;
import es.in2.qa.permission_application.model.Concepto;
import es.in2.qa.permission_application.service.dao.ConceptDAO;
import es.in2.qa.permission_application.service.dao.impl.ConceptDAOImplTest;

public class PermissionApplicationService {
	
	private static ConceptDAO _conceptDAO = new ConceptDAOImplTest();
	
	public static void set_conceptDAO(ConceptDAO _conceptDAO) {
		_conceptDAO = _conceptDAO;
	}

	public static List<Calendar> getSelectableYears(){
		List<Calendar> selectableYears = new ArrayList<Calendar>(3);
		
		Calendar calendar = new GregorianCalendar();
		Calendar calendarAnterior = (Calendar)calendar.clone();
		calendarAnterior.add(Calendar.YEAR, -1);
		Calendar calendarPosterior = (Calendar)calendar.clone();
		calendarPosterior.add(Calendar.YEAR, 1);
		
		selectableYears.add(calendarAnterior);
		selectableYears.add(calendar);
		selectableYears.add(calendarPosterior);
		
		return selectableYears;
	}

	public static List<Concepto> getConceptos(int year) {
		return _conceptDAO.load(year);
	}
	
	public static Integer calcularDias(String fechaInicio,String fechaFinal) throws DateFormatException{
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date inicio;
		Date fin;
		
		try{
			inicio = dateFormat.parse(fechaInicio);
			fin = dateFormat.parse(fechaFinal);
		}catch(ParseException e){
			throw new DateFormatException();
		}
		
		
		return null;
	}

}
