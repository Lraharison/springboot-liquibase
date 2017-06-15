package org.cyranno.springbootliquibase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>
 * </p>
 *
 * @author raharisonl
 * <pre>
 * =============================================================================
 * Version - JJ/MM/AAAA - Auteur        - Objet
 * =============================================================================
 * 1.0.0   - 15 juin 2017 - raharisonl       - Création initiale
 * =============================================================================
 * </pre>
 * @since octav 1.0.0
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
