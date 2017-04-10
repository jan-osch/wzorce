cmake_minimum_required(VERSION 3.6)
project(cw)

set(CMAKE_CXX_STANDARD 11)

set(SOURCE_FILES
        3_1/main.cpp
        3_1/newLogger.cpp
        3_1/newLogger.h
        3_1/Counter.cpp
        3_1/Counter.h
        3_1/FileLogger.cpp
        3_1/FileLogger.h
        3_1/Formatter.cpp
        3_1/Formatter.h
        3_1/LoggerFacade.cpp
        3_1/LoggerFacade.h
        3_1/ScreenLogger.cpp
        3_1/ScreenLogger.h
        3_1/Timestamper.cpp
        3_1/Timestamper.h
        3_1/LoggerAdapter.cpp
        3_1/LoggerAdapter.h
        )

add_executable(3_1 ${SOURCE_FILES})

set(SOURCE_FILES_2
        3_2/md5.cpp
        3_2/md5.h
        3_2/sha256.cpp
        3_2/sha256.h
        3_2/Password.cpp
        3_2/Password.h
        3_2/Hash.cpp
        3_2/Hash.h
        3_2/main.cpp
        3_2/MD5Hash.cpp
        3_2/MD5Hash.h
        3_2/SHA256Hash.cpp 3_2/SHA256Hash.h)

add_executable(3_2 ${SOURCE_FILES_2})

set(SOURCE_FILES_3
        3_3/main.cpp
        )

add_executable(3_3 ${SOURCE_FILES_3})

set(SOURCE_FILES_4
        4_2/main.cpp
        )

add_executable(4_2 ${SOURCE_FILES_4})

set(SOURCE_FILES_5_1
        5_1/Launcher.h
        5_1/main.cpp
        5_1/Grenade.cpp 5_1/AntiTankGrenade.cpp 5_1/AntiTankGrenade.h 5_1/Grenade.h 5_1/Launcher.cpp 5_1/SmokeGrenade.cpp 5_1/SmokeGrenade.h)

add_executable(5_1 ${SOURCE_FILES_5_1})

set(SOURCE_FILES_5_2
        5_2/main.cpp
        5_2/Director.cpp 5_2/Director.h 5_2/Builder.cpp 5_2/Builder.h)

add_executable(5_2 ${SOURCE_FILES_5_2})