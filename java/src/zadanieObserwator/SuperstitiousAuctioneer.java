package zadanieObserwator;

public class SuperstitiousAuctioneer implements Observer<Auction.AuctionState> {
    private int amount;
    private Auction auction;

    public SuperstitiousAuctioneer(Auction auction, int amount) {
        this.amount = amount;
        this.auction = auction;
    }


    @Override
    public void update(Observable observable, Auction.AuctionState state) {
        if (!state.isSold()) {
            if (state.getPrice() % 3 == 0) {
                System.out.println("SuperstitiousAuctioneer raises: " + this.amount);
                this.auction.raise(this.amount);
            }
        }
    }
}
