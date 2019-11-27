package abstract_class;

import interfaces.Condiment;

import java.util.List;

public abstract class Beverage {
    protected String description;
    protected double costCof;
    protected List condiments;

    public String getDescription(){
        return description;
    }

    public abstract void addCondiment(Condiment condiment);

    public abstract double cost();
}
