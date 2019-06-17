package cn.master.pattern.builder.model;

import java.util.ArrayList;

public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String action = sequence.get(i);
            if(action.equalsIgnoreCase("start")) {
                this.start();
            } else if(action.equalsIgnoreCase("stop")) {
                this.stop();
            } else if(action.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if(action.equalsIgnoreCase("engineBoom")) {
                this.engineBoom();
            }
        }
    }

    public void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }
}
