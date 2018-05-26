package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.res.ResourcesCompat;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;

public class PlaceAdapter extends ArrayAdapter<Place> {
    public PlaceAdapter(@NonNull Context context, @NonNull List<Place> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_place, parent, false);
        }
        Place currentPlace = getItem(position);

        setPlaceImage(currentPlace, listItemView);
        setPlaceName(currentPlace, listItemView);
        setPlaceStars(currentPlace, listItemView);
        setPlaceAddress(currentPlace, listItemView);
        setPlacePhone(currentPlace, listItemView);
        setPlaceWeb(currentPlace, listItemView);
        setPlaceText(currentPlace, listItemView);

        return listItemView;
    }

    private void setPlaceImage(Place place, View view) {
        ImageView placeImage = view.findViewById(R.id.place_image);
        placeImage.setImageResource(place.getImageId());
    }

    private void setPlaceName(Place place, View view) {
        TextView placeName = view.findViewById(R.id.place_name);
        placeName.setText(place.getName());
    }

    private void setPlaceStars(Place place, View view) {
        TextView placeStars = view.findViewById(R.id.place_star);
        if (place.hasStars()) {
            placeStars.setVisibility(View.VISIBLE);
            String stars = "";
            for (int i = 0; i < place.getNumberOfStars(); i++) {
                stars += "\uf005 ";
            }
            placeStars.setText(stars);
        } else {
            placeStars.setVisibility(View.GONE);
        }
    }

    private void setPlaceAddress(final Place place, View view) {
        TextView placeAddress = view.findViewById(R.id.place_address);
        SpannableString content = new SpannableString(place.getAddress());
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        placeAddress.setText(content);
        placeAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double latitude = place.getLatitude();
                double longitude = place.getLongitude();
                String uri = String.format(Locale.ENGLISH, getContext().getResources().getString(R.string.google_navigation_uri), latitude, longitude);
                Uri gmmIntentUri = Uri.parse(uri);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage(getContext().getResources().getString(R.string.package_name_google_maps));
                getContext().startActivity(mapIntent);
            }
        });
    }

    private void setPlacePhone(Place place, View view) {
        TextView placePhone = view.findViewById(R.id.place_phone_number);
        LinearLayout rowPhone = view.findViewById(R.id.place_row_phone);
        if (place.hasPhoneNumber()) {
            placePhone.setVisibility(View.VISIBLE);
            rowPhone.setVisibility(View.VISIBLE);
            placePhone.setText(place.getPhoneNumber());
        } else {
            placePhone.setVisibility(View.GONE);
            rowPhone.setVisibility(View.GONE);
        }
    }

    private void setPlaceWeb(Place place, View view) {
        TextView placeWeb = view.findViewById(R.id.place_web);
        LinearLayout rowWeb = view.findViewById(R.id.place_row_web);
        if (place.hasWeb()) {
            placeWeb.setVisibility(View.VISIBLE);
            rowWeb.setVisibility(View.VISIBLE);
            placeWeb.setText(place.getUrl());
        } else {
            placeWeb.setVisibility(View.GONE);
            rowWeb.setVisibility(View.GONE);
        }
    }

    private void setPlaceText(Place place, View view) {
        TextView placeText = view.findViewById(R.id.place_text);
        if (place.hasText()) {
            placeText.setVisibility(View.VISIBLE);
            placeText.setText(place.getText());
        } else {
            placeText.setVisibility(View.GONE);
        }
    }
}
