package test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icat.service.DemoProviderService;

public class ConsumerTest {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo/dubbo-demo-consumer.xml"});
		context.start();
		DemoProviderService demoProviderService = (DemoProviderService)context.getBean("demoProviderService");
		String result = demoProviderService.sayHello("Hello Dubbo！");
		
		System.out.println("服务消费者远程调用的结果：  " + result);
		System.in.read(); // 按任意键退出
		context.close();
	}
}
