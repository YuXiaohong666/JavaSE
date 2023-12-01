package com.geo.learning02.reference;

import com.geo.learning02.reference.data.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author yuxiaohong
 * @package com.geo.learning02.reference
 * @date 2023/12/1 12:19
 * @description
 */
public class MethodRefTest {
    // 情况1：对象::实例方法
    @Test
    public void test1() {
        // 正常调用
        Consumer<String> con1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con1.accept("hello");
        System.out.println("*************************");

        // lambda表达式
        Consumer<String> con2 = s -> System.out.println(s);

        // 方法引用
        Consumer<String> con3 = System.out::println;
    }

    @Test
    public void test2() {
        Person person = new Person("tom", 23);
        // 正常调用
        Supplier<String> sup1 = new Supplier<String>() {
            @Override
            public String get() {
                return person.getName();
            }
        };
        System.out.println(sup1.get());

        System.out.println("*************************************");

        // lambda表达式
        Supplier<String> sup2 = () -> person.getName();
        System.out.println(sup2.get());

        System.out.println("*************************************");

        // 方法引用
        Supplier<String> sup3 = person::getName;
        System.out.println(sup3.get());
    }

    // 情况2：类::静态方法
    @Test
    public void test3() {
        Comparator<Integer> com1 = new Comparator<Integer>() {
            // 1.正常调用
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(com1.compare(23, 25));
        System.out.println("***************************");

        // 2.使用lambda表达式
        Comparator<Integer> com2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com2.compare(22, 21));
        System.out.println("***************************");
        // 3.使用方法引用
        Comparator<Integer> com3 = Integer::compare;
        System.out.println(com3.compare(0, 3));
    }

    // Function中的R apply()
    @Test
    public void test4() {

        // 1.正常调用
        Function<Double, Long> fun1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        // 2.使用lambda表达式
        Function<Double, Long> fun2 = aDouble -> Math.round(aDouble);

        // 3.使用方法引用
        Function<Double, Long> fun3 = Math::round;

    }

    // 情况3：类::实例方法
    @Test
    public void test5() {
        // 1.
        Comparator<String> com1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        // 2.lambda
        Comparator<String> com2 = (o1, o2) -> o1.compareTo(o2);

        // 3.方法引用
        Comparator<String> com3 = String::compareTo;
        System.out.println(com3.compare("abc", "abc"));
    }

    @Test
    public void test6() {
        BiPredicate<String, String> bipre1 = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };

        // 2.
        BiPredicate<String, String> bipre2 = (s1, s2) -> s1.equals(s2);

        // 3.方法引用
        BiPredicate<String, String> bipre3 = String::equals;
    }

    @Test
    public void test7() {
        Person person = new Person("xiaojie", 23);
        Function<Person, String> fun1 = new Function<Person, String>() {
            @Override
            public String apply(Person person) {
                return person.getName();
            }
        };
        fun1.apply(new Person());

        // 2.lambda
        Function<Person, String> fun2 = person1 -> person1.getName();
        fun2.apply(person);

        // 3.方法引用
        Function<Person, String> fun3 = Person::getName;
        System.out.println(fun3.apply(person));

    }
}
