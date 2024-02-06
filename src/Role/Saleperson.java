package Role;

import Role.General;

public class Saleperson extends General{
	public Saleperson() {
		
	}
	public Saleperson(String user_id, String user_name, String user_password, String user_email, Role.General.user_role user_role) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_email = user_email;
		this.user_role = user_role;
	}
	
	// GET INFORMATION
	
	public String getSaleperson_user_id() {
		return user_id;
	}
	public String getSaleperson_user_name() {
		return user_name;
	}
	public String getSaleperson_user_password() {
		return user_password;
	}
	public String getSaleperson_user_email() {
		return user_email;
	}
	public String getSaleperson_user_role() {
		return user_role.name();
	}
	
	// SET INFORMATION
	
	public void setSaleperson_user_name(String user_name) {
		this.user_name = user_name;
	}
	public void setSaleperson_user_password(String user_password) {
		this.user_password = user_password;
	}
	public void setSaleperson_user_email(String user_email) {
		this.user_email = user_email;
	}
	public void setSaleperson_user_role(Role.General.user_role user_role) {
		this.user_role = user_role;
	}
}
