package enity;

public class Cloth extends Product {
    private String size;
    private String material;

    public Cloth(Long id, String productName, Float price, Float weight, String color, int productCount, String size, String material){
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.material = material;
    }

    public String getSize(){
        return size;
    }
    public String getMaterial(){
        return material;
    }

    public String toString() {
        return super.toString() + "Cloth{" + "size='" + size + '\'' + ", material='" + material + '\'' + '}';
    }
}
