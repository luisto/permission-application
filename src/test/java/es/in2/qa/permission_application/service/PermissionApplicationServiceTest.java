package es.in2.qa.permission_application.service;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import es.in2.qa.permission_application.DateFormatException;
import es.in2.qa.permission_application.model.Concepto;

public class PermissionApplicationServiceTest {
	
	@BeforeClass
	public void setUp() {
		//do nothing
	}

	@Test
	public void yearComboTest() {
		List<Calendar> selectableYears =  PermissionApplicationService.getSelectableYears();
		
		//lista de tres elementos
		Assert.assertEquals(selectableYears.size(), 3);
		
		//en orden de menor a mayor
		Boolean ordenado = selectableYears.get(0).before(selectableYears.get(1));
		ordenado &= selectableYears.get(1).before(selectableYears.get(2));
		Assert.assertTrue(ordenado);
		
		//elem1 = año actual -1
		//elem2 = año actual
		//elem3 = año actual +1
		Calendar actual = new GregorianCalendar();
		Integer actualYear = actual.get(Calendar.YEAR);
		Assert.assertEquals(selectableYears.get(0).get(Calendar.YEAR), actualYear-1);
		Assert.assertEquals(selectableYears.get(1).get(Calendar.YEAR), actualYear.intValue());
		Assert.assertEquals(selectableYears.get(2).get(Calendar.YEAR), actualYear+1);
	}
	
	@Test
	public static void conceptComboTest(){
		Calendar actual = new GregorianCalendar();
		
		List<Concepto> conceptos = PermissionApplicationService.getConceptos(actual.get(Calendar.YEAR));
		
		//lista no vacía
		Assert.assertNotNull(conceptos);
		Assert.assertEquals(conceptos.isEmpty(), false);
	}
	
	@Test
	public static void dateTest(){
		//fecha no vacía
		String fechaInicio = "";
		String fechaFinal = "";
		
		try{
			PermissionApplicationService.calcularDias(fechaInicio, fechaFinal);
		}catch(Exception e){
			Assert.assertEquals(e.getClass().getName(), DateFormatException.class.getName());
		}
		
		
		//fecha formato de fecha
	}

}
