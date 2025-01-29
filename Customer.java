public class Customer extends User {
    public Customer(String name,String email){
        super(name,email);
    }
    @Override
    public void perfromRole(){
         System.out.println("Customer: Browsing and purchasing products.");

    }
    public void placeOder(Product product){
        System.out.println("Customer: Placing order for "+product.getName());
    }
}
