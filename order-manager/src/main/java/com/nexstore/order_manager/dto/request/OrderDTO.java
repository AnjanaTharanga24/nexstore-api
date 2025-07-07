package com.nexstore.order_manager.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    public Integer id;
    public Integer itemId;
    public String orderDate;
    public Integer amount;
}
