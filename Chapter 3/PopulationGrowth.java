//World Population Growth

public class PopulationGrowth {
    public static void main(String[] args) {
        final double GROWTH_RATE = 0.01; // 1% growth rate
        double currentPopulation = 8_000_000_000.0; // ~8 billion
        final int YEARS = 75;
        double doublePopulation = currentPopulation * 2;
        int doublingYear = 0;
        
        System.out.println("Year\tPopulation\tIncrease");
        System.out.println("----\t----------\t--------");
        
        for (int year = 1; year <= YEARS; year++) {
            double increase = currentPopulation * GROWTH_RATE;
            currentPopulation += increase;
            
            if (currentPopulation >= doublePopulation && doublingYear == 0) {
                doublingYear = year;
            }
            
            System.out.printf("%d\t%,.0f\t%,.0f%n", 
                year, currentPopulation, increase);
        }
        
        System.out.printf("%nPopulation will double in %d years%n", doublingYear);
    }
}