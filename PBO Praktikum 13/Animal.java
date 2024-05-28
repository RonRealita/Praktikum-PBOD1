public abstract class Animal {
    public abstract void eat();

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }     
}
