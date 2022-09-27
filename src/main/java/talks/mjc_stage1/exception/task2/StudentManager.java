package talks.mjc_stage1.exception.task2;

public class StudentManager {
    private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Student find(long studentID) {
        Student result = Student.getValueOf(studentID);
        if(result == null){
            throw new StudentNotFoundException("Could not find student with ID " + studentID);
        }
        return result;
    }

    public static void main(String[] args) throws StudentNotFoundException {
        StudentManager manager = new StudentManager();


        for (int i = 0; i < IDs.length; i++) {
            try {
                Student student = manager.find(IDs[i]);
                System.out.println("Student name " + student.getName());
            } catch (NullPointerException e) {

            }

        }
    }


}
