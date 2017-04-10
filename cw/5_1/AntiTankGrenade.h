//
// Created by Janusz Grzesik on 28.03.2017.
//

#ifndef CW_ANTITANKGRENADE_H
#define CW_ANTITANKGRENADE_H


#include "Grenade.h"

class AntiTankGrenade : public Grenade{
public:
    AntiTankGrenade(float m);

    AntiTankGrenade(const Grenade &other);

protected:
    void show() override;

    Grenade *clone() override;
};


#endif //CW_ANTITANKGRENADE_H
