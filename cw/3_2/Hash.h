//
// Created by Janusz Grzesik on 14.03.2017.
//

#ifndef CW_HASH_H
#define CW_HASH_H


#include <string>

class Hash {
public:
    virtual std::string hash(std::string)= 0;
};


#endif //CW_HASH_H
