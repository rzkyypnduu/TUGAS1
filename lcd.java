public class lcd{
    private String Status;
    private int Volume;
    private int Brightness;
    private String Cable;
    private int jk;

    public String turnOff(){
        return Status = "Off";
    }
    public String turnOn(){
        return Status = "On";
    }
    public String Frezee(){
        return Status = "Frezee";
    }
    public int volumeUp(){
        Volume++;
        return Volume;
    }
    public int volumeDown(){
        Volume--;
        return Volume;
    }
    public int setVolume(int Volume){
        this.Volume = Volume;
        return Volume;
    }
    public int brightnessUp(){
        Brightness++;
        return Brightness;
    }
    public int brightnessDown(){
        Brightness--;
        return Brightness;
    }
    public int setBrightness(int Brightness){
        this.Brightness = Brightness;
        return Brightness;
    }
    public void Cek(){
        if(jk == 1){
         jk += 1;
        }
    }
    public void setCable(){
        switch(jk){
            case 1:
                Cable = "HDMI";
                break;
            case 2:
                Cable = "DVI";
                break;
            case 3:
                Cable = "VGA";
                break;
            default:
                Cable = "DisplayPort";
                
        }
    }
    public void cableUp(){
        this.jk++;
        Cek();
        setCable();
    }
    public void cableDown(){
        this.jk--;
        Cek();
        setCable();
    }

    public void displayMassage(){
        System.out.println("---------------LCD---------------");
        System.out.println("Status LCD Saat Ini\t:"+ Status);
        System.out.println("Volume LCD Saat Ini\t:"+ Volume);
        System.out.println("Brightness LCD saat ini\t:"+ Brightness);
        System.out.println("Cable LCD Saat Ini\t:"+ Cable);
        System.out.println("---------------------------------");
    }
}