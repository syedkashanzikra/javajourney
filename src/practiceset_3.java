public class practiceset_3 {
    public static void main(String[] args) {
        //problem 1
        String name ="Kashan Abbas";
        name = name.toLowerCase();
        System.out.println(name);
        // problem 2
        String spacedname ="K asha n Abbas";
        System.out.println(spacedname.replace(' ','_'));
        //problem 3
        String Letter ="Hello <|Name|> ,Hi Yourself ";
        Letter = Letter.replace("<|Name|>","Kashan");
        System.out.println(Letter);
        //Problem 4

        String newString  = "This contains  double or Triple spaces";
        System.out.println(newString.indexOf("  "));
        System.out.println(newString.indexOf("    "));

        // problm 5
        String letter2 ="Hello  \n\t Kashan Hello Sir \nBye!";
        System.out.println(letter2);
// problem
   String Add = "Abbas";
        System.out.printf("Hello %s ",Add);
    }
}
