package org.gradledemo.dependency;


import org.apache.commons.math3.primes.Primes;

public class Dependency {
    public static void main(String[] args) {
        System.out.println("Hello World from Dependency!");
        System.out.printf("Q: Is 3 a prime no? A: %s\n", Primes.isPrime(3) ? "Y" : "N");
    }
}
