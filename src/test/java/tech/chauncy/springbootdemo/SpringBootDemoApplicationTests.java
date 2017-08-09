package tech.chauncy.springbootdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Autowired
	private Item item;
	@Autowired
	private Customer customer;
	
	@Test
	public void contextLoads() {
		System.out.println(item.toString());
	}
	
	@Test
	public void testCustomer(){
		System.out.println(customer.toString());
	}

	@Test
	public void testELList(){
		item.getAddresses();
	}
}
