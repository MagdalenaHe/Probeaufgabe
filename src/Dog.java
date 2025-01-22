/**
 * Represents a Dog
 */
public class Dog extends Animal {

    private int baseInsureSum = 2500;

    /**
     * @param birthdayString Date of birth in the format "dd/MM/yyyy"
     */
    public Dog(String birthdayString) {
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
