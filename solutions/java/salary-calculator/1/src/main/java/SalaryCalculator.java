public class SalaryCalculator {
    // penalty rules
    private static final double PENALTY = 0.15;
    private static final int PENALTY_THRESHOLD = 5;

    // salary rules
    private static final double BASE_SALARY = 1000.0;
    private static final double SALARY_CAP = 2000.0;

    // bonus rules
    private static final int BONUS_THRESHOLD = 20;
    private static final int BASE_BONUS_MULTIPLIER = 10;
    private static final int HIGH_BONUS_MULTIPLIER = 13;
    
    public double salaryMultiplier(int daysSkipped) {
        return 1.0 - (daysSkipped < PENALTY_THRESHOLD ? 0.0 : PENALTY);
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= BONUS_THRESHOLD ? HIGH_BONUS_MULTIPLIER : BASE_BONUS_MULTIPLIER;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = BASE_SALARY;
        salary = salary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        salary = salary >= SALARY_CAP ? SALARY_CAP : salary;
        return salary;
    } 
}
