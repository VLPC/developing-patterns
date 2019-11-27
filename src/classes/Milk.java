package classes;

import interfaces.Condiment;

public class Milk implements Condiment {
        public double getCost(){
            return 10;
        }

        public String getDescription(){
            return "Milk";
        }
}
