package exceptions;

public class Mage extends Character{

	public Mage(String firstName) {
		super(firstName, "Mage");
		super.setLife(70);
		super.setStrength(3);
		super.setAgility(10);
		super.setWit(10);
		String newName = firstName;
		System.out.println(newName +" : May the gods be with me.");
		
	}
	
	//Attacks
	
	@Override public void attack(String Weapon){
		try {
			if (Weapon == "magic" || Weapon == "wand") {
				String name= getName();
				System.out.println(name +" : Rrrrrrrrr....");
				System.out.println(name +" : Feel the power of my "+Weapon);
			}else if(Weapon == "") {
				throw new WeaponException();
			}else {
				throw new MageWeaponException(Weapon);
			}
		}catch(MageWeaponException e) {
			System.out.print(name +" : ");
			System.out.println(e.getMessage());
			
		}catch(WeaponException e) {
			System.out.print(name +" : ");
			System.out.println(e.getMessage());
			
		}
	}
	@Override public void tryToAttack(String Weapon){
		try {
			if (Weapon == "magic" || Weapon == "wand") {
				String name= getName();
				System.out.println(name +" : Rrrrrrrrr....");
				System.out.println(name +" : Feel the power of my "+Weapon);
			}else if(Weapon == "") {
				throw new WeaponException();
			}else {
				throw new MageWeaponException(Weapon);
			}
		}catch(MageWeaponException e) {
			System.out.print(name +" : ");
			System.out.println(e.getMessage());
			
		}catch(WeaponException e) {
			System.out.print(name +" : ");
			System.out.println(e.getMessage());
			
		}
	}
	
	@Override public void moveRight() {
		String name= getName();
		System.out.println(name + " : moves right furtively");
	}
	@Override public void moveLeft() {
		String name= getName();
		System.out.println(name + " : moves left furtively");
	}
	@Override public void moveBack() {
		String name= getName();
		System.out.println(name + " : moves back furtively");
	}
	@Override public void moveForward() {
		String name= getName();
		System.out.println(name + " : moves forwards furtively");
	}

}
