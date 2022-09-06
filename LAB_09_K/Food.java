public class Food implements TaxCalculator{

    private String name;
    private double cost;


    public Food(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public static void calculateTax(double cost)
    {
        double podatek =0.08*cost;
        System.out.println("Podatek zapłacony wynosi: " + podatek);
    }

}
