package ir.maktab.phase2.exception;

public class ImageSizeOutOfRange extends RuntimeException{
    private String message = "Image size out of range";

    public ImageSizeOutOfRange() {
    }

    @Override
    public String getMessage() {
        return message;
    }
}
