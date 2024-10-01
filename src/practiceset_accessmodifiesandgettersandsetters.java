import static java.lang.Math.PI;

//problemno1 fo cylinder getting and setting the height and radius
class Cylinder{
    private int height;
    private int radius;
    //we can make also constructor


    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }
    //press alt+enter for making getters and setter immediately

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getSurfaceArea(){
        return 2*PI*radius*radius*height+2*PI*radius*radius;

        }
        public double getVolume() {
            return PI * radius * radius * height;
        }
//    PI*r1*r1*h
}

//problem no 4
class Rctangle{
    private int length;
    private int breadth;
    //alt+insert

    public Rctangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rctangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }



    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}


public class practiceset_accessmodifiesandgettersandsetters {
    public static void main(String[] args) {
     Cylinder cylinder1 =new Cylinder(5,9); //by using constructors we dont need to define
  //   cylinder1.setHeight(40);
     int h1 = cylinder1.getHeight();
        //System.out.println(cylinder1.getHeight());
     //    cylinder1.setRadius(35);
     int r1 = cylinder1.getRadius();
     //   System.out.println(cylinder1.getRadius());
        System.out.println("Volume");
        System.out.println(cylinder1.getVolume());
        System.out.println("Surface area");
        System.out.println(cylinder1.getSurfaceArea());
   //problem  4
        Rctangle r =new Rctangle();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        System.out.println("Helo World");
    }
}
