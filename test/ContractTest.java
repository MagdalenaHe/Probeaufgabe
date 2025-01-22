import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContractTest {

    @Test
    void calcInsSumForDog() {
        //Given
        Animal dog = new Dog("06/05/2017");
        //When
        Contract contractDog = new Contract("Premium", dog);
        //Then
        assertEquals(3500.0, contractDog.calcInsSum());
    }

    @Test
    void calcInsSumForCat() {
        //Given
        Animal cat = new Cat("20/10/2019");
        //When
        Contract contractCat = new Contract("Premium", cat);
        //Then
        assertEquals(2800.0, contractCat.calcInsSum());
    }

    @Test
    void calcInsSumSmallAnimal() {
        //Given
        Animal smallAnimal = new SmallAnimal("20/10/2024");
        //When
        Contract contractSmallAnimal = new Contract("Premium", smallAnimal);
        //Then
        assertEquals(1400.0, contractSmallAnimal.calcInsSum());
    }

    @Test
    void calcInsRatePremium() {
        //Given
        String tarVar = "Premium";
        Animal dog = new Dog("06/05/2017");
        //When
        Contract contractDog = new Contract(tarVar, dog);
        //Then
        assertEquals(1.4, contractDog.calcInsRate(tarVar));
    }

    @Test
    void calcInsRateOptimal() {
        //Given
        String tarVar = "Optimal";
        Animal dog = new Dog("06/05/2017");
        //When
        Contract contractDog = new Contract(tarVar, dog);
        //Then
        assertEquals(1.2, contractDog.calcInsRate(tarVar));
    }

    @Test
    void calcInsRateKompakt() {
        //Given
        String tarVar = "Kompakt";
        Animal dog = new Dog("06/05/2017");
        //When
        Contract contractDog = new Contract(tarVar, dog);
        //Then
        assertEquals(1.0, contractDog.calcInsRate(tarVar));
    }

    @Test
    void calcInsPremDog() {
        //Given
        String tarVar = "Premium";
        Animal dog = new Dog("06/05/2017");
        //When
        Contract contractTessa = new Contract(tarVar, dog);
        //Then
        assertEquals(980, contractTessa.calcInsPrem());
    }

    @Test
    void calcInsPremCat() {
        //Given
        String tarVar = "Optimal";
        Animal cat = new Cat("20/10/2019");
        //When
        Contract contractCat = new Contract(tarVar, cat);
        //Then
        assertEquals(600, contractCat.calcInsPrem());
    }

    @Test
    void calcInsPremSmallAnimal() {
        //Given
        String tarVar = "Kompakt";
        Animal smallAnimal = new SmallAnimal("20/10/2024");
        //When
        Contract contractSmallAnimal = new Contract(tarVar, smallAnimal);
        //Then
        assertEquals(200, contractSmallAnimal.calcInsPrem());
    }


}