package es.in2.qa.permission_application.model;

public class Concepto {

	private Long id;
	private Integer year;
	private String concept;
	private Integer total;
	private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getConcept() {
		return concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Concepto(Long id, Integer year, String concept, Integer total, String type) {
		super();
		this.id = id;
		this.year = year;
		this.concept = concept;
		this.total = total;
		this.type = type;
	}

	public Concepto() {
		super();
	}

}
