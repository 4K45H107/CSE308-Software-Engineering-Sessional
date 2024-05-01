package observer;

public interface user {
    public void operationalToPartialDown();
    public void operationalToFullyDown();
    public void partiallyDownToOperational();
    public void partiallyDownToFullyDown();
    public void fullyDownToOperational();
    public void fullyDownToPartiallyDown();
}
