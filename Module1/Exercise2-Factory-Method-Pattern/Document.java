/**
 * Document Interface
 * 
 * This interface defines the contract for all document types.
 * It represents the abstraction layer for different document formats
 * in the Factory Method Design Pattern.
 * 
 * @author Cognizant Digital Nurture
 * @version 1.0
 */
public interface Document {
    
    /**
     * Generates content specific to the document type.
     * Each implementation provides its own way of generating content.
     */
    void generateContent();
    
    /**
     * Opens the document in the appropriate application.
     */
    void open();
    
    /**
     * Saves the document.
     */
    void save();
    
    /**
     * Closes the document.
     */
    void close();
}
