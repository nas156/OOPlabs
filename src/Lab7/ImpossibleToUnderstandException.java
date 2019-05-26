package Lab7;

/**
 * Thrown when exception is not understood, when "My code is perfect, why does not it work?".
 *
 * @author nas156
 */
public class ImpossibleToUnderstandException extends RuntimeException {
    static final long serialVersionUID = -12345678987654321L;

    /**
     * Constructs a {@code ImpossibleToUnderstandException} with no detail message.
     */
    ImpossibleToUnderstandException() {
        super();
        System.out.println("Again?");
    }

    /**
     * Constructs a {@code ImpossibleToUnderstandException} with the specified
     * detail message.
     *
     * @param s the detail message.
     */

    ImpossibleToUnderstandException(String s) {
        super(s);
    }

}
