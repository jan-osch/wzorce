//
// Created by Janusz Grzesik on 28.03.2017.
//

#include "Grenade.h"

Grenade::Grenade(float m) : mass(m) {};

Grenade::Grenade(const Grenade &other) {
    mass = other.getMass();
    verticalVelocity = other.getVerticalVelocity();
    horizontalVelocity = other.getHorizontalVelocity();
}

float Grenade::getMass() const {
    return mass;
}

float Grenade::getVerticalVelocity() const {
    return verticalVelocity;
}

float Grenade::getHorizontalVelocity() const {
    return horizontalVelocity;
}

void Grenade::initialize(float vertical, float horizontal) {
    this->horizontalVelocity = horizontal;
    this->verticalVelocity = vertical;
}




