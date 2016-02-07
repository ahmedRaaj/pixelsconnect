package com.ahmed.pixelsconnect.domain;

import com.ahmed.pixelsconnect.domain.Category;
import com.ahmed.pixelsconnect.domain.OrderedProduct;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-02-08T02:51:11")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, Double> unitPrice;
    public static volatile SingularAttribute<Product, String> image;
    public static volatile SingularAttribute<Product, Double> buyingPrice;
    public static volatile SingularAttribute<Product, Date> lastUpdate;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, String> additionalInfo;
    public static volatile ListAttribute<Product, OrderedProduct> orderedProductList;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, Integer> id;
    public static volatile SingularAttribute<Product, Category> category;

}