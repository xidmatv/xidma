/**
 * 
 */
package bean;
import java.sql.Date;

/**
 * @author Fallou MBAYE
 *
 */
public class Contact {
	//Attribut
	private int id;
	private String name;
	private String lastname;
	private String phone;
	private String subject;
	private String message;
	private String email;
	private Date created;
	// Constructeur
	public Contact(int id, String name, String lastname, String phone, String subject, String message, String email,
			Date created) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
		this.subject = subject;
		this.message = message;
		this.email = email;
		this.created = created;
	}
	public Contact() {
		super();
	}
	// Getters et Setters
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
	/*public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}*/
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
}
