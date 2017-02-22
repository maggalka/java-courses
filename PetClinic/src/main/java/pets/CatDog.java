package pets;

/**
 * Created by Vladimir on 22.02.2017.
 * Реализация котопса.
 * @author Vladimir
 * @since 22.02.2017
 */
public class CatDog extends Pet {
    private Cat cat;
    private Dog dog;
    private String name;

    public CatDog(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
        this.name = this.cat.getName()+this.dog.getName();
    }

    public void makeSound() {
        this.cat.makeSound();
        this.dog.makeSound();
    }
}
