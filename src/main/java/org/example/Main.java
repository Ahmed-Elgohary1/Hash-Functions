package org.example;


import static org.example.fnv.FNV.fnv;
import static org.example.murmur3.Murmur.hash32;
import static org.example.murmur3.Util.display;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hash from murmur: " + display(fnv("Ahmed Elgohary")) );
    }
}
