package zadanieObserwator;

import java.util.Random;

public class ProbabilisticAuctioneer implements Observer<Auction.AuctionState> {

    private final Random generator;
    private Auction auction;
    private int probRaiseSmall;
    private int raiseSmall;
    private int probabilityRaiseBig;
    private int raiseBig;

    public ProbabilisticAuctioneer(Auction auction, int probRaiseSmall, int raiseSmall, int probabilityRaiseBig, int raiseBig) {
        this.auction = auction;
        this.probRaiseSmall = probRaiseSmall;
        this.raiseSmall = raiseSmall;
        this.probabilityRaiseBig = probabilityRaiseBig;
        this.raiseBig = raiseBig;
        this.generator = new Random();
    }

    @Override
    public void update(Observable observable, Auction.AuctionState state) {
        if (!state.isSold()) {
            int rnd = this.generator.nextInt(100);

            if (rnd <= this.probabilityRaiseBig) {
                System.out.println("ProbabilisticAuctioneer raises: " + this.raiseBig);
                this.auction.raise(this.raiseBig);
            } else if (rnd <= this.probRaiseSmall) {
                System.out.println("ProbabilisticAuctioneer raises: " + this.raiseSmall);
                this.auction.raise(this.raiseSmall);
            }
        }
    }
}
