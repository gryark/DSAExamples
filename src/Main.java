public class Main {
    public static void main(String[] args) {
        Student[] students;
        // allocating memory for 5 objects of type Student
        students = new Student[5];
        // initialize the elements of the array
        students[0] = new Student(1, "Ali");

        // accessing the elements of the specified array
        /* for (int i = 0; i < students.length; i++) {
            System.out.println("Element at " + i + " : "
                    + students[i].id + " "
                    + students[i].name);
        }*/
        double[] array= {10, 20, 30, 50, 40};
        CodeExamples ce= new CodeExamples();
        double max=ce.arrayMax(array);
        System.out.println(max);
    }
}