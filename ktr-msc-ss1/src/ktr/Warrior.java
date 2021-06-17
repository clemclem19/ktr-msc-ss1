package ktr;

public class Warrior extends Character{

	public Warrior(String firstName) {
		super(firstName,"Warrior");
		super.setLife(100);
		super.setStrength(10);
		super.setAgility(8);
		super.setWit(3);
		String newName = firstName;
		System.out.println(newName +" : My name will go down in history !");
	}
	
	//Attacks
	
	@Override public void attack(String Weapon) {
		try {
			if (Weapon == "hammer" || Weapon == "sword") {
				String name= getName();
				System.out.println(name +" : Rrrrrrrrr....");
				System.out.println(name +" : I'll crush you with my "+ Weapon);
			}
			else if(Weapon == "") {
				throw new WeaponException();
			}else {
				throw new WarriorWeaponException(Weapon);
			}
		}catch(WeaponException e) {
			System.out.print(name +" : ");
			System.out.println(e.getMessage());
		}catch(WarriorWeaponException e) {
			System.out.print(name +" : ");
			System.out.println(e.getMessage());
		}
	}
	
	
	@Override public void tryToAttack(String Weapon) {
		try {
			if (Weapon == "hammer" || Weapon == "sword") {
				String name= getName();
				System.out.println(name +" : Rrrrrrrrr....");
				System.out.println(name +" : I'll crush you with my "+Weapon);
			}
			else if(Weapon == "") {
				throw new WeaponException();
			}else {
				throw new WarriorWeaponException(Weapon);
			}
		}catch(WeaponException e) {
			System.out.print(name +" : ");
			System.out.println(e.getMessage());
		}
		catch(WarriorWeaponException e) {
			System.out.print(name +" : ");
			System.out.println(e.getMessage());
		}
	}
	
	//Movement
	
	@Override public void moveRight() {
		String name= getName();
		System.out.println(name + " : moves right like a bad boy");
	}
	@Override public void moveLeft() {
		String name= getName();
		System.out.println(name + " : moves left like a bad boy");
	}
	@Override public void moveBack() {
		String name= getName();
		System.out.println(name + " : moves back like a bad boy");
	}
	@Override public void moveForward() {
		String name= getName();
		System.out.println(name + " : moves forwards like a bad boy");
	}
	
}
