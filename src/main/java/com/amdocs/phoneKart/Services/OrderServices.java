package com.amdocs.phoneKart.Services;

import com.amdocs.phoneKart.model.Orders;


public interface OrderServices {
    //
    Orders createOrder(Orders ord);
    Orders getOrder(long id);
    Orders addOrder(long id , Orders ord);
    Orders deleteOrder(long id);

    Orders updateAddress(long id, String addr);

    String getAddressbyOrderId(long id);
//    List<Order> findCustomersByFamilyId(long family_id);
}
