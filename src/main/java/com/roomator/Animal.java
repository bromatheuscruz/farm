package com.roomator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * An @Entity annotation is used to inform that a class is also an entity.
 * From this, a JPA establishes a link between an entity and a table of the same name in the database,
 * where the data of objects of that type can be persistent.
*/
@Entity
public class Animal {

    /**
     * @Id Identify that is an primary key property
    */
    @Id

    /** @GeneratedValue The primary key generation strategy
     * that the persistence provider must use to
     * generate the annotated entity primary key.
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private AnimalType type;
    private BigDecimal weight;

    public Animal() {}

    public Animal(AnimalType type, BigDecimal weight) {
        this.type = type;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * Verify if the animal can be sold
     * If the weight of the animal is greater than or equal to the minimum weight required for the type of animal
     * it can be sold
     * @return boolean value
     */
    public boolean canBeSold() {
        return this.getWeight().doubleValue() >= this.getType().getNecessaryToSoldWeight().doubleValue();
    }
}
