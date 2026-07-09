
# Exercise 7: Financial Forecasting

## Objective

Calculate future value for compound interest using recursive and non-recursive methods.

## Problem Statement

Forecast investment growth over years with a given annual rate.

## Approach Used

- `calculateFutureValueNaiveRecursive()` uses recursion with one call per year
- `calculateFutureValueMemoization()` caches results for repeated calls
- `calculateFutureValueIterative()` uses a loop
- `calculateFutureValueMathematical()` uses `Math.pow()`

## Code Structure

- `FinancialForecast.java`: methods for each calculation approach
- `FinancialForecastTest.java`: sample scenarios for investment and retirement

## Sample Output

```text
--- Scenario 1: Basic Investment Growth ---
Investment Details:
  Principal: ₹10000.0
  Annual Rate: 8.0%
  Duration: 5 years

Future Value Calculations:
  Naive Recursive: ₹14693.28
  Memoization: ₹14693.28
  Iterative: ₹14693.28
  Mathematical: ₹14693.28
```

## Time Complexity

- Naive recursion: O(n)
- Memoization: O(n)
- Iterative: O(n)
- Mathematical: O(1)

## Learning Outcome

Compare recursive, iterative, and formula-based approaches for the same financial problem.
