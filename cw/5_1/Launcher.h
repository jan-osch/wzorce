#ifndef __LAUNCHER_H__
#define __LAUNCHER_H__


#include "Grenade.h"

class Launcher{
public:
	Launcher(float tossEnergy);
	
	void load(Grenade *);
	
	Grenade* fire(float angle);
	
private:
	float tossEnergy;
	Grenade* prototype = 0;
};


#endif
