class animal{
    public String walk;


    public String getWalk() {
        return walk;
    }

    public void setWalk(String walk) {
        this.walk = walk;
    }

    public animal() {
        this.walk = "model";
    }

    public void walking() {
        System.out.println(getWalk());
    }
}
class  dog extends animal{
    public String sound;
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    public void barking() {
        System.out.println(getSound());
    }



}
class wheel{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting X in base");
        this.x = x;
    }

    public void myStatement() {
        System.out.println("hello World");
    }
}
//in the inheritance we use extends
class car extends wheel{ //in this all information of wheel is inserted
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class inheritance {
    public static void main(String[] args) {
      //  wheel w =new wheel(); i can also use  thatand also this follow
        car w =new car(); //also can use
        w.setX(3);
        System.out.println(w.getX());

        //for animal side
        dog tom =new dog();

        System.out.println(tom.getWalk());
        tom.setSound("Hello");
        System.out.println(tom.getSound());
    }
}
