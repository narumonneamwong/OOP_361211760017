package lab7;

public class Mobile {
    private int MobileID ;
    private String Brand;
    private String Generation;
    private int Price;
    private String OperatingSystem;

    public Mobile(){}

    public Mobile (int MobileID,String Brand,String Generation,int Price,String OperatingSystem){
        this.MobileID =MobileID;
        this.Brand = Brand;
        this.Generation = Generation;
        this.Price =Price;
        this.OperatingSystem = OperatingSystem;
    }
    //Behavior คือ พฤกติกรรมของวัตถุ
    public void Internet(){
        System.out.println("Mobile Internet");
    }
    public void Messenger (){ System.out.println("Mobile Messenger");}
    public void Facebook (){ System.out.println("Mobile Facebook");}
    public void line (){ System.out.println("Mobile line");}

    public int getMobileID(){return this.MobileID;}
    public void setMobileID(int MobileID) {this.MobileID = MobileID;}

    public String getBrand(){return  this.Brand;}
    public void setBrand(String Brand){this.Brand = Brand;}

    public String getGeneration(){return  this.Generation;}
    public void setGeneration (String Generation){this.Generation = Generation;}

    public int getPrice(){return this.Price;}
    public void setPrice(int Price) {this.Price = Price;}

    public String getOperatingSystem(){return  this.OperatingSystem;}
    public void setOperatingSystem(String OperatingSystem){this.OperatingSystem = OperatingSystem;}


}//class
