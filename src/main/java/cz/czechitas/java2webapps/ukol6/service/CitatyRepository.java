package cz.czechitas.java2webapps.ukol6.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CitatyRepository {

    private final List<String> seznamCitatu;

    public CitatyRepository() {
        this.seznamCitatu = List.of(
                "Jan Werich: Smích a pláč jsou nejcennější majetek živého člověka.",
                "Jan Werich: Ono je lepší mluvit s chytrým člověkem o něčem hloupém, než s hlupákem o něčem chytrém.",
                "Jan Werich: Jestliže neumíš, naučíme tě, jestliže nemůžeš, pomůžeme ti, jestliže nechceš, nepotřebujeme tě.",
                "Jan Werich: Čas si vymysleli lidé, aby věděli, od kdy do kdy a co za to.",
                "John Lennon: Nebojím se smrti, protože v ni nevěřím. Je to jen přestup z jednoho auta do druhého. ",
                "John Lennon: Čas, jehož marnění sis užil, není ztracený.",
                "John Lennon: Na konci vždy vše dobře dopadne. A jestli to dobře nedopadlo, tak to potom ještě není konec. ",
                "Albert Einstein: Nevím, čím se bude bojovat ve třetí světové válce, ale ve čtvrté to budou klacky a kameny.",
                "Albert Einstein: Nechtěj být člověkem, který je úspěšný, ale člověkem, který za něco stojí.",
                "Albert Einstein: Představivost je důležitější než vědomosti.",
                "Albert Einstein: Existují tisíce způsobů, jak zabít čas, ale žádný, jak ho vzkřísit.",
                "Seneca: Pláč uleví ve strastech.",
                "Seneca: Smrt je někdy trestem, často darem, pro mnohé dobrodiním.",
                "Seneca: Čas léčí rány, které nemůže vyléčit rozum.",
                "William Shakespeare: Ďábel i Bibli cituje, když mu to přijde vhod.",
                "William Shakespeare: Šťasten být neumíš, protože po tom, co nemáš, se ženeš, a co máš, na to zapomínáš.",
                "William Shakespeare: Hluboký pád přivodí často největší štěstí.",
                "William Shakespeare: Rány, které si člověk způsobí sám, se léčí těžko."
        );
    }

    //vraci pocet citatu v nasi „databazi“
    public int pocet() {
        return seznamCitatu.size();
    }

    //vraci text citatu se zadanym poradovym cislem.
    public String citat(int poradi) {
        return seznamCitatu.get(poradi);
    }
}
