package test;


import  java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int i = sc.nextInt();
            Student[] students=new  Student[i];
            for (int j=1 ;j<=students.length;j++){
                String[] s = sc.nextLine().split(" ");
                students[j-1].setHeight(Integer.parseInt(s[j-1]));
                String[] s1 = sc.nextLine().split(" ");
                students[j-1].setM(Integer.parseInt(s1[j-1]));
            }

        }

    }

    private class Student extends Comparable {

        private int id;
        private int height;
        private int m;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getM() {
            return m;
        }

        public void setM(int m) {
            this.m = m;
        }

        @Override
        public int compareTo(Object o) {
            Student s1= (Student)o;

            return 0;
        }
    }
}
