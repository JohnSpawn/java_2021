package com.hell.tuto.sealedclass;

/*
Permet d'avoir des classes dérivées à condition qu'elles font partit des classe autorisées
 */
public sealed class Vehicle permits Voiture, Moto{
}
