package Role;

import java.util.ArrayList;
import java.util.List;

public class Admin extends General {
	public Admin() {
		
	}

    public Admin(String username, String password, String emailaddress) {
        this.user_name = username;
        this.user_password = password;
        this.user_email = emailaddress;
    }

    // Getter and setter methods for username, password, and email address
    public String getUsername() {
        return user_name;
    }

    public void setUsername(String username) {
        this.user_name = username;
    }

    public String getPassword() {
        return user_password;
    }

    public void setPassword(String password) {
        this.user_password = password;
    }

    public String getEmailAddress() {
        return user_email;
    }

    public void setEmailAddress(String emailAddress) {
        this.user_email = emailAddress;
    }

    // Method to authenticate login
    public boolean authenticateLogin(String providedUsername, String providedPassword) {
        return user_name.equals(providedUsername) && user_password.equals(providedPassword);
    }
    
    private List<Admin> AdminPersonalProfiles;
    private List<WorkerProfile> WorkerPersonalProfiles;
    //Fixed the verification number to allow admin to delete profile.
    private static final int VERIFICATION_NUMBER = 227;

    {
    AdminPersonalProfiles = new ArrayList<>();
    WorkerPersonalProfiles = new ArrayList<>();
    }

    // Manage admin personal profile
    public void addAdminProfile(Admin adminProfile) {
        AdminPersonalProfiles.add(adminProfile);
    }

    public void updateAdminProfile(String user_name, String user_password, String user_email, String new_user_name, String new_password, String new_email_address) {
    	boolean ProfileUpdated = false;
    	for (Admin profile : AdminPersonalProfiles) {
            if (profile.getUsername().equals(user_name) && profile.getPassword().equals(user_password) && profile.getEmailAddress().equals(user_email)) {
                profile.setUsername(new_user_name);
                profile.setPassword(new_password);
                profile.setEmailAddress(new_email_address);
                ProfileUpdated = true ; 
                break;
            }
        }
        if (ProfileUpdated) {
            System.out.println("Profile updated successfully.");
        } 
        else {
            System.out.println("Failed to updated profile.");
        }
    }

    public void deleteAdminProfile(Admin adminProfile, int verificationNumber) {
        if (verificationNumber == VERIFICATION_NUMBER) {
            AdminPersonalProfiles.remove(adminProfile);
            System.out.println("Admin profile deleted successfully.");
        } 
        else {
            System.out.println("Verification number is incorrect, failed to delete the profile.");
        }
    }
    
    // Manage worker profile
    public void addWorkerProfile(WorkerProfile Worker) {
        WorkerPersonalProfiles.add(Worker);
    }

    public void updateWorkerProfile(String user_name, String user_password, String user_email, String new_user_name, String new_password, String new_email_address, String ProfileSourceUpdate) {
    	boolean ProfileUpdated = false;
    	for (WorkerProfile profile : WorkerPersonalProfiles) {
            if (profile.getUsername().equals(user_name) && profile.getPassword().equals(user_password) && profile.getEmailAddress().equals(user_email) && profile.getProfileSource().equals(ProfileSourceUpdate)) {
                profile.setUsername(new_user_name);
                profile.setPassword(new_password);
                profile.setEmailAddress(new_email_address);
                ProfileUpdated = true ; 
                break;
            }
        }
        if (ProfileUpdated) {
            System.out.println("Profile updated successfully.");
        } 
        else {
            System.out.println("Failed to updated profile.");
        }
    }

    public void deleteWorkerProfile(WorkerProfile Worker, int verificationNumber) {
        if (verificationNumber == VERIFICATION_NUMBER) {
            WorkerPersonalProfiles.remove(Worker);
            System.out.println("Profile deleted successfully.");
        } 
        else {
            System.out.println("Verification number is incorrect, failed to delete the profile.");
        }
    }
    
    public void generateWorkDoneReport() {
       
    }

    // Generate approved/closed sale report
    public void generateSaleReport() {
      
    }
}

public class WorkerProfile implements Saleperson, Officer {
    private String ProfileSource;

    public String getProfileSource() {
        return ProfileSource;
    }

    public void setProfileSource(String ProfileSource) {
        this.ProfileSource = ProfileSource;
    }
}
