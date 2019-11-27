import interfaces.Condiment;

public class Sugar implements Condiment {
    public double getCost(){
        return 15;
    }

    public String getDescription(){
        return "Sugar";
    }
}
