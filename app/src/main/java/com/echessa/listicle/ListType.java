package com.echessa.listicle;

import java.util.ArrayList;

/**
 * Created by echessa on 5/14/15.
 */
public class ListType {

    private String mName;
    private ArrayList<ListItem> mListItems;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public ArrayList<ListItem> getListItems() {
        return mListItems;
    }

    public void setListItems(ArrayList<ListItem> listItems) {
        this.mListItems = listItems;
    }
}
