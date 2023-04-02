import java.util.Scanner;
// exp 2,3 strings
class find_dupes {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("entre the string");
    String  text= s.nextLine();
    System.out.println("entre the substring");
    String  subtext= s.nextLine();
    System.out.println(text.contains(subtext));

    }
}

