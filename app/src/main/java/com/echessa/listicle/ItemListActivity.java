package com.echessa.listicle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class ItemListActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        ArrayList<ListItem> listItems = new ArrayList<ListItem>();
        ListItem listItem1 = new ListItem();
        listItem1.setName("Test Item");
        listItems.add(listItem1);

        ListView listView = (ListView)findViewById(R.id.item_list_view);
        listView.setAdapter(new ItemAdapter(listItems));
    }

    private class ItemAdapter extends ArrayAdapter<ListItem> {
        ItemAdapter(ArrayList<ListItem> listItems) {
            super(ItemListActivity.this, R.layout.item_list_row, R.id.item_row_name, listItems);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = super.getView(position, convertView, parent);

            ListItem listItem = getItem(position);

            TextView nameTextView = (TextView)convertView.findViewById(R.id.item_row_name);
            nameTextView.setText(listItem.getName());

            return convertView;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_item_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
