import com.mikovic.interfaces.Subject;
import com.mikovic.model.*;
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

        System.out.println("------pattern Adapter наследование-------");
        VeterinarAdapterExtends adapter = new VeterinarAdapterExtends();
        Dog dog = new Dog();
        adapter.examination(dog);
        adapter.treatment(dog);

        System.out.println("------pattern Adapter композиция-------");
        VeterinarAdapterComposition adapterComposition = new VeterinarAdapterComposition();
        adapterComposition.examination(dog);
        adapterComposition.treatment(dog);

        System.out.println("------pattern FACADE -------");
        Clinica clinica = new Clinica();
        clinica.start();

    }
}
