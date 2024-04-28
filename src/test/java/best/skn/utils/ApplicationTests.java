package best.skn.utils;

import best.skn.utils.message.Message;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

  @Test
  void infoMessageOutput() {
    System.out.println(Message.infoConsole("You are SKN!"));
  }

  @Test
  void successMessageOutput() {
    System.out.println(
      Message.successConsole(
        "SKN, you were able to learn three languages successfully!"
      )
    );
  }

  @Test
  void errorMessageOutput() {
    System.out.println(
      Message.errorConsole(("SKN, you failed to find the true happiness!"))
    );
  }
}