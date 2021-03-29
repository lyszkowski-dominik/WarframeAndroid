package com.example.warframe;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView wynik;
    String rarity;

    String[] ComponentNames = new String[] {"Aksomati Prime Schemat","Aksomati Prime Lufa","Aksomati Prime Połączenie","Aksomati Prime Korpus",
            "Burston Prime Kolba","Burston Prime Schemat","Burston Prime Lufa","Burston Prime Korpus","Dethcube Prime Schemat","Dethcube Prime Mózg",
            "Dethcube Prime Karapaks","Dethcube Prime Systemy","Atlas Prime Schemat","Atlas Prime Neurooptyka","Atlas Prime Powłoka","Atlas Prime Systemy",
            "Ivara Prime Schemat","Ivara Prime Neurooptyka","Ivara Prime Powłoka","Ivara Prime Systemy","Baza Prime Schemat","Baza Prime Lufa","Baza Prime Korpus",
            "Baza Prime Kolba","Hikou Prime Schemat","Hikou Prime Kieszeń","Hikou Prime Gwiazdki","Valkyr Prime Schemat","Valkyr Prime Neoruooptyka",
            "Valkyr Prime Powłoka","Valkyr Prime Systemy","Nyx Prime Schemat","Nyx Prime Neurooptyka","Nyx Prime Powłoka","Nyx Prime Systemy",
            "Scindo Prime Schemat","Scindo Prime Ostrze","Scindo Prime Rękojeść","Cernos Prime Schemat","Cernos Prime Majdan","Cernos Prime Dolne Ramię",
            "Cernos Prime Cięciwa","Cernos Prime Góre Ramię","Bronco Prime Schemat","Bronco Prime Lufa","Bronco Prime Korpus","Orthos Prime Schemat","Orthos Prime Ostrze",
            "Orthos Prime Rękojeść","Ninkondi Prime Schemat","Ninkondi Prime Łańcuch","Ninkondi Prime Rękojeść","Zakti Prime Schemat","Zakti Prime Lufa","Zakti Prime Korpus",
            "Helios Prime Schemat","Helios Prime Mózg","Helios Prime Karapaks","Helios Prime Systemy","Octavia Prime Schemat","Octavia Prime Neurooptyka",
            "Octavia Prime Powłoka","Octavia Prime Systemy","Paris Prime Schemat","Paris Prime Majdan","Paris Prime Dolne Ramię","Paris Prime Cięciwa",
            "Paris Prime Górne Ramię"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wynik = findViewById(R.id.wynik);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,ComponentNames);
        AutoCompleteTextView txv = findViewById(R.id.autoCompleteTextView2);
        txv.setAdapter(adapter);

    }



    public void search(View v) {

        AutoCompleteTextView ac = findViewById(R.id.autoCompleteTextView2);
        String searchTerm = ac.getText().toString();


        Warehouse warehouse = new Warehouse();
        Available available = new Available();

        List<String> filter = new ArrayList<>();
        List<String> nowAvailable = available.getAvailableList();



        /* Metoda pobiera komponent z magazynu i porównuje nazwę pozycji
        do szukanej frazy, jeśli znajdzie podobieństwo, pobiera z pozycji magazynowej
        listę reliktów z których przedmiot wypada i zapisuje ją do nowej listy
         */

        for (int i = 0; i < warehouse.componentList.size(); i++) {
            String s = warehouse.componentList.get(i).getName();
            if (s.equals(searchTerm))
                filter = (warehouse.componentList.get(i).getDropFrom());
            // Przy trafieniu, zapisuje do zmiennej globalnej String Rzadkość występowania danego komponentu
            rarity = warehouse.componentList.get(i).getRarity();
        }

        // Przerobienie List na obiekty Kolekcji
        Collection<String> listOne = filter;
        Collection<String> listTwo = nowAvailable;

        // Metoda zostawia w listTwo tylko obiekty które występują w listOne // odsiewa z wszystkich reliktów tylko te które obecnie są dostępne
        listTwo.retainAll(listOne);
        if(listTwo.size() != 0) {

            ((TextView)findViewById(R.id.wynik)).setText("Obecnie dostępne relikty: \n" + listTwo+ "\n\nSzukany komponent wypada z: \n" + filter + "\n\nRzadkość komponentu: " + rarity);
            /*
            System.out.println("Szukany komponent wypada z: " + filter + "\nObecnie dostępne relikty: " + listTwo + "\nRzadkość komponentu: " + rarity );
             */

        }else
            ((TextView)findViewById(R.id.wynik)).setText("Komponent obecnie nie do zdobycia lub brak go w bazie danych");

    }
}