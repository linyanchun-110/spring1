import model.Persion;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IsayHello;
import service.impl.Ifly;
import service.sayHelp;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Persion bean=(Persion)context.getBean("persion", Persion.class);
        bean.say();
        sayHelp bean1=(sayHelp)context.getBean("sayhelp", sayHelp.class);
        IsayHello isayHello=bean1.getIsayHello();
        isayHello.say();
        Ifly ifly=context.getBean(Ifly.class);
        ifly.fly();

    }
}
