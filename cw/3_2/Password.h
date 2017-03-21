//
// Created by Janusz Grzesik on 14.03.2017.
//

#ifndef CW_PASSWORD_H
#define CW_PASSWORD_H


#include <string>
#include "Hash.h"

class Password {
public:
    Password(Hash *hashGenerator) : generator(hashGenerator) {}

    void set(std::string s);

    bool validate(std::string s);

private:
    std::string password;
    Hash *generator;
};


#endif //CW_PASSWORD_H
