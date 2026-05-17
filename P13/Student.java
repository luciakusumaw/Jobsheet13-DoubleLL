package P13;
public class Student {
    String nim, name, kelasName;
    double gpa;

    public Student(){
    }
    public Student(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        kelasName = kls;
        gpa = ip;
    }
    void print(){
        System.out.println(nim+" - "+name+" - "+kelasName+" - "+gpa);
    }
}
