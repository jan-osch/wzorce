//
// Created by Janusz Grzesik on 14.03.2017.
//

#include "LoggerAdapter.h"

void LoggerAdapter::info(std::string input) {
    instance->log(4, input);
}

void LoggerAdapter::warning(std::string input) {
    instance->log(3, input);
}

void LoggerAdapter::error(std::string input) {
    instance->log(2, input);
}
