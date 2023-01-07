public class Employee {
    private String name;
    private String surname;
    private String otchestvo;
    private int otdel;
    private double salary;
    private int id;
    static int counter = 1;


    public String getName() {
        return this.name = name;
    }

    public String getSurname() {

        return this.surname = surname;
    }

    public String getOthestvo() {

        return this.otchestvo = otchestvo;
    }

    public int getOtdel() {

        return this.otdel = otdel;
    }

    public double getSalary() {

        return this.salary = salary;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String surname, String otchestvo, int otdel, int salary) {
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
        this.otdel = otdel;
        this.salary = salary;
        this.id = counter++;
    }

    public String toString() {
        return "Имя " + this.name + " Фамилия " + this.surname + " Отчество " + this.otchestvo + " Отдел " + this.otdel + " Зарплата " + this.salary + " id " + this.id;
    }

}
