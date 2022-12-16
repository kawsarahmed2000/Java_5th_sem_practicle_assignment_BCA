package multifile;

import java.util.Scanner;

public class MultiFilepackage {
    public String str1;

    public String readString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        str1 = sc.nextLine();
        return str1;
    }
}