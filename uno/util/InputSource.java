package uno.util;

import java.io.BufferedReader;

public class InputSource{
    public final boolean isInteractive;
    private BufferedReader br;
    private int[] inputs;
    private int inputIdx;
    public static final int DONE = -1;
    public InputSource(boolean isInteractive, int... inputs){
        this.isInteractive = isInteractive;
        this.inputs = inputs.clone();
    }
    public int getNextInput(){
        return 1;
    }
    
}