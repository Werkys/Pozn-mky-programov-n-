Zde je zápis z poskytnutých stránek o konceptech Javy, včetně dědičnosti, rozhraní, abstraktních tříd a přetypování [1].


audio rozbor: [dedicnostarozhrani.notebooklm](https://notebooklm.google.com/notebook/cca046a5-3872-40e6-868e-5dd75ad3eaf6/audio)


### Dědičnost
**Dědičnost** umožňuje, aby třída přebírala vlastnosti a metody jiné třídy [1].
*   Používá se klíčové slovo **`extends`** [1].
*   Třída může mít **pouze jednu rodičovskou třídu** (předka) [1].
*   Potomek (podtřída) **dědí všechny vlastnosti předka** [1].
*   Instance potomka může kdykoli nahradit instanci předka; například, pokud máte proměnnou datového typu `Predek`, můžete do ní uložit instanci třídy `Potomek` [1]. Opačně to však není možné [1].

**Překrývání metod (Method Overriding)**
*   Potomek automaticky dědí všechny metody předka [2].
*   Potomek může metodu předka **nadefinovat znovu**, čímž *překryje* (override) původní chování metody předka [2].
    *   Například, třída `Moucha`, která rozšiřuje `Zivocich`, může překrýt metodu `hybejSe()`, aby se moucha pouze otáčela na místě, zatímco ostatní živočichové se pohybují doprava [2]. K označení této skutečnosti se používá anotace `@Override` [2].

**Odkaz na kód předka (`super`)**
*   Klíčové slovo **`super`** se používá pro odkazování na členy rodičovské třídy [3].
*   Můžete odkazovat:
    *   Na **konstruktor rodičovské třídy** [3]. Příkladem je `MyWorld`, který volá `super(600, 400, 1)` pro inicializaci svého předka `World` [3].
    *   Na **překrytou metodu předka** [3]. Například `KamionSPrivesem` může volat `super.getNosnost()` k získání nosnosti kamionu před přičtením nosnosti přívěsu [3].

### Rozhraní (Interfaces)
**Rozhraní** definují kontrakt pro třídy, specifikující metody, které musí implementující třídy poskytnout [4].
*   Používá se klíčové slovo **`implements`** [4].
*   Rozhraní může obsahovat **pouze hlavičky metod** (deklarace bez implementace) a **veřejné konstantní atributy** [4].
*   Implementací rozhraní třída **garantuje, že má určité metody** [4].
*   Rozhraní jsou užitečná například pro zajištění, aby objekty různých tříd mohly být uniformně umístěny do kontejneru [4].
*   Z rozhraní **nelze převzít hotový kód**; pouze předepisuje, *jaké* metody má třída mít, nikoli *jak* se chovají [4, 5].
*   **Nelze vytvořit instanci rozhraní** (např. `new Rozhrani()`) [5].
*   Třída může **implementovat libovolný počet rozhraní** [5].
*   Rozhraní jsou přínosná, když každá třída má na společnou zprávu reagovat jinak [5].
    *   Příkladem je rozhraní `Zasahnutelne`, které deklaruje metodu `zasah(Strela s)`, zajišťující, že každá třída, která ho implementuje (např. `Prisera`), bude mít tuto metodu a definuje, jak reaguje na zásah [4].

### Abstraktní třída (Abstract Classes)
**Abstraktní třídy** slouží jako mezistupeň mezi běžnými třídami a rozhraními, umožňují částečnou implementaci [5].
*   Používá se klíčové slovo **`abstract`** [6].
*   **Nelze vytvořit instance abstraktní třídy** [5, 6].
*   Abstraktní třídu lze použít jako **společného předka** pro další třídy, které již abstraktní být nemusí [6].

**Abstraktní metody**
*   Abstraktní třída může mít **abstraktní metody** [6].
*   U abstraktních metod **není uveden žádný kód**, pouze fakt, že metoda ve třídě musí existovat [6].
*   Pokud potomci nejsou abstraktní, **musí ke každé abstraktní metodě uvést konkrétní kód** [6].
    *   Například, abstraktní třída `Predmet` může mít abstraktní metodu `void pouzij()`. Neabstraktní třída `Mic`, která rozšiřuje `Predmet`, musí pak poskytnout konkrétní kód pro metodu `pouzij()` [6].

### Srovnání konceptů
Zdroje poskytují jasné rozlišení mezi dědičností, rozhraními a abstraktními třídami [5]:
*   **Dědičnost:** Používá se, když potomek **přebírá *všechny* vlastnosti předka** (a případně přidává něco dalšího) [5]. Třída může mít **jen jednoho předka** [5].
*   **Rozhraní:** Pouze **předepisuje, jaké metody má třída mít** [5]. **Nelze z něj převzít hotový kód** a **nelze vytvářet instance** rozhraní [5]. Třída může **implementovat libovolný počet rozhraní** [5]. Je užitečné, když každá třída má na společnou zprávu reagovat jinak [5].
*   **Abstraktní třída:** Je jakýmsi **mezistupněm**, kdy **přebíráme kód jen některých metod** [5]. **Nelze vytvářet instance** abstraktní třídy [5].

### Přetypování (Casting)
**Přetypování** umožňuje zacházet s objektem jednoho typu jako s jiným, zejména při práci s dědičností [7].
*   Potomek může vždy zastoupit předka; instance potomka může být uložena do proměnné datového typu předka [7].
*   Jsou však situace, kdy potřebujete k takto uloženému potomkovi znovu přistupovat jako k potomkovi, včetně všech jeho specifických metod a atributů [7]. V takovém případě **musíte použít přetypování** [7].
*   Přetypování se zapíše tak, že se název požadované třídy uzavře do závorky před výrazem, který vrací objekt [7].
    *   Příklady zahrnují přetypování objektu získaného z detekce kolize na konkrétní typ `Prekazka`, nebo přetypování zdroje události `ActionEvent` na typ `Button` v GUI aplikaci [8].
*   **Důležité upozornění:** Musíte si být **stoprocentně jisti**, že objekt uložený v proměnné datového typu `Predek` je skutečně datového typu `Potomek` [8]. Pokud tomu tak není, běh programu by skončil výjimkou a aplikace by havarovala [8].