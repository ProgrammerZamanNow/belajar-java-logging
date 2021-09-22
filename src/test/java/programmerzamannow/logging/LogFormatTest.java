package programmerzamannow.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFormatTest {

  private static final Logger log = LoggerFactory.getLogger(LogFormatTest.class);

  @Test
  void testLogFormat() {

    log.info("Without Parameter");
    log.info("{} + {} = {}", 10, 10, (10 + 10));
    log.error("Ups", new NullPointerException());

  }
}
