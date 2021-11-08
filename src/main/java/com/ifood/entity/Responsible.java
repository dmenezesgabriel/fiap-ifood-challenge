package com.ifood.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class which abstract Store's Legal Responsible
 *
 * @author Gabriel Menezes
 * @version 1.0
 */
public class Responsible implements Serializable {
    protected static final long serialVersionUID = 1L;

    protected int id;
    protected String name;
    protected long cpf;
    protected long rg;

    public Responsible() {
    }

    public Responsible(int id, String name, long cpf, long rg) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
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

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return this.rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public Responsible id(int id) {
        setId(id);
        return this;
    }

    public Responsible name(String name) {
        setName(name);
        return this;
    }

    public Responsible cpf(int cpf) {
        setCpf(cpf);
        return this;
    }

    public Responsible rg(int rg) {
        setRg(rg);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Responsible)) {
            return false;
        }
        Responsible responsible = (Responsible) o;
        return id == responsible.id && Objects.equals(name, responsible.name) && cpf == responsible.cpf
                && rg == responsible.rg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cpf, rg);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + ", cpf='" + getCpf() + "'" + ", rg='"
                + getRg() + "'" + "}";
    }

}
