package uz.marina.PetClinic;

import uz.marina.PetClinic.clinic.Client;
import uz.marina.PetClinic.clinic.Clinic;
import uz.marina.PetClinic.pets.Cat;
import uz.marina.PetClinic.pets.CatDog;
import uz.marina.PetClinic.pets.Dog;

/**
 * Created by Vladimir on 22.02.2017.
 * Работа клиники.
 * @author Vladimir
 * @since 22.02.2017
 */
public class ClinicRunner {
    public static void main(String[] args) {
        final Clinic clinic = new Clinic(10);

        clinic.addClient(0, new Client("Brown", new Cat("Digy")));
        clinic.addClient(1, new Client("Nick", new Dog("Sparky")));

        clinic.addClient(2, new Client("Ann", new CatDog(new Cat("Tom"),
                new Dog("Piccy"))));

    }
}
