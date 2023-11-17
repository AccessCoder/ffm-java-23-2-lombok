package de.neuefische;

import lombok.Builder;
import lombok.With;

import java.math.BigDecimal;

@With
@Builder
public record Car(String brand, String color, BigDecimal price, String model) {
}
