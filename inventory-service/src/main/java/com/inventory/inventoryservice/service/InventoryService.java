package com.inventory.inventoryservice.service;

import com.inventory.inventoryservice.model.InventoryResponse;
import com.inventory.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;


@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    @SneakyThrows
    public List<InventoryResponse> isInStock(List<String> skuCode) {
        log.info("Wait started");
        Thread.sleep(10000);
        log.info("Wait ended");
        return inventoryRepository.findBySkuCodeIn(skuCode).
                stream().map(inventory ->
                    InventoryResponse.builder()
                            .skuCode(inventory.getSkuCode())
                            .inStock(inventory.getQuantity() > 0)
                            .build()
                ).toList();
    }
}
