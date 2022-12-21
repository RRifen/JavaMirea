package lab21.task02_03;

public class Test {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0]= "AAAAAAAAAA";
        strings[1]= "BBBBBBBB";
        strings[2]= "ABABABABABBABAB";
        strings[3]= "BABABBABABABAB";
        strings[4]= null;
        AnyArray a = new AnyArray(strings);
        System.out.println(a.getElementByIndex(0));
        System.out.println(a.getElementByIndex(1));
        System.out.println(a.getElementByIndex(2));
        System.out.println(a.getElementByIndex(3));
        System.out.println(a.getElementByIndex(4));
    }
}
