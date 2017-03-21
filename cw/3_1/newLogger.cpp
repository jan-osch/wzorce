#include <iostream>

#include "newLogger.h"

using namespace std;

void NewLogger::log(int log_level, string message) {
    int exclamation_marks = 0;

    if (log_level <= 3)
        exclamation_marks = 4 - log_level;

    cout << string(exclamation_marks, '!') << string(log_level, ' ') << message << endl;
}