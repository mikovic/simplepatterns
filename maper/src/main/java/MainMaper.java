

import com.mikovic.db.DbConnector;
import com.mikovic.db.DbCreate;
import com.mikovic.model.Client;
import com.mikovic.patterns.PersonFactory;
import com.mikovic.service.ClientService;
import com.mikovic.service.ClientServiceImpl;

import java.sql.Connection;
import java.time.LocalDate;

import static java.lang.System.exit;

public class MainMaper {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Ура");
        Connection conn = DbConnector.getConnection();
        if (conn == null) {
            exit(0);
            System.out.println("Соединение не установлено");
        }

        DbCreate.createTables(conn);
        PersonFactory personFactory = new PersonFactory();
        Client client = personFactory.getClient();
        client.setFirstName("Иван");
        client.setLastName("Иваныч");
        client.setBirthday(LocalDate.of(1970, 12, 16));
        client.setDescription("Хороший парень");
        ClientService clientService = new ClientServiceImpl();
        clientService.create(conn, client);
        client.show();
        System.out.println(client.getId());
        Client searchClient = clientService.find(conn, client.getId());
        searchClient.setDescription("Плохой парень");
        clientService.update(conn, searchClient);
        searchClient.show();


    }
}
