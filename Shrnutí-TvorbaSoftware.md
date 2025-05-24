Shrnutí: Tvorba software
------------------------------

Tento dokument poskytuje přehled hlavních témat a důležitých myšlenek z výňatků textu "Tvorba software". Text se zabývá procesem tvorby softwaru, s důrazem na jednotlivé fáze projektu, testování, profese a základní pojmy.

audio rozbor: [tvorbasoftware.notebooklm](https://notebooklm.google.com/notebook/da582efa-3fe9-4fd2-8339-bef62f4eacfc/audio)
### Hlavní témata a klíčové myšlenky:

1.  Fáze softwarového projektu: Text podrobně popisuje jednotlivé fáze životního cyklu softwaru. Je zde zdůrazněn sekvenční, ale iterativní přístup s důrazem na důkladnou přípravu v počátečních fázích.

-   Formulace slovního zadání: Počáteční fáze, kdy zákazník nebo zadavatel definuje, co má být vyřešeno. Důraz je kladen na "Jednoznačnost popisu" a "Přesný výčet funkcí, které má systém plnit". Požadavky musí být "Ověřitelnost požadavků zadání".
-   Analýza: V této fázi se "slovní zadání" převádí na "formalizované zadání". Klíčové otázky zahrnují "Jaká data potřebujeme?", "Jaké operace nad daty provádíme?" a "Které skupiny (typy) uživatelů budou se systémem interagovat?". Je důležité, že v této fázi se "NE bavíme o: softwarovém či hardwarovém způsobu řešení, algoritmech, způsobu ukládání dat,...". Výstupy by měly být srozumitelné i pro zákazníka.
-   Návrh: Tato fáze se zaměřuje na technické řešení problému. Výsledkem je "Návrh struktury tříd + algoritmus". Řeší se "Jak rozdělit jednotlivé části řešení mezi třídy a metody" a "Algoritmus (obecný postup) řešení jednotlivých dílčích úkolů". Složitost se liší podle typu úlohy, kde převažuje buď "Návrh struktury" (např. skladové systémy) nebo "Algoritmizace" (např. vědecké výpočty).
-   Implementace: Fáze, kdy se píše "Zdrojový kód", který "realizuje algoritmus". Hlavní profese je "kodér ~ programátor".
-   Nasazení: Instalace systému u zákazníka a "Zaškolíme obsluhu".
-   Údržba: Zahrnuje "aktualizace" a "úpravy" existujícího systému.
-   Vyřazení z provozu: Fáze, kdy systém "je vyřazen z provozu a dále se již nepoužívá".

1.  Testování je kontinuální proces: Text zdůrazňuje, že testování není samostatná fáze, ale "probíhá ve všech fázích počínaje analýzou". V počátečních fázích se testuje "soulad jednotlivých částí dokumentace a návaznosti", zatímco ve fázích implementace a údržby probíhá "klasické testování kódu". Testování zároveň zahrnuje "soulad s návrhovou dokumentací a požadavky analýzy".
2.  Profese v týmu pro tvorbu softwaru: Text identifikuje různé role, které se podílejí na tvorbě softwaru. Není nutné, aby každá role byla obsazena samostatnou osobou, a názvy rolí se mohou lišit. Důležité role zahrnují:

-   Informatik: "vědec", který se zabývá "algoritmy", jejich "převody", "vztahy mezi nimi" a "složitost algoritmů". Rozlišuje se "Základní výzkum" a "Aplikovaný výzkum".
-   Softwarový inženýr (vývojář) ~ analytik: Provádí "analýzu úlohy", "Komunikuje se zákazníkem" a "Řídí spolupráci v týmu".
-   programátor: "aplikuje obecné algoritmy na konkrétní úlohu" a "zapisuje v programovacím jazyce".
-   Tester: "Po celou dobu projektu ověřuje správnost vytvořených materiálů".
-   Projektový manažer: "Dohlíží na činnost týmu, kontroluje termíny", "Komunikuje se zákazníkem a předává požadavky týmu".
-   UX specialista: "Navrhuje uživatelské rozhraní projektu tak, aby bylo uživatelsky přívětivé".
-   Grafik: "Vytváří vizuální podobu produktu".
-   Kreativec: "Přináší nové pohledy na věc".

1.  Výhody počátečního návrhu na papíře/obrázku: Text doporučuje začínat složitými částmi a nezdržovat se detaily v počátečních fázích. Důvodem je, že "Složité věci řešíme první!" a "Vymyslet strukturu tříd je složité". Psaní kódu nebo klikání v modelovacích nástrojích na začátku "je triviální a zdržuje".
2.  Klíčové pojmy: Text definuje několik základních pojmů:

-   CASE (Computer-Aided Software Engineering): "Programy pro podporu návrhu software".
-   Metodika: Popisuje "jaké pracovníky využít, jaké činnosti vykonat, jaké nástroje použít, jaké produkty vyrobit".
-   Softwarové inženýrství: "Vědecká disciplína, zabývá se metodikou a postupy efektivní práce a spolupráce v týmu při tvorbě SW". Zahrnuje i "návrh grafického rozhraní".


