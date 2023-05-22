package basic_dl.a_quickstart_byname;

import basic_dl.a_quickstart_byname.bean.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByNameApplication {
    public static void main(String[] args) throws Exception{
        BeanFactory factory = new ClassPathXmlApplicationContext("quickstart-byname.xml");
        Person person = (Person) factory.getBean("person");
        System.out.println(person);
    }
}
