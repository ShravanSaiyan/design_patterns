package examples.instrumentdesign.impl;

import examples.instrumentdesign.model.*;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private ArrayList<Instrument> inventory;

    public Inventory(List<Instrument> inventory) {
        this.inventory = new ArrayList<>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {

        Instrument instrument = null;

        if (instrumentSpec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec) instrumentSpec);
        } else if (instrumentSpec instanceof MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) instrumentSpec);

        }

        inventory.add(instrument);


    }
}
