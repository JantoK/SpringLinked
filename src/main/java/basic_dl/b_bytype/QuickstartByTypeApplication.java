package basic_dl.b_bytype;

import basic_dl.b_bytype.bean.Person;
import basic_dl.b_bytype.dao.DemoDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByTypeApplication {
    public static void main(String[] args) throws Exception{
        BeanFactory factory = new ClassPathXmlApplicationContext("quickstart-bytype.xml");
        Person person = factory.getBean(Person.class);
        System.out.println(person);

        DemoDao demoDao = factory.getBean(DemoDao.class);
        System.out.println(demoDao.findAll());
    }
}
