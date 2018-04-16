package HelloWorld;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       word msg = new word();
        Scanner scanIn = new Scanner(System.in);
        msg.SetText(scanIn.nextLine());
       List<String> list= new ArrayList<>();
       list.add("Hello world!");
    }
    public static void printMessage(List<String> list) {
        for (String s:list) {
            System.out.println(s);
        }
    }
}