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

        recipes1.add(new Recipes("Gogosi", "900 g f??in?? alb??, " +
                "2 oua, " +
                "15 g sare, " +
                "400 ml lapte, " +
                "100 g unt 82% gr??sime, " +
                "40 g drojdie proasp??t??, " +
                "5 g zah??r, " +
                "200 g ciocolat?? alb??, rupt?? ??n buc????ele, " +
                "200 g de ciocolata neagra, 200 g ciocolata cu lapte, 200 g ciocolata alba, 100 g ornamente colorate din zah??r", "Mod de preparare", "1. Pune ??ntr-un bol f??ina, sarea ??i ou??le b??tute. Amestec?? separat laptele c??ldu??, untul topit, drojdia ??i zah??rul, apoi toarn?? totul ??n bolul cu f??in??. Mai departe, amestec?? bine p??n?? c??nd ob??ii un aluat omogen ??i las?? aluatul la crescut timp de 1 or??, la temperatura camerei. 2. Pe un blat uns cu pu??in ulei, ??ntinde aluatul ??ntr-o foaie mare, cam de 2 cm grosime. Decupeaz?? gogo??ile folosind 2 cercuri pentru aluat (sau 2 pahare) ??i las??-le pe blat, s?? mai creasc?? ??nc?? 30 de minute. 3. Dup?? ce-au crescut, pr??je??te gogo??ile ??n ulei p??n?? c??nd se rumenesc. Scoate-le ??ntr-o farfurie acoperit?? cu c??teva ??erve??ele, ca s?? absoarb?? excesul de ulei. 4. ??n timp ce gogo??ile se r??cesc, pune la topit ciocolata la bain marie. Tope??te pe r??nd sau fiecare tip de ciocolat?? separat. 5. Ciocolata alb?? topit?? ??mparte-o ??n dou??. Jum??tate amestec??-o cu zmeura liofilizat?? zdrobit??. Astfel ob??ii culoarea roze. 6. Scufund?? fiecare gogo??ic?? ??n ciocolat??, apoi orneaz-o dup?? preferin??e.", R.drawable.ggs));

        recipes1.add(new Recipes("Gutui umpute", "4 gutui, nuci, migdale, scortisoara, " +
                "8 lingurite de miere, " +
                "15 g sare, " +
                "4 crengu??e de cimbru proasp??t, " +
                "2 linguri cu unt topit. " , "Mod de preparare", "Rumene??te nucile cur????ate ??ntr-o tigaie, f??r?? ulei. C??nd ??ncep s??-??i degaje aromele, ia de pe foc. M??run??e??te-le u??or, amestec??-le cu mierea ??i untul c??ldu??. Spal?? gutuile foarte bine. Taie-le ??n jum??t????i, pe lungime, ??i scoate-le cotorul. A??az??-le ??ntr-o tav??, umplele cu amestecul de nuci, miere ??i unt, pune ??n fiecare gutuie c??te o crengu???? de cimbru t??iat??. Acoper?? cu o folie ??i d?? la cuptorul ??ncins, la 180 de grade. Dup?? 30- 40 de minute ??ndep??rteaz?? folia (sau capacul) ??i mai las??-le ??n cuptor p??n?? gutuile devin rumene. Serve??tele simple, dac?? poste??ti, sau cu fri??c?? proasp??t b??tut?? ori ??nghe??at?? de vanilie.", R.drawable.gtu));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        myrecyclerView.setAdapter(myAdapter);

    }
}