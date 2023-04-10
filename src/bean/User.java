package bean;

import java.security.MessageDigest;
import java.util.Date;
import java.util.Formatter;

public class User {
	
	// Déclaration des attributs
	 private int id;
	 private String username;
	 private String password;
	 private String password_token;
	 private String name;
	 private String lastname;
	 private Date birth;
	 private String email;
	 private String email_token;
	 private String phone;
	 private String city;
	 private String gender;
	 private String avatar;
	 private int active;
	 private Date created;
	 private Date modified;
	 
	// constructeur
	public User(String username, String password, String password_token, String name, String lastname, Date birth,
			String email, String email_token,String phone, String city, String gender, String avatar, int active, Date created,
			Date modified) {
		super();
		this.username = username;
		this.password = password;
		this.password_token = password_token;
		this.name = name;
		this.lastname = lastname;
		this.birth = birth;
		this.email = email;
		this.email_token = email_token;
		this.phone = phone;
		this.city = city;
		this.gender = gender;
		this.avatar = avatar;
		this.active = active;
		this.created = created;
		this.modified = modified;
	}

	public User() {
		super();
	}
	
	// Getter et Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = hashpassword(password);
	}

	public String getPassword_token() {
		return password_token;
	}

	public void setPassword_token(String password_token) {
		this.password_token = hashpassword(password_token);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail_token() {
		return email_token;
	}
	public String getPhone(){
		return phone;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public void setEmail_token(String email_token) {
		this.email_token = email_token;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", password_token=" + password_token
				+ ", name=" + name + ", lastname=" + lastname + ", birth=" + birth + ", email=" + email
				+ ", email_token=" + email_token + ", city=" + city + ", gender=" + gender + ", avatar=" + avatar
				+ ", active=" + active + ", created=" + created + ", modified=" + modified + "]";
	}
	  
	
	/**
	 * Permet de convertir byte en hexadÈciamal
	 * @param hash
	 * @return
	 */
	private static String byteToHex(final byte[] hash)
	{
	    Formatter formatter = new Formatter();
	    for (byte b : hash)
	    {
	        formatter.format("%02x", b);
	    }
	    String result = formatter.toString();
	    formatter.close();
	    return result;
	}
	//permet de chiffre le mot de passe
	public String hashpassword(String password){
		MessageDigest encrypt = null;
		try {
			encrypt = MessageDigest.getInstance("SHA-1");
			encrypt.reset();
			encrypt.update(password.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		//on va crypter le mot de passe
		
		return byteToHex(encrypt.digest());
	}

}
