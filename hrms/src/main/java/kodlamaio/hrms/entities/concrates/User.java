package kodlamaio.hrms.entities.concrates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.Entities;
import lombok.Data;
@Entity
@Table(name="users")
@Data
public class User implements Entities {
	  
	  @Id
	  @GeneratedValue	
      @Column(name="id")	
      private int id;
	  
      @Column(name="email")
      private String email;
      
      @Column(name="password")
      private String password;
      
      @Column(name="password")
      private String againPassword;
	
      public User () {}

	  public User(int id, String email, String password, String againPassword) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.againPassword = againPassword;
	}
      

	

}
