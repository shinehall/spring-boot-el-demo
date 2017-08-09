package tech.chauncy.springbootdemo;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("item")
public class Item {
	@Value("obj")
	private String name;
	@Value("10")
	private int total;
	@Value("{'bj','wh','gz'}")
	private List<String> addresses;
	
	public String[] elements = {"sub1", "sub2", "sub3"};
	public List<Integer> parts = Arrays.asList(10001, 10002, 10050);
	public Map<String, Integer> info = new HashMap<String, Integer>(){
		private static final long serialVersionUID = 1L;
		{
			put("weight", 1);
			put("status", 0);
		}
	};
	
	public String createTime(){
		return new Date().toString();
	}
	
	public void getAddresses(){
		addresses.stream().forEach((str) -> System.out.println(str));
	}
	
	@Override
	public String toString() {
		return "name:" + name + " total:" + total;
	}

}
