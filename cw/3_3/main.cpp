#include <iostream>


using namespace std;


class Proszek {
public:
    virtual void uzyj()=0;
};

class DelikatnyProszek : public Proszek {
public:
    virtual void uzyj() {
        cout << "Uzywam delikatnego proszku" << endl;
    }
};

class ZwyklyProszek : public Proszek {
public:
    virtual void uzyj() {
        cout << "Uzywam zwyklego taniego proszku" << endl;
    }
};

class Pranie {
public:
    void pierz();

protected:
    void obracaj_beben(int n) {
        for (int i = 0; i < n; i++)
            cout << '*';
        cout << endl;
    }

    void plucz() {
        cout << "OOOOO" << endl;
    }

    void wiruj(int n) {
        for (int i = 0; i < n; i++)
            cout << '.';
        cout << endl;
    }



private:
    virtual void pranie_wstepne() {}
    void zablokuj_drzwi() {
        cout << "<<<<<<<<<<<<<<<<" << endl;
    }

    void odblokuj_drzwi() {
        cout << ">>>>>>>>>>>>>>>>" << endl << endl;
    }

    virtual void pranie_zasadnicze() = 0;

    virtual void plukanie() = 0;

    virtual void wirowanie() = 0;

    virtual Proszek *pobierzProszek() = 0;
};

void Pranie::pierz() {
    zablokuj_drzwi();


    pranie_wstepne();

    Proszek *p = pobierzProszek();
    p->uzyj();

    pranie_zasadnicze();
    plukanie();
    wirowanie();


    odblokuj_drzwi();
}


class PranieBawelny : public Pranie {
protected:
    void pranie_wstępne() {
        cout << "Wstepne bawełna" << endl;
    }

    void pranie_zasadnicze() {
        cout << "Pierze bawełnę" << endl;
        cout << "Pierze bawełnę" << endl;
        cout << "Pierze bawełnę" << endl;
    }

    void plukanie() {
        this->plucz();
        this->plucz();
    }

    void wirowanie() {
        this->wiruj(10);
    }

    Proszek* pobierzProszek(){
        return new ZwyklyProszek();
    }
};


class PranieIntensywne : public Pranie {
protected:
    void pranie_wstępne() {
        cout << "wstępne intensywne" << endl;
    }
    void pranie_zasadnicze() {
        cout << "Pierze bardzo" << endl;
        cout << "Pierze bardzo" << endl;
        cout << "Pierze bardzo" << endl;
    }

    void plukanie() {
        this->plucz();
        this->plucz();
        this->plucz();
        this->plucz();
        this->plucz();
    }

    void wirowanie() {
        this->wiruj(30);
    }

    Proszek* pobierzProszek(){
        return new ZwyklyProszek();
    }
};

class PranieDelikatne : public Pranie {
private:
    virtual void pranie_zasadnicze() {
        cout << "Pierze delikatnie" << endl;
    }

    void plukanie() {
        this->plucz();
        this->plucz();
    }

    void wirowanie() {
        this->wiruj(5);
    }

    Proszek* pobierzProszek(){
        return new DelikatnyProszek();
    }
};


int main(int argc, char **argv) {

    Pranie *p = new PranieBawelny();
    Pranie *q = new PranieIntensywne();
    Pranie *r = new PranieDelikatne();

    p->pierz();
    q->pierz();
    r->pierz();

    return 0;
}
