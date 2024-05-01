package observer;

public interface baseCompany {
    public void subscribe(user user, String type);
    public void unSubscribe();
    public void notifyUser(int option);
}