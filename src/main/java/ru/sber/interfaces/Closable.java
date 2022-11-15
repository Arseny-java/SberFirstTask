package ru.sber.interfaces;

import ru.sber.storage.Storage;

public interface Closable {
    default void closeDeposit(String ownerName) {
        Storage.closeProduct(ownerName);
    }
}
