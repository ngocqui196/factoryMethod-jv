public class FactoryAnimal {
    public Animal getAnimal(String type) {
        if (type.equals("canine")) {
            return new Dog();
        }
        return new Cat();
    }
}
