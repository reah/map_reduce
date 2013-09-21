/*
 * CS 61C Fall 2013 Project 1
 *
 * DoublePair.java is a class which stores two doubles and
 * implements the Writable interface. It can be used as a
 * custom value for Hadoop. To use this as a key, you can
 * choose to implement the WritableComparable interface,
 * although that is not necessary for credit.
 */

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Writable;

public class DoublePair implements Writable {
    // Declare any variables here
    double x;
    double y;
    /**
     * Constructs a DoublePair with both doubles set to zero.
     */
    public DoublePair() {
        // YOUR CODE HERE
        x = 0; 
        y = 0;
    }

    /**
     * Constructs a DoublePair containing double1 and double2.
     */
    public DoublePair(double double1, double double2) {
        // YOUR CODE HERE
        x = double1;
        y = double2;
    }

    /**
     * Returns the value of the first double.
     */
    public double getDouble1() {
        // YOUR CODE HERE
        return x;
    }

    /**
     * Returns the value of the second double.
     */
    public double getDouble2() {
        // YOUR CODE HERE
        return y;
    }

    /**
     * Sets the first double to val.
     */
    public void setDouble1(double val) {
        // YOUR CODE HERE
        x = val;
    }

    /**
     * Sets the second double to val.
     */
    public void setDouble2(double val) {
        // YOUR CODE HERE
        y = val;
    }

    /**
     * write() is required for implementing Writable.
     */
    public void write(DataOutput out) throws IOException {
        // YOUR CODE HERE
        out.writeDouble(x);
        out.writeDouble(y);
    }

    /**
     * readFields() is required for implementing Writable.
     */
    public void readFields(DataInput in) throws IOException {
        // YOUR CODE HERE
        x = in.readDouble();
        y = in.readDouble();
    }

    public static void main(String[] args){}
}
