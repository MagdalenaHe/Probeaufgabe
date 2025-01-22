public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog("06/05/2017");
        Contract contractDog = new Contract("Premium", dog);
        System.out.println("Hund (7 Jahre) + Variante Premium:");
        System.out.println("Versicherungssumme: " + contractDog.getInsSum());
        System.out.println("Versicherungsprämie: " + contractDog.calcInsPrem());

        Animal cat = new Cat("20/10/2019");
        Contract contractCat = new Contract("Optimal", cat);
        System.out.println("Katze (3 Jahre) + Variante Optimal:");
        System.out.println("Versicherungssumme: " + contractCat.getInsSum());
        System.out.println("Versicherungsprämie: " + contractCat.calcInsPrem());

        Animal smallAnimal = new SmallAnimal("20/10/2024");
        Contract contractSmallAnimal = new Contract("Kompakt", smallAnimal);
        System.out.println("Kleintier (1 Jahr) + Variante Kompakt:");
        System.out.println("Versicherungssumme: " + contractSmallAnimal.getInsSum());
        System.out.println("Versicherungsprämie: " + contractSmallAnimal.calcInsPrem());

    }
}







