package apside.be.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Clients")
@NoArgsConstructor
@Getter @Setter
public class Client {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idCustomer;
	 @Column(name="Name")
	private String name;
	public Client(String name) {
		super();
		this.name = name;
	}
	
	 

}
