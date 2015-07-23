package com.example.second;

import java.util.ArrayList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.app.ExpandableListActivity;
import android.content.Context;

public class MainActivity3 extends ExpandableListActivity {

    // Create ArrayList to hold parent Items and Child Items
    private ArrayList<String> parentItems = new ArrayList<String>();
    private ArrayList<Object> childItems = new ArrayList<Object>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create Expandable List and set it's properties
        ExpandableListView expandableList = getExpandableListView();
        expandableList.setDividerHeight(2);
        expandableList.setGroupIndicator(null);
        expandableList.setClickable(true);

        // Set the Items of Parent
        setGroupParents();
        // Set The Child Data
        setChildData();

        // Create the Adapter
        MyExpandableAdapter adapter = new MyExpandableAdapter(parentItems,childItems);

        adapter.setInflater(
                (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE),
                this);

        // Set the Adapter to expandableList
        expandableList.setAdapter(adapter);
        expandableList.setOnChildClickListener(this);

    }

    // method to add parent Items
    public void setGroupParents() {
        parentItems.add("Направление1");
        parentItems.add("Направление2");
        parentItems.add("Направление3");
        parentItems.add("Направление4");
    }

    // method to set child data of each parent
    public void setChildData() {

        // Add Child Items for Fruits
        ArrayList<String> child = new ArrayList<String>();
        child.add("Универ");
        child.add("Универ");
        child.add("Универ");
        child.add("Универ");

        childItems.add(child);

        // Add Child Items for Flowers
        child = new ArrayList<String>();
        child.add("Универ");
        child.add("Универ");
        child.add("Универ");
        child.add("Универ");

        childItems.add(child);

        // Add Child Items for Animals
        child = new ArrayList<String>();
        child.add("Универ");
        child.add("Универ");
        child.add("Универ");
        child.add("Универ");

        childItems.add(child);

        // Add Child Items for Birds
        child = new ArrayList<String>();
        child.add("Универ");
        child.add("Универ");
        child.add("Универ");
        child.add("Универ");

        childItems.add(child);
    }


}



