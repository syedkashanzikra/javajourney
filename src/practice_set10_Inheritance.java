import org.w3c.dom.css.Rect;

//problem no 1 and 3 in one combination
class circle1 {
    public int radius;

    public circle1(int r) {
        this.radius = r;
    }

    public circle1() {
        System.out.println("Th9s is default constructor");
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
class cylinder1 extends circle1{
   public int  height;

      public cylinder1(int r, int h) {
          super(r);
          this.height = h;
      }
            public double volume() {
                return Math.PI * this.radius * this.radius*this.height;

            }
  }
  //problem no 2 and 4 in one combination
class Rectangle1{
    public int length;
    public int width;

      public int getLength() {
          return length;
      }

      public void setLength(int length) {
          this.length = length;
      }

      public int getWidth() {
          return width;
      }

      public void setWidth(int width) {
          this.width = width;
      }

      public Rectangle1() {
          System.out.println("It is Defualt Constructor");
      }

      public Rectangle1(int l, int w) {
          this.length = l;
          this.width = w;
      }

      public float area(){
        return this.length*this.width;
    }
  }
class Cube extends Rectangle1{
    public int s_area;

    public int getS_area() {
        return s_area;
    }

    public void setS_area(int s_area) {
        this.s_area = s_area;
    }

    public Cube(int s_area) {
        this.s_area = s_area;
    }
public Cube(){
    System.out.println("Default Constructor of bachay ka");
}
    public Cube(int length, int width, int s_area) {
        super(length, width);
        this.s_area = s_area;
    }
    public double areaOfCube(){
    return 6*length*width;
    }
}



public class practice_set10_Inheritance {
    public static void main(String[] args) {
       // circle1 c1 =new circle1(5);
      //  System.out.println(c1.area());


//cylinder1 c1 = new cylinder1(4,5);
//        System.out.println(c1.volume());

Cube c =new Cube();
c.setLength(4);
c.setS_area(3);
c.setWidth(6);
        System.out.println(c.areaOfCube());
    }
}
