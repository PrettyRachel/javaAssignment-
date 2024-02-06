package Object;

import java.util.List;

//This is a default user profile
public class Customer {
	public String customer_id;
	public String customer_name;
	public String customer_email;
	public String customer_contact;
	public String customer_address;
	public List customer_order_list;
	
	public Customer() {
		
	}
	public Customer(String customer_id, String customer_name, String customer_email, String customer_contact, String customer_address, List customer_order_list) {
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_email = customer_email;
		this.customer_contact = customer_contact;
		this.customer_contact = customer_address;
		this.customer_order_list = customer_order_list;
	}
	
	// GET INFORMATION
	
	public String getCustomer_customer_id() {
		return customer_id;
	}
	public String getCustomer_customer_name() {
		return customer_name;
	}
	public String getCustomer_customer_email() {
		return customer_email;
	}
	public String getCustomer_customer_contact() {
		return customer_contact;
	}	
	public String getCustomer_customer_address() {
		return customer_address;
	}	
	public List getCustomer_customer_order_list() {
		return customer_order_list;
	}

	
	// SET INFORMATION
	
	public void setCustomer_customer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public void setCustomer_customer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public void setCustomer_customer_contact(String customer_contact) {
		this.customer_contact = customer_contact;
	}
	public void setCustomer_customer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public void setCustomer_customer_order_list(List customer_order_list) {
		this.customer_order_list = customer_order_list;
	}
}
