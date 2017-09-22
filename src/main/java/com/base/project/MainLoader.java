package com.base.project;

import java.util.UUID;

import com.base.project.model.Item;

/**
 * Created by Denys_Makarov on 9/22/2017.
 */
public class MainLoader {
    public static void main(String[] args) {
        Item item = new Item(UUID.randomUUID(), "test item");

        item.testLogger();
    }
}
