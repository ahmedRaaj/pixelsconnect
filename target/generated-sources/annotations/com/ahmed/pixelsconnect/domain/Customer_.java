package com.ahmed.pixelsconnect.domain;

import com.ahmed.pixelsconnect.domain.CustomerOrder;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-08T02:51:11")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> email2;
    public static volatile SingularAttribute<Customer, String> address;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, String> postalCode;
    public static volatile SingularAttribute<Customer, String> companyName;
    public static volatile SingularAttribute<Customer, String> name;
    public static volatile SingularAttribute<Customer, String> mobile;
    public static volatile ListAttribute<Customer, CustomerOrder> customerOrderList;
    public static volatile SingularAttribute<Customer, Integer> id;
    public static volatile SingularAttribute<Customer, String> email;

}