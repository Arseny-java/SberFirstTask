package ru.sber.interfaces;

import ru.sber.model.Product;
import ru.sber.storage.Storage;

public interface GetDebt {
    default Double getDebt(String name, Double limit, Double interestRate) {
        Product product = Storage.getFromStorage(name);
        Double balance = product.getBalance();
        return ((limit - balance) * interestRate/100) + (limit - balance);
    }
}
