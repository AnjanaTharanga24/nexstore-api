package com.nexstore.order_manager.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponse {
    public Integer id;
    public Integer itemId;
    public String orderDate;
    public Integer amount;
}
