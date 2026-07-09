/**
 * WordDocument Class
 * 
 * Concrete implementation for MS Word documents (.docx).
 * Demonstrates the Factory Method Pattern by implementing
 * the Document interface for Word format.
 * 
 * @author Cognizant Digital Nurture
 * @version 1.0
 */
public class WordDocument implements Document {
    
    /**
     * Generates content in Word format with proper formatting.
     */
    @Override
    public void generateContent() {
        System.out.println("Generating Microsoft Word Document (.docx) content...");
        System.out.println("- Adding paragraphs with formatting");
        System.out.println("- Applying styles and themes");
        System.out.println("- Embedding images and objects");
    }
    
    /**
     * Opens the document in MS Word.
     */
    @Override
    public void open() {
        System.out.println("Opening document in Microsoft Word Application");
    }
    
    /**
     * Saves the document in Word format.
     */
    @Override
    public void save() {
        System.out.println("Saving document as .docx format");
    }
    
    /**
     * Closes the Word document.
     */
    @Override
    public void close() {
        System.out.println("Closing Microsoft Word document");
    }
}
