#include <iostream>
#include <vector>

#include "Launcher.h"
#include "AntiTankGrenade.h"

using namespace std;

int main(int argc, char** argv) {
	
	Launcher w = Launcher(1000);
	
	w.load(new AntiTankGrenade(10.5));
	
	vector<Grenade*> series;
	for(int i = 0; i < 6; i++)
		series.push_back(w.fire(30.0 + i * 10.0));
	
	for(Grenade* it : series)
		it->show();
	
	return 0;
}


