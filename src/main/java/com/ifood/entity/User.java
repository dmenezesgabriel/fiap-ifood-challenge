package com.ifood.entity;

/**
 * Class which abstract system's user
 * @author Gabriel Menezes]
 * @version 1.0
 */
import java.io.Serializable;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * User id
     */
    private int id;
    /**
     * User name
     */
    private String name;
    /**
     * User birth date
     */
    private Calendar birthDate;
    /**
     * User gender
     */
    private String gender;
    /**
     * User e-mail
     */
    private String email;
    /**
     * User password
     */
    private String password;

    public User() {
        super();
    }

    public User(int id, String name, Calendar birthDate, String gender, String email, String password) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
        this.password = password;
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

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        return "User [id=" + id + ", name=" + name + ", birthDate=" + sdf.format(birthDate.getTime()) + ", gender="
                + gender + ", email=" + email + ", password=" + password + "]";
    }
}