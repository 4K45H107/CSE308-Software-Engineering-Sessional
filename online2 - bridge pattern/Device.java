package online;

public abstract class Device {
    public void store()
    {
        System.out.println("Store files in Storage module");
    }

    public void interect()
    {
        System.out.println("Interect device via Interface module");
    }

    public void communicate()
    {
        System.out.println("Communicate with communication module");
    }

    abstract void setOS(OS os);
    abstract OS getOs();
}
