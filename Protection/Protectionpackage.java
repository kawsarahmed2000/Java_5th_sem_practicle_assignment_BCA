package Protection;

public class Protectionpackage {
    public String str1 = "I am Public";
    private String str2 = "I am Private";
    protected String str3 = "I am protected";

    public void readString() {
        System.out.println("Public String : " + str1);
        System.out.println("Private String : " + str2);
        System.out.println("Protected String : " + str3);
    }
}