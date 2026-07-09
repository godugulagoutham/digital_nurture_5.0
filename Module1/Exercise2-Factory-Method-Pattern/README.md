# Exercise 2: Factory Method

## Objective

Use a factory to create document objects without the client knowing the concrete classes.

## Problem Statement

The client should request a document type and receive the appropriate document object.

## Approach Used

- Define `Document` interface
- Implement `WordDocument`, `PdfDocument`, `ExcelDocument`
- Use `DocumentFactory.createDocument()` to return the correct type

## Code Structure

- `Document.java`: interface for document actions
- `WordDocument.java`, `PdfDocument.java`, `ExcelDocument.java`: concrete implementations
- `DocumentFactory.java`: factory method for document creation
- `FactoryMethodTest.java`: demonstrates document creation and usage

## Sample Output

```text
=== Factory Method Design Pattern Demo ===

--- Creating Word Document ---
Opening document in Microsoft Word Application
Generating Microsoft Word Document (.docx) content...
Saving document as .docx format
Closing Microsoft Word document
```

## Time Complexity

- `createDocument()`: O(1)
- Document operations: O(1) per method

## Learning Outcome

Learn how to separate object creation from usage and add new document types with minimal code change.
