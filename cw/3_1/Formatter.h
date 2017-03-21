//
// Created by pawel on 3/7/17.
//

#ifndef DESIGNPATTERNSLAB1_FORMATTER_H
#define DESIGNPATTERNSLAB1_FORMATTER_H

class Formatter {
public:
    char t;

    Formatter(char _t) : t(_t) {};

    std::string highlight(std::string input);

    std::string addInfo(std::string input);

    std::string addWarning(std::string input);

    std::string addError(std::string input);
};

#endif //DESIGNPATTERNSLAB1_FORMATTER_H
