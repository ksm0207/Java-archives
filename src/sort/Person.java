package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Person {
    int age;
    String name;

    public Person (int age , String name){
        this.age=age;
        this.name=name;

        System.out.println("====================");
        System.out.println("Person age  : " +age);
        System.out.println("Person name : " +name);
        System.out.println("====================\n");
    }
    @Override
    public String toString() {
        return age + " " + name + "\n";

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());

        // 1. 클래스 배열 객체 만들기
        Person [] p = new Person [size];

        // 2. 객체에 데이터 저장
        for (int i = 0 ; i < size ; i ++) {

            st = new StringTokenizer(br.readLine()," ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            p[i] = new Person(age,name);
        }
        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person object1, Person object2) {

                return object1.age - object2.age;
            }
        });

        for (int i = 0 ; i < size ; i ++) {
            // 객체배열의 객체를 출력하면 해당 Index 의 객체의 toString()이 출력됨
            sb.append(p[i]);
        }
        System.out.println(sb);
    }
}
