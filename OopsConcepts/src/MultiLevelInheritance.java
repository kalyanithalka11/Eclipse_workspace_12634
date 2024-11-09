
public class MultiLevelInheritance {
	public static void main(String[] args) {
		Iphone i = new Iphone();
		i.call();
		i.videoCall();
		
		SmartMobile sm = new SmartMobile();
		sm.sms();
		sm.call();
	}
}
