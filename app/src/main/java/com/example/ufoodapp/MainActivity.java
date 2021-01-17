package com.example.ufoodapp;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    boolean onSearch;

    int images[] = {R.drawable.aubonpainlogo, R.drawable.chickfilalogo, R.drawable.chickfilalogo,
            R.drawable.chompandgologo, R.drawable.chompandgologo, R.drawable.chompandgologo,
            R.drawable.chompitlogo, R.drawable.chompitlogo, R.drawable.croutons,
            R.drawable.pandaexpresslogo, R.drawable.pandaexpresslogo, R.drawable.papajohnslogo,
            R.drawable.pollotropicallogo, R.drawable.saladcreationslogo, R.drawable.shakesmartlogo,
            R.drawable.subwaylogo, R.drawable.subwaylogo};
    String names[] = {"Au Bon Pain", "Chick-fil-A - Broward Dining", "Chick-fil-A",
            "Chomp & Go - Mowry Rd", "Chomp & Go - Hough Hall", "Chomp & Go - Hull Rd",
            "Chomp It - Graham Oasis", "Chomp It - Village Dr", "Croutons",
            "Panda Express - SW Archer Rd", "Panda Express - Museum Dr", "Papa Johns",
            "Pollo Tropical", "Salad Creations", "Shake Smart",
            "Subway", "Subway"};

    String locations[] = {"Newell Hall, 1700 Stadium Rd, Gainesville, FL 32611", "Broward Dining Complex, 60 Inner Rd, Gainesville, FL 32611", "Sun Terrace Cafe, 114 Recreational Dining Ctr, Gainesville, FL 32611",
            "2033 Mowry Rd, Gainesville, FL 32608", "Hough Hall, Gainesville, FL 32611", "3450 Hull Rd, Gainesville, FL 32607",
            "Graham Oasis, Gainesville, FL 32610", "309 Village Dr, Gainesville, FL 32611", "655 Reitz Union Drive, Gainesville , FL 32611",
            "1600 SW Archer Rd, Gainesville, FL 32611", "101 Museum Dr, Gainesville, FL 32611", "4220 NW 16th Blvd Ste A, Gainesville, FL 32605",
            "655 Reitz Union Drive, Gainesville, FL 32603", "1600 SW Archer Rd, Gainesville, FL 32603", "118 Reitz Union Drive, Gainesville, FL 32601",
            "Reitz Student Center 114 Recreational Dining Ctr,Gainesville, FL 32611", "1005 W University Ave, Gainesville, FL 32601"};

    List<Resuaurant> arrayList = new ArrayList<>();
    List<Resuaurant> returnedList = new ArrayList<>();
//    SearchView searchView;

    //    PersonAdapter resuaurantAdapter;
//    ArrayList<Resuaurant> arrayList = new ArrayList<>();
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        onSearch = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_names);

        for (int i = 0; i < names.length; i++){
            Resuaurant resuaurant = new Resuaurant(names[i], locations[i], images[i]);
            arrayList.add(resuaurant);
        }

        customAdapter = new CustomAdapter(arrayList, this);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Resuaurant tempRes = returnedList.get(position);

                if(tempRes.getName().equals("Au Bon Pain")){
                    Intent intent = new Intent(view.getContext(), AuBonPain.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Chick-fil-A - Broward Dining")){
                    Intent intent = new Intent(view.getContext(), chick60.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Chick-fil-A - Sun Terrace Cafe")){
                    Intent intent = new Intent(view.getContext(), chick114.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Chomp & Go - Mowry Rd")){
                    Intent intent = new Intent(view.getContext(), chompGofirst.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Chomp & Go - Hough Hall")){
                    Intent intent = new Intent(view.getContext(), chompGosecond.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Chomp & Go - Hull Rd")){
                    Intent intent = new Intent(view.getContext(), chompGothird.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Chomp It - Graham Oasis")){
                    Intent intent = new Intent(view.getContext(), chompItfirst.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Chomp It - Village Dr")){
                    Intent intent = new Intent(view.getContext(), chompItsecond.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Croutons")){
                    Intent intent = new Intent(view.getContext(), sub_croutons.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Panda Express - SW Archer Rd")){
                    Intent intent = new Intent(view.getContext(), pandaexpressfirst.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Panda Express - Museum Dr")){
                    Intent intent = new Intent(view.getContext(), pandaexpresssecond.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Papa Johns")){
                    Intent intent = new Intent(view.getContext(), PapaJohns.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Pollo Tropical")){
                    Intent intent = new Intent(view.getContext(), PolloTropical.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Salad Creations")){
                    Intent intent = new Intent(view.getContext(), saladcreation.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Shake Smart")){
                    Intent intent = new Intent(view.getContext(), shakesmart.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Shake Smart - Reitz")){
                    Intent intent = new Intent(view.getContext(), subwayfirst.class);
                    startActivity(intent);
                }
                if(tempRes.getName().equals("Shake Smart")){
                    Intent intent = new Intent(view.getContext(), subwaysecond.class);
                    startActivity(intent);
                }

            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem menuItem = menu.findItem(R.id.search_view);

        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener( new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText){
                customAdapter.getFilter().filter(newText);
                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.search_view){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class CustomAdapter extends BaseAdapter implements Filterable {

        private List<Resuaurant> resuaurantList;
        private List<Resuaurant> resuaurantListFiltered;
        private Context context;

        public CustomAdapter(List<Resuaurant> resuaurantList, Context context) {
            this.resuaurantList = resuaurantList;
            this.resuaurantListFiltered = resuaurantList;
            this.context = context;
        }

        @Override
        public int getCount() {
            return resuaurantListFiltered.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.menu_list, null);
            ImageView imageView = view.findViewById(R.id.imageView);
            TextView itemName = view.findViewById(R.id.txtName);
            TextView itemLocation = view.findViewById(R.id.txtLocation);

            imageView.setImageResource(resuaurantListFiltered.get(position).getImage());
            itemName.setText(resuaurantListFiltered.get(position).getName());
            itemLocation.setText(resuaurantListFiltered.get(position).getLocation());

            return view;
        }

        @Override
        public Filter getFilter() {
            Filter filter = new Filter(){
                @Override
                protected FilterResults performFiltering(CharSequence constraint) {

                    FilterResults filterResults = new FilterResults();
                    if (constraint == null || constraint.length()== 0){
                        filterResults.count = resuaurantList.size();
                        filterResults.values = resuaurantList;
                    }
                    else{
                        onSearch = true;
                        String searchStr = constraint.toString().toLowerCase();
                        List<Resuaurant> resultData = new ArrayList<>();
                        for (Resuaurant resuaurant:resuaurantList){
                            if (resuaurant.getName().toLowerCase().contains(searchStr) || resuaurant.getLocation().toLowerCase().contains(searchStr)){
                                resultData.add(resuaurant);
                            }

                            filterResults.count = resultData.size();
                            filterResults.values = resultData;
                        }
                        for(Resuaurant res: resultData)

                            returnedList = resultData;
                    }
                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence constraint, FilterResults results) {
                    resuaurantListFiltered = (List<Resuaurant>) results.values;

                    notifyDataSetChanged();

                }
            };
            return filter;
        }
    }
}