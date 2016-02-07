package com.ahmed.pixelsconnect.domain;

import com.ahmed.pixelsconnect.domain.Customer;
import com.ahmed.pixelsconnect.domain.OrderedProduct;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-08T02:51:11")
@StaticMetamodel(CustomerOrder.class)
public class CustomerOrder_ { 

    public static volatile SingularAttribute<CustomerOrder, Long> totalAmount;
    public static volatile SingularAttribute<CustomerOrder, Long> finalAmount;
    public static volatile ListAttribute<CustomerOrder, OrderedProduct> orderedProductList;
    public static volatile SingularAttribute<CustomerOrder, Long> discount;
    public static volatile SingularAttribute<CustomerOrder, Integer> id;
    public static volatile SingularAttribute<CustomerOrder, Integer> invoiceNo;
    public static volatile SingularAttribute<CustomerOrder, Boolean> quotation;
    public static volatile SingularAttribute<CustomerOrder, Customer> customer;

}