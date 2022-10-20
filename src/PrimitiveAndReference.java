public class PrimitiveAndReference {
    public static void main(String[] args) {
            int x=5;
            int y=x;
            x=6;
        System.out.println(x);
        System.out.println(y);
        Student student1=new Student();
        student1.Id=1;
        student1.name="Güray";
        student1.lastName="ARIK";

        Student student2=student1;

        student2.name="Ali";
        System.out.println(student1.name);
        //student1 ---> @101ab --> {1, "Güray", "ARIK}
        //student2 ---> @101ab --> {1, "Güray", "ARIK}

    }
    public static class Student{
        int Id;
        String name;
        String lastName;
    }
}
