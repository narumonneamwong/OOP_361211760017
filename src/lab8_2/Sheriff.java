package lab8_2;

public class Sheriff extends Person {
    private String WorkState;

    public Sheriff(String name, String dateOfBirth,String workState) {
        super(name, dateOfBirth);
        this.WorkState = workState;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I work at"+this.WorkState);
    }

    //getter and setter

    public String getWorkState() {
        return WorkState;
    }

    public void setWorkState(String workState) {
        WorkState = workState;
    }
    //toString

    @Override
    public String toString() {
        return "Sheriff{" +
                "WorkState='" + WorkState + '\'' +
                "} " + super.toString();
    }
}
