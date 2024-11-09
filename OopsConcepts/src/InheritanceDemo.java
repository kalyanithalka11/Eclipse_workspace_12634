
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
		m.call();
		m.sms();
		
		
		SmartMobile sm = new SmartMobile();
		sm.videoCall();
		sm.call();
		sm.browse();
		
		Iphone i = new Iphone();
		i.videoCall();
	}

}
