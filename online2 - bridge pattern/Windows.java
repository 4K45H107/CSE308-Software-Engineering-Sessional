package online;

public class Windows implements OS{

    String osName;

    public Windows()
    {
        this.osName = "Windows";
    }

    @Override
    public void setOSName(String OSName) {
        this.osName =  OSName;
        
    }

    @Override
    public String getOSName() {
        return this.osName;
    }
    
}
