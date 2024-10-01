//inheritance means the meths defaultly transfer from super interfface n sub interface
//for example
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
    //we can ovveride also in Interface
    void meth4(int  a);

}
class SampleClass implements childSampleInterface{
    @Override
    public void meth1() {
        System.out.println("Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2");
    }

    @Override
    public void meth4() {
        System.out.println("This is meth4");
    }

    @Override
    public void meth4(int a) {
        System.out.println("This is overide method having the value of a: "+a);
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

}


public class InheritanceInInterfaces {
    public static void main(String[] args) {
        SampleClass obj =new SampleClass();
        obj.meth1();
        obj.meth4(4);
    }
}
