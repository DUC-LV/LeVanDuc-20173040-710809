package utils;

import entity.order.Order;
// DUCLV-20173040
public interface ShippingFeeCalculator {
    int calculateShippingFee(Order order);
}