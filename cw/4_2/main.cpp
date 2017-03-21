#include <iostream>
#include <vector>


using namespace std;

class TrainElement {
public:
    virtual string toString() =0;
};

class Locomotive : public TrainElement {
};

class StandardGaugeLocomotive : public Locomotive {
public:
    virtual string toString() {
        return "____/ __]";
    }
};

class NarrowGaugeLocomotive : public Locomotive {
public:
    virtual string toString() {
        return "_[=]";
    }
};


class Wagon : public TrainElement {
};

class NarrowGaugeWagon : public Wagon {
public:
    virtual string toString() {
        return "|....|";
    }
};

class StandardGaugeWagon : public Wagon {
public:
    virtual string toString() {
        return "| []  [] [] [] [] |";
    }
};


class TrainFactory {
public:
    virtual Locomotive *createLocomotive()=0;

    virtual Wagon *createWagon()=0;
};

class NarrowGaugeTrainFactory : public TrainFactory {
public:
    virtual Locomotive *createLocomotive() {
        return new NarrowGaugeLocomotive();
    }

    virtual Wagon *createWagon() {
        return new NarrowGaugeWagon();
    }
};

class StandardGaugeTrainFactory : public TrainFactory {
public:
    virtual Locomotive *createLocomotive() {
        return new StandardGaugeLocomotive();
    }

    virtual Wagon *createWagon() {
        return new StandardGaugeWagon();
    }
};

class Planner {
public:
    Planner(TrainFactory* t) {
        this->factory = t;
    }

    void createShortTrain() {
        this->createLocomotives(1);
        this->createWagons(6);
    }

    void createLongTrain() {
        this->createLocomotives(2);
        this->createWagons(10);
    }

    void showTrain() {
        for (TrainElement *e: this->elements) {
            cout << e->toString() << " ";
        }
        cout << endl;
    }


private:
    vector<TrainElement *> elements;
    TrainFactory* factory;

    void createWagons(int amount) {
        for (int i = 0; i < amount; i++) {
            this->elements.push_back(this->factory->createWagon());
        }
    }

    void createLocomotives(int amount) {
        for (int i = 0; i < amount; i++) {
            this->elements.push_back(this->factory->createLocomotive());
        }
    }
};

int main(){
    Planner standard = Planner(new StandardGaugeTrainFactory());
    standard.createLongTrain();
    standard.showTrain();

    Planner shortNarrow = Planner(new NarrowGaugeTrainFactory());
    shortNarrow.createShortTrain();
    shortNarrow.showTrain();
}