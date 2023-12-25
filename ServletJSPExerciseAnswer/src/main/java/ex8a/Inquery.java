package ex8a;

import java.io.Serializable;

public class Inquery implements Serializable {
	private String name;
	private int age;
	private String zipcode;
	private String address;
	private String body;
	
	// constructor without args	
	public Inquery() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Inquery(String name, int age, String zipcode, String address, String body) {
		super();
		this.name = name;
		this.age = age;
		this.zipcode = zipcode;
		this.address = address;
		this.body = body;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
}
