package programmerzamannow.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

public class MyTest {

  @Test
  void testRequestId() throws InterruptedException {

    MyController controller = new MyController(new MyService(new MyRepository()));

    for (int i = 0; i < 10; i++) {
      new Thread(() -> {
        String requestId = UUID.randomUUID().toString();
        MDC.put("requestId", requestId);
        controller.save();
        MDC.remove("requestId");
      }).start();
    }

    Thread.sleep(1000L);

  }
}
