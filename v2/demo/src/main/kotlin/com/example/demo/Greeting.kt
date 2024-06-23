
public class Greeting {
    private val message: String

    public Greeting() {}

    public Greeting(String message) this.message = message

    public getMessage(): String return this.message

    public void setMessage(message: String) this.message = message

    @Override
    public toString(): String return "Greeting(message='$message')"
}