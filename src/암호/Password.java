package 암호;

import java.util.ArrayList;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String key = sc.next();
        int num = 0;
        ArrayList<Character> Line = new ArrayList<>();
        for (int i = 0; i<line.length(); i++) {
            Line.add(line.charAt(i));
            Line.set(i, (char) (Line.get(i)-(key.charAt(i%key.length()))+26));
        }
        for (Character e : Line) System.out.println(e + " ");

    }
}
