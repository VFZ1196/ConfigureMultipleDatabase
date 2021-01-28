package springBootMultipleDatabase.model.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user1")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String email;
	private int age;
	
	public User() {
		
	}
	
	public User(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
