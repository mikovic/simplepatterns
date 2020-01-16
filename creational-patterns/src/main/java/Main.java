import com.mikovic.interfaces.Command;
import com.mikovic.interfaces.Subject;
import com.mikovic.model.*;
import com.mikovic.patterns.Factory;
import com.mikovic.patterns.PersonFactory;
import com.mikovic.patterns.VisitBuilder;

import java.time.LocalDate;

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
        client1.setBirthday(LocalDate.of(1970, 12, 16));
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

        System.out.println("------pattern CHAIN -------");
        Operator busyOperator = new BusyRegistrator();

        Registrator registrator1 = new Registrator("Ольга");
        Registrator registrator2 = new Registrator("Мария");
        Registrator registrator3 = new Registrator("Татьяна");
        //закольцовываем
        busyOperator.link(registrator1).
                link(registrator2).
                link(registrator3).
                link(busyOperator);
        //создаем очередь из 5 клиентов
        for (int i = 1; i <= 5 ;i++) {
            final int temp = i;
            busyOperator.handle(new Client(Integer.toString(temp)));
        }
        System.out.println("------pattern COMMAND -------");

        Registratura registratura = new Registratura();
        clinica.setRegistratura(registratura);
        //создаем комвнду по регистрации ранее созданного клиента регистратором 1
        Command registrationClient1 = new RegistrationCommand(registrator1, client1);
        // регистрируем команду(карту) в регистратуре
        registratura.register("cartClient1", registrationClient1);
        // регистрируем клиента
        registratura.execute("cartClient1");


    }

}
