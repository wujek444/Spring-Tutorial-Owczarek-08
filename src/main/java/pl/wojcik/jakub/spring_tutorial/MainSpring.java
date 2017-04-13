package pl.wojcik.jakub.spring_tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean someBean = context.getBean("someBean", SomeBean.class);
		
		System.out.println(someBean.getUser().getName());
		
		SomeBean someBean2 = context.getBean("someBean2", SomeBean.class);
		System.out.println(someBean2.getUser().getName());

	}

}
