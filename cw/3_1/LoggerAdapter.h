//
// Created by Janusz Grzesik on 14.03.2017.
//

#ifndef CW_LOGGERADAPTER_H
#define CW_LOGGERADAPTER_H

#include <string>
#include "LoggerFacade.h"
#include "newLogger.h"


class LoggerAdapter : public LoggerFacade {
public:
    LoggerAdapter(NewLogger *logger) : instance(logger) {};

    void info(std::string input);

    void warning(std::string input);

    void error(std::string input);

private:
    NewLogger *instance;
};


#endif //CW_LOGGERADAPTER_H
