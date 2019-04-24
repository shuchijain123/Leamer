package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
@Entity
public class Lemur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;
    private Boolean movesIt;
    private Integer age;
    private Double weight;
    private String species;

    public Lemur(Long id, Boolean movesIt, Integer age, Double weight, String species) {
        Id = id;
        this.movesIt = movesIt;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public Lemur( Boolean movesIt, Integer age, Double weight, String species) {

        this.movesIt = movesIt;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Boolean getMovesIt() {
        return movesIt;
    }

    public void setMovesIt(Boolean movesIt) {
        this.movesIt = movesIt;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
