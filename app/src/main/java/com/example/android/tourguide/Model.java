package com.example.android.tourguide;

import java.util.ArrayList;

public class Model {

    private ArrayList<Place> restaurants;
    private ArrayList<Place> hotels;
    private ArrayList<Place> places;

    public Model() {
        restaurants = new ArrayList<>();
        hotels = new ArrayList<>();
        places = new ArrayList<>();
        restaurants.add(new Restaurant(R.drawable.don_papa, "Don Papa", "Nad Přehradou 9", 49.223138, 16.514083, "+420 736 638 380", "www.restaurantdonpapa.cz"));
        restaurants.add(new Restaurant(R.drawable.akat, "Akát", "Kubíčkova 8", 49.221185, 16.5178, "+420 539 010 723", "www.restauraceakat.cz"));
        restaurants.add(new Restaurant(R.drawable.la_corrida, "La Corrida", "nám. 28. dubna 1069/2", 49.225636, 16.530275, "+420 515 549 873", "www.lacorrida.cz"));
        hotels.add(new Hotel(R.drawable.hotel_prosperita, "Hotel Prosperita", "Rakovecká 265", 49.248398, 16.487836, "+420 546 221 266", "www.hotel-prosperita.cz", 3));
        hotels.add(new Hotel(R.drawable.hotel_rakovec, "Hotel Rakovec", "Rakovecká 1335/13", 49.231274, 16.508829, "+420 515 908 624", "www.hotelrakovec.cz", 3));
        hotels.add(new Hotel(R.drawable.maximus_resort, "Hotel Maximus Resort", "Hrázní 327/4a", 49.243575, 16.515841, "+420 546 221 035", "www.maximus-resort.cz", 4));
        places.add(new Place("Zahradní železnice je modelovým skanzenem úzkokolejných železnic. Po kolejích zahradní železnice jezdí modely ČSD, ČD, DR, DB, Máv, Boržavské dráhy, FOD, OBB, JHMD, KuKBB, RhB, FO a WSB.", R.drawable.zahradni_zeleznice, "Zahradní železnice", "Ruda 140", 49.224881, 16.505657, "www.zahradni-zeleznice.eu"));
        places.add(new Place("V původním tělese dálnice z polské Vratislavi do Vídně stavěné za nacistické okupace v roce 1942 je klenutý kamenný most čtyřmetrové světlosti a šestimetrové výšky nad vozovkou, procházející pod mostem. Zvláštností tohoto dálničního mostu je skutečnost, že pod jeho mostovkou protéká ve dvou rourách metrového průměru místní potok Vrbovec, tekoucí ze Žebětína podél okraje Bystrce a ústící do Svratky.", R.drawable.dvoupatrovy_most, "Dvoupatrový most", "Údolí oddechu", 49.212962, 16.521852));
        places.add(new Place("Hrad Veveří je se svými deseti věžemi jedním z nejrozsáhlejších a nestarších hradních areálů v České republice. Tyčí se nad Brněnskou přehradou na severu městské části Bystrc.", R.drawable.hrad_veveri, "Hrad Veveří", " Veverská Bítýška", 49.256951, 16.461728, "www.hrad-veveri.cz"));
        places.add(new Place("Nejznámější a \"nejvelkolepější\" nedokončenou silnicí v Česku je takzvaná Hitlerova dálnice, jejíž trasu lze dobře sledovat severně od Brna v krajině Boskovické brázdy neboli Malé Hané. Patrně nejvýraznějším pohrobkem nedokončeného dálničního díla je pozoruhodný betonový pilíř, který ční ze svahu v bezprostřední blízkosti hráze Brněnské přehrady.", R.drawable.pilir_hitlerova_dalnice, "Pilíř mostu", "Šikulova", 49.233457, 16.521488));
        places.add(new Place("Brněnská přehrada, dříve též Kníničská přehrada, je vodní dílo na Svratce. Vznikla vystavěním hráze na 56. říčním kilometru Svratky a zatopením údolí s obcí Kníničky. Přehrada dříve sloužila jako zásobárna vody pro Brno (nyní se využívá vody z Vírské přehrady a vody z vrtů v Březové), k rekreaci a také jako zdroj elektrické energie.", R.drawable.prehrada, "Brněnská přehrada", "Vodní Nádrž Brno", 49.244702, 16.509320, "www.brnenskaprehrada.cz"));
        places.add(new Place("Betonová gravitační hráz je vysoká 23,5 m, v koruně dlouhá 234 m, široká 7 m a byla zde postavena v letech 1936-40. Hladina nádrže dosahuje maximální šířky 700 m, délky 9,3 km a zadržuje 21 mil. m³ vody. Zatopila široké meandrujíc údolí Svratky a obec Kníničky. V hrázi přehrady je umístěna Kaplanova turbína o výkonu 2,88 MW a maximální odtok může být až 400 m³ za vteřinu.", R.drawable.prehrada_hraz, "Hráz Brněnské přehrady", "Hrázní", 49.232551, 16.519160));
        places.add(new Place("Zoo Brno se nachází v blízkosti Brněnské přehrady na Mniší hoře na ploše 65 ha. Návštěvníci zde mohou vidět téměř 800 zvířat v 210 druzích.Mezi největší chovatelské úspěchy zoo patří první odchov mláděte medvěda ledního v Československu v roce 1976 nebo obdobně první odchov šimpanze v roce 1967.", R.drawable.zoo_brno, "Zoo Brno", "U Zoologické zahrady 46", 49.230354, 16.533397, "www.zoobrno.cz"));
    }
    public ArrayList<Place> getRestaurants() {
        return restaurants;
    }

    public ArrayList<Place> getHotels() {
        return hotels;
    }

    public ArrayList<Place> getPlaces() {
        return places;
    }
}
