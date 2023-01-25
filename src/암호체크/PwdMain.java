package 암호체크;

import java.util.Scanner;

public class PwdMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PwdCheckClass pwdCheck = new PwdCheckClass();
        String pwd;
        while (true){
            System.out.println("암호 입력 : ");
            pwd = sc.next();

            if (pwd.equals("종료") || pwd.equalsIgnoreCase("exit")) break;;
            if (!pwdCheck.validLength(pwd)) {
                System.out.println("Bad Lenght password");
                continue;
            }
            if (!pwdCheck.validNumber(pwd)) {
                System.out.println("Bad Number password");
                continue;
            }
            if (!pwdCheck.validLowerAlphabet(pwd)) {
                System.out.println("Bad Lower Alphabet password");
                continue;
            }
            if (!pwdCheck.validUpperAlphabet(pwd)) {
                System.out.println("Bad Upper Alphabet password");
                continue;
            }
            if (!pwdCheck.validRex(pwd)) {
                System.out.println("Bad Rex password");
                continue;
            }
            System.out.println("Good password");
        }
    }
}
