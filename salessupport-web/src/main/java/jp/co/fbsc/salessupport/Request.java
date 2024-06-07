package jp.co.fbsc.salessupport;

public class Request {
	private String key;
	private String  value;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Request(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Request [key=" + key + ", value=" + value + "]";
	}
	
	

}
