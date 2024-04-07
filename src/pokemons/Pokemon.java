package pokemons;

public abstract class Pokemon {

    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    protected abstract void atacarPlacaje();
    protected abstract void atacarAranazo();
    protected abstract void atacarMordisco();

}
