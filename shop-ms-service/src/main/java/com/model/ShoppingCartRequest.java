package com.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShoppingCartRequest {
private long productId;
private Integer quantity;

}
