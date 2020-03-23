package com.mikovic.entities.patternBuilder;

public class Person {
    public String firstName;
    public String lastName;
    public String middleName;
    public String country;
    public String adress;
    public String phone;
    public int age;
    public String gender;

    public Person() {

    }


    public static class Builder {
        //Обязательные параметры
        public String firstName;
        public String lastName;
        //Необязательные параметры со значениями по умолчанию
        public String middleName;
        public String country;
        public String adress;
        public String phone;
        public int age = 0;
        public String gender;

        //Конструктор с обязательными параметрами
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setAdress(String adress) {
            this.adress = adress;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person buidl() {
            return new Person(this);
        }
    }
        public Person(Builder builder) {
            firstName = builder.firstName;
            lastName = builder.lastName;
            middleName = builder.middleName;
            country = builder.country;
            adress = builder.adress;
            phone = builder.phone;
            age = builder.age;
            gender = builder.gender;
        }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

