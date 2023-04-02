import java.util.Scanner;
//exp 4 strjhkk
class name_handle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("entre the name");
        String text = s.nextLine();
        System.out.println("hello "+text.charAt(0) +" "+text.charAt(text.indexOf(" ")+1) + text.substring(text.substring(text.indexOf(" ")+1).indexOf(" ")+text.indexOf(" ")+1) );
        System.out.println();

    }
}