//
// Created by pawel on 3/7/17.
//

#ifndef DESIGNPATTERNSLAB1_COUNTER_H
#define DESIGNPATTERNSLAB1_COUNTER_H


class Counter {
public:
    int infoCount;
    int warningCount;
    int errorCount;

    static Counter &getInstance() {
        static Counter instance;
        return instance;
    };
private:
    Counter() : infoCount(0), warningCount(0), errorCount(0) {};

    Counter(Counter const &);

    void operator=(Counter const &);
};


#endif //DESIGNPATTERNSLAB1_COUNTER_H
