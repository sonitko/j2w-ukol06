# Úkol 6 – Citáty 2.0

Dnes vytvoříme stránku pro zobrazování citátů, ve verzi 2.0. „Business logika“, tedy podstata toho, co apliakce dělá, už nebude přímo v controlleru, ale bude ve
službách (*service*). Služby budou rovnou tři – pro takhle jednoduchou stránku je to sice jako jít s kanonem na vrabce, ale je to jen protentokrát z cvičných důvodů.

Controller bude přímo používat službu `CitatyService`. V té bude jedna metoda (v případě bonusového úkolu dvě metody). Metoda `nahodnyCitat()` bude vracet
String – text náhodného citátu. V kódu této metody se použijí dvě následující služby.

Služba `CitatyService` bude používat služby `NahodneCisloService` a `CitatyRepository`. `NahodneCisloService` bude mít jendu metodu – `dejNahodneCislo(int horniMez)`,
která dostane jako parametr číslo, a bude vracet náhodné číslo (typu `int`) mezi 0 (včetně) a parametrem `horniMez` (mimo).

Poslední služba se bude jmenovat `CitatyRepository`. Je to speciální typ služby, která slouží pro načítáí (případně ukládání) dat – proto se jmenuje *repository*.
Ve Springu má repository dokonce speciální anotaci, tentokrát ale službu *oanotuj* už známou anotací `@Service`. Tato služba bude mít dvě metody. Metoda `pocet()`
bude vracet číslo (`int`) – počet citátů v naší „databázi“. Metoda `citat(int poradi)` bude vracet text citátu se zadaným pořadovým číslem.

Pravděpodobně se ti budou při řešení úkolu hodit anotace `@Service` (umisťuje se nad třídu) a `@Autowired` (my ji umisťujeme nad konstruktor).

1. Udělej fork zdrojového repository do svého účtu na GitHubu, případně pokračuj ve svém úkolu z předchozí lekce.
1. Naklonuj si repository **ze svého účtu** na GitHubu na lokální počítač.
1. Spusť si naklonovanou aplikaci a otevři v prohlížeči stránku [http://localhost:8080/](http://localhost:8080/).
1. Stránka zobrazuje náhodně zvolené citáty. Takže máš hotovo? 😁 Bohužel ne… Teď je potřeba kód v Javě upravit tak, aby výkonný kód byl ve službách popsaných
   výše a v controlleru se jen volala služba `CitatyService.nahodnyCitat()`, která vrátí – ano, náhodný citát. Veškerý výkonný kód je ale už v projektu napsaný.
   (Postup, kdy neměníme funkčnost programu, nýbrž jenom upravujeme už funkční kód, se používá tak často, že pro to existuje termín – *refaktoring*).
1. **Bonus:** Můžeš přidat druhou metodu controlleru, která bude zobrazovat konkrétní citát zadaný číslem v URL. Tj. na adrese `/1` se zobraí 1. citát,
   na adrese `/2` druhý citát atd. Nemusíš řešit, co se stane, když uživatel zadá číslo mimo počet citátů v aplikaci. Ve službě`CitatyService` pro to vytvoř
   druhou metodu, `konkretniCitat(int cislo)`, která bude vracet `String` s citátem s daným pořadovým číslem.
1. Zkontroluj, zda vše funguje.
1. *Commitni* a *pushnni* změny (výsledný kód) do svého repository na GitHubu.
1. Vlož odkaz na své repository do tabulky s úkoly na Google Drive.

## Odkazy

* odkaz na stránku [Lekce 7](https://java.czechitas.cz/2021-jaro/java-2/lekce-7.html)
* Java SE 11 [Javadoc](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/) – dokumentace všech tříd, které jsou součástí základní Javy ve verzi 11.
* Dokumentace [Spring Boot](https://spring.io/projects/spring-boot#learn) – odsud je anotace `@SpringBootApplication` a třída `SpringApplication`.
* Dokumentace [Spring Framework](https://spring.io/projects/spring-framework#learn) – odsud jsou anotace `@Controller`, `@GetRequest` a třída `ModelAndView`.
* Dokumentace [Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html) – šablonovací systém pro HTML použitý v projektu.
* [Unsplash](https://unsplash.com) – obrázky a fotografie k použití zdarma
