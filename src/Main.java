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
        double minSalary =100000000;
        String RabotnicSMinZp="";
        for (int i = 0; i < employee.length; i++) {
            if(minSalary>employee[i].getSalary()) {
                minSalary = employee[i].getSalary();
                RabotnicSMinZp=employee[i].getName();
            }
            else if(minSalary==employee[i].getSalary()){
                System.out.println("Один из работников с минимальной зп "+employee[i].getName());

            }
        }
        System.out.println("Один из работников с минимальной зп "+RabotnicSMinZp);
        return minSalary;
    }
    public static double getMaxSalary(Employee[] employee) {
        double maxSalary =0;
        String RabotnicSMaxZp="";
        for (int i = 0; i < employee.length; i++) {
            if(maxSalary<employee[i].getSalary()) {
                maxSalary = employee[i].getSalary();
                RabotnicSMaxZp=employee[i].getName();
            }
            else if(maxSalary==employee[i].getSalary()){
                System.out.println("Один из работников с максимальной зп "+employee[i].getName());

            }
        }
        System.out.println("Один из работников с максимальной зп "+RabotnicSMaxZp);
        return maxSalary;
    }
    public static double getSredniySalary(Employee[] employee) {
        double summ = 0;
        for (int i = 0; i < employee.length; i++) {
            summ = (summ + employee[i].getSalary())/employee.length;
        }
        System.out.println("Средняя зп сотрудников = " + summ);
        return summ;
    }
    public static void getFIOemp(Employee[] employee) {
        System.out.println(employee[0].getName()+" "+employee[0].getSurname()+" "+employee[0].getOthestvo());
        System.out.println(employee[1].getName()+" "+employee[1].getSurname()+" "+employee[1].getOthestvo());
        System.out.println(employee[2].getName()+" "+employee[2].getSurname()+" "+employee[2].getOthestvo());
        System.out.println(employee[3].getName()+" "+employee[3].getSurname()+" "+employee[3].getOthestvo());
        System.out.println(employee[4].getName()+" "+employee[4].getSurname()+" "+employee[4].getOthestvo());
        System.out.println(employee[5].getName()+" "+employee[5].getSurname()+" "+employee[5].getOthestvo());
        System.out.println(employee[6].getName()+" "+employee[6].getSurname()+" "+employee[6].getOthestvo());
        System.out.println(employee[7].getName()+" "+employee[7].getSurname()+" "+employee[7].getOthestvo());
        System.out.println(employee[8].getName()+" "+employee[8].getSurname()+" "+employee[8].getOthestvo());
        System.out.println(employee[9].getName()+" "+employee[9].getSurname()+" "+employee[9].getOthestvo());
    }

}