package pets;

/**
 * Created by Vladimir on 22.02.2017.
 * Животные
 * @author Vladimir
 * @since 22.02.2017
 */
public abstract class Pet {
    private String name;

    /**
     * Издавать звук
     */
    abstract void makeSound();

    /**
     * Имя питомца
     */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
