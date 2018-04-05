package mypack;

import org.eclipse.jdt.internal.compiler.batch.FileSystem;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class OurLogic 
{
	public static void main(String args[])
	{
		Resource res = new FileSystemResource("Democfg.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		MyInterface inter= (MyInterface) factory.getBean("id4");
		inter.method1();
	}
}
