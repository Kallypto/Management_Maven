package enity;

public class Boots extends Product {
    private int size;
    private boolean isNaturalSkin;

    public Boots(Long id, String productName, Float price, Float weight, String color, int productCount, int size, boolean isNaturalSkin){
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public int getSize(){
        return size;
    }
    public boolean getIsNaturalSkin(){
        return isNaturalSkin;
    }

    public String toString() {
        return super.toString() + "Boots{" + "size='" + size + '\'' + ", isNaturalSkin=" + isNaturalSkin + '}';
    }
}
