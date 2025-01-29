import java.util.ArrayList;

public class ECommerceSystem {
    public static void main(String[] args) {
        User admin=new Admin("Raju","raju@ecommerce.com");
        User seller=new Seller("Suresh","suresh@store.com", "Suresh store");
        User customer=new Customer("Rahul","rahul@customer.com");

        Product laptop=new Electronics("Laptop", 555000);
        Product tshirt=new Clothing("T-Shirt",500);
        Product apples=new Groceries("Apples",50 );

        ArrayList<User> users=new ArrayList<>();
        users.add(admin);
        users.add(customer);
        users.add(seller);
        System.out.println("User Roles: ");
        for(User user:users){
            user.showDetails();
            user.perfromRole();
            System.out.println();
        }
        System.out.println("Product Categories: ");
        ArrayList<Product> products = new ArrayList<>();
        products.add(laptop);
        products.add(tshirt);
        products.add(apples);

        for (Product product : products) {
            product.showCategory();
        }

        // Specific interactions
        ((Seller) seller).addProduct(laptop);
        ((Customer) customer).placeOder(tshirt);
        ((Admin) admin).manageSystem();
        
    }
}
