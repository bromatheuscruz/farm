package com.roomator;

import java.math.BigDecimal;

public enum AnimalType {
    /**
     * AnimalType enum types
     * has marketValue and necessaryToSoldWeight
     */
    COW(BigDecimal.valueOf(500.00), BigDecimal.valueOf(300)),
    PIG(BigDecimal.valueOf(250.00), BigDecimal.valueOf(100)),
    CHICKEN(new BigDecimal(5.00), BigDecimal.valueOf(0.50));

    private BigDecimal marketValue;
    private BigDecimal necessaryToSoldWeight;

    /**
     * AnimalType enum constructor
     * @param marketValue
     * @param necessaryToSolWeight
     */
    AnimalType(BigDecimal marketValue, BigDecimal necessaryToSolWeight) {
        this.marketValue = marketValue;
        this.necessaryToSoldWeight = necessaryToSolWeight;
    }

    public BigDecimal getMarketValue() {
        return this.marketValue;
    }

    public BigDecimal getNecessaryToSoldWeight() {
        return this.necessaryToSoldWeight;
    }
}
