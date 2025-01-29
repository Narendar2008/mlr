public class Electronics extends Product{
    public Electronics(String name,double price){
        super(name,price);
    }
    @Override
    public void showCategory(){
        System.out.println("Category: Electronics - "+getName()+", Price: $"+getPrice());
    }
}
