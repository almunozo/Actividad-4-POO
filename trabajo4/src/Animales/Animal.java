package Animales;

public abstract class Animal {
	protected String sonido; 
	protected String alimentos; 
	protected String hábitat;
	protected String nombreCientífico;
	public abstract String getNombreCientífico();
	public abstract String getSonido();
	public abstract String getAlimentos();
	public abstract String getHábitat();
}
