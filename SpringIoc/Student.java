package SpringIoc;

public class Student {

    private int studentId;
    private String studentName;
    private String studentAddress;

    public Student(int id,String name, String address){
        super();
        this.studentId = id;
        this.studentName = name;
        this.studentAddress = address;
    }

    public Student(){
        super();
    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int id){
        this.studentId = id;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String name){
        this.studentName = name;
    }

    public String getStudentAddress(){
        return studentAddress;
    }

    public void setStudentAddress(String address){
        this.studentAddress = address;
    }

    @Override
    public String toString(){
        return "Student [studentId = "+ studentId+ ",student name"+ studentName+ ",student address"+studentAddress +"]";
    }

}
