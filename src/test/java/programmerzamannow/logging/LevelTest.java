package programmerzamannow.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LevelTest {

  private static final Logger log = LoggerFactory.getLogger(LevelTest.class);

  @Test
  void testLevel() {

    log.trace("Trace");
    log.debug("Debug");
    log.info("Info");
    log.warn("Warning");
    log.error("Error");

  }
}
