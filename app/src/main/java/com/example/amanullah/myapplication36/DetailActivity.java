package com.example.amanullah.myapplication36;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by AMANULLAH on 07-Feb-18.
 */

public class DetailActivity extends AppCompatActivity implements ContactsAdapter.ContactsAdapterListener {

    Context context=this;
    String rolls;
    ImageView imageView;
    ImageView imageView2;
    TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8;
    CircleImageView circleImageView;
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
            "001",
            "002",
            "003",
            "004",
            "005",
            "006",
            "007",
            "008",
            "009",
            "010",
            "011",
            "012",
            "013",
            "014",
            "015",
            "016",
            "017",
            "018",
            "019",
            "020",
            "021",
            "022",
            "023",
            "024",
            "025",
            "026",
            "027",
            "028",
            "v29",
            "030",
            "031",
            "032",
            "033",
            "034",
            "035",
            "036",
            "037",
            "038",
            "039",
            "040",
            "041",
            "042",
            "043",
            "044",
            "045",
            "046",
            "047",
            "048",
            "049",
            "050",
            "051",
            "052",
            "053",
            "054",
            "055",
            "056",
            "057",
            "058",
            "059",
            "060",
            "061",
            "062",
            "063",
            "064",
            "065",
            "066",
            "067",
            "068",
            "069",
            "070",
            "071",
            "072",
            "073",
            "074",
            "075",
            "076",
            "077",
            "078",
            "079",
            "080",
            "081",
            "082",
            "083",
            "084",
            "085",
            "086",
            "087",
            "088",
            "089",
            "090",
            "091",
            "092",
            "093",
            "094",
            "095",
            "096",
            "097",
            "098",
            "099",
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

    String[] fb = {
            "https://www.facebook.com/MD.asifur.rahman.anik",
            "https://www.facebook.com/iAngkur/about?lst=100002989436677%3A100012410827171%3A1511406900",
            "https://www.facebook.com/profile.php?id=100009393594800",
            "https://www.facebook.com/mohaimin66",
            "https://www.facebook.com/redwanul.haque.96930",
            "https://www.facebook.com/1nsane.shadow",
            "https://www.facebook.com/sakibreza96",
            "https://www.facebook.com/profile.php?id=100009833886180",
            "https://www.facebook.com/abrarhasin.pranto.7",
            "https://www.facebook.com/shahjalal.sakil.16",
            "https://www.facebook.com/tahminarahman.sony",
            "https://www.facebook.com/samiul.sumon1",
            "https://www.facebook.com/fabliha.haque.3",
            "https://www.facebook.com/ankur.014.sadman",
            "https://www.facebook.com/profile.php?id=100011364231806",
            "https://www.facebook.com/profile.php?id=100011034107778",
            "https://www.facebook.com/aiproshar",
            "https://www.facebook.com/profile.php?id=100007379626070",
            "https://www.facebook.com/nahin97",
            "https://www.facebook.com/dibbo12475",
            "https://www.facebook.com/salahuddin.sas",
            "https://www.facebook.com/hannan.sagar.1",
            "https://www.facebook.com/profile.php?id=100010959785248",
            "https://www.facebook.com/azahar.alam.1507024",
            "https://www.facebook.com/lyeadl",
            "https://www.facebook.com/Stasnim12357",
            "https://www.facebook.com/anurag.onneshon.kuet",
            "https://www.facebook.com/mushfiq.2847",
            "https://www.facebook.com/fazle.rasul.9",
            "https://www.facebook.com/profile.php?id=100010602612585",
            "https://www.facebook.com/profile.php?id=100011061124499",
            "https://www.facebook.com/tanjina.oriana",
            "https://www.facebook.com/sadmanahmed.shuvo",
            "https://www.facebook.com/prince.shakib34",
            "https://www.facebook.com/sabbir.rahman.986227",
            "",
            "",
            "https://www.facebook.com/raihanul.islam.refat",
            "https://www.facebook.com/nahid.pappu.9",
            "https://www.facebook.com/mohaimen96",
            "https://www.facebook.com/rezaulhsagar",
            "https://www.facebook.com/rakibcsekuet",
            "https://www.facebook.com/mohammad.peyal.3",
            "https://www.facebook.com/angel.prapti.3",
            "https://www.facebook.com/Nishat.nayla13",
            "https://www.facebook.com/sadiajahan.borna",
            "https://www.facebook.com/amanullah.asraf.47",
            "https://www.facebook.com/sabyasachis1",
            "https://www.facebook.com/Mr.nobody199",
            "https://www.facebook.com/rafeed.khan.33",
            "https://www.facebook.com/profile.php?id=100005066868049",
            "https://www.facebook.com/guria.tondra",
            "https://www.facebook.com/biazid.bostame05",
            "https://www.facebook.com/juyanaislam.islam",
            "https://www.facebook.com/profile.php?id=100011405672796",
            "https://www.facebook.com/iambota",
            "https://www.facebook.com/shaif.dihan",
            "https://www.facebook.com/profile.php?id=100010876834405",
            "https://www.facebook.com/aranya.rahman87",
            "https://www.facebook.com/akib.javed.1232",
            "https://www.facebook.com/tahmed1409",
            "https://www.facebook.com/nooruddin.imad",
            "https://www.facebook.com/profile.php?id=100005757940382",
            "https://www.facebook.com/tuliranidas.ksr",
            "https://www.facebook.com/profile.php?id=100011387301111",
            "https://www.facebook.com/mdrifatanwar.nirob.90",
            "https://www.facebook.com/ayon.roy.754",
            "https://www.facebook.com/aroni.saha.1",
            "https://www.facebook.com/aalianamalique.malique",
            "https://www.facebook.com/mb.mredul4342",
            "https://www.facebook.com/akash.shahriar.3",
            "https://www.facebook.com/rifat2704",
            "https://www.facebook.com/ondhokarer.ami.31",
            "https://www.facebook.com/mdrubel.hasan.5477",
            "https://www.facebook.com/abir.abir.3766952",
            "https://www.facebook.com/Nishupto",
            "https://www.facebook.com/daud.anik",
            "https://www.facebook.com/bishal.imtiaz.9",
            "https://www.facebook.com/Fahim.0000007",
            "https://www.facebook.com/rabbiul.hasan.986",
            "https://www.facebook.com/mikail.biswas",
            "https://www.facebook.com/ahsanhabib.nayan.73",
            "https://www.facebook.com/srs.sohan.963",
            "https://www.facebook.com/fjshammo",
            "https://www.facebook.com/tasmia.mouli",
            "https://www.facebook.com/amlan.sarker",
            "https://www.facebook.com/mainuddin.munna.56",
            "https://www.facebook.com/profile.php?id=100009221773967",
            "https://www.facebook.com/Hridoytareqmahmud",
            "https://www.facebook.com/jfsrabonee",
            "https://www.facebook.com/ohida.aminohi",
            "https://www.facebook.com/shishir.ahmmed.9",
            "https://www.facebook.com/badhon.islam.1232",
            "https://www.facebook.com/refata1",
            "https://www.facebook.com/raataa95",
            "https://www.facebook.com/trq.rhm",
            "https://www.facebook.com/marufurrahman.nayem.1",
            "https://www.facebook.com/Mahmuud.al.hasan",
            "https://www.facebook.com/abir.yeasar",
            "https://www.facebook.com/profile.php?id=100006210490927",
            "https://www.facebook.com/profile.php?id=100009205281705",
            "https://www.facebook.com/tanzim.tamanna.07",
            "https://www.facebook.com/anik.chandra.754",
            "https://www.facebook.com/mdmubashshir.hosain",
            "https://www.facebook.com/prince.indronil.9",
            "https://www.facebook.com/manon.rahman9",
            "https://www.facebook.com/mdsharzulmostafa.rakib",
            "https://www.facebook.com/minnagahidoidesu",
            "https://www.facebook.com/shahriar.parvez.988",
            "",
            "https://www.facebook.com/niaz.mahmud.921",
            "https://www.facebook.com/msowrav",
            "https://www.facebook.com/tanimahmed.bijoy.37",
            "https://www.facebook.com/mhmanik.mk",
            "https://www.facebook.com/Akash.arafat130792",
            "https://www.facebook.com/profile.php?id=100011455188682",
            "https://www.facebook.com/profile.php?id=100010605015813",
            "https://www.facebook.com/shuvo.ahmed.0056700",
            "https://www.facebook.com/iAmYourN1ghtmar3",
            "https://www.facebook.com/Raihan72000",
            "https://www.facebook.com/mouly.dewan"
    };

    String[] phone = {
            "01516111574",
            "01934487492",
            "01722535557",
            "01792628063",
            "01990030023",
            "01521331082",
            "01521323429",
            "01682828025",
            "01521314727",
            "01855096779",
            "01789490303",
            "01521428673",
            "01959003435",
            "01782123643",
            "01515237580",
            "01937331677",
            "01537062651",
            "01869963116",
            "01521484478",
            "01798478034",
            "01920549511",
            "01981482568",
            "01966020268",
            "01521304249",
            "01843331918",
            "01780686796",
            "01927730750",
            "01521323671",
            "01774237089",
            "01866824103",
            "01924487827",
            "01521332599",
            "01521418737",
            "01866824103",
            "01935276013",
            "01966773651",
            "01796251351",
            "01715269339",
            "01521419243",
            "01521332439",
            "01521433691",
            "01521315059",
            "01521331930",
            "01986540246",
            "01521333763",
            "01711483461",
            "01521304517",
            "01536252622",
            "01681080490",
            "01515687376",
            "01559483614",
            "01757838373",
            "01552834294",
            "01761413633",
            "01517038460",
            "01521329307",
            "01521314784",
            "01989583426",
            "01521318547",
            "01521318493",
            "01937279983",
            "01521315683",
            "01917935344",
            "01716682257",
            "01752121847",
            "01710507049",
            "01992404375",
            "01762795633",
            "01737383942",
            "01829822447",
            "01799616381",
            "01521320910",
            "01912143792",
            "01726297095",
            "01713604347",
            "01768682252",
            "01521403823",
            "0188154240",
            "01969773003",
            "01797838986",
            "01987860912",
            "01773756759",
            "01521412638",
            "01621000343",
            "01938625809",
            "01521313223",
            "01552931042",
            "01551811949",
            "01790208848",
            "01868107328",
            "01789452091",
            "01521300336",
            "01679357283",
            "01521329993",
            "01748535404",
            "01620601009",
            "01819135695",
            "01745863974",
            "01786852035",
            "01827854137",
            "01521330523",
            "01740426465",
            "01521325124",
            "01521321936",
            "01853089724",
            "01521314721",
            "01521428838",
            "01789522828",
            "01521435153",
            "01521307471",
            "01832239894",
            "01686263588",
            "01921223700",
            "01748480449",
            "01762893415",
            "01931631209",
            "01521301117",
            "01521314934",
            "01741965485",
            "01521331399",
            "01784660050"
    };
    String[] home = {
            "Jessore",
            "Dhaka",
            "Nilphamari",
            "Sirajgang",
            "Sirajgang",
            "Dhaka",
            "Bogra",
            "Dhaka",
            "Khulna",
            "Chandpur",
            "Rajshahi",
            "Sirajgang",
            "Naogaon",
            "Natore",
            "Khulna",
            "Dhaka",
            "Rajshahi",
            "Chuadanga",
            "Chittagong",
            "Netrakona",
            "Comilla",
            "Chandpur",
            "Panchagarh",
            "Rangpur",
            "Barisal",
            "Rajshahi",
            "Jessore",
            "Chittagong",
            "Dinajpur",
            "Chittagong",
            "Dhaka",
            "Dhaka",
            "Rajshahi",
            "Chittagong",
            "Khulna",
            "Chuadanga",
            "Dhaka",
            "Dhaka",
            "Rajshahi",
            "Dhaka",
            "Dhaka",
            "Pirojpur",
            "Faridpur",
            "Dhaka",
            "Barisal",
            "Noakhali",
            "Rangpur",
            "Dhaka",
            "Dhaka",
            "Dhaka",
            "Dhaka",
            "Naogaon",
            "Dhaka",
            "Lalmonirhat",
            "Dhaka",
            "Chittagong",
            "Khulna",
            "Khulna",
            "Jessore",
            "Jessore",
            "Bagerhat",
            "Brahmanbaria",
            "Chuadanga",
            "Narsingdi",
            "Jessore",
            "Naogaon",
            "Dhaka",
            "Rajshahi",
            "Rangpur",
            "Sherpur",
            "Rajshahi",
            "Dhaka",
            "Barisal",
            "Dhaka",
            "Chittagong",
            "Bhola",
            "Bogra",
            "Rajshahi",
            "Bhola",
            "Rangpur",
            "Dhaka",
            "Rangpur",
            "Jhenida",
            "Sirajganj",
            "Barisal",
            "Rangpur",
            "Rangpur",
            "Gazipur",
            "Lakshmipur",
            "Tangail",
            "Mymensingh",
            "Rajshahi",
            "Comilla",
            "Comilla",
            "Chittagong",
            "Barisal",
            "Barisal",
            "Comilla",
            "Rangpur",
            "Dhaka",
            "Mymensingh",
            "Bogra",
            "Naogan",
            "Natore",
            "Khulna",
            "Khulna",
            "Bogra",
            "Dhaka",
            "Natore",
            "Tangail",
            "Dhaka",
            "Tangail",
            "Kushtia",
            "Jamalpur",
            "Dinajpur",
            "Magura",
            "Rajshahi",
            "Bogra",
            "Jessore",
            "Dhaka",
            "Chittagong"
    };
    String[] email = {

    };
    String[] blood = {

    };
    String[] birth = {

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        // toolbar fancy stuff
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setTitle(R.string.toolbar_title);
/*
        getSupportActionBar().setTitle((Html.fromHtml(
                "<font color=\"#FFFFFF\">"
                        + getString(R.string.toolbar_title)
                //+ "</font>"
        )));
*/

        circleImageView= (CircleImageView) findViewById(R.id.img1);
        imageView= (ImageView) findViewById(R.id.background);
        imageView2= (ImageView) findViewById(R.id.background2);
        tx1= (TextView) findViewById(R.id.textView1);
        tx2= (TextView) findViewById(R.id.textView2);
        tx3= (TextView) findViewById(R.id.text_phone);
        tx4= (TextView) findViewById(R.id.text_fb);
        tx5= (TextView) findViewById(R.id.text_work);
        tx6= (TextView) findViewById(R.id.text_email);
        tx7= (TextView) findViewById(R.id.text_blood);
        tx8= (TextView) findViewById(R.id.text_b);
        Intent intent = getIntent();
        rolls = intent.getStringExtra("roll");
        //Toast.makeText(getApplicationContext(), "Selected: " + rolls, Toast.LENGTH_LONG).show();
        circleImageView.setImageResource(img2[Integer.parseInt(rolls)-1]);
        imageView.setImageResource(img2[Integer.parseInt(rolls)-1]);
        imageView2.setImageResource(img2[Integer.parseInt(rolls)-1]);
        imageView2.setRotationX(180);
        tx1.setText(title[Integer.parseInt(rolls)-1]);
        tx2.setText("1507"+dis[Integer.parseInt(rolls)-1]);
        tx3.setText(phone[Integer.parseInt(rolls)-1]);
        tx4.setText(fb[Integer.parseInt(rolls)-1]);
        tx4.setMovementMethod(new ScrollingMovementMethod());
        tx5.setText(home[Integer.parseInt(rolls)-1]);
        //tx6.setText(email[Integer.parseInt(rolls)-1]);
        //tx7.setText(blood[Integer.parseInt(rolls)-1]);
        //tx8.setText(birth[Integer.parseInt(rolls)-1]);
        //circleImageView.setImageResource(R.drawable.i3);
        if(rolls.equals("47")){
            tx6.setText("amanullahoasraf@gmail.com");
            tx7.setText("A+");
        }
    }

    @Override
    public void onContactSelected(Contact contact) {
        //imgss=contact.getPhone();
        circleImageView.setImageResource(R.drawable.i2);
        //Toast.makeText(getApplicationContext(), "Selected: " + contact.getName() + ", " + contact.getPhone(), Toast.LENGTH_LONG).show();

    }

    public void call1(View view) {
        String uri = "tel:"+tx3.getText().toString();
        //Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse(uri));
        Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse(uri));
        try {
            //startActivity(callIntent);
            startActivity(dialIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(DetailActivity.this, "CALL faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
    }

    public void msg1(View view) {
        Intent smsIntent = new Intent(Intent.ACTION_VIEW);
        smsIntent.setData(Uri.parse("smsto:"));
        smsIntent.setType("vnd.android-dir/mms-sms");
        String num = tx3.getText().toString();
        //String sms = editText5.getText().toString();
        smsIntent.putExtra("address"  , num);
        //smsIntent.putExtra("sms_body"  , sms);
        try {
            startActivity(smsIntent);
            finish();
            //Toast.makeText(DetailActivity.this, "msg :"+num, Toast.LENGTH_SHORT).show();
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(DetailActivity.this, "SMS faild, please try again later.", Toast.LENGTH_SHORT).show();
        }
    }

    public void email(View view) {
        final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        emailIntent.setType("text/plain");
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{tx6.getText().toString()});
        //emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Hello");
        //emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "Add Message here");
        try {
            startActivity(Intent.createChooser(emailIntent, "Send email using..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(DetailActivity.this, "No email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }

    public void map1(View view) {
        //Uri mapuri=Uri.parse("geo:0,0?q=" + Uri.encode("khulna"));
        //Intent mapintent=new Intent(Intent.ACTION_VIEW, mapuri);
        //mapintent.setPackage(com.google.android.apps.maps);
        String uri="http://maps.google.co.in/maps?q="+home[Integer.parseInt(rolls)-1]+", bangladesh";
        Intent map=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        try {
            startActivity(map);
        }catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(DetailActivity.this, "map not open", Toast.LENGTH_SHORT).show();
        }
        //Toast.makeText(DetailActivity.this, "home", Toast.LENGTH_SHORT).show();
    }

    public void direction(View view) {
        Toast.makeText(DetailActivity.this, "direction", Toast.LENGTH_SHORT).show();
    }

    public void facebook(View view) {
        //Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(fb[Integer.parseInt(rolls)-1]));
        //Toast.makeText(DetailActivity.this,fb[Integer.parseInt(rolls)-1], Toast.LENGTH_SHORT).show();
        PackageManager pack=context.getPackageManager();
        try {
            //startActivity(browserIntent);
            int version=pack.getPackageInfo("com.facebook.katana",0).versionCode;
            boolean activate=pack.getApplicationInfo("com.facebook.katana",0).enabled;
            if(activate){
                if(version>=3002850){
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://facewebmodal/f?href="+fb[Integer.parseInt(rolls)-1]));
                    startActivity(browserIntent);
                } else {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/"+fb[Integer.parseInt(rolls)-1]));
                    startActivity(browserIntent);
                }
            }else {

                Toast.makeText(DetailActivity.this, "facebook not activate", Toast.LENGTH_SHORT).show();
            }

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(DetailActivity.this, "facebook not open", Toast.LENGTH_SHORT).show();
        }
    }

    public void messenger(View view) {

        //Intent intent=new Intent();
        //intent.setAction(Intent.ACTION_SEND);
        //intent.putExtra(Intent.EXTRA_TEXT,"hi");
        //intent.setType("text/plain");
        //intent.setPackage("com.facebook.orca");
        try {
            //startActivity(intent);
        } catch (android.content.ActivityNotFoundException ex) {
            //Toast.makeText(DetailActivity.this, "mesenger not open.", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(DetailActivity.this, "messenger", Toast.LENGTH_SHORT).show();
    }
}
