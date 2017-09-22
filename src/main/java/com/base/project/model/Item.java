package com.base.project.model;

import java.util.UUID;

/**
 * Test data model class.
 */
public class Item {

    public Item(final UUID id) {
        this.id = id;
    }

    private UUID id;

    private String name;

}
