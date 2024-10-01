
class Phone2{
    public Phone2() {
        System.out.println("this Is General constructors");
    }
    public Phone2(int a){
        System.out.println("This is constructor of Phone in  "+a);
    }

    public void powerOn(){
        System.out.println("Power on the phone");
    }
    public void powerOff(){
        System.out.println("Power off the phone");
    }
}
interface Camera2{
    public void OnCamera();
    public void OffCamera();
    //we can make a private method but itdoesnot use in sub class it only can use in interfacce that it is used .It used for
    //code reusibilty in interface ,We can use the private method in only interfacee
    private void greet(){
        System.out.println("Assalamun_aalikum");
    }

    //we can  make a default method and it can also overide in sub class
    default public void TakePic(){
        greet();
        System.out.println("Taking pic in  the Default method in camera");
    }

//    public void TakeVideo();

}
interface Chrome2{
    //    public void onChrome();
//    public void offChrome();
    public void deleteHistory();
    public void newTab();

}
interface Wifi2{
    String[] getnetworks();
    void networkconnection(String myNetworks);
}
interface MusicPlayer2{
    public void OnMusic();
    public void OffMusic();

}
class Smartphone2 extends Phone2 implements Camera2,Chrome2,MusicPlayer2,Wifi2{
    public Smartphone2() {
        System.out.println("this is general Constructor of Smartphone");
    }

    public Smartphone2(int a,int b) {
        super(a);
        System.out.format("This is the Second Constructor having b  :%d \n",b);
    }

    @Override
    public void deleteHistory() {
        System.out.println("Deleting History of chrome");
    }

    @Override
    public void OffMusic() {
        System.out.println("off Music");
    }

    @Override
    public void OffCamera() {
        System.out.println("off camera");
    }

    @Override
    public void newTab() {
        System.out.println("Opening new tab");
    }

    @Override
    public void OnMusic() {
        System.out.println("on musicccs");
    }

    @Override
    public void OnCamera() {
        System.out.println("On camera");
    }

    @Override
    public String[] getnetworks() {
        System.out.println("Getting wif");
        String[] networkList={"TpLink","Bravo","Tenda"};
        return networkList;
    }

    @Override
    public void networkconnection(String myNetworks) {
        System.out.println("connecting .. to this " + myNetworks);
    }

//    @Override
//    public void TakePic() {
//        System.out.println("Taking pic from subclass");
//    }we can also  use this and overide it
}








public class Polymorphism_In_Interfaces {
    public static void main(String[] args) {
      //in poly morphissm we use interface as refrence and sub class or class as Object and we can only use methods of only refrence
        // methods means if i make a cameara reference so i cant choose wifi methods
        Camera2 obj =new Smartphone2();
//        obj.getnetwork --> throws an error
        obj.OffCamera();

    }
}
