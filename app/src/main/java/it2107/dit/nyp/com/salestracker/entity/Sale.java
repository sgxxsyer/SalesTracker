package it2107.dit.nyp.com.salestracker.entity;

import java.util.Date;

/**
 * Created by 143119F on 11/19/2015.
 */
public class Sale {
    private String itemName;

    public Sale(boolean staffDiscount, String itemName, double itemCostPrice, double itemSellingPrice, int quantitySold, Date dateSold) {
        this.staffDiscount = staffDiscount;
        this.itemName = itemName;
        this.itemCostPrice = itemCostPrice;
        this.itemSellingPrice = itemSellingPrice;
        this.quantitySold = quantitySold;
        this.dateSold = dateSold;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemCostPrice() {
        return itemCostPrice;
    }

    public void setItemCostPrice(double itemCostPrice) {
        this.itemCostPrice = itemCostPrice;
    }

    public double getItemSellingPrice() {
        return itemSellingPrice;
    }

    public void setItemSellingPrice(double itemSellingPrice) {
        this.itemSellingPrice = itemSellingPrice;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public boolean isStaffDiscount() {
        return staffDiscount;
    }

    public void setStaffDiscount(boolean staffDiscount) {
        this.staffDiscount = staffDiscount;
    }

    public Date getDateSold() {
        return dateSold;
    }

    public void setDateSold(Date dateSold) {
        this.dateSold = dateSold;
    }

    private double itemCostPrice;

    @Override
    public String toString() {
        return "Sale{" +
                "itemName='" + itemName + '\'' +
                ", itemCostPrice=" + itemCostPrice +
                ", itemSellingPrice=" + itemSellingPrice +
                ", quantitySold=" + quantitySold +
                ", staffDiscount=" + staffDiscount +
                ", dateSold=" + dateSold +
                '}';
    }

    private double itemSellingPrice;
    private int quantitySold;
    private boolean staffDiscount;
    private Date dateSold;
}
