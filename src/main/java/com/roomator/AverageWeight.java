package com.roomator;

import java.math.BigDecimal;

/**
 * Object used only to transfer data, do not have business rule
 * It can be called: Data Transfer Object
 */
public class AverageWeight {

    private AnimalType animalType;
    private BigDecimal averageWeight;

    public AverageWeight() {}

    public AverageWeight(AnimalType animalType, BigDecimal averageWeigh) {
        this.animalType = animalType;
        this.averageWeight = averageWeigh;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public BigDecimal getAverageWeigh() {
        return averageWeight;
    }

    public void setAverageWeigh(BigDecimal averageWeigh) {
        this.averageWeight = averageWeigh;
    }
}
