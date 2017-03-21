//
// Created by pawel on 3/7/17.
//

#include <iostream>
#include "Formatter.h"

std::string Formatter::highlight(std::string input) {
    std::string result = "";
    for (int i = 0; i < 20; ++i) {
        result.push_back(t);
    }
    result.append("\n");
    result += input;
    result.append("\n");
    for (int i = 0; i < 20; ++i) {
        result.push_back(t);
    }
    return result;
}

std::string Formatter::addInfo(std::string input) {
    return "[INFO]" + input;
}

std::string Formatter::addWarning(std::string input) {
    return "[WARN]" + input;
}

std::string Formatter::addError(std::string input) {
    return "[ERROR]" + input;
}