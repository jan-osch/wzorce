//
// Created by Janusz Grzesik on 14.03.2017.
//

#ifndef CW_MD5HASH_H
#define CW_MD5HASH_H


#include "Hash.h"

class MD5Hash : public Hash {
    std::string hash(std::string s);
};


#endif //CW_MD5HASH_H
