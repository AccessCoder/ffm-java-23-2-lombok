package de.neuefische;

import lombok.*;

import java.math.BigDecimal;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarClass {

    private String brand;
    private String color;
    private BigDecimal price;
    private String model;


}
