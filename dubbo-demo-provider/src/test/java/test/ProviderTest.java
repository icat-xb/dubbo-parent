package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "dubbo/dubbo-demo-provider.xml" });
		context.start();
		System.out.println("服务提供者向zookeeper注册中心注册服务成功>>>>>>>>>>>port:20881");
		System.in.read(); // 按任意键退出
		context.close();
	}

}
