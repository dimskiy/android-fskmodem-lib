android-fskmodem
================

Android/Java library for encoding and decoding FSK audio signals.

The FSKModem library is developed by Cytec BG Ltd. as a free software available under the GNU GPLv3 license.

The FSKModem library consists of two major components:

- FSKEncoder
- FSKDecoder

It is designed to work with the existing implementation of SoftModem library for arduino.

For usage guidelines take a look at the examples.

You can use AAR artifact this way:

1. Add to project' build dependencies:
[![](https://jitpack.io/v/dimskiy/android-fskmodem-lib.svg)](https://jitpack.io/#dimskiy/android-fskmodem-lib)

```
allprojects {
    repositories {
        maven {
            url 'https://jitpack.io'
        }
    }
}
```
2. Add to the app's module:
```
dependencies {
    implementation 'com.github.dimskiy:android-fskmodem-lib:VERSION'
}
```