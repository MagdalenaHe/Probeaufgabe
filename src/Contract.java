/**
 * Represents a contract from an animal
 */
public class Contract {

    private double insSum;
    private long insPrem;
    private double tarRate;
    private String tarVar;
    private final Animal animal;

    /**
     * @param tarVar Tariff Variation
     * @param animal Animal for the contract
     */
    public Contract(String tarVar, Animal animal) {
        this.tarVar = tarVar;
        this.animal = animal;
    }

    /**
     * Calculates insurance sum
     *
     * @return insurance sum
     */
    public double calcInsSum() {
        if (tarVar == null || tarVar.isEmpty()) {
            throw new IllegalArgumentException("Tariff can´t be null or empty");
        }

        if (animal == null) {
            throw new IllegalArgumentException("Animal can´t be null");
        }
        insSum = calcInsRate(tarVar) * animal.getBaseInsureSum();
        return insSum;
    }

    /**
     * Calculates insurance premium
     *
     * @return insurance premium
     */
    public double calcInsPrem() {

        if (animal.getAgeFactor() <= 0) {
            throw new IllegalStateException("Age factor must be greater than 0");
        }
        if (getInsSum() <= 0) {
            throw new IllegalStateException("Insurance sum must be greater than 0");
        }

        insPrem = (long) (getInsSum() * animal.getAgeFactor());
        return insPrem;
    }

    /**
     * Calculates variant factor according to tariff variant
     *
     * @param tarVar Insurance variant
     * @return variant factor
     */
    public double calcInsRate(String tarVar) {
        return switch (tarVar) {
            case "Kompakt" -> 1.0;
            case "Optimal" -> 1.2;
            case "Premium" -> 1.4;

            default -> throw new IllegalStateException("Unexpected value: " + tarVar);
        };
    }

    /**
     * @return Sum of the insurance using the calcInsSum Methode
     */
    public double getInsSum() {
        insSum = calcInsSum();
        return insSum;
    }

    public void setInsSum(double insSum) {
        this.insSum = insSum;
    }

    public long getInsPrem() {
        return insPrem;
    }

    public void setInsPrem(long insPrem) {
        this.insPrem = insPrem;
    }

    public double getTarRate() {
        return tarRate;
    }

    public void setTarRate(double tarRate) {
        this.tarRate = tarRate;
    }

    public String getTarVar() {
        return tarVar;
    }

    public void setTarVar(String tarVar) {
        this.tarVar = tarVar;
    }
}
