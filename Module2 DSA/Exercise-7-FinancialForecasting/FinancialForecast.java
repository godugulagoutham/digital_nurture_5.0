/**
 * FinancialForecast Class
 * 
 * Demonstrates recursive approach to financial forecasting.
 * Uses recursion to calculate compound growth of investments.
 * 
 * Problem Statement:
 * Calculate the future value of an investment with compound interest.
 * Formula: FV = PV * (1 + r)^n
 * where:
 *   - PV = Present Value (initial investment)
 *   - r = Rate of interest (as decimal, e.g., 0.05 for 5%)
 *   - n = Number of periods (years)
 *   - FV = Future Value
 * 
 * Time Complexity Analysis:
 *   - Naive Recursive: O(2^n) - Exponential (extremely inefficient)
 *   - With Memoization: O(n) - Linear (efficient)
 *   - Iterative: O(n) - Linear (most efficient)
 * 
 * Space Complexity Analysis:
 *   - Naive Recursive: O(n) - Call stack depth
 *   - With Memoization: O(n) - Recursion stack + cache
 *   - Iterative: O(1) - Constant space
 * 
 * @author Cognizant Digital Nurture
 * @version 1.0
 */
public class FinancialForecast {
    
    // Memoization cache for storing calculated values
    private static java.util.Map<String, Double> cache = new java.util.HashMap<>();
    
    /**
     * Calculates future value using NAIVE RECURSIVE approach.
     * WARNING: This is inefficient for large n values due to repeated calculations.
     * 
     * Time Complexity: O(2^n) - Exponential
     * Space Complexity: O(n) - Call stack depth
     * 
     * @param presentValue Initial investment amount
     * @param rate Annual interest rate (as decimal, e.g., 0.05 for 5%)
     * @param years Number of years for investment
     * @return Future value after compound interest
     */
    public static double calculateFutureValueNaiveRecursive(double presentValue, double rate, int years) {
        // Base case: no years have passed
        if (years == 0) {
            return presentValue;
        }
        
        // Recursive case: calculate for one less year, then apply interest
        // FV(n) = FV(n-1) * (1 + rate)
        return calculateFutureValueNaiveRecursive(presentValue, rate, years - 1) * (1 + rate);
    }
    
    /**
     * Calculates future value using RECURSIVE approach with MEMOIZATION.
     * Much more efficient than naive recursion.
     * 
     * Time Complexity: O(n) - Linear
     * Space Complexity: O(n) - Memoization cache
     * 
     * @param presentValue Initial investment amount
     * @param rate Annual interest rate (as decimal)
     * @param years Number of years for investment
     * @return Future value after compound interest
     */
    public static double calculateFutureValueMemoization(double presentValue, double rate, int years) {
        String key = presentValue + ":" + rate + ":" + years;
        
        // Check if result is already calculated
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        
        // Base case
        if (years == 0) {
            return presentValue;
        }
        
        // Recursive case with memoization
        double result = calculateFutureValueMemoization(presentValue, rate, years - 1) * (1 + rate);
        cache.put(key, result);
        return result;
    }
    
    /**
     * Calculates future value using ITERATIVE approach (Most efficient).
     * This is the best approach in terms of performance and space usage.
     * 
     * Time Complexity: O(n) - Linear
     * Space Complexity: O(1) - Constant space
     * 
     * @param presentValue Initial investment amount
     * @param rate Annual interest rate (as decimal)
     * @param years Number of years for investment
     * @return Future value after compound interest
     */
    public static double calculateFutureValueIterative(double presentValue, double rate, int years) {
        double futureValue = presentValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + rate);
        }
        return futureValue;
    }
    
    /**
     * Calculates future value using MATHEMATICAL approach.
     * Direct calculation without loop or recursion.
     * 
     * Time Complexity: O(1) - Constant
     * Space Complexity: O(1) - Constant space
     * 
     * Uses built-in Math.pow() function for efficient power calculation.
     * 
     * @param presentValue Initial investment amount
     * @param rate Annual interest rate (as decimal)
     * @param years Number of years for investment
     * @return Future value after compound interest
     */
    public static double calculateFutureValueMathematical(double presentValue, double rate, int years) {
        return presentValue * Math.pow(1 + rate, years);
    }
    
    /**
     * Calculates the number of years needed to double the investment.
     * Uses the "Rule of 72" as approximation and exact calculation.
     * 
     * Rule of 72: Years to double ≈ 72 / (rate * 100)
     * 
     * @param rate Annual interest rate (as decimal)
     * @return Approximate years to double (using Rule of 72)
     */
    public static double yearsToDoubleRuleOf72(double rate) {
        return 72 / (rate * 100);
    }
    
    /**
     * Calculates exact years needed to double the investment.
     * Uses logarithm formula: n = log(2) / log(1 + r)
     * 
     * @param rate Annual interest rate (as decimal)
     * @return Exact years to double the investment
     */
    public static double yearsToDoubleExact(double rate) {
        return Math.log(2) / Math.log(1 + rate);
    }
    
    /**
     * Clears the memoization cache.
     */
    public static void clearCache() {
        cache.clear();
    }
}
