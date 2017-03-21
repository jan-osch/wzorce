//
// Created by pawel on 3/7/17.
//

#include <ctime>
#include <iostream>
#include "Timestamper.h"

std::string Timestamper::addTimestamp(std::string input) {
    std::string result = input;
    std::string timestamp = "";
    time_t t = time(0);   // get time now
    struct tm *now = localtime(&t);
    timestamp += std::to_string(now->tm_year + 1900);
    timestamp += "-";
    timestamp += std::to_string(now->tm_mon + 1);
    timestamp += "-";
    timestamp += std::to_string(now->tm_mday);
    return timestamp + input;
}