package zadanieObserwator;

public class JournalistObserver implements Observer<Auction.AuctionState> {
    private int raised;

    public JournalistObserver() {
        this.raised = -1;
    }

    @Override
    public void update(Observable observable, Auction.AuctionState state) {
        if (state.isSold()) {
            System.out.println("Auction: price raised:" + this.raised + " sold for: " + state.getPrice());
        } else {
            this.raised++;
        }
    }
}
