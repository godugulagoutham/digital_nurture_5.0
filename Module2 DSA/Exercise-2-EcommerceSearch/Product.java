/**
 * Product Model Class
 * 
 * Represents a product in the e-commerce system with essential attributes.
 * This class is used for search operations and data manipulation.
 * 
 * @author Cognizant Digital Nurture
 * @version 1.0
 */
public class Product implements Comparable<Product> {
    
    private int productId;
    private String productName;
    private double price;
    private int quantity;
    
    /**
     * Constructor to initialize a Product.
     * 
     * @param productId Unique identifier for the product
     * @param productName Name of the product
     * @param price Price of the product
     * @param quantity Quantity in stock
     */
    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Getters
    public int getProductId() {
        return productId;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    /**
     * Compares products by productId for sorting.
     * Required for binary search functionality.
     * 
     * @param other The product to compare with
     * @return negative if this < other, 0 if equal, positive if this > other
     */
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }
    
    /**
     * Returns string representation of the product.
     */
    @Override
    public String toString() {
        return String.format("Product{ID=%d, Name='%s', Price=%.2f, Qty=%d}", 
            productId, productName, price, quantity);
    }
}
