package ordermanagementsystem;

/**
 *
 * @author toshiba
 */
public class ProductDetails {
    
    private int regID;
    private String name;
    private int price;
    private String seller ;
    private int pieces;

    /**
     * @return the regID
     */
    public int getRegID() {
        return regID;
    }

    /**
     * @param regID the regID to set
     */
    public void setRegID(int regID) {
        this.regID = regID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the seller
     */
    public String getSeller() {
        return seller;
    }

    /**
     * @param seller the seller to set
     */
    public void setSeller(String seller) {
        this.seller = seller;
    }

    /**
     * @return the pieces
     */
    public int getPieces() {
        return pieces;
    }

    /**
     * @param pieces the pieces to set
     */
    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
    
    
}
