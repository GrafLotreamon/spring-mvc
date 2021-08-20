package web.model;


import java.util.ArrayList;
import java.util.List;

public class Car {
    String marka;
    int model;
    String godvipuska;


    public Car(String marka, int model, String godvipuska) {
        this.marka = marka;
        this.model = model;
        this.godvipuska = godvipuska;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getGodvipuska() {
        return godvipuska;
    }

    public void setGodvipuska(String godvipuska) {
        this.godvipuska = godvipuska;
    }

    @Override
    public String toString() {
        return " Car  {" +
                "\n Marka = '" + marka + '\'' +
                "   Model = " + model +
                "   Godvipuska = '" + godvipuska  +
                '}';
    }
}
