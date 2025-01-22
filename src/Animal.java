import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.YEARS;

/**
 * Represents an Animal.
 */
public class Animal {

    private int baseInsureSum;
    private final String birthdayString;
    private long age;
    private double ageFactor;

    /**
     * @param birthdayString Date of birth in the format "dd/MM/yyyy"
     */
    public Animal(String birthdayString) {
        if (birthdayString == null || birthdayString.isEmpty()) {
            throw new IllegalArgumentException("Birthday can´t be null or empty");
        }
        this.birthdayString = birthdayString;
        this.age = calcAge(birthdayString);
        this.ageFactor = calcAgeFactor();
    }

    /**
     * Calculated age at conclusion of contract
     *
     * @param birthdayString Date of birth in the format "dd/MM/yyyy"
     * @return age in years
     */
    public long calcAge(String birthdayString) {
        if (birthdayString == null || birthdayString.isEmpty()) {
            throw new IllegalArgumentException("Birthday string can´t be null or empty");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate birthday = LocalDate.parse(birthdayString, formatter);
        LocalDate dateToday = LocalDate.now();
        if (birthday.isAfter(dateToday)) {
            throw new IllegalArgumentException("Birthdate can´t be in the future");
        }
        return YEARS.between(birthday, dateToday);
    }

    /**
     * calculates the age factor according to age at conclusion of contract
     *
     * @return age factor
     */
    public double calcAgeFactor() {
        if (age < 0) {
            throw new IllegalArgumentException("Calculated age can´t be negative");
        }
        if (age <= 2) {
            ageFactor = 0.2;
            return ageFactor;
        } else if (age <= 5) {
            ageFactor = 0.25;
            return ageFactor;
        } else if (age <= 7) {
            ageFactor = 0.28;
            return ageFactor;
        } else {
            ageFactor = 0.3;
            return ageFactor;
        }

    }

    public int getBaseInsureSum() {
        return baseInsureSum;
    }

    public void setBaseInsureSum(int baseInsureSum) {
        this.baseInsureSum = baseInsureSum;
    }

    public String getBirthdayString() {
        return birthdayString;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public double getAgeFactor() {
        return ageFactor;
    }

    public void setAgeFactor(double ageFactor) {
        this.ageFactor = ageFactor;
    }
}
