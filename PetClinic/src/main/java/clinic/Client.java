package clinic;

import pets.Pet;

/**
 * Created by Vladimir on 22.02.2017.
 * Клиент
 * @author Vladimir
 * @since 22.02.2017
 */
public class Client {
    private String id;
    private Pet pet;

    public Client(String id, Pet pet) {
        this.id = id;
        this.pet = pet;
    }

    public String getId() {
        return id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void removePet(){
        this.pet=null;
    }
}
