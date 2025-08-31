public class Main {
    public static void main(String[] args)
    {
        double[] array_test = {7.0, 5.0, 8.2, 8.2, 9.5, 4.0, 1.0, 9.5};
        A a = new A();
        double max2_test = a.A1(array_test);

        String str = "level";
        Boolean check_Palindrome = a.checkPalindrome(str);

        System.out.println(a.giaiThua(5));
    }
}
