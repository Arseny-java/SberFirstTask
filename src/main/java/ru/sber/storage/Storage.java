package ru.sber.storage;

import ru.sber.interfaces.AddToStorageAfterCreating;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"unchecked", "FieldMayBeFinal"})
public class Storage {
    private static Map<String, AddToStorageAfterCreating> storage = new HashMap<>();


    public static <AddToStorageAfterCreating> AddToStorageAfterCreating getFromStorage(String key) {
        return (AddToStorageAfterCreating) storage.get(key);
    }

    public static void setToStorage(String key, AddToStorageAfterCreating value) {
        storage.put(key, value);
    }

    public static void closeProduct(String key) {
        storage.remove(key);
    }

}
