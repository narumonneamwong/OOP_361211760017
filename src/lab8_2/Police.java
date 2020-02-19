package lab8_2;

public class Police extends Person {
    private String WorkCountry;
    public Police(String name, String dateOfBirth,String WorkCountry) {
        super(name, dateOfBirth);
        this.WorkCountry = WorkCountry;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I work at"+this.WorkCountry);
    }
    //getter and setter

    public String getWorkCountry() {
        return WorkCountry;
    }

    public void setWorkCountry(String workCountry) {
        WorkCountry = workCountry;
    }
    //toString

    @Override
    public String toString() {
        return "Police{" +
                "WorkCountry='" + WorkCountry + '\'' +
                "} " + super.toString();
    }
}//class



