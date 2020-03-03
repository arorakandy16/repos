package Q3;

//(3) Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Third {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Third.class,args);
        Trainer trainer = applicationContext.getBean(Trainer.class);
        trainer.manageWork();


    }
}