public class Main {
    public static void main (String[] args) {
        // первое задание
        short []e = new short[7];
        for (int i=0; i<e.length; i++) {
            e[i] = (short) (7+2*i);
        }
        // второе задание
        float[] x = new float[11];
        for (int i = 0; i<x.length; i++) {
            x[i] = (float) (-8.0 +  Math.random()*15.0);
        }
        // третье задание
        double[][] e1 = new double[e.length][x.length];
        for (int i = 0; i<e.length; i++) {
            for (int j = 0; j<x.length; j++) {
                e1[i][j] = calc(e[i], x[j]);
            }
        }
        // выведем матрицу
        matrix(e1);
    }
    static double calc(short e, float x) {
        if (e==17) {
            double arg = Math.pow(x, (2.0/(3.0*(x-0.25))));
            double res = Math.tan(Math.tan(arg));
            return res;
        }
        else if (e==9 || e==13 || e==19) {
            return Math.sin(Math.sin(Math.sin(x)));
        }
        else {
            // последоватльно считаем
            double pw1 = Math.pow(x/3.0, x);
            double pw2 = 1.0/3.0 + Math.pow(Math.tan(x), pw1);
            double expw = Math.exp(Math.pow(Math.E, Math.sin(x)));
            double chislitel = Math.sin(Math.pow(x*(Math.PI + x), 2));
            double drob = 2*Math.pow(chislitel, pw2);
            return Math.pow(drob, expw);
        }
    }
    // метод вывода матрицы
    static void matrix( double[][] e1) {
        for (int i = 0; i < e1.length; i++) {
            for (int j = 0; j < e1[i].length; j++) {
                // 5 знаков после запятой
                System.out.printf("%12.5f ", e1[i][j]);
            }
            System.out.println();
        }
    }
}

