# ti-jailbreak Module

## Description

Easy validation if an iOS-device is jailbroken or an Android-device is rooted.

This module uses [DTTJailbreakDetection](https://github.com/thii/DTTJailbreakDetection) for iOS and [Rootbeer](https://github.com/scottyab/rootbeer) for Android

## Usage

To access this module from JavaScript, you would do the following:

var TiJailbreak = require('be.aca.mobile.jailbreak');

if (TiJailbreak.isJailbroken()) {
...
} else {
...
}

## Author

This module has been made by the ACA Mobile team, part of [ACA IT-Solutions](https://www.aca-it.be). 
Find us online on [https://mobile.aca-it.be](https://mobile.aca-it.be)!
