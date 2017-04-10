//
// Created by Janusz Grzesik on 28.03.2017.
//

#include <iostream>
#include "AntiTankGrenade.h"

AntiTankGrenade::AntiTankGrenade(float m) : Grenade(m) {}

AntiTankGrenade::AntiTankGrenade(const Grenade &other) : Grenade(other) {
    mass = other.getMass();
    initialize(other.getVerticalVelocity(), other.getHorizontalVelocity());
}

void AntiTankGrenade::show() {
    std::cout <<"AntiTankGrenade mass: " << this->mass
              << " horizontal: " << this->horizontalVelocity
              << " vertical: " << this->verticalVelocity
              << std::endl;
}

Grenade *AntiTankGrenade::clone() {
    return new AntiTankGrenade(*this);
}
