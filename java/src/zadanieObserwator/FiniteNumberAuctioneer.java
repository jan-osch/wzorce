package zadanieObserwator;

public class FiniteNumberAuctioneer implements Observer<Auction.AuctionState> {
    private int raisesToGo;
    private Auction auction;
    private float percent;

    public FiniteNumberAuctioneer(Auction auction, int raisesToGo, float percent) {
        this.raisesToGo = raisesToGo;
        this.auction = auction;
        this.percent = percent;
    }

    @Override
    public void update(Observable observable, Auction.AuctionState state) {
        if (!state.isSold()) {
            if (this.raisesToGo > 0) {
                this.raisesToGo--;
                int amount = (int) (state.getPrice() * this.percent);

                System.out.println("FiniteNumberAuctioneer raises: " + amount);
                this.auction.raise(amount);
            }
        }
    }
}
