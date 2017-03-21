//
// Created by Janusz Grzesik on 14.03.2017.
//

#include "Password.h"

void Password::set(std::string s) {
    password = generator->hash(s);
}

bool Password::validate(std::string s) {
    return generator->hash(s) == password;
}
