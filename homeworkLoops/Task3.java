package com.galeeva.homeworkLoops;

/*рограммист Ваня сразу после окончания курсов dmdev устроился в
        IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
        Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
        300$ в месяц Ваня тратит на еду и развлечения.
        10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
        Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
        Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты*/

public class Task3 {

    public static void main(String[] args) {
        income(600);
    }

    public static void income(int value) {
        double result = 0;
        int up = 400;
        int food = 300;
        double invest = 0;
        for (int i = 1; i <= 38; i++) {
            double current = 0;
            if (i >= 1 && i <= 6) {
                current = value;
            } else if (i >= 7 && i <= 12) {
                current = value + up;
            } else if (i >= 13 && i <= 18) {
                current = value + 2 * up;
            } else if (i >= 19 && i <= 24) {
                current = value + 3 * up;
            } else if (i >= 25 && i <= 30) {
                current = value + 4 * up;
            } else if (i >= 31 && i <= 36) {
                current = value + 5 * up;
            } else if (i >= 37 && i <= 38) {
                current = value + 6 * up;
            }
            result += current - food - (current * 0.1);
            invest += invest * 0.02;
            invest += current * 0.1;
            System.out.println(i + " " + result + " " + invest);
        }
        System.out.print(result + " " + invest);
    }
}
