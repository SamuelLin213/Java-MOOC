
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
    public int priceDifference(Apartment compared) {
        int p1 = this.squares * this.pricePerSquare;
        int p2 = compared.squares * compared.pricePerSquare;
        
        int diff = p1 - p2;
        if(diff < 0){
            diff *= -1;
        }
        return diff;
    }
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.squares * this.pricePerSquare > compared.squares * 
                compared.pricePerSquare) {
            return true;
        }
        return false;
    }
}
