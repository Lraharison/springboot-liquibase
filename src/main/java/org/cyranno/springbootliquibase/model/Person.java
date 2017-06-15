package org.cyranno.springbootliquibase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "firstname", nullable = false, unique = false)
    private String firstName;

    @Column(name = "lastname", nullable = false, unique = false)
    private String lastName;

    @Column(name = "username", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", nullable = false, unique = false)
    private String password;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param pId id à définir
     */
    public void setId(Integer pId) {
        id = pId;
    }

    /**
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param pFirstName firstName à définir
     */
    public void setFirstName(String pFirstName) {
        firstName = pFirstName;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param pLastName lastName à définir
     */
    public void setLastName(String pLastName) {
        lastName = pLastName;
    }

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
