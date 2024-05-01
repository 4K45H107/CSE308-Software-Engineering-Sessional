package online;

public class Notebook extends Device{

    OS os;

    public Notebook(OS os)
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
