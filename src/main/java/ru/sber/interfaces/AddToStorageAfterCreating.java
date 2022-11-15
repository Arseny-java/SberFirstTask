package ru.sber.interfaces;

import ru.sber.storage.Storage;

public interface AddToStorageAfterCreating {
    default void addToStorage(String name) {
        Storage.setToStorage(name, this);
    }

}
