//
// Created by Janusz Grzesik on 14.03.2017.
//

#ifndef CW_SHA256HASH_H
#define CW_SHA256HASH_H

#include "Hash.h"

class SHA256Hash : public Hash {
    std::string hash(std::string s);
};


#endif //CW_SHA256HASH_H
