package best.skn.utils.message;

import best.skn.utils.color.Color;
import reactor.core.publisher.Mono;

/**
 * Message Class as main API
 *
 * @author SKN Shukhan
 * @version 1.3.0
 * @since 2024-03-12
 * @use.case Java, Java Spring Boot
 * @dedicated.to Logno, Atoshi and My Parents
 */
public class Message {

  /**
   * Outputs info message on console when a process needs to notify something excluding failure and success
   *
   * @param message a String containing the actual info message
   * @return a String containing formatted info message
   * @since v1.0.0
   */
  public static String infoConsole(String message) {
    return String.format("%s 📚 \n", Color.blue(message));
  }

  /**
   * Outputs info message as server response on API request success/failure
   *
   * @param message a String containing the actual info message
   * @return a String containing formatted info message
   * @since v1.1.0
   */
  public static String infoServer(String message) {
    return String.format("Info: %s 📚", message);
  }

  /**
   * Outputs info message as server mono response on API request success/failure
   *
   * @param message a String containing the actual info message
   * @return a Mono of String containing formatted info message
   * @since v1.1.0
   */
  public static Mono<String> infoMono(String message) {
    Mono<String> infoMessage = Mono.just(infoServer(message)).log();

    return infoMessage;
  }

  /**
   * Outputs success message on console when a process succeeds to complete
   *
   * @param message a String containing the actual success message
   * @return a String containing formatted success message
   * @since v1.0.0
   */
  public static String successConsole(String message) {
    return String.format("%s ✅ \n", Color.green(message));
  }

  /**
   * Outputs success message as server response on API request success
   *
   * @param message a String containing the actual success message
   * @return a String containing formatted success message
   * @since v1.0.0
   */
  public static String successServer(String message) {
    return String.format("Success: %s ✅", message);
  }

  /**
   * Outputs success message as server mono response on API request success
   *
   * @param message a String containing the actual success message
   * @return a Mono of String containing formatted success message
   * @since v1.0.0
   */
  public static Mono<String> successMono(String message) {
    Mono<String> successMessage = Mono.just(successServer(message)).log();

    return successMessage;
  }

  /**
   * Outputs error message on console when a process fails to complete
   *
   * @param message a String containing the actual error message
   * @return a String containing formatted error message
   * @since v1.0.0
   */
  public static String errorConsole(String message) {
    return String.format("%s ❌ \n", Color.red(message));
  }

  /**
   * Outputs error message as server response on API request failure
   *
   * @param message a String containing the actual error message
   * @return a String containing formatted error message
   * @since v1.0.0
   */
  public static String errorServer(String message) {
    return String.format("Error: %s ❌", message);
  }

  /**
   * Outputs error message as server mono response on API request failure
   *
   * @param message a String containing the actual error message
   * @return a Mono of String containing formatted error message
   * @since v1.0.0
   */
  public static Mono<String> errorMono(String message) {
    Mono<String> errorMessage = Mono.error(new RuntimeException(errorServer(message)));

    return errorMessage;
  }

  /**
   * Public static method to throw Unsupported Instantiation Error
   *
   * @throws UnsupportedOperationException
   * @since v1.1.0
   */
  public static void throwInstantiationError() throws UnsupportedOperationException {
    throw new UnsupportedOperationException(errorConsole("Class Instantiation is not supported!"));
  }

  /**
   * Private constructor to make the class non-instantiable
   *
   * @since v1.1.0
   */
  private Message() {
    throwInstantiationError();
  }
}
