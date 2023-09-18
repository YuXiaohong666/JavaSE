/**
 * @author yuxiaohong
 * @package
 * @date 2023/7/18 11:56
 * @description ${DESCRIPTION}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {1, 2, 3};
        int a = 3;
        String s = "333";
        Person person = new Person();
        System.out.println(person.a);
        System.out.println(s);
    }
}


class Person {
    int a = 10;

    @Override
    public String toString() {
        return "Person{" +
                "a=" + a +
                '}';
    }
}