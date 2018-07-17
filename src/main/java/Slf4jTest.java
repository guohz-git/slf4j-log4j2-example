import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {
    static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);

    public static void main(String[] args) {
        logger.info("self4j log : {}" ,"enable");
    }
}
