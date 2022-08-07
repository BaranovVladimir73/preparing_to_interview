import builder.Person;
import builder.PersonBuilder;

public class Main {

    public static void main(String[] args) {
        Person person = new PersonBuilder().buildFirstName("Иван")
                .buildLastName("Иванов")
                .buildMiddleName("без второго имени")
                .buildCountry("Россия")
                .buildPhone("+7982132012")
                .buildAddress("г. Москва")
                .buildAge(24)
                .buildGender("Муж")
                .build();
    }
}
