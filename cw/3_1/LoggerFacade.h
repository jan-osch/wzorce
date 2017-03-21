//
// Created by pawel on 3/7/17.
//

#ifndef DESIGNPATTERNSLAB1_LOGGERFACADE_H
#define DESIGNPATTERNSLAB1_LOGGERFACADE_H


#include <iostream>
#include "FileLogger.cpp"
#include "Formatter.h"

class LoggerFacade {
public:
    std::string filepath;
    Formatter formatter;

    LoggerFacade(std::string _filepath) : filepath(_filepath), formatter('_') {}

    LoggerFacade() : formatter('_'), filepath("") {}

    virtual void info(std::string input);

    virtual void warning(std::string input);

    virtual void error(std::string input);
};


#endif //DESIGNPATTERNSLAB1_LOGGERFACADE_H
