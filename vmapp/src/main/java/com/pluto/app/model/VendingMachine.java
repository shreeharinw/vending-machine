package com.pluto.app.model;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private static VendingMachine instance;
    private static Integer defaultRows = 3;
    private static Integer defaultColumns = 3;


    private static int rows;
    private static int columns;
    private static boolean inMaintenance;

    public static List<List<Slot>> grid;

    private VendingMachine(int rows, int columns) {
        this.rows=rows;
        this.columns = columns;
        initVMGrid();
    }

    private VendingMachine() {
        this(defaultRows, defaultColumns);
    }

    public static VendingMachine getInstance() {
        if (instance == null) {
            instance = new VendingMachine(defaultRows, defaultColumns);
            Inventory.getInstance();
            initVMGrid();
        }
        return instance;
    }

    public static VendingMachine reset() {
        instance = null;
        return getInstance();
    }

    private static void initVMGrid() {
        grid = new ArrayList<>();
        for (int i=0;i<rows;i++) {
            List<Slot> vMRow = new ArrayList<>();
            for (int j=0;j<columns;j++) {
                vMRow.add(new Slot(i, j));
            }
            grid.add(vMRow);
        }
    }

    public void setInMaintenance(boolean inMaintenance) {
        this.inMaintenance = inMaintenance;
    }
}