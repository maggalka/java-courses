package uz.marina.PetClinic.pets;

/**
 * Created by Vladimir on 22.02.2017.
 * Реализация собаки.
 * @author Vladimir
 * @since 22.02.2017
 */
public class Dog extends Pet {
    private String name;

    public Dog(final String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Gav, Gav");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
