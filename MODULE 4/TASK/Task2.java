public class Task2 {
    public static void main(String[] args) {
        byte age = -127;
        short money = (short) 32_768;
        int tooMuchMoney = -2147483648;
        long soMuchMoney = -9223372036854775807L;
        float area = 12345678.90f;
        double fig = 123456789.90;
        char letter = 'a';
        boolean isAround = true;

        System.out.println(age);
        System.out.println(money);
        System.out.println(tooMuchMoney);
        System.out.println(soMuchMoney);
        System.out.println(area);
        System.out.println(fig);
        System.out.println(letter);
        System.out.println(isAround);
    }
}
