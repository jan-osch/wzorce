//
// Created by Janusz Grzesik on 14.03.2017.
//

#include <iostream>
#include "Password.h"
#include "MD5Hash.h"
#include "SHA256Hash.h"


int main() {
    Password *p = new Password(new MD5Hash());

    p->set("abcd");

    std::cout << p->validate("abcd") << std::endl;
    std::cout << p->validate("bulbazaur") << std::endl;


    Password *p1 = new Password(new SHA256Hash());

    p1->set("efgh");

    std::cout << p1->validate("efgh") << std::endl;
    std::cout << p1->validate("pikaczu") << std::endl;
}