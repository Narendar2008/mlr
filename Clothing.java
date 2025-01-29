public class Clothing extends Product{
    public Clothing(String name,double price){
        super(name,price);
    }
    @Override
    public void showCategory(){
        System.out.println("Category: Clothing - "+getName()+", Price: $"+getPrice());
    }
    
}
