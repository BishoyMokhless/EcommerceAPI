package com.ecomm.template.ecommDemo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {
    @Id
   // @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="pClass")
    private String pClass;

    public Products(long id, @JsonProperty("name") String name, @JsonProperty("pClass") String pClass) {
        this.id = id;
        this.name = name;
        this.pClass = pClass;
    }

    public Products() {

    }

    public long getId() {
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

    public String getpClass() {
        return pClass;
    }

    public void setpClass(String pClass) {
        this.pClass = pClass;
    }

    @Override
    public String toString() {
        return "products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pClass='" + pClass + '\'' +
                '}';
    }
}
