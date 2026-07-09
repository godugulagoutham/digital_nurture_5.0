import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {
    private static final Logger logger = LoggerFactory.getLogger(LoggingDemo.class);

    public void run() {
        logger.info("Application started");
        logger.debug("Debug message for development");
        logger.warn("Warning message generated");
    }
}
