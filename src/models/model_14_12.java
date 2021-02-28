package models;

import java.util.Random;

public class model_14_12 {

    // На плоскости проведены две параллельные прямые,
    // расстояние между ними L. На эту плоскость бросается круг радиуса R.
    // Случайные отклонения центра круга от линий, в направлении им
    // перпендикулярном, распределены нормально.

    // Центр рассеивания расположен на расстоянии b от одной из линий
    // во внешнюю сторону, а среднеквадратичное отклонение равно d.

    // Определить при одном бросании:
    // а) вероятность накрытия кругом хотя бы одной прямой;
    // б) вероятность накрытия обеих прямых, если
    // L = 10м, R = 8м, b = 5м, d = 14.8м.

    private static Random random = new Random();

    private static int newDigit () { return random.nextInt(10); }

    public static int main() {

        return 0;
    }
}