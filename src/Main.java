public class Main {
    public static void main(String[] args) {
        Point2DTest();
        Point3DTest();
    }
        public static void Point2DTest(){
            Point2D p2d = new Point2D();
            System.out.println(p2d);

            p2d = new Point2D(1,2);
            System.out.println(p2d);


        }

        public static void Point3DTest(){
            Point3D p3d = new Point3D();
            System.out.println(p3d);

            p3d = new Point3D(1,2,3);
            System.out.println(p3d);
        }
    }

