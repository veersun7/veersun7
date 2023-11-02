package org.nirm;


@FunctionalInterface
public interface sayable extends myInterface {
void say(String msg); //single Abstract method - SAM

default int print() {
	greetings("Hi from print");
	int n = 7;
	return n;
}
static void greetings(String msg) {
	System.out.println("String received : " + msg);
}

}