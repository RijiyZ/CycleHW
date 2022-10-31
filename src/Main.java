public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 17;i = i+2) {
            System.out.println(i);
        }
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        for (int a = 1904; a <= 2096; a = a + 4) {
            System.out.println(a + " Является високосным годом.");
        }
        for (int i = 7; i < 100; i = i + 7){
            System.out.println(i);
        }
        for (int i = 1; i < 1000; i = i * 2) {
            System.out.println(i);
        }
        int total = 0;
        int vklad = 29000;
        for (int i = 1; i < 13; i++) {
            total = total + vklad;
            total = total + total/100;
            System.out.println("Месяц: " + i + " Сумма накоплений равна " + total + " рублей.");}
    }
}