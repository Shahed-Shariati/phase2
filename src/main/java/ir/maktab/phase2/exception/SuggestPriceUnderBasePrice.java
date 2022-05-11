package ir.maktab.phase2.exception;

public class SuggestPriceUnderBasePrice extends RuntimeException{
    private String getMessage = "Suggest price is under price Base ";

    public SuggestPriceUnderBasePrice() {
    }

    public String getGetMessage() {
        return getMessage;
    }
}
