package Exception;


public class ExtraPlayersException extends Exception {
    public ExtraPlayersException() {

    }
    
    public String toString() {
        return "Exception : Please enter players between 2-4";
    }
}
