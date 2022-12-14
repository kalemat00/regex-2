public class Tester {
    public static void main(String[] args) {
        String string1 = "tup tuup tuuup tuuuup";
        string1 = string1.replaceAll("u{2,3}", "x");
        System.out.println(string1);
    }
}
