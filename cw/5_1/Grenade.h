//
// Created by Janusz Grzesik on 28.03.2017.
//

#ifndef CW_GRENADE_H
#define CW_GRENADE_H

class Grenade {
public:
    Grenade(float m);

    Grenade(const Grenade &other);

    float getMass() const;

    float getVerticalVelocity() const;

    float getHorizontalVelocity() const;

    virtual Grenade *clone()= 0;

    virtual void initialize(float vertical, float horizontal);

    virtual void show()= 0;
protected:
    float mass;
    float verticalVelocity;
    float horizontalVelocity;
};

#endif //CW_GRENADE_H
