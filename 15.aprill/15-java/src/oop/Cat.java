package oop;

import java.util.Objects;

public class Cat {
    String name;
    String owner;

    public Cat(String name, String owner) {
        this.name = name;
        this.owner = owner;
    };

    void roll() {
        System.out.println("*rolling*");
    }

    void greet() {
        System.out.println("meow!");
    }

    void speak() {
        System.out.println("I cannot!");
    }    

    @Override
    public String toString() {
        return "Cat [name=" + name + ", owner=" + owner + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cat other = (Cat) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
