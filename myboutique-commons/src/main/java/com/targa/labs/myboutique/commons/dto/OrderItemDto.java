/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.targa.labs.dev.myboutique.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author n.lamouchi
 */
@AllArgsConstructor
@Data
public class OrderItemDto {
    private Long id;
    private Long quantity;
    private Long productId;
    private Long orderId;
}
