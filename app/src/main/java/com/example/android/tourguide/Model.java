package com.example.android.tourguide;


import android.content.Context;

import java.util.ArrayList;

public class Model {

    private ArrayList<Place> restaurants;
    private ArrayList<Place> hotels;
    private ArrayList<Place> places;
    private ArrayList<Place> shops;

    public Model(Context context) {
        restaurants = new ArrayList<>();
        hotels = new ArrayList<>();
        places = new ArrayList<>();
        shops = new ArrayList<>();
        restaurants.add(new Restaurant(R.drawable.don_papa, context.getResources().getString(R.string.restaurant_name_don_papa), context.getString(R.string.restaurant_address_don_papa), 49.223138, 16.514083, context.getString(R.string.restaurant_phone_don_papa), context.getString(R.string.restaurant_web_don_papa)));
        restaurants.add(new Restaurant(R.drawable.akat, context.getString(R.string.restaurant_name_akat), context.getString(R.string.restaurant_address_akat), 49.221185, 16.5178, context.getString(R.string.restaurant_phone_akat), context.getString(R.string.restaurant_web_akat)));
        restaurants.add(new Restaurant(R.drawable.la_corrida, context.getString(R.string.restaurant_name_la_corrida), context.getString(R.string.restaurant_address_corrida), 49.225636, 16.530275, context.getString(R.string.restaurant_phone_corrida), context.getString(R.string.restaurant_web_corrida)));
        hotels.add(new Hotel(R.drawable.hotel_prosperita, context.getString(R.string.hotel_name_prosperita), context.getString(R.string.hotel_address_prosperita), 49.248398, 16.487836, context.getString(R.string.hotel_phone_prosperita), context.getString(R.string.hotel_web_prosperita), 3));
        hotels.add(new Hotel(R.drawable.hotel_rakovec, context.getString(R.string.hotel_name_rakovec), context.getString(R.string.hotel_address_rakovec), 49.231274, 16.508829, context.getString(R.string.hotel_phone_rakovec), context.getString(R.string.hotel_web_rakovec), 3));
        hotels.add(new Hotel(R.drawable.maximus_resort, context.getString(R.string.hotel_name_maximus_resort), context.getString(R.string.hotel_address_maximus_resort), 49.243575, 16.515841, context.getString(R.string.hotel_phone_maximus_resort), context.getString(R.string.hotel_web_maximus_resort), 4));
        places.add(new Place(context.getString(R.string.place_text_zeleznice), R.drawable.zahradni_zeleznice, context.getString(R.string.place_name_zahradni_zeleznice), context.getString(R.string.place_adress_zahradni_zeleznice), 49.224881, 16.505657, context.getString(R.string.place_web_zahradni_zeleznice)));
        places.add(new Place(context.getString(R.string.place_text_dvojty_most), R.drawable.dvoupatrovy_most, context.getString(R.string.place_name_dvoupatrovy_most), context.getString(R.string.place_adress_dvoupatrovy_most), 49.212962, 16.521852));
        places.add(new Place(context.getString(R.string.place_text_veveri), R.drawable.hrad_veveri, context.getString(R.string.place_name_veveri), context.getString(R.string.place_adress_veveri), 49.256951, 16.461728, context.getString(R.string.place_web_veveri)));
        places.add(new Place(context.getString(R.string.place_text_pilir), R.drawable.pilir_hitlerova_dalnice, context.getString(R.string.place_name_pilir), context.getString(R.string.place_adress_pilir), 49.233457, 16.521488));
        places.add(new Place(context.getString(R.string.place_text_prehrada), R.drawable.prehrada, context.getString(R.string.place_name_prehrada), context.getString(R.string.place_adress_prehrada), 49.244702, 16.509320, context.getString(R.string.place_web_prehrada)));
        places.add(new Place(context.getString(R.string.place_text_hraz), R.drawable.prehrada_hraz, context.getString(R.string.place_name_hraz), context.getString(R.string.place_adress_hraz), 49.232551, 16.519160));
        places.add(new Place(context.getString(R.string.place_text_zoo), R.drawable.zoo_brno, context.getString(R.string.place_name_zoo), context.getString(R.string.place_adress_zoo), 49.230354, 16.533397, context.getString(R.string.place_web_zoo)));
        shops.add(new Shop(R.drawable.vebafood, context.getString(R.string.shop_name_vebafood), context.getString(R.string.shop_address_vebafood), 49.221386, 16.515810, context.getString(R.string.shop_web_vebafood)));
        shops.add(new Shop(R.drawable.sklizeno, context.getString(R.string.shop_name_sklizeno), context.getString(R.string.shop_address_sklizeno), 49.218003, 16.498086, context.getString(R.string.shop_web_sklizeno)));

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

    public ArrayList<Place> getShops() {
        return shops;
    }
}
