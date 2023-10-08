public class Main {
    public static void main(String[] args) {
        int i = 33_000;
        byte b = 122;
        short s = 30_000;
        long l = 15L;
        float f = -3.8f;
        double d = 4.2d;
        System.out.println("Значение переменной i c типом int равно " + i );
        System.out.println("Значение переменной b c типом byte равно " + b );
        System.out.println("Значение переменной s c типом short равно " + s );
        System.out.println("Значение переменной l c типом long равно " + l );
        System.out.println("Значение переменной f c типом float равно " + f );
        System.out.println("Значение переменной d c типом double равно " + d );   //задача 1

        System.out.println(" ");
        float f1 = 27.12F;
        long l1 = 987_678_965_549L;
        double d1 = 2.786d;
        int i1 = 569;
        short s1 = -159;
        int i2 = 27897;
        byte b1 = 67;
        System.out.println("Значение переменной f1 c типом float равно " + f1 );
        System.out.println("Значение переменной l1 c типом long равно " + l1 );
        System.out.println("Значение переменной d1 c типом double равно " + d1 );
        System.out.println("Значение переменной i1 c типом int равно " + i1 );
        System.out.println("Значение переменной s1 c типом short равно " + s1 );
        System.out.println("Значение переменной i2 c типом int равно " + i2 );
        System.out.println("Значение переменной b1 c типом byte равно " + b1 );   //задача 2

        System.out.println(" ");

        int lP = 23;
        int aS = 27;
        int eA = 30;
        int totalPaper = 480;
        System.out.println("На каждого ученика рассчитано " + totalPaper / (lP + aS + eA) + " листов бумаги");  //задача 3

        System.out.println(" ");

        int bottlePer1 = 16/2;
        System.out.println("За 20 минут машина произвела " + bottlePer1 * 20 + " штук бутылок");
        System.out.println("За 1 сутки машина произвела " + bottlePer1 * 60 * 24 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlePer1 * 60 * 24 * 3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlePer1 * 60 * 24 * 30 + " штук бутылок");   //задача 4

        System.out.println(" ");

        int totalPaint = 120;
        int whitePaintPer1 = 2;
        int brownPaintPer1 = 4;
        int per1ClassRoom = whitePaintPer1 + brownPaintPer1;
        int classRoom = totalPaint / per1ClassRoom;

        System.out.println("В школе, где " + classRoom + " классов, нужно " + whitePaintPer1 * classRoom + " банок белой краски" +
                " и " + brownPaintPer1 * classRoom + " банок коричневой краски");   //задача 5

        System.out.println(" ");

        int bananas = 80 * 5;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int eggs = 70 * 4;
        int totalGramm = bananas + milk + iceCream + eggs;
        double totalKg = totalGramm / 1000d;
        System.out.println("Завтрак спортсмена составит " + totalGramm + " грамм");
        System.out.println("Завтрак спортсмена составит " + totalKg + " кг");  //задача 6

        System.out.println(" ");







    }
}