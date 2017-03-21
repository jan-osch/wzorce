//
// Created by pawel on 3/7/17.
//

#include <iostream>
#include <fstream>

class FileLogger {
public:
    static void log(std::string input, std::string filepath) {
        std::ofstream log(filepath, std::ios_base::app | std::ios_base::out);
        log << input << " to file " << filepath << std::endl;
    }
};