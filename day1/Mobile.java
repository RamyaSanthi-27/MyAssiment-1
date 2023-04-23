package week1.day1;

public class Mobile {
	public void sendSMS() {
		System.out.println("Send SMS");
	}
protected void AllowVoiceCall() {
	
System.out.println("Voice Call");
}
private void takeVedio() {
	System.out.println("Take Vedio");
}
public static void main(String[] args) {
	Mobile obj =new Mobile();
	obj.sendSMS();
	obj.AllowVoiceCall();
	obj.takeVedio();
}
}

