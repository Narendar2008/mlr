public class Admin extends User {
    public Admin(String name,String email){
        super(name,email);
    }
    @Override
    public void perfromRole(){
        System.out.println("Admin: Managing the e-commerce platform.");
    }
    public void manageSystem(){
        System.out.println("Admin:  Reviewing user activity and system performance");
    }
}
