package 암호체크;

public class PwdCheckClass {
    boolean validLength(String pwd) {
        if (pwd.length() >= 10 && pwd.length() <= 30) return true;
     return false;
    }

    boolean validNumber(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if ('0' <= pwd.charAt(i) && pwd.charAt(i) <= '9') return true;
        }
        return false;
    }

    boolean validLowerAlphabet(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if ('a' <= pwd.charAt(i) && pwd.charAt(i) <= 'z') return true;
        }
        return false;
    }

    boolean validUpperAlphabet(String pwd) {
        for (int i = 0; i < pwd.length(); i++) {
            if ('A' <= pwd.charAt(i) && pwd.charAt(i) <= 'Z') return true;
        }
        return false;
    }

    boolean validRex(String pwd) {
        char arr[] = new char[]{'!', '%', '_', '#', '&', '+', '-', '*', '/'};
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < pwd.length(); j++) {
               if (arr[i] == pwd.charAt(j)) return true;
           }
        }
        return false;
    }
}
