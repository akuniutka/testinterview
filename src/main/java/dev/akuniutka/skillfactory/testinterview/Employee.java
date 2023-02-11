package dev.akuniutka.skillfactory.testinterview;

public class Employee {

    private final String fio;
    private final String birthday;
    private final String employedDate;


    public Employee(String fio, String birthday, String employedDate) {
        this.fio = fio;
        this.birthday = birthday;
        this.employedDate = employedDate;
    }


    public String getFio() {
        return fio;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmployedDate() {
        return employedDate;
    }

}
