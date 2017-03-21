//
// Created by Janusz Grzesik on 14.03.2017.
//

#include "md5.h"
#include "MD5Hash.h"

std::string MD5Hash::hash(std::string s) {
    return md5(s);
}
