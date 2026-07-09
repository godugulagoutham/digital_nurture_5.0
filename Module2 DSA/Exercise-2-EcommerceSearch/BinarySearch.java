
/**
 * BinarySearch Class
 * 
 * Implements Binary Search algorithm to find products in the e-commerce system.
 * NOTE: Requires the product array to be sorted by product ID.
 * 
 * Algorithm: Divides the search space by half in each iteration.
 * 
 * Time Complexity: O(log n) - where n is the number of products
 *   - Best Case: O(1) - element at middle position
 *   - Average Case: O(log n)
 *   - Worst Case: O(log n)
 * 
 * Space Complexity: O(1) - iterative approach uses constant extra space
 * 
 * Advantages:
 *   - Very efficient for large sorted datasets
 *   - Much faster than linear search for large n
 *   - Predictable performance (O(log n))
 * 
 * Disadvantages:
 *   - Requires sorted data
 *   - More complex than linear search
 *   - Array insertion/deletion is inefficient
 * 
 * @author Cognizant Digital Nurture
 * @version 1.0
 */
public class BinarySearch {
    
    /**
     * Searches for a product by ID using binary search (iterative).
     * 
     * Prerequisite: Product array must be sorted by product ID.
     * 
     * @param products Sorted array of products
     * @param targetId The product ID to find
     * @return The product if found, null otherwise
     */
    public static Product searchById(Product[] products, int targetId) {
        if (products == null || products.length == 0) {
            System.out.println("Product list is empty.");
            return null;
        }
        
        int left = 0;
        int right = products.length - 1;
        int comparisons = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            comparisons++;
            int midId = products[mid].getProductId();
            
            if (midId == targetId) {
                System.out.println("Product found after " + comparisons + " comparisons");
                return products[mid];
            } else if (midId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println("Product not found after " + comparisons + " comparisons");
        return null;
    }
    
    /**
     * Recursive implementation of binary search.
     * 
     * @param products Sorted array of products
     * @param targetId The product ID to find
     * @param left Left boundary of search
     * @param right Right boundary of search
     * @return The product if found, null otherwise
     */
    public static Product searchByIdRecursive(Product[] products, int targetId, int left, int right) {
        if (left > right) {
            System.out.println("Product not found (recursive search)");
            return null;
        }
        
        int mid = left + (right - left) / 2;
        int midId = products[mid].getProductId();
        
        if (midId == targetId) {
            return products[mid];
        } else if (midId < targetId) {
            return searchByIdRecursive(products, targetId, mid + 1, right);
        } else {
            return searchByIdRecursive(products, targetId, left, mid - 1);
        }
    }
    
    /**
     * Public wrapper for recursive binary search.
     */
    public static Product searchByIdRecursive(Product[] products, int targetId) {
        if (products == null || products.length == 0) {
            System.out.println("Product list is empty.");
            return null;
        }
        return searchByIdRecursive(products, targetId, 0, products.length - 1);
    }
}
