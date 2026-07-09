/**
 * PdfDocument Class
 * 
 * Concrete implementation for PDF documents (.pdf).
 * Demonstrates the Factory Method Pattern by implementing
 * the Document interface for PDF format.
 * 
 * @author Cognizant Digital Nurture
 * @version 1.0
 */
public class PdfDocument implements Document {
    
    /**
     * Generates content in PDF format with compression.
     */
    @Override
    public void generateContent() {
        System.out.println("Generating PDF Document (.pdf) content...");
        System.out.println("- Creating PDF pages with layout");
        System.out.println("- Compressing images for optimization");
        System.out.println("- Adding watermarks and metadata");
    }
    
    /**
     * Opens the document in a PDF viewer.
     */
    @Override
    public void open() {
        System.out.println("Opening document in PDF Viewer Application");
    }
    
    /**
     * Saves the document in PDF format.
     */
    @Override
    public void save() {
        System.out.println("Saving document as .pdf format with compression");
    }
    
    /**
     * Closes the PDF document.
     */
    @Override
    public void close() {
        System.out.println("Closing PDF document");
    }
}
