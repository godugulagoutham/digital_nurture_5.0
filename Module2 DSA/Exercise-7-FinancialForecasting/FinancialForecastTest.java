/**
 * FinancialForecastTest Class
 * 
 * Demonstrates different approaches to financial forecasting using recursion.
 * Compares performance of various implementations and shows practical examples.
 * 
 * Sample Scenarios:
 * 1. Basic Investment Growth
 * 2. Long-term Retirement Planning
 * 3. College Fund Calculation
 * 4. Break-even Analysis
 * 
 * @author Cognizant Digital Nurture
 * @version 1.0
 */
public class FinancialForecastTest {
    
    public static void main(String[] args) {
        System.out.println("=== Financial Forecasting Demo ===\n");
        
        // ===== BASIC INVESTMENT SCENARIO =====
        System.out.println("--- Scenario 1: Basic Investment Growth ---");
        double principal = 10000;      // ₹10,000
        double annualRate = 0.08;       // 8% per year
        int years = 5;
        
        System.out.println("Investment Details:");
        System.out.println("  Principal: ₹" + principal);
        System.out.println("  Annual Rate: " + (annualRate * 100) + "%");
        System.out.println("  Duration: " + years + " years");
        System.out.println();
        
        // Calculate using different methods
        System.out.println("Future Value Calculations:");
        
        // For small years, use all methods
        if (years <= 15) {
            long startNaive = System.nanoTime();
            double futureNaive = FinancialForecast.calculateFutureValueNaiveRecursive(principal, annualRate, years);
            long timeNaive = System.nanoTime() - startNaive;
            System.out.printf("  Naive Recursive: ₹%.2f (Time: %.2f ms)%n", futureNaive, timeNaive / 1_000_000.0);
        }
        
        long startMemo = System.nanoTime();
        double futureMemo = FinancialForecast.calculateFutureValueMemoization(principal, annualRate, years);
        long timeMemo = System.nanoTime() - startMemo;
        System.out.printf("  Memoization: ₹%.2f (Time: %.2f ms)%n", futureMemo, timeMemo / 1_000_000.0);
        
        long startIter = System.nanoTime();
        double futureIter = FinancialForecast.calculateFutureValueIterative(principal, annualRate, years);
        long timeIter = System.nanoTime() - startIter;
        System.out.printf("  Iterative: ₹%.2f (Time: %.2f ms)%n", futureIter, timeIter / 1_000_000.0);
        
        long startMath = System.nanoTime();
        double futureMath = FinancialForecast.calculateFutureValueMathematical(principal, annualRate, years);
        long timeMath = System.nanoTime() - startMath;
        System.out.printf("  Mathematical: ₹%.2f (Time: %.2f ms)%n", futureMath, timeMath / 1_000_000.0);
        
        System.out.println();
        
        // ===== YEARLY BREAKDOWN =====
        System.out.println("--- Yearly Growth Breakdown ---");
        System.out.println("Year | Amount (₹) | Interest Earned (₹)");
        System.out.println("-".repeat(50));
        
        double balance = principal;
        System.out.printf("%4d | %,10.2f | %,18.2f%n", 0, balance, 0.0);
        
        for (int i = 1; i <= years; i++) {
            double previousBalance = balance;
            balance = FinancialForecast.calculateFutureValueMathematical(principal, annualRate, i);
            double interestEarned = balance - previousBalance;
            System.out.printf("%4d | %,10.2f | %,18.2f%n", i, balance, interestEarned);
        }
        System.out.println();
        
        // ===== RETIREMENT PLANNING SCENARIO =====
        System.out.println("--- Scenario 2: Retirement Planning (Long-term) ---");
        double monthlyContribution = 10000;  // ₹10,000 per month
        double yearsToRetirement = 30;
        double returnRate = 0.10;             // 10% annual return
        
        System.out.println("Retirement Fund Details:");
        System.out.println("  Monthly Contribution: ₹" + monthlyContribution);
        System.out.println("  Years to Retirement: " + (int)yearsToRetirement);
        System.out.println("  Expected Annual Return: " + (returnRate * 100) + "%");
        
        // Simple calculation: total contributions + growth
        double totalContributions = monthlyContribution * 12 * yearsToRetirement;
        double retirementAmount = FinancialForecast.calculateFutureValueMathematical(
            totalContributions, returnRate, (int)yearsToRetirement);
        
        System.out.println();
        System.out.printf("  Total Contributions: ₹%,.2f%n", totalContributions);
        System.out.printf("  Projected Retirement Fund: ₹%,.2f%n", retirementAmount);
        System.out.printf("  Investment Growth: ₹%,.2f%n", retirementAmount - totalContributions);
        System.out.println();
        
        // ===== RULE OF 72 & DOUBLING TIME =====
        System.out.println("--- Scenario 3: Time to Double Investment ---");
        double[] rates = {0.05, 0.07, 0.08, 0.10, 0.12};
        
        System.out.println("Rate   | Rule of 72 (approx) | Exact Calculation | Difference");
        System.out.println("-".repeat(65));
        
        for (double rate : rates) {
            double rule72 = FinancialForecast.yearsToDoubleRuleOf72(rate);
            double exact = FinancialForecast.yearsToDoubleExact(rate);
            double diff = Math.abs(rule72 - exact);
            System.out.printf("%5.1f%% | %19.2f | %17.2f | %10.2f%n", 
                rate * 100, rule72, exact, diff);
        }
        System.out.println();
        
        // ===== COMPLEXITY ANALYSIS =====
        System.out.println("--- Time Complexity Analysis ---");
        System.out.println("Method                     | Time Complexity | Space Complexity | Best Use Case");
        System.out.println("-".repeat(85));
        System.out.println("Naive Recursive            | O(2^n)          | O(n)             | Educational (n ≤ 20)");
        System.out.println("Recursive + Memoization    | O(n)            | O(n)             | Learning recursion");
        System.out.println("Iterative Loop             | O(n)            | O(1)             | Production (good balance)");
        System.out.println("Mathematical (Math.pow)    | O(1)            | O(1)             | Production (best)");
        System.out.println();
        
        // ===== COLLEGE FUND EXAMPLE =====
        System.out.println("--- Scenario 4: College Fund Planning ---");
        double childAge = 8;
        double collegeAge = 18;
        double yearsUntilCollege = collegeAge - childAge;
        double currentSavings = 50000;     // ₹50,000 already saved
        double annualReturn = 0.09;         // 9% annual return
        
        double collegeAmount = FinancialForecast.calculateFutureValueMathematical(
            currentSavings, annualReturn, (int)yearsUntilCollege);
        
        System.out.println("College Fund Details:");
        System.out.println("  Child's Current Age: " + (int)childAge);
        System.out.println("  Years Until College: " + (int)yearsUntilCollege);
        System.out.println("  Current Savings: ₹" + currentSavings);
        System.out.println("  Expected Annual Return: " + (annualReturn * 100) + "%");
        System.out.println();
        System.out.printf("  Projected Amount at College: ₹%,.2f%n", collegeAmount);
        System.out.println();
    }
}
