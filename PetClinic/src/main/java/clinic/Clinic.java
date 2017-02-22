package clinic;

import java.util.ArrayList;

/**
 * Created by Vladimir on 22.02.2017.
 * Класс описывает клинику.
 * @author Vladimir
 * @since 22.02.2017
 */
public class Clinic {

    /**
     * Список клиентов
     */
    private Client[] clients;

    public Clinic(final int size) {
        this.clients = new Client[size];
    }

    /**
     * Добавить клиента.
     * @param position Позиция
     * @param client Клиент
     */
    public void addClient(int position, Client client){
        this.clients[position] = client;
    }

    public ArrayList<Client> findClientsByPetName(String petName){
        ArrayList<Client> neededClients = new ArrayList<Client>();
        for (Client client : clients)
            if (client!=null&&client.getPet()!=null&&
                    client.getPet().getName().equals(petName))
                neededClients.add(client);
        return neededClients;
    }

    public ArrayList<Client> findClientsById(String id){
        ArrayList<Client> neededClients = new ArrayList<Client>();
        for (Client client : clients)
            if (client!=null&&client.getId().equals(id))
                neededClients.add(client);
        return neededClients;
    }

    public void removeClientbyId(String id){
        for (int i=0; i < this.clients.length; i++)
            if (clients[i]!=null&&clients[i].getId().equals(id))
                clients[i]=null;
    }

    public void removePetByName(String petName){
        for (int i=0; i < this.clients.length; i++) {
            if (clients[i] != null && clients[i].getPet() != null &&
                    clients[i].getPet().getName().equals(petName))
                clients[i].removePet();
        }
    }
}
