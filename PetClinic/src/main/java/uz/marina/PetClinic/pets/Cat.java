package uz.marina.PetClinic.pets;

/**
 * Created by Vladimir on 22.02.2017.
 * Реализация кошки.
 * @author Vladimir
 * @since 22.02.2017
 */
public class Cat extends Pet {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("May, May");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
