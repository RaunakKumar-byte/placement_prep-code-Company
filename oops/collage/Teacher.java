package collage;

public class Teacher{

    public static void main(String[] args){
        Student s=new Student(24373,"Raunak");
        System.out.println(s.name);
        s.setMarks();
        System.out.println(s.marks);
                System.out.println(s.getpsw());

            s.display();
    }
}