package com.acasado.inventorymanager.service;

import com.acasado.inventorymanager.model.InventoryRecord;

import java.util.Optional;

public interface IServiceMine {
    Optional<InventoryRecord> getInventoryRecord(Integer productId);
    Optional<InventoryRecord> purchaseProduct(Integer productId, Integer quantity);
}
