public class cwhstringmethods {
    public static void main(String[] args) {
  String name = "Kashan"; /*
       // System.out.println(name);
       int lengthofname = name.length();
        System.out.println(lengthofname);
   String upc = name.toUpperCase();
        System.out.println(upc);
   String lpc = name.toLowerCase();
        System.out.println(lpc);
        //////////
        String spacedstring = "                   Kashan     ";
        System.out.println(spacedstring);
        //can be use two methods
        System.out.println(spacedstring.trim());
        //or can save a value in a variable and sout it//
  */
        //Substring are two types lets You see by the output
  // in this the counting starts from 0 zero  k0 a1 s2 h3 a4 n5
        System.out.println(name.substring(2));
   //second type of substring
        // in this the first number means 0 is includesd and 4 is excluded;
        System.out.println(name.substring(0,4));

        //now replace functions
        System.out.println(name.replace('a','i'));
        //for targeted words
        System.out.println(name.replace("shan","rry"));
        System.out.println(name.replace("a","ierr"));
 //conditional method for checking
        boolean namefalse = name.startsWith("Kns");
        System.out.println(namefalse);
        // true
        boolean nametrue = name.startsWith("Kas");
        System.out.println(nametrue);
        //now end with method
        System.out.println(name.endsWith("shan"));

        // now using char at for knowing the char at 5th position
        System.out.println(name.charAt(5));
        // now using indexof
        System.out.println(name.indexOf('K'));
        // now if there is another method for using the starting point as int
        String modifiedname = "Kashanshan";
        System.out.println(modifiedname.indexOf('a',6));
        // now for condition  that it is equal orf not
          System.out.println(name.equals("Kashan"));
          //it is case sensitive
        System.out.println(name.equals("kashan"));
        //for this we use this function it doesnot deal with casses
        System.out.println(name.equalsIgnoreCase("kAshaN"));
//now for Escape Sequence
        System.out.println("Hello World  \" double quote  ");
  // for printing double qote
       // for printing new line,tabspace and backslash,backspace ,formfeed
        System.out.println("Hello World  \n double quote  ");
        System.out.println("Hello World  \t double quote  ");
        System.out.println("Hello World  \\ double quote  ");
        System.out.println("Hello World\b  double quote  ");
        System.out.println("Hello World \f  double quote  ");
    }
}
