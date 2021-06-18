package exceptions;

public class Character {
	
	protected String name;
	final String RPGClass;
	protected int life;
	protected int agility;
	protected int strength;
	protected int wit;
	
	//Constructors
	public Character(String firstName, String ChosenClass) {
		name = firstName;
		RPGClass=ChosenClass;
		life = 50;
		agility = 2;
		strength = 2;
		wit = 2;
	}
	public Character(String firstName) {
		name = firstName;
		RPGClass="Character";
		life = 50;
		agility = 2;
		strength = 2;
		wit = 2;
	}
	
	//getters and setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getWit() {
		return wit;
	}
	public void setWit(int wit) {
		this.wit = wit;
	}
	
	
	//Methods
	public void attack(String Weapon) {
		String name= getName();
		System.out.println(name +" : Rrrrrrrrr....");
	}
	public void moveRight() {
		String name= getName();
		System.out.println(name + " : moves right");
	}
	public void moveLeft() {
		String name= getName();
		System.out.println(name + " : moves left");
	}
	public void moveBack() {
		String name= getName();
		System.out.println(name + " : moves back");
	}
	public void moveForward() {
		String name= getName();
		System.out.println(name + " : moves forwards");
	}
	
	public final void unsheathe() {
		String name= getName();
		System.out.println(name + " : unsheathes his weapon");
	}
	
	public void tryToAttack(String Weapon) {
		String name= getName();
		System.out.println(name +" : Rrrrrrrrr....");
	}
	
	
	//Main
	public static void main(String[] args) {
		Character Warrior = new Warrior("Jean-Luc");
		Character Mage = new Mage("Robert");
		Warrior.tryToAttack("screwdriver");
		Mage.tryToAttack("Hammer");
		Warrior.moveRight();
		Mage.moveLeft();
		Mage.attack("");	
	}
}
