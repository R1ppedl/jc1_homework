package part1.Task45;

public class MyException extends Exception{
    private int studentId;

    public int getStudentId() {
        return studentId;
    }
    public MyException(String massage, int studentId1) {
        super(massage);
        studentId = studentId1;
    }
}
