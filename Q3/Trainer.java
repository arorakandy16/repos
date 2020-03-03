package Q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Trainer {
    @Autowired
    private Employee employee;
    public Trainer(Employee employee){
        this.employee=employee;
    }
    public void manageWork(){
        employee.doWork();

    }
}