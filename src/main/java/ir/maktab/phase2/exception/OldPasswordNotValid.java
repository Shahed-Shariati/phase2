package ir.maktab.phase2.exception;

public class OldPasswordNotValid extends RuntimeException{
    private String Message = "Old Password Is not valid";
    public OldPasswordNotValid() {
    }

    @Override
    public String getMessage() {
        return Message;
    }
}
