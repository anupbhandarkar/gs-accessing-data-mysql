package anup;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Request {
	@Id
	private Integer id;

	private String productgroup;

	@ManyToOne
	@JoinColumn(name = "document_id" )
	private Document document;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public String getProductgroup() {
		return productgroup;
	}
	public void setProductgroup(String productgroup) {
		this.productgroup = productgroup;
	}

}
