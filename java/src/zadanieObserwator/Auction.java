package zadanieObserwator;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Observable<Auction.AuctionState> {
    private int price;
    private List<Observer> listeners;
    private boolean sold;

    public Auction(int startPrice) {
        this.price = startPrice;
        this.listeners = new ArrayList<>();
        this.sold = false;
    }

    @Override
    public void addListener(Observer o) {
        this.listeners.add(o);
    }

    @Override
    public void removeListener(Observer o) {
        this.listeners.remove(o);
    }

    public void raise(int amount) {
        this.price += amount;
        this.emit();
    }

    public void setSold() {
        this.sold = true;
        this.emit();
    }

    @Override
    public void emit() {
        System.out.println("Current price: " + this.price + " sold: " + this.sold);

        for (Observer o : this.listeners) {
            o.update(this, new AuctionState(this.price, this.sold));
        }
    }

    public class AuctionState {
        private final int price;
        private final boolean sold;

        public AuctionState(int price, boolean sold) {
            this.price = price;
            this.sold = sold;
        }

        public int getPrice() {
            return price;
        }

        public boolean isSold() {
            return sold;
        }
    }
}
