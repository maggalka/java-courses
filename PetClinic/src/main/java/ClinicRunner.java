import clinic.Client;
import clinic.Clinic;
import pets.Cat;
import pets.CatDog;
import pets.Dog;

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
