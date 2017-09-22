package com.base.project.model;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Test data model class.
 */
public class Item {
    private Logger LOG = LoggerFactory.getLogger(Item.class);

    public Item(final UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    private UUID id;

    private String name;

    public void testLogger() {
        LOG.info("Item testLogger() invoked, Item id = {}, name = {}.", id, name);
    }

}
