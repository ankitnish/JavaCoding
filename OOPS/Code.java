package OOPS;


import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int[] rno = new int[5];
        String[] names = new String[5];
        int[] marks = new int[5];

        Student[] students = new Student[5];

        System.out.println(Arrays.toString(students));


    }
}

class Student {
    int rno;
    String name;
    int marks;
}
