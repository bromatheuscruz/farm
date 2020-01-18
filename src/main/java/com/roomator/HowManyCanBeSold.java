package com.roomator;

/**
 * Object used to transfer data, do not have business rule
 * It can be called: Data Transfer Object
 */
public class HowManyCanBeSold {

    private AnimalType type;
    private Long quantity;

    public HowManyCanBeSold() {}

    public HowManyCanBeSold(AnimalType type, Long quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
