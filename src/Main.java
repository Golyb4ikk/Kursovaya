import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Employee nine = new Employee("Seei", "Seev", "Servich", 2, 111000);
        Employee eight = new Employee("Sei", "Sev", "Servich", 2, 11000);
        Employee zero = new Employee("Seri", "Sgeev", "Sergevich", 2, 1123000);
        Employee seven = new Employee("Sergei", "Sergeev", "Sergeevich", 1, 1000);
        Employee raz = new Employee("Se", "Sergv", "Servich", 4, 15000);
        Employee dva = new Employee("Ser", "Ser", "Ser", 2, 2000);
        Employee tri = new Employee("gei", "geev", "geevich", 3, 3000);
        Employee four = new Employee("ei", "ev", "vich", 4, 1123000);
        Employee five = new Employee("Serrrr", "Serrrr", "Sergrr", 5, 1000);
        Employee six = new Employee("Sss", "Seess", "Sess", 1, 4000);
        Employee[] employee = new Employee[10];
        employee[0] = zero;
        employee[1] = raz;
        employee[2] = dva;
        employee[3] = tri;
        employee[4] = four;
        employee[5] = five;
        employee[6] = six;
        employee[7] = seven;
        employee[8] = eight;
        employee[9] = nine;
        //1 zadacha
        getAllEmployee(employee);
        //2 zadacha
        getAllSalary(employee);
        //3 zadacha
        getMinSalary(employee);
        //4 zadacha
        getMaxSalary(employee);
        //4 zadacha
        getSredniySalary(employee);
        //4 zadacha
        getFIOemp(employee);


    }

    public static void getAllEmployee(Employee[] employee) {
        System.out.println(employee[0]);
        System.out.println(employee[1]);
        System.out.println(employee[2]);
        System.out.println(employee[3]);
        System.out.println(employee[4]);
        System.out.println(employee[5]);
        System.out.println(employee[6]);
        System.out.println(employee[7]);
        System.out.println(employee[8]);
        System.out.println(employee[9]);
    }

    public static double getAllSalary(Employee[] employee) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц= " + sum);
        return sum;
    }

    public static double getMinSalary(Employee[] employee) {
        double proverkaMinSalary = employee[0].getSalary();
        String RabotnicSMinZp = "";
        //Naxodim min zp sredi rabotnikov
        for (int i = 0; i < employee.length; i++) {
            if (proverkaMinSalary > employee[i].getSalary()) {
                proverkaMinSalary = employee[i].getSalary();
                RabotnicSMinZp = employee[i].getName();
            }
        }
        //proveriem na nalichie esche sotrudnikov s min zp
        double minZpRabotnika = proverkaMinSalary;
        for (int j = 0; j < employee.length; j++) {
            if (minZpRabotnika == employee[j].getSalary()) {
                System.out.println("У работника с именем " + employee[j].getName() + " минимальная зп = " + minZpRabotnika);
            }
        }
        return proverkaMinSalary;
    }

    public static double getMaxSalary(Employee[] employee) {
        double proverkaMaxSalary = employee[0].getSalary();
        String RabotnicSMaxZp = "";
        //Naxodim max zp sredi rabotnikov
        for (int i = 0; i < employee.length; i++) {
            if (proverkaMaxSalary < employee[i].getSalary()) {
                proverkaMaxSalary = employee[i].getSalary();
                RabotnicSMaxZp = employee[i].getName();
            }
        }
        //proveriem na nalichie esche sotrudnikov s max zp
        double maxZpRabotnika = proverkaMaxSalary;
        for (int j = 0; j < employee.length; j++) {
            if (maxZpRabotnika == employee[j].getSalary()) {
                System.out.println("У работника с именем " + employee[j].getName() + " максимальная зп = " + maxZpRabotnika);
            }
        }
        return proverkaMaxSalary;
    }

    public static double getSredniySalary(Employee[] employee) {
        double summ = 0;
        for (int i = 0; i < employee.length; i++) {
            summ = (summ + employee[i].getSalary()) / employee.length;
        }
        System.out.println("Средняя зп сотрудников = " + summ);
        return summ;
    }

    public static void getFIOemp(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName() + " " + employee[i].getSurname() + " " + employee[i].getOthestvo());
        }
    }

}