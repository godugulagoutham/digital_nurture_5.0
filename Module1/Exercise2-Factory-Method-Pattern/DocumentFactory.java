/**
 * DocumentFactory Class
 * 
 * Factory for creating Document instances based on file type.
 * This is the core of the Factory Method Design Pattern.
 * The factory encapsulates the logic for creating objects,
 * allowing the client code to remain independent of concrete implementations.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * 
 * @author Cognizant Digital Nurture
 * @version 1.0
 */
public class DocumentFactory {
    
    /**
     * Creates and returns a Document instance based on file type.
     * 
     * @param fileType The type of document to create (WORD, PDF, EXCEL)
     * @return A Document instance of the specified type
     * @throws IllegalArgumentException if the file type is not supported
     */
    public static Document createDocument(String fileType) {
        if (fileType == null) {
            throw new IllegalArgumentException("File type cannot be null");
        }
        
        // Convert to uppercase for case-insensitive comparison
        fileType = fileType.toUpperCase();
        
        switch (fileType) {
            case "WORD":
            case "DOC":
            case "DOCX":
                return new WordDocument();
                
            case "PDF":
                return new PdfDocument();
                
            case "EXCEL":
            case "XLS":
            case "XLSX":
                return new ExcelDocument();
                
            default:
                throw new IllegalArgumentException("Unknown document type: " + fileType);
        }
    }
}
