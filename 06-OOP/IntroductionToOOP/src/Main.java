public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a;                  //Объявление переменной 'a' типа 'int'
        Point A = new Point();  //Объявление переменной 'A' типа 'Point'
        //Создание объекта (экземпляра) 'A' класса 'Point'
        A.setX(2);
        A.setY(3);
        System.out.println("X = " + A.getX());
        System.out.println("Y = " + A.getY());

        Point B = new Point();
        B.setX(7);
        B.setY(8);
        A.Print();
        B.Print();

        //System.out.println("X = " + B.getX());
        //System.out.println("Y = " + B.getY());
        //Object
        System.out.println("Расстояние: " + A.distance(B));
        System.out.println("Расстояние: " + B.distance(A));
    }
}
    class Point {
        private double x;
        private double y;
        public void setX (double x) {
            this.x = x;
        }
        public void setY (double y) {
            this.y = y;
        }

        public double getX () {
            return x;
        }
        public double getY () {
            return y;
        }

        public double distance (Point other) {
            double x_distance = this.x - other.x;
            double y_distance = this.y - other.y;
            return Math.sqrt(x_distance*x_distance + y_distance*y_distance) ;
        }
        public void Print () {
            System.out.println("X = %f, Y = %f".formatted(x,y));
        }
    }

