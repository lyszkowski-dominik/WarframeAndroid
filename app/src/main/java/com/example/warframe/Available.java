package com.example.warframe;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Available {
    List<String> availableList = new ArrayList<>();

    String a1 = "Lith B8";
    String a2 = "Lith D4";
    String a3 = "Lith G3";
    String a4 = "Lith I1";
    String a5 = "Lith K5";
    String a6 = "Lith M7";
    String a7 = "Lith P5";
    String a8 = "Lith T4";
    String a9 = "Lith T5";
    String a10 = "Meso C6";
    String a11 = "Meso D6";
    String a12 = "Meso E5";
    String a13 = "Meso I1";
    String a14 = "Meso K3";
    String a15 = "Meso P2";
    String a16 = "Meso P4";
    String a17 = "Meso T4";
    String a18 = "Neo B6";
    String a19 = "Neo B7";
    String a20 = "Neo N13";
    String a21 = "Neo N14";
    String a22 = "Neo N15";
    String a23 = "Neo P2";
    String a24 = "Neo T2";
    String a25 = "Neo Z7";
    String a26 = "Axi A11";
    String a27 = "Axi A12";
    String a28 = "Axi A13";
    String a29 = "Axi C6";
    String a30 = "Axi H5";
    String a31 = "Axi O5";
    String a32 = "Axi T6";
    String a33 = "Axi W2";
    String a34 = "Axi Z1";

    public Available() {
        availableList.add(a1);
        availableList.add(a2);
        availableList.add(a3);
        availableList.add(a4);
        availableList.add(a5);
        availableList.add(a6);
        availableList.add(a7);
        availableList.add(a8);
        availableList.add(a9);
        availableList.add(a10);
        availableList.add(a11);
        availableList.add(a12);
        availableList.add(a13);
        availableList.add(a14);
        availableList.add(a15);
        availableList.add(a16);
        availableList.add(a17);
        availableList.add(a18);
        availableList.add(a19);
        availableList.add(a20);
        availableList.add(a21);
        availableList.add(a22);
        availableList.add(a23);
        availableList.add(a24);
        availableList.add(a25);
        availableList.add(a26);
        availableList.add(a27);
        availableList.add(a28);
        availableList.add(a29);
        availableList.add(a30);
        availableList.add(a31);
        availableList.add(a32);
        availableList.add(a33);
        availableList.add(a34);
    }

    public List<String> getAvailableList() {
        return availableList;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Available available = (Available) o;
        return Objects.equals(availableList, available.availableList) && Objects.equals(a1, available.a1) && Objects.equals(a2, available.a2) && Objects.equals(a3, available.a3) && Objects.equals(a4, available.a4) && Objects.equals(a5, available.a5) && Objects.equals(a6, available.a6) && Objects.equals(a7, available.a7) && Objects.equals(a8, available.a8) && Objects.equals(a9, available.a9) && Objects.equals(a10, available.a10) && Objects.equals(a11, available.a11) && Objects.equals(a12, available.a12) && Objects.equals(a13, available.a13) && Objects.equals(a14, available.a14) && Objects.equals(a15, available.a15) && Objects.equals(a16, available.a16) && Objects.equals(a17, available.a17) && Objects.equals(a18, available.a18) && Objects.equals(a19, available.a19) && Objects.equals(a20, available.a20) && Objects.equals(a21, available.a21) && Objects.equals(a22, available.a22) && Objects.equals(a23, available.a23) && Objects.equals(a24, available.a24) && Objects.equals(a25, available.a25) && Objects.equals(a26, available.a26) && Objects.equals(a27, available.a27) && Objects.equals(a28, available.a28) && Objects.equals(a29, available.a29) && Objects.equals(a30, available.a30) && Objects.equals(a31, available.a31) && Objects.equals(a32, available.a32) && Objects.equals(a33, available.a33) && Objects.equals(a34, available.a34);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(availableList, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30, a31, a32, a33, a34);
    }
}

