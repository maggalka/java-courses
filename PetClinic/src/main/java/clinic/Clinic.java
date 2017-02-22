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

    public Client[] getClients() {
        return clients;
    }

    /**
     * Добавить клиента.
     * @param position Позиция
     * @param client Клиент
     */
    public void addClient(int position, Client client){
        this.clients[position] = client;
    }

    /**
     * Найти клиентов по имени питомца.
     * @param petName имя питомца
     */
    public ArrayList<Client> findClientsByPetName(String petName){
        ArrayList<Client> neededClients = new ArrayList<Client>();
        for (Client client : clients)
            if (client!=null&&client.getPet()!=null&&
                    petName.equals(client.getPet().getName()))
                neededClients.add(client);
        return neededClients;
    }
    /**
     * Найти клиентов по имени клиента.
     * @param id имя клиента
     */
    public ArrayList<Client> findClientsById(String id){
        ArrayList<Client> neededClients = new ArrayList<Client>();
        for (Client client : clients)
            if (client!=null&&client.getId().equals(id))
                neededClients.add(client);
        return neededClients;
    }
    /**
     * Удалить всех клиентов с соответствующим именем.
     * @param id имя клиента
     */
    public void removeClientbyId(String id){
        for (int i=0; i < this.clients.length; i++)
            if (clients[i]!=null&&clients[i].getId().equals(id))
                clients[i]=null;
    }
    /**
     * Удалить всех клиентов с соответствующим именем питомца.
     * @param petName имя питомца
     */
    public void removePetByName(String petName){
        for (int i=0; i < this.clients.length; i++) {
            if (clients[i] != null && clients[i].getPet() != null &&
                    petName.equals(clients[i].getPet().getName()))
                clients[i].removePet();
        }
    }
}
