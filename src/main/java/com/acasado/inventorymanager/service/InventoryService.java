package com.acasado.inventorymanager.service;

import com.acasado.inventorymanager.model.InventoryRecord;

import java.util.Optional;

public interface InventoryService {
    Optional<InventoryRecord> getInventoryRecord(Integer productId);
    Optional<InventoryRecord> purchaseProduct(Integer productId, Integer quantity);
    //First create this then Ctrl + I  in the subclass... Ctrl+Alt+B should generate subclass
    // InventoryRecord getSimpleRecord(Integer PrductId, Integer Quantity);
}
