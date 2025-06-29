package com.nexstore.order_manager.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Integer id;
    private Integer itemId;
    private String orderDate;
    private Integer amount;
}
