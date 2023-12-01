package com.geo.learning02.reference;

import com.geo.learning02.reference.data.Person;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author yuxiaohong
 * @package com.geo.learning02.reference
 * @date 2023/12/1 17:02
 * @description
 */
public class ConstructorRefTest {
    Person person = new Person("xiaohong", 24);

    @Test
    public void test1() {
        // 1.
        Supplier<Person> sup1 = new Supplier<Person>() {
            @Override
            public Person get() {
                return new Person();
            }
        };
        sup1.get();

        // 2.lambda

        Supplier<Person> sup2 = () -> new Person();
        sup2.get();

        // 3.构造器引用
        Supplier<Person> sup3 = Person::new;
    }

    @Test
    public void test2() {
        // 1.正常调用
        Function<Integer, Person> fun1 = new Function<Integer, Person>() {
            @Override
            public Person apply(Integer id) {
                return new Person(id);
            }
        };

        // 2.构造器引用
        Function<Integer, Person> fun2 = Person::new;
    }

    @Test
    public void test3() {
        BiFunction<String, Integer, Person> bi1 = new BiFunction<String, Integer, Person>() {
            @Override
            public Person apply(String name, Integer age) {
                return new Person(name, age);
            }
        };
        System.out.println(bi1.apply("li", 23));

        // 2.构造器引用
        BiFunction<String, Integer, Person> bi2 = Person::new;
        System.out.println(bi2.apply("er", 15));
    }

    // 数组引用
    @Test
    public void test4() {
        Function<Integer, Person[]> fun1 = new Function<Integer, Person[]>() {
            @Override
            public Person[] apply(Integer length) {
                return new Person[length];
            }
        };

        // 2.数组引用
        Function<Integer, Person[]> fun2 = Person[]::new;
        fun2.apply(10);
    }
}
