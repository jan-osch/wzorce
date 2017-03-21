#include <iostream>
#include "LoggerFacade.h"
#include "LoggerAdapter.h"

int main() {
    NewLogger *p = new NewLogger();
    LoggerAdapter *f = new LoggerAdapter(p);

    for (int i = 0; i < 100; i++) {
        f->info("entering");

        int r = rand() % 12;
        if (r > 7)
            f->warning("not good");
        if (r == 10)
            f->error("mamma mia!");

        f->info("exiting");
    }

    return 0;
}