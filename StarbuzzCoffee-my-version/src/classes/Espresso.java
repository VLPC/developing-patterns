package classes;

import abstract_class.Beverage;
import interfaces.Condiment;

import java.util.ArrayList;

public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
        costCof = 20;
        condiments = new ArrayList();
    }

    public void addCondiment(Condiment condiment){
        condiments.add(condiment);
    }

    public double cost(){
        double costCondiments = 0;
        for (int i = 0; i < condiments.size(); i++){
            Condiment condiment = (Condiment) condiments.get(i);
            costCondiments += condiment.getCost();
        }
        return costCof + costCondiments;
    }

    public String getDescription(){
        return description;
    }
}
