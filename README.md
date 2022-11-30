# Offizielles README

## Fake Lebenslauf

* 1950: Geburt
* 1960: Erschaffung der Programmiersprache C
* 1970: Erschaffung der ersten Objekt-Orientierung
* 1980: Realisierung das Objekt-Orientierung ein Fehler war
* 2000-2010: Schulbeginn
* 2010-2015: Abitur an der General National University, kurz GNU
* 2015-2017: Fortbildung für Fenster und Früchtebetriebssysteme bei der Firma Große Härte mit Birnen
* 2017-2022: Fragwürdige Lebenseintscheidungen
* 2022-    : Die Zukunft ist ungewiss


![Text](https://cdn.pixabay.com/photo/2014/05/27/23/32/matrix-356024_1280.jpg)

## Hinweise für die aktuelle Aufgabe

1. Maven ist verrutscht
	- Der Befehl wird funktioniert eigentlich, aber irgendwie wird das Paket de.hfu.de.hfu erstellt.
		+ Einfach alles von de.hfu.de.hfu nach de.hfu verschieben und dann müsste recht viel funktionieren
		+ Gleiches wie im vorherigen Schritt für die Test-Klassen machen
	- Manche Imports sind falsch und müssen angepasst werden
		+ Der Import in ResidentRepository.java ist falsch, er müsste eigentlich "import de.hfu.integration.domain.Resident;" heißen
		+ Der Import in ResidentService.java ist auch falsch -> "import de.hfu.integration.domain.Resident;"
		+ In der Datei BaseResidentService sind sogar zwei Imports falsch
			- Korrekter Import 1: import de.hfu.integration.repository.ResidentRepository;
			- Korrekter Import 2: import de.hfu.integration.domain.Resident;
2. Tests
	- Die Tests funktionieren weitestgehend, außer einer in der AppTest.java, dort spackt die Methode faillingTest, einfach ausklammer
	- Bei den Methoden um eine Assertion zu testen wird ein "Lambda-Ausdruck" verwendet, also ein anonymer Funktionsaufruf
		+ Ich hab immernoch nicht verstanden wie Lambda funktioniert, aber hey es tut.
	- Die Dateien im Package Util überschneiden sich eventuell mit Standardmethoden, ergo kann eventuell die Autocompletion und Fehlererkennung streicken bis die Methode vollstädnig ausgeschrieben wurde.