import clinic.Client;
import clinic.Clinic;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import pets.Cat;
import pets.CatDog;
import pets.Dog;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vladimir on 22.02.2017.
 */
public class test {
    public static void main(String[] args) {
        JUnitCore core = new JUnitCore();
        core.addListener(new ClinicListener());
        core.run(test.class);
    }
    public void addClients(Clinic clinic){
        clinic.addClient(0, new Client("Brown", new Cat("Digy")));
        clinic.addClient(1, new Client("Nick", new Dog("Sparky")));

        clinic.addClient(2, new Client("Ann", new CatDog(new Cat("Tom"),
                new Dog("Piccy"))));
    }
    @Test
    public void testNumberOfNotNullClients(){
        final Clinic clinic = new Clinic(10);
        addClients(clinic);
        int numberOfNotNullClients = 0;
        for (int i = 0; i < clinic.getClients().length; i++)
            if (clinic.getClients()[i]!=null)
                numberOfNotNullClients++;
        assertEquals(numberOfNotNullClients,3);
    }
    @Test
    public void testSearchClientByPetName(){
        final Clinic clinic = new Clinic(10);
        addClients(clinic);
        ArrayList<Client> res = clinic.findClientsByPetName("Digy");
        ArrayList<Client> arrayListContainingNeededClient = new ArrayList<Client>();
        arrayListContainingNeededClient.add(clinic.getClients()[0]);
        assertEquals(res,arrayListContainingNeededClient);
    }
    @Before
    public void before(){
        System.out.println("Before");
    }
    @After
    public void after(){
        System.out.println("After");
    }

    static class ClinicListener extends RunListener {
        @Override
        public void testStarted(Description description) throws Exception {
            System.out.println("Started:"+ description.getDisplayName());
        }

        @Override
        public void testFinished(Description description) throws Exception {
            System.out.println("Finished:"+ description.getDisplayName());
        }

        @Override
        public void testFailure(Failure failure) throws Exception {
            System.out.println("Failed:"+ failure.getDescription().getDisplayName());

        }
    }
}
