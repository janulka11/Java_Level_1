

public class DataTypes {
    public static void main(String[] args) {
        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte t = 2;
        short s = 4;
        int i = 6;
        long l = 10L;
        float f = 30.31f;
        double k = 40;
        boolean boll = true | false;
        char ch = 'z';

        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        int a = 4, b = 3, c = 6, d = 2;
        int e = a * (b + (c / d));
        System.out.println("e=" + e);

        // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        int p = 5, r = 10;
        int sum = p + r;
        boolean flag = true;
        if (flag) {
            System.out.println(sum >= 10 && sum <= 20);
        }


       // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        int j=5;
        if (j >= 0){
            System.out.println("Число " + j + " положительное");
        } else {
            System.out.println("Число " + j + " отрицательное");
        }

        // 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        int q = -5;
        boolean tr = true;
        if (tr) {
            System.out.println(q<0);
        }

        // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
         String v = "Жанна";
        {
            System.out.println("Привет," + v + "!");
        }


    }
}
