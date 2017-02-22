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
     * Получить имя питомца
     */
    public String getName() {
        return this.name;
    }

    /**
     * Установить имя питомца
     */
    public void setName(String name) {
        this.name = name;
    }
}
