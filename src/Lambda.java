import java.util.ArrayList;
import java.util.List;

public class Lambda {



    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Python");

        for(String str : list)
            System.out.println( str );

        System.out.println();

        list.forEach((String str)-> System.out.println(str));   // 첫번째 버전

        System.out.println();

        list.forEach( str -> System.out.println(str));  // 파라미터에대한 타입이 추론이 가능하기 때문에 타입을 생략가능

        System.out.println();

        list.forEach( System.out::println );  // 이렇게까지 만들수 있음..


        //////////////////////////////////////////////////////////////////

        Outer out = new Outer();
        int a = Outer.Inner.MAX_WIDTH;
        out.setRect(10,10, a, 300);

        Outer.Inner inn = out.new Inner();
        inn.setX(100);
        inn.setY(50);
        inn.setWidth(300);
        inn.setHeight(400);
        inn.getRect();

        out.getRect();

        System.out.println( Outer.StaticInner.getTest() );
        // final int test = Outer.StaticInner.TEST;
    }
}


