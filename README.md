## Zadanie od zákazníka
Naša univerzita by potrebovala systém, v ktorom študenti môžu klásť otázky profesorom k predmetom na verejne dostupnom fóre. Odpovedať na otázky môžu ako profesori, tak aj samotní študenti medzi sebou. V otázkach a odpovediach by mohol systém vedieť automaticky vyhľadávať, aby sa študenti nemuseli pýtať stále na to isté. Prístup študentov môže byť anonymný. Diskusia by mala byť členená po predmetoch. V odpovedi sa môže vyskytnúť odkaz alebo príloha.

## Zber požiadaviek
- **RQ01**  Systém umožní zapísať otázku.
- **RQ02**  Systém vie k položenej otázke zaevidovať jednu alebo viac odpovedí.
- **RQ03**  Systém viaže otázky a odpovede vždy k práve jednému predmetu.
- **RQ04**  Systém umožní notifikovať používateľov priradených k predmetu (vyučujúci), ktorí sú zodpovední za zodpovedanie otázky.
- **RQ05**  Systém umožní k otázke alebo k odpovedi pripojiť prílohu.
- **RQ06**  Systém umožní notifikovať používateľa, ktorý otázku položil (študent).
- **RQ07**  Systém umožní full-textovo vyhľadávať v otázkach aj odpovediach.
- **RQ08**  Systém umožní administrátorovi vytvárať predmety a priraďovať k nim vyučujúcich.
- **RQ09**  Systém umožní zostavovať najčastejšie kladené otázky (FAQ) aj s ich odpoveďami na základe hlasovania o ich prospešnosti ("like").
- **RQ10**  Systém umožní ku každej odpovedi pridať ešte ďalšiu otázku (na vyjasnenie).
- **RQ11**  Systém umožní zaevidovať ku každej otázke viac odpovedí a následne ku každej odpovedi ďalšie reakcie.
- **RQ12**  Systém automaticky zruší konto, ktoré nepoložilo otázku nejaký čas (napr. rok).
- **RQ13**  Systém umožní vyučujúcemu označiť dobrú a výstižnú študentovu odpoveď.
- **RQ14**  Systém zabezpečí navýšenie bodov v kreditnom systéme za dobrú a výstižnú odpoveď.
- **RQ15**  Systém umožní poslať otázku aj mailom.
- **RQ16**  Systém umožní vyučujúcemu označiť nesprávnu odpoveď študenta.

## Slovník pojmov
| **Pojem** | **Anglický názov** | **Definícia** |
|-----------|----------------|-------------|
| **Predmet** | Course | Vymedzená oblasť, ktorej sa bude týkať diskusia. Zodpovedá predmetu výučby. |
| **Vyučujúci** | Teacher | Expert v oblasti daného predmetu. Jeden predmet môže mať viacerých vyučujúcich a jeden vyučujúci môže vyučovať viacero predmetov. |
| **Študent** | Student | Človek získavajúci znalosti z jedného alebo viacerých predmetov. |
| **Diskusný príspevok** | Message | Text zadaný vyučujúcim alebo študentom, ktorý sa vzťahuje k práve jednému vybranému predmetu. |
| **Otázka** | Question | Diskusný príspevok, ktorý zadáva študent. Prospešnosť otázky je hodnota, ktorá sa určuje na základe hlasovania. Jeden predmet môže obsahovať viac otázok. |
| **Odpoveď** | Answer | Diskusný príspevok, v ktorom študent alebo vyučujúci reaguje na otázku - t.j. odpovede sa vždy viažu ku konkrétnej otázke. Jedna otázka môže mať viac odpovedí. |
| **Reakcia** | Reply | Diskusný príspevok, v ktorom študent alebo vyučujúci reaguje na odpoveď, alebo na inú reakciu. Každá odpoveď alebo reakcia môže mať viac reakcií. |
| **Konto** | Account | Identita používateľa v systéme. Umožňuje jeho e-mailovú autentifikáciu. |
| **Kredity** | Credit | Spôsob odmeny študenta za aktivitu vyučujúcim. |
