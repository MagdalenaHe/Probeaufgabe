/**
 * Represents small Animals
 */

public class SmallAnimal extends Animal {

    private int baseInsureSum = 1000;

    /**
     * @param birthdayString Date of birth in the format "dd/MM/yyyy"
     */
    public SmallAnimal(String birthdayString) {
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
