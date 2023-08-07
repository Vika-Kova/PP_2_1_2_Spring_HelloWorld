import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());

        Cat bean2 = (Cat) applicationContext.getBean("cat", Cat.class);
        Cat bean3 = (Cat) applicationContext.getBean("cat", Cat.class);
        System.out.println(bean2.getMassage());

        System.out.println((bean == bean1));
        System.out.println((bean2 == bean3));
    }
}