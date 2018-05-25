package com.example.android.tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PlaceFragment extends android.support.v4.app.Fragment {

    Model model;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, null);

        model = new Model(getContext());
        ArrayList<Place> data;
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String key = bundle.getString(getContext().getResources().getString(R.string.key_name_navId));
            if (key == getContext().getResources().getString(R.string.place_type_restaurants)) {
                data = model.getRestaurants();
            } else if (key == getContext().getResources().getString(R.string.place_type_hotels)) {
                data = model.getHotels();
            } else {
                data = model.getPlaces();
            }
        } else {
            data = model.getRestaurants();
        }

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), data);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
