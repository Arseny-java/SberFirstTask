package ru.sber.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("FieldMayBeFinal")
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Product {
    private String ownerName;
    private String currency;
    private Double balance;
}
