package Role;

// This is a default user profile
public class General {
	public String user_id;
	public String user_name;
	public String user_password;
	public String user_email;
	public String user_role;
	
	public General() {
		
	}
	public General(String user_id, String user_name, String user_password, String user_email, String user_role) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_email = user_email;
		this.user_role = user_role;
	}
	
	// GET INFORMATION
	
	public String getGeneral_user_id() {
		return user_id;
	}
	public String getGeneral_user_name() {
		return user_name;
	}
	public String getGeneral_user_password() {
		return user_password;
	}
	public String getGeneral_user_email() {
		return user_email;
	}
	public String getGeneral_user_role() {
		return user_role;
	}
	
	// SET INFORMATION
	
	public void setGeneral_user_name(String user_name) {
		this.user_name = user_name;
	}
	public void setGeneral_user_password(String user_password) {
		this.user_password = user_password;
	}
	public void setGeneral_user_email(String user_email) {
		this.user_email = user_email;
	}
	public void setGeneral_user_role(String user_role) {
		this.user_role = user_role;
	}
}
