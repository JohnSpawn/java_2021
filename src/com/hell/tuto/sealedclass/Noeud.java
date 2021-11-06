package com.hell.tuto.sealedclass;

public sealed interface Noeud permits Noeud.Feuille, Noeud.MultiNoeud, Noeud.AdditionNoeud{

    double eval();


    record AdditionNoeud (Noeud gauche, Noeud droite) implements Noeud {
        public double eval(){
            return gauche.eval() + droite.eval();
        }
    }

    record Feuille (double val) implements Noeud {
        public double eval(){
            return val;
        }
    }

    record MultiNoeud(Noeud gauche, Noeud droite) implements Noeud {
        public double eval(){
            return gauche.eval() * droite.eval();
        }
    }
}
