import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JTest {

    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        logger.info("{}{}",1234455,"djsfhsdjhf");
        logger.debug("this is a test");
    }
}
