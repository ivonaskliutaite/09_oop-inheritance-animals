package lt.techin.oop;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    //constructor
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    // method
    public String getDescription() {
        String pawOrPaws = (numberOfPaws == 1) ? "paw" : "paws";
        String furStatus = hasFur ? "a" : "no";

        // In Java, String format() method returns a formatted string using the given locale,
        // specified format string, and arguments. We can concatenate the strings using this method and
        // at the same time, we can format the output concatenated string.
        return String.format("This animal is mostly %s. It has %d %s and %s fur.",
                color, numberOfPaws, pawOrPaws, furStatus);
    }
}
