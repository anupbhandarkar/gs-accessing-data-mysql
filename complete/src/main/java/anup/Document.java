package anup;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Document {

	@Id
	private Integer  id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	private String year;

   


	
	
}
