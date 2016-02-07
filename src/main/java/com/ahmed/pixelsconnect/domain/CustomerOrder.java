/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahmed.pixelsconnect.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Amir
 */
@Entity
@Table(name = "customer_order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerOrder.findAll", query = "SELECT c FROM CustomerOrder c"),
    @NamedQuery(name = "CustomerOrder.findById", query = "SELECT c FROM CustomerOrder c WHERE c.id = :id"),
    @NamedQuery(name = "CustomerOrder.findByTotalAmount", query = "SELECT c FROM CustomerOrder c WHERE c.totalAmount = :totalAmount"),
    @NamedQuery(name = "CustomerOrder.findByInvoiceNo", query = "SELECT c FROM CustomerOrder c WHERE c.invoiceNo = :invoiceNo"),
    @NamedQuery(name = "CustomerOrder.findByQuotation", query = "SELECT c FROM CustomerOrder c WHERE c.quotation = :quotation"),
    @NamedQuery(name = "CustomerOrder.findByFinalAmount", query = "SELECT c FROM CustomerOrder c WHERE c.finalAmount = :finalAmount"),
    @NamedQuery(name = "CustomerOrder.findByDiscount", query = "SELECT c FROM CustomerOrder c WHERE c.discount = :discount")})
public class CustomerOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "total_amount")
    private Long totalAmount;
    @Column(name = "invoice_no")
    private Integer invoiceNo;
    @Column(name = "quotation")
    private Boolean quotation;
    @Column(name = "final_amount")
    private Long finalAmount;
    @Column(name = "discount")
    private Long discount;
    @JoinColumn(name = "Customer_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Customer customer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerOrder")
    private List<OrderedProduct> orderedProductList;

    public CustomerOrder() {
    }

    public CustomerOrder(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Integer invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Boolean getQuotation() {
        return quotation;
    }

    public void setQuotation(Boolean quotation) {
        this.quotation = quotation;
    }

    public Long getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(Long finalAmount) {
        this.finalAmount = finalAmount;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customerid) {
        this.customer = customerid;
    }

    @XmlTransient
    public List<OrderedProduct> getOrderedProductList() {
        return orderedProductList;
    }

    public void setOrderedProductList(List<OrderedProduct> orderedProductList) {
        this.orderedProductList = orderedProductList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerOrder)) {
            return false;
        }
        CustomerOrder other = (CustomerOrder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ahmed.pixelsconnect.domain.CustomerOrder[ id=" + id + " ]";
    }
    
}
