package com.roomator;

import java.math.BigDecimal;

/**
 * Object used only to transfer data, do not have business rule
 * It can be called: Data Transfer Object
 */
public class CurrentValue {

    private BigDecimal currentValue;

    public CurrentValue() {}

    public CurrentValue(BigDecimal currentValue) {
        this.currentValue = currentValue;
    }

    public BigDecimal getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(BigDecimal currentValue) {
        this.currentValue = currentValue;
    }
}
