package com.ifood.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class which abstract Store's Contacts
 *
 * @author Gabriel Menezes
 * @version 1.0
 */
public class Contact implements Serializable {
    protected static final long serialVersionUID = 1L;

    protected int id;
    protected String name;
    protected String email;
    protected int phone;

    public Contact() {
    }

    public Contact(int id, String name, String email, int phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Contact id(int id) {
        setId(id);
        return this;
    }

    public Contact name(String name) {
        setName(name);
        return this;
    }

    public Contact email(String email) {
        setEmail(email);
        return this;
    }

    public Contact phone(int phone) {
        setPhone(phone);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) o;
        return id == contact.id && Objects.equals(name, contact.name) && Objects.equals(email, contact.email)
                && phone == contact.phone;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phone);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + ", email='" + getEmail() + "'"
                + ", phone='" + getPhone() + "'" + "}";
    }

}
