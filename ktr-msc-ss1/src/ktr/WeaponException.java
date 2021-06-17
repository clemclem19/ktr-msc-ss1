 package ktr;

public class WeaponException extends Exception{
	
	public WeaponException(){
		super("I refuse to fight with my bare hands");
	}
	
}
class MageWeaponException extends Exception{
	
	public MageWeaponException(String Weapon){
		super("I don't need this stupid "+ Weapon + "! Don't misjudge my powers !");
	}
	
}
class WarriorWeaponException extends Exception{
	
	public WarriorWeaponException(String Weapon){
		super("A "+ Weapon + "?? What should I do with this?!");
	}
	
}