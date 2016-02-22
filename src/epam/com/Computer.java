package epam.com;

/**
 * Created by Любовь on 22.02.2016.
 */
public class Computer {
    private int price;


    public int res(){

        return price *10/100;
    }
    public void setPrice(int price) {

        this.price = price;


    }

    public int getPrice() {
        return price;
    }
}
