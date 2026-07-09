import java.util.Arrays;

/**
 * EcommerceSearchTest Class
 * 
 * Demonstrates the usage of Linear Search and Binary Search algorithms
 * in the context of an e-commerce product search system.
 * 
 * Sample Data: 10 products with various IDs and prices.
 * 
 * @author Cognizant Digital Nurture
 * @version 1.0
 */
public class EcommerceSearchTest {
    
    public static void main(String[] args) {
        System.out.println("=== E-commerce Search System Demo ===\n");
        
        // Create sample products (unsorted for linear search)
        Product[] products = new Product[]{
            new Product(105, "Laptop", 45000, 5),
            new Product(102, "Mouse", 500, 50),
            new Product(108, "Keyboard", 1500, 30),
            new Product(101, "Monitor", 15000, 10),
            new Product(107, "USB Cable", 200, 100),
            new Product(103, "Webcam", 2000, 15),
            new Product(106, "Headphones", 3000, 25),
            new Product(104, "Mousepad", 300, 40),
            new Product(109, "Power Bank", 1200, 20),
            new Product(110, "Screen Protector", 150, 80)
        };
        
        System.out.println("Sample Products:");
        for (Product p : products) {
            System.out.println("  " + p);
        }
        System.out.println();
        
        // ===== LINEAR SEARCH DEMONSTRATIONS =====
        System.out.println("--- LINEAR SEARCH TESTS ---");
        System.out.println("Linear Search is efficient for unsorted arrays.\n");
        
        System.out.println("Test 1: Search for Product ID 105");
        Product result1 = LinearSearch.searchById(products, 105);
        if (result1 != null) {
            System.out.println("Result: " + result1);
        }
        System.out.println();
        
        System.out.println("Test 2: Search for Product ID 999 (Not Found)");
        Product result2 = LinearSearch.searchById(products, 999);
        if (result2 == null) {
            System.out.println("Result: Product not found in inventory");
        }
        System.out.println();
        
        System.out.println("Test 3: Search by Price Range (₹500 - ₹2000)");
        Product[] rangeResults = LinearSearch.searchByPriceRange(products, 500, 2000);
        System.out.println("Products found:");
        for (Product p : rangeResults) {
            System.out.println("  " + p);
        }
        System.out.println();
        
        // ===== BINARY SEARCH DEMONSTRATIONS =====
        System.out.println("--- BINARY SEARCH TESTS ---");
        System.out.println("Binary Search is efficient for sorted arrays.\n");
        
        // Create sorted copy for binary search
        Product[] sortedProducts = products.clone();
        Arrays.sort(sortedProducts);
        
        System.out.println("Sorted Products (by ID):");
        for (Product p : sortedProducts) {
            System.out.println("  " + p);
        }
        System.out.println();
        
        System.out.println("Test 1: Binary Search for Product ID 107");
        Product bResult1 = BinarySearch.searchById(sortedProducts, 107);
        if (bResult1 != null) {
            System.out.println("Result: " + bResult1);
        }
        System.out.println();
        
        System.out.println("Test 2: Recursive Binary Search for Product ID 103");
        Product bResult2 = BinarySearch.searchByIdRecursive(sortedProducts, 103);
        if (bResult2 != null) {
            System.out.println("Result: " + bResult2);
        }
        System.out.println();
        
        System.out.println("Test 3: Binary Search for Product ID 999 (Not Found)");
        Product bResult3 = BinarySearch.searchById(sortedProducts, 999);
        if (bResult3 == null) {
            System.out.println("Result: Product not found in inventory");
        }
        System.out.println();
        
        // ===== PERFORMANCE COMPARISON =====
        System.out.println("--- PERFORMANCE COMPARISON ---");
        System.out.println("Complexity Analysis:");
        System.out.println("  Linear Search: O(n) - Searches sequentially");
        System.out.println("  Binary Search: O(log n) - Divides search space in half");
        System.out.println();
        System.out.println("For 10 products:");
        System.out.println("  Linear Search worst case: 10 comparisons");
        System.out.println("  Binary Search worst case: " + (int)(Math.log(10)/Math.log(2)) + " comparisons");
        System.out.println();
        System.out.println("For 1,000,000 products:");
        System.out.println("  Linear Search worst case: 1,000,000 comparisons");
        System.out.println("  Binary Search worst case: " + (int)(Math.log(1000000)/Math.log(2)) + " comparisons");
        System.out.println();
    }
}
