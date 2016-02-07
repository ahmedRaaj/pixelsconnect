/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.pixelsconnect.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Amir
 */
@Embeddable
public class OrderedProductPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Product_id")
    private int productid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "customer_order_id")
    private int customerOrderId;

    public OrderedProductPK() {
    }

    public OrderedProductPK(int productid, int customerOrderId) {
        this.productid = productid;
        this.customerOrderId = customerOrderId;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(int customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productid;
        hash += (int) customerOrderId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderedProductPK)) {
            return false;
        }
        OrderedProductPK other = (OrderedProductPK) object;
        if (this.productid != other.productid) {
            return false;
        }
        if (this.customerOrderId != other.customerOrderId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ahmed.pixelsconnect.domain.OrderedProductPK[ productid=" + productid + ", customerOrderId=" + customerOrderId + " ]";
    }
    
}
