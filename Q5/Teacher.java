package Q5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    @Autowired
    private Student student;
    public Teacher(Student student){
        this.student=student;
    }
    public void studentAnalyse(){
        student.StudentIs();
    }
}