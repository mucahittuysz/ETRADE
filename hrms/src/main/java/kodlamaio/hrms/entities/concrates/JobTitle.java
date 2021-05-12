package kodlamaio.hrms.entities.concrates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.Entities;
import lombok.Data;

@Data
@Entity
@Table(name="job_titles")
public class JobTitle implements Entities {

	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	@Column(name="title")
	private String title;
	
	public JobTitle() {}

	public JobTitle(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
}
