package online;

public class SmartPhones extends Device{

    OS os;


    public SmartPhones(OS os)
    {
        this.os = os;
    }

    @Override
    public void setOS(OS os) {
        this.os = os;
    }

    @Override
    public OS getOs() {
        return this.os;
    }
    
}
