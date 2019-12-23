import com.mikovic.interfaces.Subject;
import com.mikovic.model.Client;
import com.mikovic.model.Doctor;
import com.mikovic.model.Visit;
import com.mikovic.patterns.Factory;
import com.mikovic.patterns.PersonFactory;
import com.mikovic.patterns.VisitBuilder;

public class Main {
    public static void main(String[] args){
        System.out.println("------pattern Factory--------");
        Factory factory = new Factory();
        Subject client = factory.getCurrentPerson("client");
        Subject doctor = factory.getCurrentPerson("doctor");
        client.presentation();
        doctor.presentation();
        System.out.println("--------pattern AbstractFactory--------");
        PersonFactory personFactory = new PersonFactory();
        Client client1 = personFactory.getClient();
        client1.setFirstName("Иван");
        client1.setLastName("Иваныч");
        Doctor doctor1 = personFactory.getDoctor();
        doctor1.setFirstName("Сан");
        doctor1.setLastName("Саныч");
        client1.show();
        doctor1.show();
        System.out.println("------pattern Builder-------");
        VisitBuilder builder = new VisitBuilder();
        Visit visit = builder.buildVisit(client1, doctor1);
        visit.presentation();

    }
}
