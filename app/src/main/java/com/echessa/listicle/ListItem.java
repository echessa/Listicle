package com.echessa.listicle;

/**
 * Created by echessa on 5/14/15.
 */
public class ListItem {

    private String mName;
    private ListType mListType;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public ListType getListType() {
        return mListType;
    }

    public void setListType(ListType listType) {
        this.mListType = listType;
    }
}
