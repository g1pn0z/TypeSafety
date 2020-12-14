import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TypeSafety {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Mister Dr."));
        employees.add(new Employee("Miss Dr."));
        employees.add(new Employee("Dr. Who"));

        Iterator<Employee> iter = employees.iterator();

        while (iter.hasNext()){
            Employee emp = iter.next();
            System.out.println(emp.getName());
        }

    }
}


