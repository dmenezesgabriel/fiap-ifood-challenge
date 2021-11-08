package com.ifood.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class which abstract Store's Specialty
 *
 * @author Gabriel Menezes
 * @version 1.0
 */

public class Specialty implements Serializable {
    protected static final long serialVersionUID = 1L;

    protected int id;
    protected String name;

    public Specialty() {
    }

    public Specialty(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Specialty id(int id) {
        setId(id);
        return this;
    }

    public Specialty name(String name) {
        setName(name);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Specialty)) {
            return false;
        }
        Specialty specialty = (Specialty) o;
        return id == specialty.id && Objects.equals(name, specialty.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + "}";
    }
}
