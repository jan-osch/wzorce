//
// Created by Janusz Grzesik on 14.03.2017.
//

#include "SHA256Hash.h"
#include "sha256.h"

std::string SHA256Hash::hash(std::string s) {
    return sha256(s);
}
