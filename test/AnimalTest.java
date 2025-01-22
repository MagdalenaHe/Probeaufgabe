import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void calcAgeDog() {
        //Given
        String birthday = "20/10/2017";
        Animal dog = new Dog(birthday);
        //When
        long age = dog.calcAge(birthday);
        //Then
        assertEquals(7, age);
    }

    @Test
    void calcAgeCat() {
        //Given
        String birthday = "20/10/2019";
        Animal dog = new Dog(birthday);
        //When
        long age = dog.calcAge(birthday);
        //Then
        assertEquals(5, age);
    }

    @Test
    void calcAgeSmallAnimal() {
        //Given
        String birthday = "20/10/2023";
        Animal dog = new Dog(birthday);
        //When
        long age = dog.calcAge(birthday);
        //Then
        assertEquals(1, age);
    }

    @Test
    void calcAgeFactorUnderTwo() {
        //Given
        String birthday = "20/10/2024";
        Animal dog = new Dog(birthday);
        //When
        double ageFactor = dog.calcAgeFactor();
        //Then
        assertEquals(0.2, ageFactor);
    }

    @Test
    void calcAgeFactorUnderFive() {
        //Given
        String birthday = "20/10/2019";
        Animal dog = new Dog(birthday);
        //When
        double ageFactor = dog.calcAgeFactor();
        //Then
        assertEquals(0.25, ageFactor);
    }

    @Test
    void calcAgeFactorUnderSeven() {
        //Given
        String birthday = "20/10/2017";
        Animal dog = new Dog(birthday);
        //When
        double ageFactor = dog.calcAgeFactor();
        //Then
        assertEquals(0.28, ageFactor);
    }

    @Test
    void calcAgeFactorOlderSeven() {
        //Given
        String birthday = "20/10/2015";
        Animal dog = new Dog(birthday);
        //When
        double ageFactor = dog.calcAgeFactor();
        //Then
        assertEquals(0.3, ageFactor);
    }
}