package online;

public class Linux implements OS {

    String osName;

    public Linux()
    {
        this.osName = "Linux";
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
