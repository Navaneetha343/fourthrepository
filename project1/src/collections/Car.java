package collections;

public class Car {
int seat;

public Car(int seat) {
	this.seat=seat;
}
public int hashCode() {
	return seat%5;
}public String toString() {
	return seat+"";
}
}
