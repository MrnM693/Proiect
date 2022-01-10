package com.example.proiect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Paste","250 g penne, " +
                "250 g smantana, " +
                "70 g parmezan ras, " +
                "70 g mozzarella rasa, " +
                "70 g gorgonzola, " +
                "1 lingura ulei de masline, " +
                "1 lingurita unt, " +
                "oregano, " +
                "sare si piper. ", "Mod de preparare", "Intr-o oala incapatoare pune pennele la fiert conform instructiunilor de pe ambalaj, adica aproximativ 8 minute sau pana cand devin al dente. Separat, pregateste sosul. Topeste intr-o tigaie untul si adauga smantana, sare si piper dupa gust. Taie branzeturile marunt daca nu sunt deja rase si atunci cand smantana incepe sa fiarba pune-le in tigaie, peste restul compozitiei. Amesteca totul timp de 5 minute sau pana cand toate ingredientele s-au topit si omogenizat perfect. In final, mai lasa 2-3 minute sosul sa se ingroase la foc mic. Cu ajutorul a doua spatule adauga pennele si amesteca bine. Asadar, in mai putin de 30 de minute poti gati un preparat gustos si potrivit mai ales pentru persoanele carora le plac produsele lactate.",R.drawable.pst));

        recipes1.add(new Recipes("Pizza", "350 g faina, " +
                "7g drojdie uscata, " +
                "240 ml apa calduta, " +
                "2 lingurite zahar, " +
                "2 lingurite ulei de masline, " +
                "o lingura sare. ", "Mod de preparare", "Incepe prin a pregati blatul de pizza, urmand pasii de mai sus. In timp ce aluatul se dospeste, poti pregati sosul de rosii. Pune uleiul de masline intr-o oala, adauga usturoiul si amesteca la foc mediu, pentru doua minute. Adauga pulpa de rosii, amesteca si adauga apoi busuiocul si un praf de sare. Lasa sosul sa fiarba pentru aproximativ 15 minute sau pana se ingroasa putin. Intinde aluatul de pizza cu sucitorul si pune-l intr-o tava. Adauga sosul de rosii, avand grija sa lasi marginile goale. Pune apoi feliile de mozzarella, cateva frunze de busuioc proaspat, rosiile taiate felii si stropeste cu putin ulei de masline. Introdu pizza in cuptorul preincalzit la 240 de grade Celsius, pentru aproximativ 15 minute.", R.drawable.pzz));

        recipes1.add(new Recipes("Clatite", "400 ml iaurt, " +
                "2 cani faina, " +
                "2-3 linguri cacao, " +
                "o lingurita praf de copt, " +
                "3 oua, " +
                "3-4 linguri zahar, " +
                "zahar vanilat, " +
                "un varf cutit sare, " +
                "ulei de floarea soarelui.", "Mod de preparare", "Se amesteca la mixer zaharul, zaharul vanilat si ouale. Se adauga apoi iaurtul, faina, sarea, praful de copt si cacao. Compozitia obtinuta trebuie pastrata la rece timp de 30 de minute. Intre timp se mixeaza frisca cu smantana si cu zaharul. Se fac apoi clatitele, intr-o tigaie unsa cu unt. Cand s-au racit, se pot umple cu frisca.", R.drawable.clt));

        recipes1.add(new Recipes("Gogosi", "900 g făină albă, " +
                "2 oua, " +
                "15 g sare, " +
                "400 ml lapte, " +
                "100 g unt 82% grăsime, " +
                "40 g drojdie proaspătă, " +
                "5 g zahăr, " +
                "200 g ciocolată albă, ruptă în bucățele, " +
                "200 g de ciocolata neagra, 200 g ciocolata cu lapte, 200 g ciocolata alba, 100 g ornamente colorate din zahăr", "Mod de preparare", "1. Pune într-un bol făina, sarea și ouăle bătute. Amestecă separat laptele călduț, untul topit, drojdia și zahărul, apoi toarnă totul în bolul cu făină. Mai departe, amestecă bine până când obții un aluat omogen și lasă aluatul la crescut timp de 1 oră, la temperatura camerei. 2. Pe un blat uns cu puțin ulei, întinde aluatul într-o foaie mare, cam de 2 cm grosime. Decupează gogoșile folosind 2 cercuri pentru aluat (sau 2 pahare) și lasă-le pe blat, să mai crească încă 30 de minute. 3. După ce-au crescut, prăjește gogoșile în ulei până când se rumenesc. Scoate-le într-o farfurie acoperită cu câteva șervețele, ca să absoarbă excesul de ulei. 4. În timp ce gogoșile se răcesc, pune la topit ciocolata la bain marie. Topește pe rând sau fiecare tip de ciocolată separat. 5. Ciocolata albă topită împarte-o în două. Jumătate amestecă-o cu zmeura liofilizată zdrobită. Astfel obții culoarea roze. 6. Scufundă fiecare gogoșică în ciocolată, apoi orneaz-o după preferințe.", R.drawable.ggs));

        recipes1.add(new Recipes("Gutui umpute", "4 gutui, nuci, migdale, scortisoara, " +
                "8 lingurite de miere, " +
                "15 g sare, " +
                "4 crenguțe de cimbru proaspăt, " +
                "2 linguri cu unt topit. " , "Mod de preparare", "Rumenește nucile curățate într-o tigaie, fără ulei. Când încep să-și degaje aromele, ia de pe foc. Mărunțește-le ușor, amestecă-le cu mierea și untul călduț. Spală gutuile foarte bine. Taie-le în jumătăți, pe lungime, și scoate-le cotorul. Așază-le într-o tavă, umplele cu amestecul de nuci, miere și unt, pune în fiecare gutuie câte o crenguță de cimbru tăiată. Acoperă cu o folie și dă la cuptorul încins, la 180 de grade. După 30- 40 de minute îndepărtează folia (sau capacul) și mai lasă-le în cuptor până gutuile devin rumene. Serveștele simple, dacă postești, sau cu frișcă proaspăt bătută ori înghețată de vanilie.", R.drawable.gtu));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        myrecyclerView.setAdapter(myAdapter);

    }
}