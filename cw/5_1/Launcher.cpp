//
// Created by Janusz Grzesik on 28.03.2017.
//
#include <cmath>
#include "Launcher.h"

Launcher::Launcher(float tossEnergy) {
    this->tossEnergy = tossEnergy;
}

void Launcher::load(Grenade *g) {
    this->prototype = g;
}

Grenade *Launcher::fire(float angle) {
    Grenade *g = this->prototype->clone();

    float tossSpeed = 2 * this->tossEnergy / g->getMass();
    float horizontalSpeed = (float) cos(2 * 3.14 * angle / 360) * tossSpeed;
    float verticalSpeed = (float) sin(2 * 3.14 * angle / 360) * tossSpeed;

    g->initialize(horizontalSpeed, verticalSpeed);

    return g;
}

