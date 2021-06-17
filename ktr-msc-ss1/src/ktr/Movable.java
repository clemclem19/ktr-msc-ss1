package ktr;

public interface Movable {
		public default void moveRight() {
			String name="[name]";
			System.out.println(name + " : moves right");
		}
		public default void moveLeft() {
			String name="[name]";
			System.out.println(name + " : moves left");
		}
		public default void moveBack() {
			String name="[name]";
			System.out.println(name + " : moves back");
		}
		public default void moveForward() {
			String name="[name]";
			System.out.println(name + " : moves forwards");
		}
	}
