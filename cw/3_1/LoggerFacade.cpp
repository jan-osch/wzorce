//
// Created by pawel on 3/7/17.
//

#include "LoggerFacade.h"
#include "Timestamper.h"

void LoggerFacade::info(std::string input) {
    std::string toFile = this->formatter.addInfo(Timestamper::addTimestamp(input));
    FileLogger::log(toFile, this->filepath);
}

void LoggerFacade::warning(std::string input) {
    std::string toFile = this->formatter.addWarning(Timestamper::addTimestamp(input));
    FileLogger::log(toFile, this->filepath);
    std::cout << input << std::endl;
}

void LoggerFacade::error(std::string input) {
    std::string toFile = this->formatter.addError(Timestamper::addTimestamp(input));
    FileLogger::log(toFile, this->filepath);
    std::cout << this->formatter.highlight(input) << std::endl;
}
