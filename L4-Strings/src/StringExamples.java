import java.util.Locale;

public class StringExamples {
    public static void main(String[] args) {
        String name = "marrune";
        String gretting = "hello";

        int stringsize = name.length();

        System.out.println(name + " has " + stringsize + " letters.");
        //Or
        System.out.println(name + " has " + name.length() + " letters ");

        System.out.println(gretting + " has " + gretting.length() + " letters ");

        //PLan
        //1.get input
        //2. isolate first letter
        //3. Capitalize first letter
        //4.isolate the rest of letters
        //5. repair letter into one
        //6. display results

        System.out.println(capFirst(name));
    }

    public static String capFirst(String name){
        String letter = name.substring(0, 1);
        letter = letter.toUpperCase();

        return letter + name.substring(1);
    }
}
