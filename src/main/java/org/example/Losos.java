
package org.example;

@Table(Title = "Losos")
class Losos {
    @Column
    String name;

    @Column
    double length;

    @Column
    Color color;

    public Losos(String name, double length, Color color) {
        this.name = name;
        this.length = length;
        this.color = color;
    }
}
