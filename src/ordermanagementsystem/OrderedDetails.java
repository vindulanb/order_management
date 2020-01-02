package ordermanagementsystem;

import java.util.Date;

/**
 *
 * @author toshiba
 */
public class OrderedDetails{

    
    private int orderID;
    private int pid;
    private int quantity;
    private int price;
    private int subTotal;
    private int sellerID;
    private String orderDate;
    private boolean delivered;

    /**
     * @return the orderID
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the pid
     */
    public int getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(int pid) {
        this.pid = pid;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the subTotal
     */
    public int getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the sellerID
     */
    public int getSellerID() {
        return sellerID;
    }

    /**
     * @param sellerID the sellerID to set
     */
    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    /**
     * @return the delivered
     */
    public boolean isDelivered() {
        return delivered;
    }

    /**
     * @param delivered the delivered to set
     */
    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }    
}
