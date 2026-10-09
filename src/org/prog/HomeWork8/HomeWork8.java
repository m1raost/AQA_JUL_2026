package org.prog.HomeWork8;

//TODO: interface IPhone
// Apple and Android implement IPhone
// IPhone must: unlock phone. Android: with fingerprint, Apple: with faceId
// HomeWork must have method that accepts IPhone and unlocks it

public class HomeWork8 {

    public void unlockPhone(IPhone phone) {
        phone.unlock();
    }
}
