package com.example.warframe;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.*;

public class Warehouse {
    List<Component> componentList = new ArrayList<>();

    Component c1 = new Component("Aksomati Prime Schemat","Powszechny" ,new ArrayList<>(Arrays.asList("Lith B8","Neo N13","Meso R2","Neo R4","Axi B4")));
    Component c2 = new Component("Aksomati Prime Lufa","Nieprzeciętny",new ArrayList<>(Arrays.asList("Meso D6","Lith B7","Neo Z5")));
    Component c3 = new Component("Aksomati Prime Połączenie","Rzadki", new ArrayList<>(Arrays.asList("Axi A13","Axi A8","Aksi A10")));
    Component c4 = new Component("Aksomati Prime Korpus","Powszechny",new ArrayList<>(Arrays.asList("Neo B7","Neo P2","Lith N6","Axi D2","Axi G4","Axi W1")));

    Component c5 = new Component("Burston Prime Kolba","Powszechny",new ArrayList<>(Arrays.asList("Lith B8","Lith D3","Lith K1","Lith M5","Lith S9","Lith V1","Meso C3","Meso N3","Meso S5","Neo B4","Neo H2","Neo M2","Neo S2","Neo V6","Neo Z4","Neo Z5","Axi O3")));
    Component c6 = new Component("Burston Prime Schemat","Powszechny",new ArrayList<>(Arrays.asList("Meso C6","Meso P4","Lith B3","Lith O1","Lith P2","Lith S10","Lith T1","Meso C5","Meso V1","Neo R3","Neo S6","Neo T1","Axi L5","Axi S6","Axi T3")));
    Component c7 = new Component("Burston Prime Lufa","Nieprzeciętny",new ArrayList<>(Arrays.asList("Lith I1","Lith F2","Lith P3","Meso G2","Meso S8","Neo B1","Neo V5","Axi G3","Axi G4","Axi H3","Axi P3","Axi T1","Axi Axi T2")));
    Component c8 = new Component("Burston Prime Korpus","Powszechny",new ArrayList<>(Arrays.asList("Axi A11","Axi A13","Lith C4","Lith D1","Lith N3","Lith S5","Meso L1","Meso T1","Meso Z1","Neo E2","Neo G3","Neo H1","Neo I2","Neo S3","Axi G2")));

    Component c9 = new Component("Dethcube Prime Schemat","Rzadki",new ArrayList<>(Arrays.asList("Lith D4","Lith D1","Lith D3")));
    Component c10 = new Component("Dethcube Prime Mózg","Rzadki",new ArrayList<>(Arrays.asList("Meso D6","Lith D2","Meso D4","Neo D2")));
    Component c11 = new Component("Dethcube Prime Karapaks","Nieprzeciętny",new ArrayList<>(Arrays.asList("Lith T4","Neo B7","Neo T2","Lith M6","Meso L1","Meso R3")));
    Component c12 = new Component("Dethcube Prime Systemy","Powszechny",new ArrayList<>(Arrays.asList("Lith B8","Lith S10","Neo E2","Neo G2","Neo I2","Axi P2")));

    Component c13 = new Component("Atlas Prime Schemat","Powszechny",new ArrayList<>(Arrays.asList("Lith P5","Neo Z7","Lith D1","Lith M5","Lith P3")));
    Component c14 = new Component("Atlas Prime Neurooptyka","Rzadki",new ArrayList<>(Arrays.asList("Axi A11","Axi A6","Axi A9")));
    Component c15 = new Component("Atlas Prime Powłoka","Nieprzeciętny",new ArrayList<>(Arrays.asList("Lith B8","Meso E3","Neo E2","Neo M3","Neo T3","Axi B3")));
    Component c16 = new Component("Atlas Prime Systemy","Nieprzeciętny",new ArrayList<>(Arrays.asList("Meso I1","Neo N15","Lith N4","Meso C4","Meso G2","Neo A3")));

    Component c17 = new Component("Ivara Prime Schemat","Nieprzeciętny",new ArrayList<>(Arrays.asList("Lith B8","Lith N4","Lith N5","Meso N9","Axi B4")));
    Component c18 = new Component("Ivara Prime Neurooptyka","Powszechny",new ArrayList<>(Arrays.asList("Meso D6","Lith D3","Meso C4","Meso N10","Neo M3")));
    Component c19 = new Component("Ivara Prime Powłoka","Rzadki",new ArrayList<>(Arrays.asList("Lith I1","Neo I1","Neo I2")));
    Component c20 = new Component("Ivara Prime Systemy","Nieprzeciętny",new ArrayList<>(Arrays.asList("Meso P2","Axi C6","Axi A9")));

    Component c21 = new Component("Baza Prime Schemat","Rzadki",new ArrayList<>(Arrays.asList("Lith B8","Lith B7","Meso B4","Axi B4")));
    Component c22 = new Component("Baza Prime Lufa","Nieprzeciętny",new ArrayList<>(Arrays.asList("Neo N15","Axi Z1","Lith S10","Lith W2")));
    Component c23 = new Component("Baza Prime Korpus","Powszechny",new ArrayList<>(Arrays.asList("Meso C6","Meso P2","Axi W2","Meso E4","Neo R3")));
    Component c24 = new Component("Baza Prime Kolba","Rzadki",new ArrayList<>(Arrays.asList("Neo B7","Axi B3")));

    Component c25 = new Component("Hikou Prime Schemat","Powszechny", new ArrayList<>(Arrays.asList("Axi S8","Lith S1","Meso N2","Neo R1")));
    Component c26 = new Component("Hikou Prime Kieszeń","Powszechny",new ArrayList<>(Arrays.asList("Lith C7","Meso N6","Axi K1","Axi V2")));
    Component c27 = new Component("Hikou Prime Gwiazdki","Powszechny",new ArrayList<>(Arrays.asList("Axi V10","Lith F2","Neo N1","Axi S3")));

    Component c28 = new Component("Valkyr Prime Schemat","Powszechny",new ArrayList<>(Arrays.asList("Lith C7","Lith A2","Lith N3","Lith T2","Meso N8","Meso S3","Meso S6","Neo K1","Axi V7","Axi V9")));
    Component c29 = new Component("Valkyr Prime Neoruooptyka","Nieprzeciętny",new ArrayList<>(Arrays.asList("Meso N11","Lith C5","Lith S6","Lith T1","Meso C2","Meso D2","Meso N8","Meso V4","Neo N7")));
    Component c30 = new Component("Valkyr Prime Powłoka","Rzadki",new ArrayList<>(Arrays.asList("Neo V9","Lith V6","Neo V7","Axi V5","Axi V6")));
    Component c31 = new Component("Valkyr Prime Systemy","Rzadki, Nieprzecięnty (Axi V10,Axi V9)",new ArrayList<>(Arrays.asList("Axi V10","Lith V3","Lith V5","Meso V3","Axi V9")));

    Component c32 = new Component("Nyx Prime Schemat","Powszechny",new ArrayList<>(Arrays.asList("Neo V9","Lith B4","Lith S2","Neo V1")));
    Component c33 = new Component("Nyx Prime Neurooptyka","Rzadki",new ArrayList<>(Arrays.asList("Meso N11","Meso N1","Meso N6")));
    Component c34 = new Component("Nyx Prime Powłoka","Nieprzeciętny, Rzadki (Neo N1)",new ArrayList<>(Arrays.asList("Axi S8","Neo N1","Neo R1")));
    Component c35 = new Component("Nyx Prime Systemy","Nieprzeciętny", new ArrayList<>(Arrays.asList("Lith C7","Neo S2","Axi S3")));

    Component c36 = new Component("Scindo Prime Schemat","Nieprzeciętny",new ArrayList<>(Arrays.asList("Lith C7","Lith B4","Lith F1")));
    Component c37 = new Component("Scindo Prime Ostrze","Rzadki",new ArrayList<>(Arrays.asList("Axi S8","Axi S1","Axi S3")));
    Component c38 = new Component("Scindo Prime Rękojeść","Nieprzeciętny, Powszechny (Meso N11)",new ArrayList<>(Arrays.asList("Meso N11","Meso C1","Meso N6")));

    Component c39 = new Component("Cernos Prime Schemat","Nieprzeciętny",new ArrayList<>(Arrays.asList("Neo V9","Lith A2","Lith Z1","Neo S13","Neo V7","Axi B1","Axi V4")));
    Component c40 = new Component("Cernos Prime Majdan","Powszechny",new ArrayList<>(Arrays.asList("Axi S8","Lith V6","Meso V5","Neo V4","Neo V6","Axi H3","Axi K3","Axi S5")));
    Component c41 = new Component("Cernos Prime Dolne Ramię","Rzadki",new ArrayList<>(Arrays.asList("Lith C7","Lith C2","Lith C5","Meso C3","Axi C1","Axi C2")));
    Component c42 = new Component("Cernos Prime Cięciwa","Nieprzeciętny, Powszechny (Axi V10)",new ArrayList<>(Arrays.asList("Axi V10","Lith B3","Meso N8","Meso O1","Meso S6","Neo A1","Axi A3","Axi K3")));
    Component c43 = new Component("Cernos Prime Góre Ramię","Powszechny",new ArrayList<>(Arrays.asList("Meso N11","Lith V3","Meso C2","Meso K1","Meso N8","Meso O2","Meso S7","Neo N6","Axi N4")));

    Component c44 = new Component("Bronco Prime Schemat","Powszechny",new ArrayList<>(Arrays.asList("Lith D4","Lith H1","Lith M6","Lith N1","Lith N4","Lith P4","Lith S1","Lith V8","Meso C2","Meso E2","Meso N2","Meso N3","Meso S2","Meso V5","Neo M1","Neo S9","Axi N2","Axi P2","Axi P3","Axi S1")));
    Component c45 = new Component("Bronco Prime Lufa","Nieprzeciętny",new ArrayList<>(Arrays.asList("Axi W2","Meso N10","Meso R3","Neo M2","Neo V1","Axi E2","Axi N3")));
    Component c46 = new Component("Bronco Prime Korpus","Powszechny",new ArrayList<>(Arrays.asList("Lith P5","Neo N14","Lith C2","Meso B4","Meso E3","Meso F1","Meso P1","Meso S8","Neo B1","Neo M3","Neo N6","Neo S8","Neo S11","Neo V4","Neo Z3","Axi S1","Axi W1")));

    Component c47 = new Component("Orthos Prime Schemat","Nieprzeciętny",new ArrayList<>(Arrays.asList("Axi A13","Lith B6","Lith B7","Lith H2","Lith S8","Lith S10","Meso B1","Axi B2","Axi C1","Axi M1","Axi V3")));
    Component c48 = new Component("Orthos Prime Ostrze","Nieprzeciętny",new ArrayList<>(Arrays.asList("Meso I1","Lith B2","Lith B3","Lith B5","Lith C4","Meso D1")));
    Component c49 = new Component("Orthos Prime Rękojeść","Powszechny",new ArrayList<>(Arrays.asList("Lith D4","Meso K3","Lith A3","Meso A1","Meso B1","Meso D1","Meso D4","Meso G2","Meso K1","Meso K2","Meso N4","Neo H1","Neo Z1","Axi A6","Axi K2","Axi L2")));

    Component c50 = new Component("Ninkondi Prime Schemat","Powszechny",new ArrayList<>(Arrays.asList("Meso K3","Meso T4","Meso L1","Neo P1","Neo R2","Neo S14","Axi G3")));
    Component c51 = new Component("Ninkondi Prime Łańcuch","Nieprzeciętny",new ArrayList<>(Arrays.asList("Lith D4","Lith D1","Lith D3","Neo R3","Neo R4","Axi P1")));
    Component c52 = new Component("Ninkondi Prime Rękojeść","Rzadki",new ArrayList<>(Arrays.asList("Neo N14","Lith N4","Lith N5","Meso N7","Meso N9","Meso N10")));

    Component c53 = new Component("Zakti Prime Schemat","Rzadki",new ArrayList<>(Arrays.asList("Axi Z1")));
    Component c54 = new Component("Zakti Prime Lufa","Nieprzeciętny",new ArrayList<>(Arrays.asList("Lith D4","Neo E2")));
    Component c55 = new Component("Zakti Prime Korpus","Powszechny",new ArrayList<>(Arrays.asList("Lith T4","Lith T6")));

    Component c56 = new Component("Helios Prime Schemat","Nieprzeciętny",new ArrayList<>(Arrays.asList("Meso E5","Lith C3","Lith N2","Lith V4","Meso C3","Meso Z1","Neo K1","Neo M1")));
    Component c57 = new Component("Helios Prime Mózg","Rzadki",new ArrayList<>(Arrays.asList("Axi H5","Lith H1","Lith H2","Meso H1","Axi H1","Axi H2")));
    Component c58 = new Component("Helios Prime Karapaks","Powszechny",new ArrayList<>(Arrays.asList("Lith K5","Meso E5","Lith P1","Meso S6","Neo N5","Neo S7","Neo V5","Axi A3","Axi C3","Axi H3")));
    Component c59 = new Component("Helios Prime Systemy","Nieprzeciętny",new ArrayList<>(Arrays.asList("Axi A12","Lith V3","Lith Z2","Meso D2","Axi N5","Axi O2")));

    Component c60 = new Component("Octavia Prime Schemat","Rzadki",new ArrayList<>(Arrays.asList("Axi O5")));
    Component c61 = new Component("Octavia Prime Neurooptyka","Powszechny",new ArrayList<>(Arrays.asList("Lith G3")));
    Component c62 = new Component("Octavia Prime Powłoka","Nieprzeciętny",new ArrayList<>(Arrays.asList("Neo Z7")));
    Component c63 = new Component("Octavia Prime Systemy","Powszechny",new ArrayList<>(Arrays.asList("Meso D6")));

    Component c64 = new Component("Paris Prime Schemat","Powszechny",new ArrayList<>(Arrays.asList("Meso D6","Neo N15","Lith F1","Lith H1","Lith M3","Lith M4","Lith S4","Meso E4","Meso H1","Meso S1","Meso V2","Neo Z1","Axi E2","Axi G1","Axi K3","Axi K4","Axi O1","Axi V4")));
    Component c65 = new Component("Paris Prime Majdan","Nieprzeciętny",new ArrayList<>(Arrays.asList("Meso T4","Lith S1","Lith S7","Meso S2","Meso S7","Neo G1","Neo R2","Neo R3","Axi A10")));
    Component c66 = new Component("Paris Prime Dolne Ramię","Powszechny",new ArrayList<>(Arrays.asList("Lith T4","Lith T5","Lith B2","Lith C4","Lith V1","Lith V2","Lith V3","Meso D2","Meso F1","Meso O1","Meso O2","Meso T2","Meso T3","Neo P1","Neo S2","Axi B3","Axi B4","Axi T3")));
    Component c67 = new Component("Paris Prime Cięciwa","Powszechny",new ArrayList<>(Arrays.asList("Axi T6","Lith S1","Lith S3","Meso K2","Meso M2","Meso M3","Meso N9","Meso S2","Neo B1","Neo M1","Neo N3","Neo N4","Neo N8","Neo V3","Neo V5","Neo Z4","Neo Z6","Axi O2")));
    Component c68 = new Component("Paris Prime Górne Ramię","Powszechny",new ArrayList<>(Arrays.asList("Lith G3","Meso I1","Lith C2","Lith F2","Lith K3","Lith N2","Lith V1","Lith V2","Meso B4","Meso N4","Meso R1","Meso S1","Meso T1","Neo S2","Neo S12","Axi H4","Axi N3")));

    public Warehouse () {

        componentList.add(c1);
        componentList.add(c2);
        componentList.add(c3);
        componentList.add(c4);
        componentList.add(c5);
        componentList.add(c6);
        componentList.add(c7);
        componentList.add(c8);
        componentList.add(c9);
        componentList.add(c10);
        componentList.add(c11);
        componentList.add(c12);
        componentList.add(c13);
        componentList.add(c14);
        componentList.add(c15);
        componentList.add(c16);
        componentList.add(c17);
        componentList.add(c18);
        componentList.add(c19);
        componentList.add(c20);
        componentList.add(c21);
        componentList.add(c22);
        componentList.add(c23);
        componentList.add(c24);
        componentList.add(c25);
        componentList.add(c26);
        componentList.add(c27);
        componentList.add(c28);
        componentList.add(c29);
        componentList.add(c30);
        componentList.add(c31);
        componentList.add(c32);
        componentList.add(c33);
        componentList.add(c34);
        componentList.add(c35);
        componentList.add(c36);
        componentList.add(c37);
        componentList.add(c38);
        componentList.add(c39);
        componentList.add(c40);
        componentList.add(c41);
        componentList.add(c42);
        componentList.add(c43);
        componentList.add(c44);
        componentList.add(c45);
        componentList.add(c46);
        componentList.add(c47);
        componentList.add(c48);
        componentList.add(c49);
        componentList.add(c50);
        componentList.add(c51);
        componentList.add(c52);
        componentList.add(c53);
        componentList.add(c54);
        componentList.add(c55);
        componentList.add(c56);
        componentList.add(c57);
        componentList.add(c58);
        componentList.add(c59);
        componentList.add(c60);
        componentList.add(c61);
        componentList.add(c62);
        componentList.add(c63);
        componentList.add(c64);
        componentList.add(c65);
        componentList.add(c66);
        componentList.add(c67);
        componentList.add(c68);
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warehouse warehouse = (Warehouse) o;
        return componentList.equals(warehouse.componentList) && c1.equals(warehouse.c1) && c2.equals(warehouse.c2);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(componentList, c1, c2);
    }
}
