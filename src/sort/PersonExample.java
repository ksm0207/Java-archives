package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class PersonExample {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        int count = Integer.parseInt(br.readLine());
        Person [] personArray = new Person [count];

        for (int i = 0 ; i < count; i ++) {
            st = new StringTokenizer(br.readLine()," ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            personArray[i] = new Person(age,name);
        }

        Arrays.sort(personArray, new Comparator<Person>() {
            @Override
            public int compare(Person object1, Person object2) {
                return object1.age - object2.age;
            }
        });

        for (int i = 0 ; i < count ; i ++) {
            System.out.println(personArray[i]);
        }
    }
    public static class Person {
        int age ;
        String name;

        public Person(int age , String name ) {
            this.age = age;
            this.name = name;

        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }

}
