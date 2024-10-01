class myMainEmployee{
    private int id;
    private String name;
    private int salary;
    public void setId(int i) {
        id=i;
    }public int getID(){
        return id;
    }
    public void setName(String  i) {
        name=i;
    }public String  getName(){
        return name;
    }

    public void setSalary(int  n) {
        salary=n;
    }public int  getSalary(){
        return salary;
    }
    //without using object creation we can make method of same class name for auto filling the data init
    public  myMainEmployee(){   //method overloading can be done in the constructors such as
        //                       myMainEmployee !=myMainEmployee(String.....)
        name="kashan";
        id=58;
    }
    public myMainEmployee(int emp_salary){
    salary=emp_salary;
    }
    public  myMainEmployee(String newName,int newId){
        name=newName;
        id=newId;
    }
}
public class java_Constructors {
    public static void main(String[] args) {
    myMainEmployee harry =new myMainEmployee("Kashan",14);
    myMainEmployee emp_1 =new myMainEmployee(10000);
//these are called constructors
//    //instead of doing this
//        harry.setId(4);
//        harry.setName(4);
        System.out.println(harry.getID());
        System.out.println(harry.getName());
        System.out.println(emp_1.getSalary());
    }

}
