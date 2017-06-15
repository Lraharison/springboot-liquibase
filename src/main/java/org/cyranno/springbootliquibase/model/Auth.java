package org.cyranno.springbootliquibase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entité Auth pour la vue auth.
 * 
 * @author Raharison L
 */
@Entity
@Table(name = "auth")
public class Auth {

	@Id
	@Column(name = "username", nullable = false, unique = true)
	private String userName;

	@Column(name = "password", nullable = false, unique = false)
	private String password;

	/**
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param pUserName userName à définir
	 */
	public void setUserName(String pUserName) {
		userName = pUserName;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param pPassword password à définir
	 */
	public void setPassword(String pPassword) {
		password = pPassword;
	}

}
