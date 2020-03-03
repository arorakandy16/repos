package Q4;

//(4) Get a Spring Bean from application context and display its properties.

import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Fourth {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Fourth.class,args);
        Trainer trainer = applicationContext.getBean(Trainer.class);
        trainer.manageWork();
        trainer.leaveManage();

    }
}