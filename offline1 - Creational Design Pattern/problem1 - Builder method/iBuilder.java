public interface iBuilder {
    void addName();
    void addProcessor();
    void addExtraElements();
    void addRam(String name,int price);
    void addGraphicsCard(String name,int price);
    PC getPc();
}
