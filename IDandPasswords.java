import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		logininfo.put("User","123456");
		logininfo.put("UserTwo","PASSWORD");
		logininfo.put("NewUser","abc123");
	}
	
	public HashMap<String, String> getLoginInfo(){
		return logininfo;
	}
}
