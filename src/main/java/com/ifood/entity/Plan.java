package com.ifood.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Class which abstract Store's Plans
 *
 * @author Gabriel Menezes
 * @version 1.0
 */
public class Plan implements Serializable {
    protected int id;
    protected String name;
    protected double commission;
    protected double tax;
    protected double price;

    public Plan() {
    }

    public Plan(int id, String name, double commission, double tax, double price) {
        this.id = id;
        this.name = name;
        this.commission = commission;
        this.tax = tax;
        this.price = price;
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

    public double getCommission() {
        return this.commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Plan id(int id) {
        setId(id);
        return this;
    }

    public Plan name(String name) {
        setName(name);
        return this;
    }

    public Plan commission(double commission) {
        setCommission(commission);
        return this;
    }

    public Plan tax(double tax) {
        setTax(tax);
        return this;
    }

    public Plan price(double price) {
        setPrice(price);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Plan)) {
            return false;
        }
        Plan plan = (Plan) o;
        return id == plan.id && Objects.equals(name, plan.name) && commission == plan.commission && tax == plan.tax
                && price == plan.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, commission, tax, price);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + ", commission='" + getCommission() + "'"
                + ", tax='" + getTax() + "'" + ", price='" + getPrice() + "'" + "}";
    }

}
