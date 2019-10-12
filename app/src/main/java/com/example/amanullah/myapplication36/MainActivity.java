package com.example.amanullah.myapplication36;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ContactsAdapter.ContactsAdapterListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView recyclerView;
    private List<Contact> contactList;
    private ContactsAdapter mAdapter;
    private SearchView searchView;

    String[] title = {
            "M.Asifur Rahman",
            "Angkur Mondal",
            "Sohana Akter",
            "S.M. Mohaiminul Islam Rafi",
            "Redwanul Haque Sourave",
            "Md.Rahat-Uz-Zaman",
            "Sakib Reza",
            "Faisal Ahmed",
            "Md. Abrar Hasin",
            "Shahjalal Sakil",
            "Most. Tahmina Rahman",
            "Samiul Azim",
            "Fabliha Haque",
            "Salim Shadman Ankur",
            "Saifur Rahman",
            "Nazia Zaman",
            "Arafat Islam Khan",
            "Sadiquzzaman Shovon",
            "Nahin Kumar Dey",
            "Dibya Sarker",
            "Salah Uddin Ahammad",
            "Md. Abdul Hannan",
            "Saima Zerin",
            "Md. Azahar Alam",
            "Shidul Mursalin Yead",
            "Md. Tasnim Shahriar",
            "Chandan Kundu",
            "Md. Mushfiqur Azam",
            "Md. Fazle Rasul",
            "Sadia Mubashshira",
            "Md.Hafiz Uddin",
            "Tanjina Oriana",
            "Sadman Ahmed",
            "Md. Shahidul Salim",
            "Md. Moklesur Rahman",
            "Md. Dalour Hossan Saeed",
            "Soomanib Kamruzzaman",
            "Raihanul Islam Refat",
            "Md. Nahid Hasan",
            "Mohaimen Hasan",
            "Md.Rezaul Hoque",
            "Md. Rakib Hossain",
            "Md.Peyal Molla",
            "Shadmaan Hye",
            "Nishat Nayla Labiba",
            "Sadia Jahan",
            "Amanullah Asraf",
            "Rezwan Ibne Borhan",
            "Md. Somir Khan",
            "Rafeed Uddin Khan",
            "Toufikul Alam Sayeem",
            "Aysa Siddika",
            "Md. Biazid Bostame",
            "Juyana Islam",
            "Awan-Ur-Rahman",
            "Md. Mohaimin-Al-Barat",
            "Shaif Mohammad Reasat",
            "Md. Habibur Rahman",
            "O.F.M. Riaz Rahman Aranya",
            "Kazi Akib Javed",
            "Tanvir Ahmed",
            "Sheikh Nooruddin",
            "Md. Ahsan Habib",
            "Tuli Rani Das",
            "Falguni Ahmed Sharna",
            "Md. Rifat Anwar",
            "Ayon Roy Ankon",
            "Aroni Saha Prapty",
            "Sumaiya",
            "Motasim Billah Mredul",
            "Md. Nasib Shahriar Akash",
            "Md. Rifat Haider Chowdhury",
            "Md. Sheersho Mueez",
            "Md. Rubel Hasan",
            "Abid Hasan Abir",
            "K M Nazib Hossen",
            "Daud Ahmed Sarker",
            "Bishal Imtiaz",
            "Fahim Ashab",
            "Md. Rabbiul Hasan",
            "Mikail Biswas Mridu",
            "Md. Ahsan Habib",
            "Md. Sohanur Rahman",
            "Fahim Jaowad",
            "Tasmia Tahnim",
            "Amlan Sarker",
            "Md. Main-Uddin Munna",
            "Md. Amit Hasan Rony",
            "Tareq Mahmud",
            "Jannatul Ferdous Srabonee",
            "Ohida-Binte-Amin",
            "Shishir Ahmmed",
            "Tahmina Sultana Priya",
            "Reffat Ahmed",
            "Raisa Tahsin",
            "Md Tareq Rahman Joy",
            "Mohammad Marufur Rahman",
            "Mahmudul Hasan Mozumder",
            "Md. Samin Yeasar",
            "Saeed Anwar Khan",
            "Fahim Ahmed Mondal",
            "Tanzim Tamanna Shitu",
            "Anik Pramanik",
            "Md. Mubashshir Hosain",
            "Indronil Bhattacharjee",
            "Manon Muhtasin Rahman",
            "Md. Sharzul Mostafa",
            "Aparajita Dola",
            "Shahriar Parvej",
            "Md. Zabirul Islam",
            "Md. Niaz Mahmud",
            "M. A. Moit Sowrav",
            "Tanim Ahmed",
            "Md.Motaleb Hossen Manik",
            "Md. Arafat Mahamud",
            "Amrita Biswas",
            "Md. Maruf Hasan",
            "Shakir Ahmed",
            "Abid Hassan Muin",
            "Raihan Hussain",
            "Mouly Dewan"
    };

    String[] dis = {
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
            "26",
            "27",
            "28",
            "29",
            "30",
            "31",
            "32",
            "33",
            "34",
            "35",
            "36",
            "37",
            "38",
            "39",
            "40",
            "41",
            "42",
            "43",
            "44",
            "45",
            "46",
            "47",
            "48",
            "49",
            "50",
            "51",
            "52",
            "53",
            "54",
            "55",
            "56",
            "57",
            "58",
            "59",
            "60",
            "61",
            "62",
            "63",
            "64",
            "65",
            "66",
            "67",
            "68",
            "69",
            "70",
            "71",
            "72",
            "73",
            "74",
            "75",
            "76",
            "77",
            "78",
            "79",
            "80",
            "81",
            "82",
            "83",
            "84",
            "85",
            "86",
            "87",
            "88",
            "89",
            "90",
            "91",
            "92",
            "93",
            "94",
            "95",
            "96",
            "97",
            "98",
            "99",
            "100",
            "101",
            "102",
            "103",
            "104",
            "105",
            "106",
            "107",
            "108",
            "109",
            "110",
            "111",
            "112",
            "113",
            "114",
            "115",
            "116",
            "117",
            "118",
            "119",
            "120",
            "121"
    };

    int[] img2 = {
            R.drawable.i1,
            R.drawable.i2,
            R.drawable.i3,
            R.drawable.i4,
            R.drawable.i5,
            R.drawable.i6,
            R.drawable.i7,
            R.drawable.i8,
            R.drawable.i9,
            R.drawable.i10,
            R.drawable.i11,
            R.drawable.i12,
            R.drawable.i13,
            R.drawable.i14,
            R.drawable.i15,
            R.drawable.i16,
            R.drawable.i17,
            R.drawable.i18,
            R.drawable.i19,
            R.drawable.i20,
            R.drawable.i21,
            R.drawable.i22,
            R.drawable.i23,
            R.drawable.i24,
            R.drawable.i25,
            R.drawable.i26,
            R.drawable.i27,
            R.drawable.i28,
            R.drawable.i29,
            R.drawable.i30,
            R.drawable.i31,
            R.drawable.i32,
            R.drawable.i33,
            R.drawable.i34,
            R.drawable.i35,
            R.drawable.i36,
            R.drawable.i37,
            R.drawable.i38,
            R.drawable.i39,
            R.drawable.i40,
            R.drawable.i41,
            R.drawable.i42,
            R.drawable.i43,
            R.drawable.i44,
            R.drawable.i45,
            R.drawable.i46,
            R.drawable.i47,
            R.drawable.i48,
            R.drawable.i49,
            R.drawable.i50,
            R.drawable.i51,
            R.drawable.i52,
            R.drawable.i53,
            R.drawable.i54,
            R.drawable.i55,
            R.drawable.i56,
            R.drawable.i57,
            R.drawable.i58,
            R.drawable.i59,
            R.drawable.i60,
            R.drawable.i61,
            R.drawable.i62,
            R.drawable.i63,
            R.drawable.i64,
            R.drawable.i65,
            R.drawable.i66,
            R.drawable.i67,
            R.drawable.i68,
            R.drawable.i69,
            R.drawable.i70,
            R.drawable.i71,
            R.drawable.i72,
            R.drawable.i73,
            R.drawable.i74,
            R.drawable.i75,
            R.drawable.i76,
            R.drawable.i77,
            R.drawable.i78,
            R.drawable.i79,
            R.drawable.i80,
            R.drawable.i81,
            R.drawable.i82,
            R.drawable.i83,
            R.drawable.i84,
            R.drawable.i85,
            R.drawable.i86,
            R.drawable.i87,
            R.drawable.i88,
            R.drawable.i89,
            R.drawable.i90,
            R.drawable.i91,
            R.drawable.i92,
            R.drawable.i93,
            R.drawable.i94,
            R.drawable.i95,
            R.drawable.i96,
            R.drawable.i97,
            R.drawable.i98,
            R.drawable.i99,
            R.drawable.i100,
            R.drawable.i101,
            R.drawable.i102,
            R.drawable.i103,
            R.drawable.i104,
            R.drawable.i105,
            R.drawable.i106,
            R.drawable.i107,
            R.drawable.i108,
            R.drawable.i109,
            R.drawable.i110,
            R.drawable.i111,
            R.drawable.i112,
            R.drawable.i113,
            R.drawable.i114,
            R.drawable.i115,
            R.drawable.i116,
            R.drawable.i117,
            R.drawable.i118,
            R.drawable.i119,
            R.drawable.i120,
            R.drawable.i121
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // toolbar fancy stuff
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setTitle(R.string.toolbar_title);
        getSupportActionBar().setTitle((Html.fromHtml(
                "<font color=\"#FFFFFF\">"
                        + getString(R.string.toolbar_title)
                //+ "</font>"
        )));

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        contactList = new ArrayList<>();
        mAdapter = new ContactsAdapter(getBaseContext(), contactList, this);

        // white background notification bar
        whiteNotificationBar(recyclerView);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new MyDividerItemDecoration(this, DividerItemDecoration.VERTICAL, 20));
        recyclerView.setAdapter(mAdapter);

        //change stutus ber color..
        Window window=this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));


        initialize();
    }

    private void initialize() {
        for (int i = 0; i < 121; i++) {
            Contact item = new Contact();
            item.setName(title[i] + "");
            item.setPhone(dis[i] + "");
            item.setImage(img2[i]);
            contactList.add(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setMaxWidth(Integer.MAX_VALUE);

        // listening to search query text change
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // filter recycler view when query submitted
                mAdapter.getFilter().filter(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                // filter recycler view when text is changed
                mAdapter.getFilter().filter(query);
                return false;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_search) {
            return true;
        }
        if (id == R.id.action_about) {
            final Context context = this;
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("roll", "47");
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        // close search view on back button pressed
        if (!searchView.isIconified()) {
            searchView.setIconified(true);
            return;
        }
        super.onBackPressed();
    }

    private void whiteNotificationBar(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            int flags = view.getSystemUiVisibility();
            flags |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            view.setSystemUiVisibility(flags);
            getWindow().setStatusBarColor(Color.WHITE);
        }
    }

    @Override
    public void onContactSelected(Contact contact) {
        final Context context = this;
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("roll", contact.getPhone());
        startActivity(intent);
        //Toast.makeText(getApplicationContext(), "Selected: " + contact.getName() + ", " + contact.getPhone(), Toast.LENGTH_LONG).show();
    }
}