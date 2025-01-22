/**
 * Represents a Cat
 */
public class Cat extends Animal {

    private int baseInsureSum = 2000;

    /**
     * @param birthdayString Date of birth in the format "dd/MM/yyyy"
     */
    public Cat(String birthdayString) {
        super(birthdayString);
    }

    @Override
    public int getBaseInsureSum() {
        return baseInsureSum;
    }

    @Override
    public void setBaseInsureSum(int baseInsureSum) {
        this.baseInsureSum = baseInsureSum;
    }
}
