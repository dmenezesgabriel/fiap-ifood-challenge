package com.ifood.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class which abstract Stores
 *
 * @author Gabriel Menezes
 * @version 1.0
 */
public class Store implements Serializable {
    protected int id;
    protected String name;
    protected String companyName;
    protected long cnpj;
    protected long phone;
    protected Specialty specialty;
    protected Contact contact;
    protected Address address;
    protected Responsible responsible;
    protected Plan plan;

    public Store() {
    }

    public Store(int id, String name, String companyName, long cnpj, long phone, Specialty specialty, Contact contact,
            Address address, Responsible responsible, Plan plan) {
        this.id = id;
        /**
         * Name that will show at the APP
         */
        this.name = name;
        this.companyName = companyName;
        this.cnpj = cnpj;
        this.phone = phone;
        this.specialty = specialty;
        this.contact = contact;
        this.address = address;
        this.responsible = responsible;
        this.plan = plan;
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

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public long getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public long getPhone() {
        return this.phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Specialty getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public Contact getContact() {
        return this.contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Responsible getResponsible() {
        return this.responsible;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }

    public Plan getPlan() {
        return this.plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Store)) {
            return false;
        }
        Store store = (Store) o;
        return id == store.id && Objects.equals(name, store.name) && Objects.equals(companyName, store.companyName)
                && cnpj == store.cnpj && phone == store.phone && Objects.equals(specialty, store.specialty)
                && Objects.equals(contact, store.contact) && Objects.equals(address, store.address)
                && Objects.equals(responsible, store.responsible) && Objects.equals(plan, store.plan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, companyName, cnpj, phone, specialty, contact, address, responsible, plan);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + ", companyName='" + getCompanyName() + "'"
                + ", cnpj='" + getCnpj() + "'" + ", phone='" + getPhone() + "'" + ", specialty='" + getSpecialty() + "'"
                + ", contact='" + getContact() + "'" + ", address='" + getAddress() + "'" + ", responsible='"
                + getResponsible() + "'" + ", plan='" + getPlan() + "'" + "}";
    }

}
