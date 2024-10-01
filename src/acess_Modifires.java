class MyEmployee{
    private int id;
    private String name;  //private aceees modifiers they are not acces easily by making objects
    //like i do in the past code

    public void setId(int i) {
        id=i;
    }public int getID(){
        return id;
    }
    public void setName(String  n) {
        name=n;
    }public String  getName(){
        return name;
    }
}


public class acess_Modifires {
    public static void main(String[] args) {
      MyEmployee harry =new MyEmployee();
//    harry.id=1;
//    harry.name="kashan";
//this will throw error
//so we use method to convert the id and name
        harry.setId(14);
        System.out.println(harry.getID());
    }
}
