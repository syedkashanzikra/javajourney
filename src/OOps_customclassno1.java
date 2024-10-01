//in this program we can create new class but in program there is only one public class so we make custom class
class Employee{
     int e_id;
     String e_name;
     int salary;
    //we can make many methods can we

    public void getDetailsEmp(){     //the method should be public  not static
        System.out.println("The ID of the employee is "+ e_id);
        System.out.println("The Name of the employee is "+e_name);
    }
    public int getSalary(){
        return salary;
    }
}

public class OOps_customclassno1 {
    public static void main(String[] args) {
        //if we want to use the custom clas we want it to make the object by using
        Employee IToffice =new Employee(); //initiating a new object
        Employee jon =new Employee(); //initiating a new object
        //setting attributes for IToffice
        IToffice.e_id = 1;
         IToffice.e_name ="kashan";
           IToffice.salary=50000;
        //setting attributes for jon
        jon.e_id = 14;
        jon.e_name ="jhon";
        jon.salary=12000;
        //using methodd of same clas and putting diffrent data in using objects
        IToffice.getDetailsEmp();
        jon.getDetailsEmp();
        int salaryofjon = jon.getSalary();
        System.out.println(salaryofjon);

        int salaryofkashan = IToffice.getSalary();
        System.out.println(salaryofkashan);
    }
}
