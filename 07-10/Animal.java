public class Animal {
    
    protected String type;
    protected boolean walkable;
    protected boolean swimable; 

    public Animal(String type, boolean walkable, boolean swimable) {
        this.type = type;
        this.walkable = walkable;
        this.swimable = swimable;
    }

    public boolean isWalkable() { return walkable; }
    public boolean isSwimable() { return swimable; }

    public String ToString() {
        return type + ": Walkable: " + walkable + ", Swimable: " + swimable;
    }
}
