package zadanieObserwator;

public interface Observer<A> {
    void update(Observable observable, A state);
}