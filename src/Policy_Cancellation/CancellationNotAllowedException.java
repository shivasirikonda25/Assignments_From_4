package Policy_Cancellation;

public class CancellationNotAllowedException extends Exception
{
    public CancellationNotAllowedException(String message) {
        super(message);
    }
}
