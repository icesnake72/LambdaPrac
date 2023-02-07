import java.awt.*;

public class Outer {
    public class Inner {
        private int x;
        private int y;
        private int width;
        private int height;

        public static final int MAX_WIDTH = 500;

        public Inner() {
            this.x = 0;
            this.y = 0;
            this.width = 0;
            this.height = 0;
            rect.setRect(this.x, this.y, this.width, this.height);
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public void getRect() {
            String strOut = String.format("%d, %d, %d, %d", x, y, width, height);
            System.out.println( strOut );
        }
    }

    static class StaticInner {
        private static final int TEST = 1000;
        public static int getTest() {
            return TEST * 2;
        }
    }

    private Rectangle rect = new Rectangle();
    private Inner inn = new Inner();
    public Outer() {
        super();

        inn.x = 0;
        inn.y = 0;
        inn.setWidth(0);
        inn.setHeight(0);
        rect.setRect(inn.getX(), inn.getY(), inn.getWidth(), inn.getHeight());
    }

    public void setRect(int x, int y, int width, int height) {
        inn.setX(x);
        inn.setY(y);
        inn.setWidth(width);
        inn.setHeight(height);
        rect.setRect(inn.getX(), inn.getY(), inn.width, inn.height);
        String strOut = String.format("%d, %d, %d, %d", inn.x, inn.y, inn.width, inn.height);
        System.out.println( strOut );
    }

    public void getRect() {
        String strOut = String.format("%d, %d, %d, %d", inn.x, inn.y, inn.width, inn.height);
        System.out.println( strOut );
    }

    public void testStatic() {
        int a = StaticInner.TEST;
        System.out.println("a = " + a );
    }

}
