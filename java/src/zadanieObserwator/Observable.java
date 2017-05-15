package zadanieObserwator;

public interface Observable<A> {
    void addListener(Observer o);

    void removeListener(Observer o);

    void emit();
}
