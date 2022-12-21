package lab13.task02;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getFullName() {
        String nameDote;
        String patronymicDote;

        if (name != null && name != "") {
            nameDote = name.substring(0, 1) + ".";
        } else {
            nameDote = "";
        }

        if (patronymic != null && patronymic != "") {
            patronymicDote = patronymic.substring(0, 1) + ".";
        } else {
            patronymicDote = "";
        }

        return surname + " " + nameDote + patronymicDote;
    }
}
