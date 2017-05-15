package zadanieObserwator;

public class Main {

    public static void main(String[] args) {
        Auction auction = new Auction(100);

        auction.addListener(new ProbabilisticAuctioneer(auction, 50, 10, 10, 100));
        auction.addListener(new SuperstitiousAuctioneer(auction, 20));
        auction.addListener(new FiniteNumberAuctioneer(auction, 3, 1.3f));
        auction.addListener(new JournalistObserver());

        auction.emit();

        auction.setSold();
    }
}
