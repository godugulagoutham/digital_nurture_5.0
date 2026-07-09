/**
 * LinearSearch Class
 * 
 * Implements Linear Search algorithm to find products in the e-commerce system.
 * 
 * Algorithm: Sequentially searches each element until the target is found.
 * 
 * Time Complexity: O(n) - where n is the number of products
 *   - Best Case: O(1) - element found at first position
 *   - Average Case: O(n/2) ≈ O(n)
 *   - Worst Case: O(n) - element at last position or not found
 * 
 * Space Complexity: O(1) - only uses constant extra space
 * 
 * Advantages:
 *   - Works on unsorted data
 *   - Simple to implement and understand
 *   - No pre-processing required
 * 
 * Disadvantages:
 *   - Inefficient for large datasets
 *   - Slower than binary search for sorted data
 * 
 * @author Cognizant Digital Nurture
 * @version 1.0
 */
public class LinearSearch {
    
    /**
     * Searches for a product by ID using linear search.
     * 
     * @param products Array of products to search
     * @param targetId The product ID to find
     * @return The product if found, null otherwise
     */
    public static Product searchById(Product[] products, int targetId) {
        if (products == null || products.length == 0) {
            System.out.println("Product list is empty.");
            return null;
        }
        
        // Iterate through all products
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == targetId) {
                System.out.println("Product found at index " + i + " after " + (i + 1) + " comparisons");
                return products[i];
            }
        }
        
        System.out.println("Product not found. Searched through all " + products.length + " products.");
        return null;
    }
    
    /**
     * Searches for products within a price range using linear search.
     * 
     * @param products Array of products to search
     * @param minPrice Minimum price (inclusive)
     * @param maxPrice Maximum price (inclusive)
     * @return Array of products within the price range
     */
    public static Product[] searchByPriceRange(Product[] products, double minPrice, double maxPrice) {
        if (products == null || products.length == 0) {
            return new Product[0];
        }
        
        // Count matching products
        int count = 0;
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                count++;
            }
        }
        
        // Create result array and fill it
        Product[] results = new Product[count];
        int index = 0;
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                results[index++] = product;
            }
        }
        
        System.out.println("Found " + count + " products in price range ₹" + minPrice + " - ₹" + maxPrice);
        return results;
    }
}
