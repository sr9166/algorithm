package sort;

import java.io.*;
import java.util.Arrays;

public class Q10814 {

    static class Person implements Comparable<Person>{
        int age;
        String name;

        Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Person person) {
            if(this.age > person.age)
                return 1;
            else if (this.age < person.age)
                return -1;
            else
                return 0;
        }

        @Override
        public String toString() {
            return String.format("%d %s", this.age, this.name);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Person[] ary = new Person[n];
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            ary[i] = new Person(Integer.parseInt(str.split(" ")[0]), str.split(" ")[1]);
        }

        Arrays.sort(ary);

        for(Person p : ary) {
            System.out.println(p);
        }
    }
}
