package nsu.ccfit.ru.mikhalev.ecxeption;

public class ChooseDirectionException extends RuntimeException {
    public ChooseDirectionException() {
        super("couldn't find the turn of the snake");
    }
}
