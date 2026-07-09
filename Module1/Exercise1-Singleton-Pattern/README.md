# Exercise 1: Singleton Logger

## Objective

Create a Logger class that returns a single shared instance.

## 🔗 Problem Statement

The application should use one Logger object throughout its runtime.

## Approach Used

- Private constructor to block direct creation
- Static instance field
- `getInstance()` returns the same object on every call

## Code Structure

- `Logger.java` contains the singleton logic and `log()` method
- `SingletonTest.java` gets two Logger references and checks identity

## Sample Output

```text
Logger Instance Created
Application Started
Only One Instance Exists
