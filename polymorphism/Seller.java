public class Seller extends User{
    private String storeName;
    public Seller(String name,String email,String storeName){
        super(name,email);
        this.storeName = storeName;
    }
    @Override
    public void perfromRole(){
        System.out.println("Seller: Adding and Managing product for the store: "+storeName);
    }
    public void addProduct(Product product){
         System.out.println("Seller: Adding product - "+product.getName());
    }
    
}
