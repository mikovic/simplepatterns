package com.mikovic;


import com.mikovic.entities.mistake.LightWeightCar;
import com.mikovic.entities.mistake.Lorry;
import com.mikovic.entities.patternBuilder.Person;
import com.mikovic.entities.poliform.Circle;
import com.mikovic.entities.poliform.Square;
import com.mikovic.entities.poliform.Triangle;

public class MainPerson {

    public static void main(String[] args) {
        Person person = new Person.Builder("Дана", "Минакова")
                .setMiddleName("Константиновна")
                .setCountry("Russia")
                .setAge(20)
                .setGender("Женский")
                .buidl();
        System.out.println(person);
        System.out.println("2____________________________________________");
        Lorry lorry = new Lorry();
        LightWeightCar lightWeightCar = new LightWeightCar();
        lorry.move();
        lorry.stop();
        lorry.open();
        lightWeightCar.move();
        lightWeightCar.open();
        System.out.println("3____________________________________________");
        Circle circle = new Circle(10);
        circle.draw();
        circle.inform();
        Triangle triangle = new Triangle(10.256, 12.2345);
        triangle.draw();
        triangle.inform();
        Square square = new Square(10.55);
        square.draw();
        square.inform();


    }

}
