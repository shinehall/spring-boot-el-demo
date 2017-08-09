package tech.chauncy.springbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {

	@Value("#{item}")
	private Item item;
	@Value("cusA")
	private String name;
	@Value("#{20 + 10}")
	private String cost;
	@Value("#{item.createTime()}")
	private String spendTime;
	@Value("#{item.parts[1]}")
	private int core;
	@Value("#{item.info['status']}")
	private int info;
	@Value("#{item.elements[1]}")
	private String element;

	@Override
	public String toString() {
		return "item:" + item.toString() + " name:" + name + " cost:" + cost + " spendTime:" + spendTime + " core:"
				+ core + " info:" + info + "element:" + element;
	}

}
