package com.globomantics.inventorymanager.service;

import com.globomantics.inventorymanager.model.InventoryRecord;

import java.util.Optional;

public class ServiceMine implements IServiceMine {
    @Override
    public Optional<InventoryRecord> getInventoryRecord(Integer productId) {
        return Optional.empty();
    }

    @Override
    public Optional<InventoryRecord> purchaseProduct(Integer productId, Integer quantity) {
        return Optional.empty();
    }
}
