package edu.aku.hassannaqvi.smkHhMl2022.models;

import static edu.aku.hassannaqvi.smkHhMl2022.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.smkHhMl2022.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.smkHhMl2022.core.MainApp.selectedDistrict;
import static edu.aku.hassannaqvi.smkHhMl2022.core.MainApp.selectedTehsil;
import static edu.aku.hassannaqvi.smkHhMl2022.core.MainApp.selectedUC;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import edu.aku.hassannaqvi.smkHhMl2022.BR;
import edu.aku.hassannaqvi.smkHhMl2022.contracts.TableContracts.FormsTable;
import edu.aku.hassannaqvi.smkHhMl2022.core.MainApp;


public class Forms extends BaseObservable implements Observable {

    private final String TAG = "Forms";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();

    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String clusterCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;

    // FIELD VARIABLES
    //A
    private String a104 = _EMPTY_;
    private String a105 = _EMPTY_;
    private String a106 = _EMPTY_;
    private String a107 = _EMPTY_;
    private String a101 = _EMPTY_;
    private String a108 = _EMPTY_;
    private String a103 = _EMPTY_;
    private String a113 = _EMPTY_;
    private String a109 = _EMPTY_;
    private String a110 = _EMPTY_;
    private String a111 = _EMPTY_;
    private String a112 = _EMPTY_;
    private String a11201 = _EMPTY_;
    private String a11201x = _EMPTY_;
    private String a11203 = _EMPTY_;
    private String c101 = _EMPTY_;
    private String c102 = _EMPTY_;
    private String c103 = _EMPTY_;

    //E
    private String e116 = _EMPTY_;
    private String e117 = _EMPTY_;

    //M
    private String m101 = _EMPTY_;
    private String m102 = _EMPTY_;
    private String m103 = _EMPTY_;
    private String m104 = _EMPTY_;
    private String m105 = _EMPTY_;
    private String m106 = _EMPTY_;
    private String m1071 = _EMPTY_;
    private String m1072 = _EMPTY_;
    private String m1073 = _EMPTY_;
    private String m1074 = _EMPTY_;
    private String m1075 = _EMPTY_;
    private String m1076 = _EMPTY_;
    private String m1077 = _EMPTY_;
    private String m1078 = _EMPTY_;
    private String m1079 = _EMPTY_;
    private String m018 = _EMPTY_;
    private String m109 = _EMPTY_;
    private String m110 = _EMPTY_;
    private String m11001x = _EMPTY_;
    private String m11002x = _EMPTY_;
    private String m111 = _EMPTY_;
    private String m112 = _EMPTY_;
    private String m11201 = _EMPTY_;
    private String m11201x = _EMPTY_;
    private String m11202 = _EMPTY_;
    private String m11202x = _EMPTY_;
    private String m11203 = _EMPTY_;
    private String m11203x = _EMPTY_;
    private String m11204 = _EMPTY_;
    private String m11204x = _EMPTY_;
    private String m11205 = _EMPTY_;
    private String m11205x = _EMPTY_;
    private String m11206 = _EMPTY_;
    private String m11206x = _EMPTY_;
    private String m11207 = _EMPTY_;
    private String m11207x = _EMPTY_;
    private String m113 = _EMPTY_;
    private String m1141 = _EMPTY_;
    private String m1142 = _EMPTY_;
    private String m1143 = _EMPTY_;
    private String m1144 = _EMPTY_;
    private String m1145 = _EMPTY_;
    private String m1146 = _EMPTY_;
    private String m1147 = _EMPTY_;
    private String m1148 = _EMPTY_;
    private String m1149 = _EMPTY_;
    private String m11410 = _EMPTY_;
    private String m11411 = _EMPTY_;
    private String m11412 = _EMPTY_;
    private String m11413 = _EMPTY_;
    private String m11414 = _EMPTY_;
    private String m11415 = _EMPTY_;
    private String m11416 = _EMPTY_;
    private String m11417 = _EMPTY_;
    private String m11418 = _EMPTY_;
    private String m115 = _EMPTY_;
    private String m116 = _EMPTY_;

    //N
    private String n101 = _EMPTY_;
    private String n102 = _EMPTY_;
    private String n103 = _EMPTY_;
    private String n104 = _EMPTY_;
    private String n10401x = _EMPTY_;
    private String n105 = _EMPTY_;
    private String n106 = _EMPTY_;
    private String n107 = _EMPTY_;
    private String n108 = _EMPTY_;
    private String n109 = _EMPTY_;
    private String n10901 = _EMPTY_;
    private String n10902 = _EMPTY_;
    private String n10903 = _EMPTY_;
    private String n10904 = _EMPTY_;
    private String n10905 = _EMPTY_;
    private String n10906 = _EMPTY_;
    private String n10907 = _EMPTY_;
    private String n110 = _EMPTY_;
    private String n111 = _EMPTY_;
    private String n112 = _EMPTY_;
    private String n113 = _EMPTY_;
    private String n11301x = _EMPTY_;

    //O
    private String o101 = _EMPTY_;
    private String o102 = _EMPTY_;
    private String o103 = _EMPTY_;
    private String o104 = _EMPTY_;
    private String o10401 = _EMPTY_;
    private String o10402 = _EMPTY_;
    private String o10403 = _EMPTY_;
    private String o10404 = _EMPTY_;
    private String o10497 = _EMPTY_;
    private String o105 = _EMPTY_;
    private String o106 = _EMPTY_;
    private String o107 = _EMPTY_;
    private String o10701 = _EMPTY_;
    private String o10702 = _EMPTY_;
    private String o10703 = _EMPTY_;
    private String o10704 = _EMPTY_;
    private String o10797 = _EMPTY_;
    private String o108 = _EMPTY_;
    private String o10896x = _EMPTY_;

    //E1
    private String e101a = _EMPTY_;
    private String e101b = _EMPTY_;
    private String e101 = _EMPTY_;
    private String e102 = _EMPTY_;
    private String e102a = _EMPTY_;
    private String e103 = _EMPTY_;
    private String e104 = _EMPTY_;
    private String e105 = _EMPTY_;
    private String e106d = _EMPTY_;
    private String e106m = _EMPTY_;
    private String e106y = _EMPTY_;
    private String e107 = _EMPTY_;
    private String e109 = _EMPTY_;
    private String e108 = _EMPTY_;
    private String e110y = _EMPTY_;
    private String e110m = _EMPTY_;
    private String e110d = _EMPTY_;
    private String e111 = _EMPTY_;
    private String e11196x = _EMPTY_;
    private String e111a = _EMPTY_;
    private String e111a96x = _EMPTY_;
    private String e112 = _EMPTY_;
    private String e11296x = _EMPTY_;
    private String e107a = _EMPTY_;
    private String e109a = _EMPTY_;
    private String e108a = _EMPTY_;
    private String e110ay = _EMPTY_;
    private String e110am = _EMPTY_;
    private String e110ad = _EMPTY_;
    private String e111c = _EMPTY_;
    private String e111c96x = _EMPTY_;
    private String e112a = _EMPTY_;
    private String e112a96x = _EMPTY_;
    private String e113y = _EMPTY_;
    private String e113m = _EMPTY_;
    private String e114 = _EMPTY_;
    private String e115 = _EMPTY_;
    private String e118 = _EMPTY_;
    private String e119d = _EMPTY_;
    private String e119m = _EMPTY_;
    private String e119y = _EMPTY_;
    private String e120 = _EMPTY_;
    private String e121 = _EMPTY_;
    private String e122 = _EMPTY_;
    private String e12296x = _EMPTY_;

    //IM
    private String im01;
    private String im02;
    private String im02a;
    private String im02a96x;
    private String im03;
    private String im0396x;
    private String im04d;
    private String im04m;
    private String im04y;
    private String im0501d;
    private String im0501m;
    private String im0501y;
    private String im0502d;
    private String im0502m;
    private String im0502y;
    private String im0502ad;
    private String im0502am;
    private String im0502ay;
    private String im0503d;
    private String im0503m;
    private String im0503y;
    private String im0504d;
    private String im0504m;
    private String im0504y;
    private String im0505d;
    private String im0505m;
    private String im0505y;
    private String im0506d;
    private String im0506m;
    private String im0506y;
    private String im0507d;
    private String im0507m;
    private String im0507y;
    private String im0508d;
    private String im0508m;
    private String im0508y;
    private String im0509d;
    private String im0509m;
    private String im0509y;
    private String im0510d;
    private String im0510m;
    private String im0510y;
    private String im0511d;
    private String im0511m;
    private String im0511y;
    private String im0512d;
    private String im0512m;
    private String im0512y;
    private String im0513d;
    private String im0513m;
    private String im0513y;
    private String im0514d;
    private String im0514m;
    private String im0514y;
    private String im0515d;
    private String im0515m;
    private String im0515y;
    private String im0515ad;
    private String im0515am;
    private String im0515ay;
    private String im0515bd;
    private String im0515bm;
    private String im0515by;
    private String im0516d;
    private String im0516m;
    private String im0516y;
    private String im07;
    private String im08;
    private String im09;
    private String im10;
    private String im12;
    private String im1201x;
    private String im11;
    private String im11a;
    private String im14;
    private String im15;
    private String im1501x;
    private String im16;
    private String im17;
    private String im1701x;
    private String im18;
    private String im19;
    private String im1901x;
    private String im20;
    private String im20a;
    private String im20a01x;
    private String im21;
    private String im22;
    private String im2201x;
    private String im22a;
    private String im23;
    private String im2396x;
    private String im24;
    private String im2496x;
    private String im25;
    private String im2501x;
    private String im2502x;
    private String im26;
    private String im2601;
    private String im2602;
    private String im2603;
    private String im2604;
    private String im2605;
    private String im2606;
    private String im2607;
    private String im2608;
    private String im2609;
    private String im2610;
    private String im2611;
    private String im2612;
    private String im2613;
    private String im2614;
    private String im2615;
    private String im2616;
    private String im2617;
    private String im2698;
    private String im2696;
    private String im2696x;
    private String im27;
    private String im28;
    private String im29;
    private String im2901x;
    private String im30;
    private String im31;
    private String im32;
    private String im3201;
    private String im3202;
    private String im3203;
    private String im3204;
    private String im3205;
    private String im3206;
    private String im3207;
    private String im3208;
    private String im3209;
    private String im3210;
    private String im3211;
    private String im3212;
    private String im3213;
    private String im3298;
    private String im3296;
    private String im3296x;

    //F
    private String f101 = _EMPTY_;
    private String f101a = _EMPTY_;
    private String f101a01 = _EMPTY_;
    private String f101a02 = _EMPTY_;
    private String f101a03 = _EMPTY_;
    private String f101a04 = _EMPTY_;
    private String f101a05 = _EMPTY_;
    private String f101a06 = _EMPTY_;
    private String f101a07 = _EMPTY_;
    private String f101a08 = _EMPTY_;
    private String f101a09 = _EMPTY_;
    private String f101a10 = _EMPTY_;
    private String f101a11 = _EMPTY_;
    private String f101a12 = _EMPTY_;
    private String f101a13 = _EMPTY_;
    private String f101a14 = _EMPTY_;
    private String f101a15 = _EMPTY_;
    private String f101a96 = _EMPTY_;
    private String f101a96x = _EMPTY_;
    private String f101b = _EMPTY_;
    private String f101b01x = _EMPTY_;
    private String f102 = _EMPTY_;
    private String f10201 = _EMPTY_;
    private String f10202 = _EMPTY_;
    private String f10203 = _EMPTY_;
    private String f10204 = _EMPTY_;
    private String f10205 = _EMPTY_;
    private String f10206 = _EMPTY_;
    private String f10207 = _EMPTY_;
    private String f10208 = _EMPTY_;
    private String f10209 = _EMPTY_;
    private String f10210 = _EMPTY_;
    private String f10211 = _EMPTY_;
    private String f10296 = _EMPTY_;
    private String f10296x = _EMPTY_;
    private String f103 = _EMPTY_;
    private String f104 = _EMPTY_;
    private String f105 = _EMPTY_;
    private String f106 = _EMPTY_;
    private String f107 = _EMPTY_;
    private String f10796x = _EMPTY_;
    private String f108 = _EMPTY_;
    private String f10801x = _EMPTY_;
    private String f10802x = _EMPTY_;
    private String f110 = _EMPTY_;
    private String f11001 = _EMPTY_;
    private String f11002 = _EMPTY_;
    private String f11003 = _EMPTY_;
    private String f11004 = _EMPTY_;
    private String f11005 = _EMPTY_;
    private String f11006 = _EMPTY_;
    private String f11007 = _EMPTY_;
    private String f11008 = _EMPTY_;
    private String f11009 = _EMPTY_;
    private String f11097 = _EMPTY_;
    private String f11096 = _EMPTY_;
    private String f11096x = _EMPTY_;
    private String f111 = _EMPTY_;
    private String f112 = _EMPTY_;
    private String f113 = _EMPTY_;
    private String f11301x = _EMPTY_;
    private String f114 = _EMPTY_;
    private String f115 = _EMPTY_;
    private String f116 = _EMPTY_;
    private String f117 = _EMPTY_;
    private String f118m = _EMPTY_;
    private String f118d = _EMPTY_;
    private String f119 = _EMPTY_;
    private String f120 = _EMPTY_;
    private String f12001x = _EMPTY_;
    private String f121a = _EMPTY_;
    private String f12101 = _EMPTY_;
    private String f121b = _EMPTY_;
    private String f121b96x = _EMPTY_;
    private String f122 = _EMPTY_;
    private String f12201x = _EMPTY_;
    private String f123 = _EMPTY_;
    private String f12301 = _EMPTY_;
    private String f12302 = _EMPTY_;
    private String f12303 = _EMPTY_;
    private String f12304 = _EMPTY_;
    private String f12305 = _EMPTY_;
    private String f12306 = _EMPTY_;
    private String f12307 = _EMPTY_;
    private String f12308 = _EMPTY_;
    private String f12309 = _EMPTY_;
    private String f12310 = _EMPTY_;
    private String f12396 = _EMPTY_;
    private String f124 = _EMPTY_;
    private String f125 = _EMPTY_;
    private String f12501 = _EMPTY_;
    private String f12502 = _EMPTY_;
    private String f12503 = _EMPTY_;
    private String f12504 = _EMPTY_;
    private String f12505 = _EMPTY_;
    private String f12506 = _EMPTY_;
    private String f12507 = _EMPTY_;
    private String f126 = _EMPTY_;
    private String f12601 = _EMPTY_;
    private String f12602 = _EMPTY_;
    private String f12603 = _EMPTY_;
    private String f12604 = _EMPTY_;
    private String f12605 = _EMPTY_;
    private String f12606 = _EMPTY_;
    private String f12607 = _EMPTY_;
    private String f12608 = _EMPTY_;
    private String f127 = _EMPTY_;
    private String f12796x = _EMPTY_;
    private String f128 = _EMPTY_;
    private String f12801 = _EMPTY_;
    private String f12802 = _EMPTY_;
    private String f12803 = _EMPTY_;
    private String f12804 = _EMPTY_;
    private String f12805 = _EMPTY_;
    private String f12806 = _EMPTY_;
    private String f12807 = _EMPTY_;
    private String f12808 = _EMPTY_;
    private String f129 = _EMPTY_;
    private String f130 = _EMPTY_;
    private String f13001 = _EMPTY_;
    private String f13002 = _EMPTY_;
    private String f13003 = _EMPTY_;
    private String f13004 = _EMPTY_;
    private String f13005 = _EMPTY_;
    private String f13006 = _EMPTY_;
    private String f13007 = _EMPTY_;
    private String f13008 = _EMPTY_;
    private String f13009 = _EMPTY_;
    private String f13010 = _EMPTY_;
    private String f13011 = _EMPTY_;
    private String f13012 = _EMPTY_;
    private String f13013 = _EMPTY_;
    private String f13014 = _EMPTY_;
    private String f13015 = _EMPTY_;
    private String f13096 = _EMPTY_;
    private String f131 = _EMPTY_;
    private String f131a = _EMPTY_;
    private String f134 = _EMPTY_;
    private String f13401 = _EMPTY_;
    private String f13402 = _EMPTY_;
    private String f13403 = _EMPTY_;
    private String f13404 = _EMPTY_;
    private String f13405 = _EMPTY_;
    private String f13406 = _EMPTY_;
    private String f13407 = _EMPTY_;
    private String f13408 = _EMPTY_;
    private String f13409 = _EMPTY_;
    private String f13410 = _EMPTY_;

    //G
    private String g101 = _EMPTY_;
    private String g102 = _EMPTY_;
    private String g103 = _EMPTY_;
    private String g10301 = _EMPTY_;
    private String g10302 = _EMPTY_;
    private String g10303 = _EMPTY_;
    private String g10304 = _EMPTY_;
    private String g10305 = _EMPTY_;
    private String g10306 = _EMPTY_;
    private String g10307 = _EMPTY_;
    private String g10308 = _EMPTY_;
    private String g10309 = _EMPTY_;
    private String g10310 = _EMPTY_;
    private String g10311 = _EMPTY_;
    private String g10312 = _EMPTY_;
    private String g10313 = _EMPTY_;
    private String g10314 = _EMPTY_;
    private String g10315 = _EMPTY_;
    private String g10396 = _EMPTY_;
    private String g10396x = _EMPTY_;
    private String g104 = _EMPTY_;
    private String g10496x = _EMPTY_;
    private String g105 = _EMPTY_;
    private String g10501x = _EMPTY_;
    private String g106 = _EMPTY_;
    private String g107 = _EMPTY_;
    private String g10701x = _EMPTY_;
    private String g108 = _EMPTY_;
    private String g109 = _EMPTY_;
    private String g110 = _EMPTY_;
    private String g126 = _EMPTY_;
    private String g127 = _EMPTY_;
    private String g113 = _EMPTY_;
    private String g114 = _EMPTY_;
    private String g11496x = _EMPTY_;
    private String g115 = _EMPTY_;
    private String g116 = _EMPTY_;
    private String g117 = _EMPTY_;
    private String g11701x = _EMPTY_;
    private String g11702x = _EMPTY_;
    private String g11703x = _EMPTY_;
    private String g118 = _EMPTY_;
    private String g11801x = _EMPTY_;
    private String g119 = _EMPTY_;
    private String g120 = _EMPTY_;
    private String g12096x = _EMPTY_;
    private String g121 = _EMPTY_;
    private String g12196x = _EMPTY_;
    private String g122 = _EMPTY_;
    private String g123 = _EMPTY_;
    private String g12301 = _EMPTY_;
    private String g12302 = _EMPTY_;
    private String g12303 = _EMPTY_;
    private String g12304 = _EMPTY_;
    private String g12305 = _EMPTY_;
    private String g12306 = _EMPTY_;
    private String g12307 = _EMPTY_;
    private String g12308 = _EMPTY_;
    private String g124 = _EMPTY_;
    private String g1241 = _EMPTY_;
    private String g1242 = _EMPTY_;
    private String g1243 = _EMPTY_;
    private String g1244 = _EMPTY_;
    private String g1245 = _EMPTY_;
    private String g1246 = _EMPTY_;
    private String g1247 = _EMPTY_;
    private String g1248 = _EMPTY_;
    private String g1249 = _EMPTY_;
    private String g12410 = _EMPTY_;
    private String g12411 = _EMPTY_;
    private String g12412 = _EMPTY_;
    private String g12413 = _EMPTY_;
    private String g12401 = _EMPTY_;
    private String g1240101 = _EMPTY_;
    private String g1240102 = _EMPTY_;
    private String g1240103 = _EMPTY_;
    private String g1240104 = _EMPTY_;
    private String g1240105 = _EMPTY_;
    private String g1240106 = _EMPTY_;
    private String g1240107 = _EMPTY_;
    private String g1240108 = _EMPTY_;
    private String g1240109 = _EMPTY_;
    private String g1240110 = _EMPTY_;
    private String g1240111 = _EMPTY_;
    private String g1240112 = _EMPTY_;
    private String g1240113 = _EMPTY_;
    private String g1240114 = _EMPTY_;
    private String g12402 = _EMPTY_;
    private String g125 = _EMPTY_;
    private String g12501 = _EMPTY_;
    private String g1250101 = _EMPTY_;
    private String g1250102 = _EMPTY_;
    private String g1250103 = _EMPTY_;
    private String g1250104 = _EMPTY_;
    private String g1250105 = _EMPTY_;
    private String g1250106 = _EMPTY_;
    private String g1250107 = _EMPTY_;
    private String g1250108 = _EMPTY_;
    private String g128 = _EMPTY_;
    private String g129 = _EMPTY_;
    private String g130 = _EMPTY_;

    //H
    private String h101 = _EMPTY_;
    private String h10101x = _EMPTY_;
    private String h10102x = _EMPTY_;
    private String h102 = _EMPTY_;
    private String h103 = _EMPTY_;
    private String h104 = _EMPTY_;
    private String h10401 = _EMPTY_;
    private String h10402 = _EMPTY_;
    private String h10403 = _EMPTY_;
    private String h10496 = _EMPTY_;
    private String h10496x = _EMPTY_;
    private String h105 = _EMPTY_;
    private String h106 = _EMPTY_;
    private String h10601x = _EMPTY_;
    private String h107 = _EMPTY_;
    private String h10800 = _EMPTY_;
    private String h108a = _EMPTY_;
    private String h108 = _EMPTY_;
    private String h10896x = _EMPTY_;
    private String h10900 = _EMPTY_;
    private String h10901 = _EMPTY_;
    private String h109 = _EMPTY_;
    private String h1091 = _EMPTY_;
    private String h1092 = _EMPTY_;
    private String h1093 = _EMPTY_;
    private String h1094 = _EMPTY_;
    private String h1095 = _EMPTY_;
    private String h1096 = _EMPTY_;
    private String h1097 = _EMPTY_;
    private String h10997 = _EMPTY_;
    private String h10996 = _EMPTY_;
    private String h10996x = _EMPTY_;
    private String h11000 = _EMPTY_;
    private String h11001 = _EMPTY_;
    private String h110 = _EMPTY_;
    private String h111 = _EMPTY_;
    private String h11200 = _EMPTY_;
    private String h11201 = _EMPTY_;
    private String h11202 = _EMPTY_;
    private String h112 = _EMPTY_;
    private String h113 = _EMPTY_;
    private String h114 = _EMPTY_;
    private String h115 = _EMPTY_;
    private String h11502 = _EMPTY_;
    private String h1150201 = _EMPTY_;
    private String h1150202 = _EMPTY_;
    private String h1150203 = _EMPTY_;
    private String h1150204 = _EMPTY_;
    private String h1150205 = _EMPTY_;
    private String h1150206 = _EMPTY_;
    private String h1150207 = _EMPTY_;
    private String h1150208 = _EMPTY_;
    private String h1150209 = _EMPTY_;
    private String h1150296 = _EMPTY_;
    private String h1150296x = _EMPTY_;
    private String h116 = _EMPTY_;
    private String h117 = _EMPTY_;
    private String h118 = _EMPTY_;
    private String h119 = _EMPTY_;
    private String h120 = _EMPTY_;
    private String h121 = _EMPTY_;
    private String h122 = _EMPTY_;
    private String h12201x = _EMPTY_;
    private String h123 = _EMPTY_;
    private String h124 = _EMPTY_;
    private String h125 = _EMPTY_;
    private String h126 = _EMPTY_;
    private String h127 = _EMPTY_;
    private String h12796x = _EMPTY_;
    private String h128 = _EMPTY_;
    private String h12896x = _EMPTY_;
    private String h1291 = _EMPTY_;
    private String h1292 = _EMPTY_;
    private String h1293 = _EMPTY_;
    private String h1294 = _EMPTY_;
    private String h1295 = _EMPTY_;
    private String h1296 = _EMPTY_;
    private String h130 = _EMPTY_;
    private String h131 = _EMPTY_;
    private String h13101 = _EMPTY_;
    private String h1310101 = _EMPTY_;
    private String h1310102 = _EMPTY_;
    private String h1310103 = _EMPTY_;
    private String h1310104 = _EMPTY_;
    private String h1310105 = _EMPTY_;
    private String h1310106 = _EMPTY_;
    private String h1310107 = _EMPTY_;
    private String h132 = _EMPTY_;
    private String h132a = _EMPTY_;
    private String h132a96x = _EMPTY_;
    private String h133 = _EMPTY_;
    private String h13301 = _EMPTY_;
    private String h13302 = _EMPTY_;
    private String h13303 = _EMPTY_;
    private String h13304 = _EMPTY_;
    private String h13305 = _EMPTY_;
    private String h13306 = _EMPTY_;
    private String h13307 = _EMPTY_;
    private String h13308 = _EMPTY_;
    private String h13309 = _EMPTY_;
    private String h13310 = _EMPTY_;
    private String h134 = _EMPTY_;
    private String h135 = _EMPTY_;
    private String h13501 = _EMPTY_;
    private String h13502 = _EMPTY_;
    private String h13503 = _EMPTY_;
    private String h13504 = _EMPTY_;
    private String h13505 = _EMPTY_;
    private String h13506 = _EMPTY_;
    private String h13507 = _EMPTY_;
    private String h13508 = _EMPTY_;
    private String h13509 = _EMPTY_;
    private String h13598 = _EMPTY_;
    private String h136 = _EMPTY_;
    private String h1361 = _EMPTY_;
    private String h1362 = _EMPTY_;
    private String h1363 = _EMPTY_;
    private String h1364 = _EMPTY_;
    private String h1365 = _EMPTY_;
    private String h1366 = _EMPTY_;
    private String h13696 = _EMPTY_;
    private String h13696x = _EMPTY_;
    private String h13601 = _EMPTY_;
    private String h13602 = _EMPTY_;
    private String h1360201 = _EMPTY_;
    private String h1360202 = _EMPTY_;
    private String h1360203 = _EMPTY_;
    private String h1360204 = _EMPTY_;
    private String h1360205 = _EMPTY_;
    private String h1360206 = _EMPTY_;
    private String h1360207 = _EMPTY_;
    private String h1360208 = _EMPTY_;
    private String h1360209 = _EMPTY_;
    private String h1360210 = _EMPTY_;
    private String h1360298 = _EMPTY_;
    private String h13603 = _EMPTY_;
    private String h137 = _EMPTY_;
    private String h13701 = _EMPTY_;
    private String h1370196x = _EMPTY_;
    private String h13702 = _EMPTY_;
    private String h13703 = _EMPTY_;
    private String h1370396x = _EMPTY_;
    private String h201 = _EMPTY_;
    private String h20101x = _EMPTY_;
    private String h20102x = _EMPTY_;
    private String h20103x = _EMPTY_;
    private String h202 = _EMPTY_;
    private String h203 = _EMPTY_;
    private String h20301x = _EMPTY_;
    private String h20302x = _EMPTY_;
    private String h20303x = _EMPTY_;
    private String h204 = _EMPTY_;
    private String h20496x = _EMPTY_;
    private String h205 = _EMPTY_;
    private String h20596x = _EMPTY_;
    private String h205a = _EMPTY_;
    private String h205a01 = _EMPTY_;
    private String h205a02 = _EMPTY_;
    private String h205a03 = _EMPTY_;
    private String h205a04 = _EMPTY_;
    private String h205a05 = _EMPTY_;
    private String h205a06 = _EMPTY_;
    private String h205a07 = _EMPTY_;
    private String h205a08 = _EMPTY_;
    private String h205a09 = _EMPTY_;
    private String h205a10 = _EMPTY_;
    private String h205a96 = _EMPTY_;
    private String h205a96x = _EMPTY_;
    private String h206 = _EMPTY_;
    private String h207 = _EMPTY_;
    private String h20701 = _EMPTY_;
    private String h20702 = _EMPTY_;
    private String h20703 = _EMPTY_;
    private String h20704 = _EMPTY_;
    private String h20705 = _EMPTY_;
    private String h20706 = _EMPTY_;
    private String h20707 = _EMPTY_;
    private String h20708 = _EMPTY_;
    private String h20798 = _EMPTY_;
    private String h208 = _EMPTY_;
    private String h20801 = _EMPTY_;
    private String h20802 = _EMPTY_;
    private String h20803 = _EMPTY_;
    private String h20804 = _EMPTY_;
    private String h20805 = _EMPTY_;
    private String h20806 = _EMPTY_;
    private String h20896 = _EMPTY_;
    private String h20896x = _EMPTY_;
    private String h208a = _EMPTY_;
    private String h208b = _EMPTY_;
    private String h208b01 = _EMPTY_;
    private String h208b02 = _EMPTY_;
    private String h208b03 = _EMPTY_;
    private String h208b04 = _EMPTY_;
    private String h208b05 = _EMPTY_;
    private String h208b06 = _EMPTY_;
    private String h208b07 = _EMPTY_;
    private String h208b08 = _EMPTY_;
    private String h208b09 = _EMPTY_;
    private String h208b98 = _EMPTY_;
    private String h208c = _EMPTY_;
    private String h208d = _EMPTY_;
    private String h208d96x = _EMPTY_;
    private String h209 = _EMPTY_;
    private String h209a = _EMPTY_;
    private String h209a96x = _EMPTY_;
    private String h210 = _EMPTY_;
    private String h211 = _EMPTY_;
    private String h21101 = _EMPTY_;
    private String h21102 = _EMPTY_;
    private String h21103 = _EMPTY_;
    private String h21104 = _EMPTY_;
    private String h21105 = _EMPTY_;
    private String h21106 = _EMPTY_;
    private String h21107 = _EMPTY_;
    private String h21108 = _EMPTY_;
    private String h21109 = _EMPTY_;
    private String h21110 = _EMPTY_;
    private String h212 = _EMPTY_;
    private String h213 = _EMPTY_;
    private String h214 = _EMPTY_;
    private String h214a = _EMPTY_;
    private String h214b = _EMPTY_;
    private String h214b01 = _EMPTY_;
    private String h214b02 = _EMPTY_;
    private String h214b03 = _EMPTY_;
    private String h214b04 = _EMPTY_;
    private String h214b05 = _EMPTY_;
    private String h214b06 = _EMPTY_;
    private String h214b96 = _EMPTY_;
    private String h214b96x = _EMPTY_;
    private String h214b98 = _EMPTY_;
    private String h215 = _EMPTY_;
    private String h216 = _EMPTY_;
    private String h216a = _EMPTY_;
    private String h216a96x = _EMPTY_;
    private String h217 = _EMPTY_;
    private String h21796x = _EMPTY_;
    private String h218 = _EMPTY_;
    private String h219 = _EMPTY_;
    private String h21996x = _EMPTY_;
    private String h22001 = _EMPTY_;
    private String h22002 = _EMPTY_;
    private String h22003 = _EMPTY_;
    private String h22004 = _EMPTY_;
    private String h22005 = _EMPTY_;
    private String h22006 = _EMPTY_;
    private String h22096 = _EMPTY_;
    private String h221 = _EMPTY_;
    private String h222 = _EMPTY_;
    private String h22296x = _EMPTY_;
    private String h223 = _EMPTY_;

    //K
    private String k101 = _EMPTY_;
    private String k101a = _EMPTY_;
    private String k101a01 = _EMPTY_;
    private String k101a02 = _EMPTY_;
    private String k101a03 = _EMPTY_;
    private String k101a04 = _EMPTY_;
    private String k101a05 = _EMPTY_;
    private String k101a06 = _EMPTY_;
    private String k101a07 = _EMPTY_;
    private String k101a08 = _EMPTY_;
    private String k101a09 = _EMPTY_;
    private String k101a10 = _EMPTY_;
    private String k101a11 = _EMPTY_;
    private String k101a12 = _EMPTY_;
    private String k101a13 = _EMPTY_;
    private String k101a14 = _EMPTY_;
    private String k101a15 = _EMPTY_;
    private String k101a16 = _EMPTY_;
    private String k101a96 = _EMPTY_;
    private String k101a96x = _EMPTY_;
    private String k101b = _EMPTY_;
    private String k102 = _EMPTY_;
    private String k103 = _EMPTY_;
    private String k104 = _EMPTY_;
    private String k10401 = _EMPTY_;
    private String k10402 = _EMPTY_;
    private String k10403 = _EMPTY_;
    private String k10404 = _EMPTY_;
    private String k10405 = _EMPTY_;
    private String k10406 = _EMPTY_;
    private String k10407 = _EMPTY_;
    private String k10408 = _EMPTY_;
    private String k10409 = _EMPTY_;
    private String k10410 = _EMPTY_;
    private String k10411 = _EMPTY_;
    private String k10412 = _EMPTY_;
    private String k10413 = _EMPTY_;
    private String k105 = _EMPTY_;
    private String k105a = _EMPTY_;
    private String k105a01 = _EMPTY_;
    private String k105a01x = _EMPTY_;
    private String k105a02 = _EMPTY_;
    private String k105a02x = _EMPTY_;
    private String k105a99 = _EMPTY_;
    private String k105b = _EMPTY_;
    private String k106 = _EMPTY_;
    private String k10601 = _EMPTY_;
    private String k10602 = _EMPTY_;
    private String k10603 = _EMPTY_;
    private String k10604 = _EMPTY_;
    private String k10605 = _EMPTY_;
    private String k10606 = _EMPTY_;
    private String k10607 = _EMPTY_;
    private String k10608 = _EMPTY_;
    private String k10696 = _EMPTY_;
    private String k10696x = _EMPTY_;
    private String k107 = _EMPTY_;
    private String k107a = _EMPTY_;
    private String k107a01 = _EMPTY_;
    private String k107a02 = _EMPTY_;
    private String k107a03 = _EMPTY_;
    private String k107a04 = _EMPTY_;
    private String k107a05 = _EMPTY_;
    private String k107a06 = _EMPTY_;
    private String k107a07 = _EMPTY_;
    private String k107a08 = _EMPTY_;
    private String k107a99 = _EMPTY_;
    private String k108 = _EMPTY_;
    private String k108a = _EMPTY_;
    private String k109 = _EMPTY_;

    //UN
    private String un01 = _EMPTY_;
    private String un02 = _EMPTY_;
    private String un03 = _EMPTY_;
    private String un04 = _EMPTY_;
    private String un0401x = _EMPTY_;
    private String un0402x = _EMPTY_;
    private String un05 = _EMPTY_;
    private String un06 = _EMPTY_;
    private String un0696x = _EMPTY_;
    private String un07 = _EMPTY_;
    private String un0701x = _EMPTY_;
    private String un0702x = _EMPTY_;
    private String un0703x = _EMPTY_;
    private String un0704x = _EMPTY_;

    //L
    private String l101 = _EMPTY_;
    private String l102 = _EMPTY_;
    private String l102a = _EMPTY_;
    private String l102a96x = _EMPTY_;
    private String l103 = _EMPTY_;
    private String l104 = _EMPTY_;
    private String l10496x = _EMPTY_;
    private String l105 = _EMPTY_;
    private String l106 = _EMPTY_;
    private String l10696x = _EMPTY_;
    private String l107 = _EMPTY_;
    private String l10796x = _EMPTY_;
    private String l108 = _EMPTY_;
    private String l10896x = _EMPTY_;
    private String l109 = _EMPTY_;
    private String l10996x = _EMPTY_;
    private String l110 = _EMPTY_;
    private String l111 = _EMPTY_;
    private String l1121 = _EMPTY_;
    private String l1122 = _EMPTY_;
    private String l1123 = _EMPTY_;
    private String l1124 = _EMPTY_;
    private String l1125 = _EMPTY_;
    private String lg101 = _EMPTY_;
    private String lg102 = _EMPTY_;
    private String lg10201 = _EMPTY_;
    private String lg10202 = _EMPTY_;
    private String lg10203 = _EMPTY_;
    private String lg10204 = _EMPTY_;
    private String lg10205 = _EMPTY_;
    private String lg10206 = _EMPTY_;
    private String lg10207 = _EMPTY_;
    private String lg10208 = _EMPTY_;
    private String lg10209 = _EMPTY_;
    private String lg10296 = _EMPTY_;
    private String lg10296x = _EMPTY_;
    private String lg103 = _EMPTY_;
    private String lg104 = _EMPTY_;
    private String lg10401 = _EMPTY_;
    private String lg10402 = _EMPTY_;
    private String lg10403 = _EMPTY_;
    private String lg10404 = _EMPTY_;
    private String lg10405 = _EMPTY_;
    private String lg10406 = _EMPTY_;
    private String lg10407 = _EMPTY_;
    private String lg10408 = _EMPTY_;
    private String lg10409 = _EMPTY_;
    private String lg10410 = _EMPTY_;
    private String lg10411 = _EMPTY_;
    private String lg10412 = _EMPTY_;
    private String lg10413 = _EMPTY_;
    private String lg10414 = _EMPTY_;
    private String lg10415 = _EMPTY_;
    private String lg10416 = _EMPTY_;
    private String lg105 = _EMPTY_;
    private String lg106 = _EMPTY_;
    private String lg10601 = _EMPTY_;
    private String lg10602 = _EMPTY_;
    private String lg10603 = _EMPTY_;
    private String lg10604 = _EMPTY_;
    private String lg10605 = _EMPTY_;
    private String lg10606 = _EMPTY_;
    private String lg10607 = _EMPTY_;
    private String lg10696 = _EMPTY_;
    private String lg10696x = _EMPTY_;
    private String l1131 = _EMPTY_;
    private String l1132 = _EMPTY_;
    private String l1133 = _EMPTY_;
    private String l1134 = _EMPTY_;
    private String l114 = _EMPTY_;
    private String l11496x = _EMPTY_;
    private String l115 = _EMPTY_;
    private String l11596x = _EMPTY_;
    private String l116 = _EMPTY_;
    private String l11696x = _EMPTY_;
    private String l117 = _EMPTY_;
    private String l11796x = _EMPTY_;


    public Forms() {
    }


    public void populateMeta() {

        setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setClusterCode(MainApp.currentHousehold.getClusterCode());
        setHhid(MainApp.currentHousehold.getHhno());
        setSno(MainApp.currentHousehold.getSno());

        //SECTION VARIABLES
        setA101(MainApp.currentHousehold.getClusterCode());
        setA105(selectedDistrict);
        setA106(selectedTehsil);
        setA107(selectedUC);
        setA113(MainApp.currentHousehold.getHhno());

    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Bindable
    public String getClusterCode() {
        return clusterCode;
    }

    public void setClusterCode(String clusterCode) {
        this.clusterCode = clusterCode;
        notifyPropertyChanged(BR.clusterCode);
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
        notifyPropertyChanged(BR.hhid);
    }

    @Bindable
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
        notifyPropertyChanged(BR.sno);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }


    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
        // this.o108 = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }



    @Bindable
    public String getA101() {
        return a101;
    }

    public void setA101(String a101) {
        this.a101 = a101;
        notifyPropertyChanged(BR.a101);
    }


    @Bindable
    public String getA104() {
        return a104;
    }

    public void setA104(String a104) {
        this.a104 = a104;
        notifyPropertyChanged(BR.a104);
    }

    @Bindable
    public String getA105() {
        return a105;
    }

    public void setA105(String a105) {
        this.a105 = a105;
        notifyPropertyChanged(BR.a105);
    }

    @Bindable
    public String getA106() {
        return a106;
    }

    public void setA106(String a106) {
        this.a106 = a106;
        notifyPropertyChanged(BR.a106);
    }

    @Bindable
    public String getA107() {
        return a107;
    }

    public void setA107(String a107) {
        this.a107 = a107;
        notifyPropertyChanged(BR.a107);
    }

    @Bindable
    public String getA108() {
        return a108;
    }

    public void setA108(String a108) {
        this.a108 = a108;
        notifyPropertyChanged(BR.a108);
    }

    @Bindable
    public String getA103() {
        return a103;
    }

    public void setA103(String a103) {
        this.a103 = a103;
        notifyPropertyChanged(BR.a103);
    }

    @Bindable
    public String getA113() {
        return a113;
    }

    public void setA113(String a113) {
        this.a113 = a113;
        notifyPropertyChanged(BR.a113);
    }

    @Bindable
    public String getA109() {
        return a109;
    }

    public void setA109(String a109) {
        this.a109 = a109;
        notifyPropertyChanged(BR.a109);
    }

    @Bindable
    public String getA110() {
        return a110;
    }

    public void setA110(String a110) {
        this.a110 = a110;
        notifyPropertyChanged(BR.a110);
    }

    @Bindable
    public String getA111() {
        return a111;
    }

    public void setA111(String a111) {
        this.a111 = a111;
        notifyPropertyChanged(BR.a111);
    }

    @Bindable
    public String getA112() {
        return a112;
    }

    public void setA112(String a112) {
        this.a112 = a112;
        notifyPropertyChanged(BR.a112);
    }

    @Bindable
    public String getA11201() {
        return a11201;
    }

    public void setA11201(String a11201) {
        if (this.a11201.equals(a11201)) return;     //For all checkboxes
        this.a11201 = a11201;
        setA11201x(a11201.equals("1") ? this.a11201x : "");
        notifyPropertyChanged(BR.a11201);
    }

    @Bindable
    public String getA11201x() {
        return a11201x;
    }

    public void setA11201x(String a11201x) {
        this.a11201x = a11201x;
        notifyPropertyChanged(BR.a11201x);
    }

    @Bindable
    public String getA11203() {
        return a11203;
    }

    public void setA11203(String a11203) {
        if (this.a11203.equals(a11203)) return;     //For all checkboxes
        this.a11203 = a11203;
        setA112(a11203.equals("97") ? "" : this.a112);
        notifyPropertyChanged(BR.a11203);
    }

    @Bindable
    public String getC101() {
        return c101;
    }

    public void setC101(String c101) {
        this.c101 = c101;
        notifyPropertyChanged(BR.c101);
    }

    @Bindable
    public String getC102() {
        return c102;
    }

    public void setC102(String c102) {
        this.c102 = c102;
        notifyPropertyChanged(BR.c102);
    }

    @Bindable
    public String getC103() {
        return c103;
    }

    public void setC103(String c103) {
        this.c103 = c103;
        notifyPropertyChanged(BR.c103);
    }




    @Bindable
    public String getM101() {
        return m101;
    }

    public void setM101(String m101) {
        this.m101 = m101;
        notifyPropertyChanged(BR.m101);
    }

    @Bindable
    public String getM102() {
        return m102;
    }

    public void setM102(String m102) {
        this.m102 = m102;
        notifyPropertyChanged(BR.m102);
    }

    @Bindable
    public String getM103() {
        return m103;
    }

    public void setM103(String m103) {
        this.m103 = m103;
        notifyPropertyChanged(BR.m103);
    }

    @Bindable
    public String getM104() {
        return m104;
    }

    public void setM104(String m104) {
        this.m104 = m104;
        notifyPropertyChanged(BR.m104);
    }

    @Bindable
    public String getM105() {
        return m105;
    }

    public void setM105(String m105) {
        this.m105 = m105;
        notifyPropertyChanged(BR.m105);
    }

    @Bindable
    public String getM106() {
        return m106;
    }

    public void setM106(String m106) {
        this.m106 = m106;
        notifyPropertyChanged(BR.m106);
    }

    @Bindable
    public String getM1071() {
        return m1071;
    }

    public void setM1071(String m1071) {
        this.m1071 = m1071;
        notifyPropertyChanged(BR.m1071);
    }

    @Bindable
    public String getM1072() {
        return m1072;
    }

    public void setM1072(String m1072) {
        this.m1072 = m1072;
        notifyPropertyChanged(BR.m1072);
    }

    @Bindable
    public String getM1073() {
        return m1073;
    }

    public void setM1073(String m1073) {
        this.m1073 = m1073;
        notifyPropertyChanged(BR.m1073);
    }

    @Bindable
    public String getM1074() {
        return m1074;
    }

    public void setM1074(String m1074) {
        this.m1074 = m1074;
        notifyPropertyChanged(BR.m1074);
    }

    @Bindable
    public String getM1075() {
        return m1075;
    }

    public void setM1075(String m1075) {
        this.m1075 = m1075;
        notifyPropertyChanged(BR.m1075);
    }

    @Bindable
    public String getM1076() {
        return m1076;
    }

    public void setM1076(String m1076) {
        this.m1076 = m1076;
        notifyPropertyChanged(BR.m1076);
    }

    @Bindable
    public String getM1077() {
        return m1077;
    }

    public void setM1077(String m1077) {
        this.m1077 = m1077;
        notifyPropertyChanged(BR.m1077);
    }

    @Bindable
    public String getM1078() {
        return m1078;
    }

    public void setM1078(String m1078) {
        this.m1078 = m1078;
        notifyPropertyChanged(BR.m1078);
    }

    @Bindable
    public String getM1079() {
        return m1079;
    }

    public void setM1079(String m1079) {
        this.m1079 = m1079;
        notifyPropertyChanged(BR.m1079);
    }

    @Bindable
    public String getM018() {
        return m018;
    }

    public void setM018(String m018) {
        this.m018 = m018;
        notifyPropertyChanged(BR.m018);
    }

    @Bindable
    public String getM109() {
        return m109;
    }

    public void setM109(String m109) {
        this.m109 = m109;
        notifyPropertyChanged(BR.m109);
    }

    @Bindable
    public String getM110() {
        return m110;
    }

    public void setM110(String m110) {
        this.m110 = m110;
        notifyPropertyChanged(BR.m110);
    }

    @Bindable
    public String getM11001x() {
        return m11001x;
    }

    public void setM11001x(String m11001x) {
        this.m11001x = m11001x;
        notifyPropertyChanged(BR.m11001x);
    }

    @Bindable
    public String getM11002x() {
        return m11002x;
    }

    public void setM11002x(String m11002x) {
        this.m11002x = m11002x;
        notifyPropertyChanged(BR.m11002x);
    }

    @Bindable
    public String getM111() {
        return m111;
    }

    public void setM111(String m111) {
        this.m111 = m111;
        notifyPropertyChanged(BR.m111);
    }

    @Bindable
    public String getM112() {
        return m112;
    }

    public void setM112(String m112) {
        this.m112 = m112;
        notifyPropertyChanged(BR.m112);
    }

    @Bindable
    public String getM11201() {
        return m11201;
    }

    public void setM11201(String m11201) {
        if (this.m11201.equals(m11201)) return; // for all checkboxes
        this.m11201 = m11201;
        setM11201x(m11201.equals("1") ? this.m11201x : "");
        notifyPropertyChanged(BR.m11201);
    }

    @Bindable
    public String getM11201x() {
        return m11201x;
    }

    public void setM11201x(String m11201x) {
        this.m11201x = m11201x;
        notifyPropertyChanged(BR.m11201x);
    }

    @Bindable
    public String getM11202() {
        return m11202;
    }

    public void setM11202(String m11202) {
        if (this.m11202.equals(m11202)) return; // for all checkboxes
        this.m11202 = m11202;
        setM11202x(m11202.equals("2") ? this.m11202x : "");
        notifyPropertyChanged(BR.m11202);
    }

    @Bindable
    public String getM11202x() {
        return m11202x;
    }

    public void setM11202x(String m11202x) {
        this.m11202x = m11202x;
        notifyPropertyChanged(BR.m11202x);
    }

    @Bindable
    public String getM11203() {
        return m11203;
    }

    public void setM11203(String m11203) {
        if (this.m11203.equals(m11203)) return; // for all checkboxes
        this.m11203 = m11203;
        setM11203x(m11203.equals("3") ? this.m11203x : "");
        notifyPropertyChanged(BR.m11203);
    }

    @Bindable
    public String getM11203x() {
        return m11203x;
    }

    public void setM11203x(String m11203x) {
        this.m11203x = m11203x;
        notifyPropertyChanged(BR.m11203x);
    }

    @Bindable
    public String getM11204() {
        return m11204;
    }

    public void setM11204(String m11204) {
        if (this.m11204.equals(m11204)) return; // for all checkboxes
        this.m11204 = m11204;
        setM11204x(m11204.equals("4") ? this.m11204x : "");
        notifyPropertyChanged(BR.m11204);
    }

    @Bindable
    public String getM11204x() {
        return m11204x;
    }

    public void setM11204x(String m11204x) {
        this.m11204x = m11204x;
        notifyPropertyChanged(BR.m11204x);
    }

    @Bindable
    public String getM11205() {
        return m11205;
    }

    public void setM11205(String m11205) {
        if (this.m11205.equals(m11205)) return; // for all checkboxes
        this.m11205 = m11205;
        setM11205x(m11205.equals("5") ? this.m11205x : "");
        notifyPropertyChanged(BR.m11205);
    }

    @Bindable
    public String getM11205x() {
        return m11205x;
    }

    public void setM11205x(String m11205x) {
        this.m11205x = m11205x;
        notifyPropertyChanged(BR.m11205x);
    }

    @Bindable
    public String getM11206() {
        return m11206;
    }

    public void setM11206(String m11206) {
        if (this.m11206.equals(m11206)) return; // for all checkboxes
        this.m11206 = m11206;
        setM11206x(m11206.equals("6") ? this.m11206x : "");
        notifyPropertyChanged(BR.m11206);
    }

    @Bindable
    public String getM11206x() {
        return m11206x;
    }

    public void setM11206x(String m11206x) {
        this.m11206x = m11206x;
        notifyPropertyChanged(BR.m11206x);
    }

    @Bindable
    public String getM11207() {
        return m11207;
    }

    public void setM11207(String m11207) {
        if (this.m11207.equals(m11207)) return; // for all checkboxes
        this.m11207 = m11207;
        setM11207x(m11207.equals("7") ? this.m11207x : "");
        notifyPropertyChanged(BR.m11207);
    }

    @Bindable
    public String getM11207x() {
        return m11207x;
    }

    public void setM11207x(String m11207x) {
        this.m11207x = m11207x;
        notifyPropertyChanged(BR.m11207x);
    }

    @Bindable
    public String getM113() {
        return m113;
    }

    public void setM113(String m113) {
        this.m113 = m113;
        notifyPropertyChanged(BR.m113);
    }

    @Bindable
    public String getM1141() {
        return m1141;
    }

    public void setM1141(String m1141) {
        this.m1141 = m1141;
        notifyPropertyChanged(BR.m1141);
    }

    @Bindable
    public String getM1142() {
        return m1142;
    }

    public void setM1142(String m1142) {
        this.m1142 = m1142;
        notifyPropertyChanged(BR.m1142);
    }

    @Bindable
    public String getM1143() {
        return m1143;
    }

    public void setM1143(String m1143) {
        this.m1143 = m1143;
        notifyPropertyChanged(BR.m1143);
    }

    @Bindable
    public String getM1144() {
        return m1144;
    }

    public void setM1144(String m1144) {
        this.m1144 = m1144;
        notifyPropertyChanged(BR.m1144);
    }

    @Bindable
    public String getM1145() {
        return m1145;
    }

    public void setM1145(String m1145) {
        this.m1145 = m1145;
        notifyPropertyChanged(BR.m1145);
    }

    @Bindable
    public String getM1146() {
        return m1146;
    }

    public void setM1146(String m1146) {
        this.m1146 = m1146;
        notifyPropertyChanged(BR.m1146);
    }

    @Bindable
    public String getM1147() {
        return m1147;
    }

    public void setM1147(String m1147) {
        this.m1147 = m1147;
        notifyPropertyChanged(BR.m1147);
    }

    @Bindable
    public String getM1148() {
        return m1148;
    }

    public void setM1148(String m1148) {
        this.m1148 = m1148;
        notifyPropertyChanged(BR.m1148);
    }

    @Bindable
    public String getM1149() {
        return m1149;
    }

    public void setM1149(String m1149) {
        this.m1149 = m1149;
        notifyPropertyChanged(BR.m1149);
    }

    @Bindable
    public String getM11410() {
        return m11410;
    }

    public void setM11410(String m11410) {
        this.m11410 = m11410;
        notifyPropertyChanged(BR.m11410);
    }

    @Bindable
    public String getM11411() {
        return m11411;
    }

    public void setM11411(String m11411) {
        this.m11411 = m11411;
        notifyPropertyChanged(BR.m11411);
    }

    @Bindable
    public String getM11412() {
        return m11412;
    }

    public void setM11412(String m11412) {
        this.m11412 = m11412;
        notifyPropertyChanged(BR.m11412);
    }

    @Bindable
    public String getM11413() {
        return m11413;
    }

    public void setM11413(String m11413) {
        this.m11413 = m11413;
        notifyPropertyChanged(BR.m11413);
    }

    @Bindable
    public String getM11414() {
        return m11414;
    }

    public void setM11414(String m11414) {
        this.m11414 = m11414;
        notifyPropertyChanged(BR.m11414);
    }

    @Bindable
    public String getM11415() {
        return m11415;
    }

    public void setM11415(String m11415) {
        this.m11415 = m11415;
        notifyPropertyChanged(BR.m11415);
    }

    @Bindable
    public String getM11416() {
        return m11416;
    }

    public void setM11416(String m11416) {
        this.m11416 = m11416;
        notifyPropertyChanged(BR.m11416);
    }

    @Bindable
    public String getM11417() {
        return m11417;
    }

    public void setM11417(String m11417) {
        this.m11417 = m11417;
        notifyPropertyChanged(BR.m11417);
    }

    @Bindable
    public String getM11418() {
        return m11418;
    }

    public void setM11418(String m11418) {
        this.m11418 = m11418;
        notifyPropertyChanged(BR.m11418);
    }

    @Bindable
    public String getM115() {
        return m115;
    }

    public void setM115(String m115) {
        this.m115 = m115;
        notifyPropertyChanged(BR.m115);
    }

    @Bindable
    public String getM116() {
        return m116;
    }

    public void setM116(String m116) {
        this.m116 = m116;
        notifyPropertyChanged(BR.m116);
    }

    @Bindable
    public String getN101() {
        return n101;
    }

    public void setN101(String n101) {
        this.n101 = n101;
        notifyPropertyChanged(BR.n101);
    }

    @Bindable
    public String getN102() {
        return n102;
    }

    public void setN102(String n102) {
        this.n102 = n102;
        notifyPropertyChanged(BR.n102);
    }

    @Bindable
    public String getN103() {
        return n103;
    }

    public void setN103(String n103) {
        this.n103 = n103;
        notifyPropertyChanged(BR.n103);
    }

    @Bindable
    public String getN104() {
        return n104;
    }

    public void setN104(String n104) {
        this.n104 = n104;
        notifyPropertyChanged(BR.n104);
    }

    @Bindable
    public String getN10401x() {
        return n10401x;
    }

    public void setN10401x(String n10401x) {
        this.n10401x = n10401x;
        notifyPropertyChanged(BR.n10401x);
    }

    @Bindable
    public String getN105() {
        return n105;
    }

    public void setN105(String n105) {
        this.n105 = n105;
        notifyPropertyChanged(BR.n105);
    }

    @Bindable
    public String getN106() {
        return n106;
    }

    public void setN106(String n106) {
        this.n106 = n106;
        notifyPropertyChanged(BR.n106);
    }

    @Bindable
    public String getN107() {
        return n107;
    }

    public void setN107(String n107) {
        this.n107 = n107;
        notifyPropertyChanged(BR.n107);
    }

    @Bindable
    public String getN108() {
        return n108;
    }

    public void setN108(String n108) {
        this.n108 = n108;
        notifyPropertyChanged(BR.n108);
    }

    @Bindable
    public String getN109() {
        return n109;
    }

    public void setN109(String n109) {
        this.n109 = n109;
        notifyPropertyChanged(BR.n109);
    }

    @Bindable
    public String getN10901() {
        return n10901;
    }

    public void setN10901(String n10901) {
        if (this.n10901.equals(n10901)) return; // for all checkboxes
        this.n10901 = n10901;
        notifyPropertyChanged(BR.n10901);
    }

    @Bindable
    public String getN10902() {
        return n10902;
    }

    public void setN10902(String n10902) {
        if (this.n10902.equals(n10902)) return; // for all checkboxes
        this.n10902 = n10902;
        notifyPropertyChanged(BR.n10902);
    }

    @Bindable
    public String getN10903() {
        return n10903;
    }

    public void setN10903(String n10903) {
        if (this.n10903.equals(n10903)) return; // for all checkboxes
        this.n10903 = n10903;
        notifyPropertyChanged(BR.n10903);
    }

    @Bindable
    public String getN10904() {
        return n10904;
    }

    public void setN10904(String n10904) {
        if (this.n10904.equals(n10904)) return; // for all checkboxes
        this.n10904 = n10904;
        notifyPropertyChanged(BR.n10904);
    }

    @Bindable
    public String getN10905() {
        return n10905;
    }

    public void setN10905(String n10905) {
        if (this.n10905.equals(n10905)) return; // for all checkboxes
        this.n10905 = n10905;
        notifyPropertyChanged(BR.n10905);
    }

    @Bindable
    public String getN10906() {
        return n10906;
    }

    public void setN10906(String n10906) {
        if (this.n10906.equals(n10906)) return; // for all checkboxes
        this.n10906 = n10906;
        notifyPropertyChanged(BR.n10906);
    }

    @Bindable
    public String getN10907() {
        return n10907;
    }

    public void setN10907(String n10907) {
        if (this.n10907.equals(n10907)) return; // for all checkboxes
        this.n10907 = n10907;
        notifyPropertyChanged(BR.n10907);
    }

    @Bindable
    public String getN110() {
        return n110;
    }

    public void setN110(String n110) {
        this.n110 = n110;
        notifyPropertyChanged(BR.n110);
    }

    @Bindable
    public String getN111() {
        return n111;
    }

    public void setN111(String n111) {
        this.n111 = n111;
        notifyPropertyChanged(BR.n111);
    }

    @Bindable
    public String getN112() {
        return n112;
    }

    public void setN112(String n112) {
        this.n112 = n112;
        notifyPropertyChanged(BR.n112);
    }

    @Bindable
    public String getN113() {
        return n113;
    }

    public void setN113(String n113) {
        this.n113 = n113;
        setN11301x(n113.equals("1") ? this.n11301x : "");
        notifyPropertyChanged(BR.n113);
    }

    @Bindable
    public String getN11301x() {
        return n11301x;
    }

    public void setN11301x(String n11301x) {
        this.n11301x = n11301x;
        notifyPropertyChanged(BR.n11301x);
    }

    @Bindable
    public String getO101() {
        return o101;
    }

    public void setO101(String o101) {
        this.o101 = o101;
        notifyPropertyChanged(BR.o101);
    }

    @Bindable
    public String getO102() {
        return o102;
    }

    public void setO102(String o102) {
        this.o102 = o102;
        notifyPropertyChanged(BR.o102);
    }

    @Bindable
    public String getO103() {
        return o103;
    }

    public void setO103(String o103) {
        this.o103 = o103;
        notifyPropertyChanged(BR.o103);
    }

    @Bindable
    public String getO104() {
        return o104;
    }

    public void setO104(String o104) {
        this.o104 = o104;
        notifyPropertyChanged(BR.o104);
    }

    @Bindable
    public String getO10401() {
        return o10401;
    }

    public void setO10401(String o10401) {
        if (this.o10401.equals(o10401)) return; // for all checkboxes
        this.o10401 = o10401;
        notifyPropertyChanged(BR.o10401);
    }

    @Bindable
    public String getO10402() {
        return o10402;
    }

    public void setO10402(String o10402) {
        if (this.o10402.equals(o10402)) return; // for all checkboxes
        this.o10402 = o10402;
        notifyPropertyChanged(BR.o10402);
    }

    @Bindable
    public String getO10403() {
        return o10403;
    }

    public void setO10403(String o10403) {
        if (this.o10403.equals(o10403)) return; // for all checkboxes
        this.o10403 = o10403;
        notifyPropertyChanged(BR.o10403);
    }

    @Bindable
    public String getO10404() {
        return o10404;
    }

    public void setO10404(String o10404) {
        if (this.o10404.equals(o10404)) return; // for all checkboxes
        this.o10404 = o10404;
        notifyPropertyChanged(BR.o10404);
    }

    @Bindable
    public String getO10497() {
        return o10497;
    }

    public void setO10497(String o10497) {
        if (this.o10497.equals(o10497)) return; // for all checkboxes
        this.o10497 = o10497;

        setO10401(o10497.equals("97") ? "" : this.o10401);
        setO10402(o10497.equals("97") ? "" : this.o10402);
        setO10403(o10497.equals("97") ? "" : this.o10403);
        setO10404(o10497.equals("97") ? "" : this.o10404);
        notifyPropertyChanged(BR.o10497);
    }

    @Bindable
    public String getO105() {
        return o105;
    }

    public void setO105(String o105) {
        this.o105 = o105;
        notifyPropertyChanged(BR.o105);
    }

    @Bindable
    public String getO106() {
        return o106;
    }

    public void setO106(String o106) {
        this.o106 = o106;
        notifyPropertyChanged(BR.o106);
    }

    @Bindable
    public String getO107() {
        return o107;
    }

    public void setO107(String o107) {
        this.o107 = o107;
        notifyPropertyChanged(BR.o107);
    }

    @Bindable
    public String getO10701() {
        return o10701;
    }

    public void setO10701(String o10701) {
        if(this.o10701.equals(o10701)) return;      // For all checkboxes
        this.o10701 = o10701;
        notifyPropertyChanged(BR.o10701);
    }

    @Bindable
    public String getO10702() {
        return o10702;
    }

    public void setO10702(String o10702) {
        if(this.o10702.equals(o10702)) return;      // For all checkboxes
        this.o10702 = o10702;
        notifyPropertyChanged(BR.o10702);
    }

    @Bindable
    public String getO10703() {
        return o10703;
    }

    public void setO10703(String o10703) {
        if(this.o10703.equals(o10703)) return;      // For all checkboxes
        this.o10703 = o10703;
        notifyPropertyChanged(BR.o10703);
    }

    @Bindable
    public String getO10704() {
        return o10704;
    }

    public void setO10704(String o10704) {
        if(this.o10704.equals(o10704)) return;      // For all checkboxes
        this.o10704 = o10704;
        notifyPropertyChanged(BR.o10704);
    }

    @Bindable
    public String getO10797() {
        return o10797;
    }

    public void setO10797(String o10797) {
        if(this.o10797.equals(o10797)) return;      // For all checkboxes
        this.o10797 = o10797;

        setO10701(o10797.equals("97") ? "" : this.o10701);
        setO10702(o10797.equals("97") ? "" : this.o10702);
        setO10703(o10797.equals("97") ? "" : this.o10703);
        setO10704(o10797.equals("97") ? "" : this.o10704);
        notifyPropertyChanged(BR.o10797);
    }

    @Bindable
    public String getO108() {
        return o108;
    }

    public void setO108(String o108) {
        this.o108 = o108;
        setO108(o108.equals("96") ? this.o10896x : "");
        notifyPropertyChanged(BR.o108);
    }

    @Bindable
    public String getO10896x() {
        return o10896x;
    }

    public void setO10896x(String o10896x) {
        this.o10896x = o10896x;
        notifyPropertyChanged(BR.o10896x);
    }

    @Bindable
    public String getE101a() {
        return e101a;
    }

    public void setE101a(String e101a) {
        this.e101a = e101a;
        notifyPropertyChanged(BR.e101a);
    }

    @Bindable
    public String getE101b() {
        return e101b;
    }

    public void setE101b(String e101b) {
        this.e101b = e101b;
        notifyPropertyChanged(BR.e101b);
    }

    @Bindable
    public String getE101() {
        return e101;
    }

    public void setE101(String e101) {
        this.e101 = e101;
        notifyPropertyChanged(BR.e101);
    }

    @Bindable
    public String getE102() {
        return e102;
    }

    public void setE102(String e102) {
        this.e102 = e102;
        notifyPropertyChanged(BR.e102);
    }

    @Bindable
    public String getE102a() {
        return e102a;
    }

    public void setE102a(String e102a) {
        this.e102a = e102a;
        notifyPropertyChanged(BR.e102a);
    }

    @Bindable
    public String getE103() {
        return e103;
    }

    public void setE103(String e103) {
        this.e103 = e103;
        notifyPropertyChanged(BR.e103);
    }

    @Bindable
    public String getE104() {
        return e104;
    }

    public void setE104(String e104) {
        this.e104 = e104;
        notifyPropertyChanged(BR.e104);
    }

    @Bindable
    public String getE105() {
        return e105;
    }

    public void setE105(String e105) {
        this.e105 = e105;
        notifyPropertyChanged(BR.e105);
    }

    @Bindable
    public String getE106d() {
        return e106d;
    }

    public void setE106d(String e106d) {
        this.e106d = e106d;
        notifyPropertyChanged(BR.e106d);
    }

    @Bindable
    public String getE106m() {
        return e106m;
    }

    public void setE106m(String e106m) {
        this.e106m = e106m;
        notifyPropertyChanged(BR.e106m);
    }

    @Bindable
    public String getE106y() {
        return e106y;
    }

    public void setE106y(String e106y) {
        this.e106y = e106y;
        notifyPropertyChanged(BR.e106y);
    }

    @Bindable
    public String getE107() {
        return e107;
    }

    public void setE107(String e107) {
        this.e107 = e107;
        notifyPropertyChanged(BR.e107);
    }

    @Bindable
    public String getE109() {
        return e109;
    }

    public void setE109(String e109) {
        this.e109 = e109;
        notifyPropertyChanged(BR.e109);
    }

    @Bindable
    public String getE108() {
        return e108;
    }

    public void setE108(String e108) {
        this.e108 = e108;
        notifyPropertyChanged(BR.e108);
    }

    @Bindable
    public String getE110y() {
        return e110y;
    }

    public void setE110y(String e110y) {
        this.e110y = e110y;
        notifyPropertyChanged(BR.e110y);
    }

    @Bindable
    public String getE110m() {
        return e110m;
    }

    public void setE110m(String e110m) {
        this.e110m = e110m;
        notifyPropertyChanged(BR.e110m);
    }

    @Bindable
    public String getE110d() {
        return e110d;
    }

    public void setE110d(String e110d) {
        this.e110d = e110d;
        notifyPropertyChanged(BR.e110d);
    }

    @Bindable
    public String getE111() {
        return e111;
    }

    public void setE111(String e111) {
        this.e111 = e111;
        setE11196x(e111.equals("96") ? this.e11196x : "");

        notifyPropertyChanged(BR.e111);
    }

    @Bindable
    public String getE11196x() {
        return e11196x;
    }

    public void setE11196x(String e11196x) {
        this.e11196x = e11196x;
        notifyPropertyChanged(BR.e11196x);
    }

    @Bindable
    public String getE111a() {
        return e111a;
    }

    public void setE111a(String e111a) {
        this.e111a = e111a;
        setE111a96x(e111a96x.equals("96") ? this.e111a96x : "");
        notifyPropertyChanged(BR.e111a);
    }

    @Bindable
    public String getE111a96x() {
        return e111a96x;
    }

    public void setE111a96x(String e111a96x) {
        this.e111a96x = e111a96x;


        notifyPropertyChanged(BR.e111a96x);
    }

    @Bindable
    public String getE112() {
        return e112;
    }

    public void setE112(String e112) {
        this.e112 = e112;
        setE11296x(e112.equals("96") ? this.e11296x : "");
        notifyPropertyChanged(BR.e112);
    }

    @Bindable
    public String getE11296x() {
        return e11296x;
    }

    public void setE11296x(String e11296x) {
        this.e11296x = e11296x;
        notifyPropertyChanged(BR.e11296x);
    }

    @Bindable
    public String getE107a() {
        return e107a;
    }

    public void setE107a(String e107a) {
        this.e107a = e107a;
        notifyPropertyChanged(BR.e107a);
    }

    @Bindable
    public String getE109a() {
        return e109a;
    }

    public void setE109a(String e109a) {
        this.e109a = e109a;
        notifyPropertyChanged(BR.e109a);
    }

    @Bindable
    public String getE108a() {
        return e108a;
    }

    public void setE108a(String e108a) {
        this.e108a = e108a;
        notifyPropertyChanged(BR.e108a);
    }

    @Bindable
    public String getE110ay() {
        return e110ay;
    }

    public void setE110ay(String e110ay) {
        this.e110ay = e110ay;
        notifyPropertyChanged(BR.e110ay);
    }

    @Bindable
    public String getE110am() {
        return e110am;
    }

    public void setE110am(String e110am) {
        this.e110am = e110am;
        notifyPropertyChanged(BR.e110am);
    }

    @Bindable
    public String getE110ad() {
        return e110ad;
    }

    public void setE110ad(String e110ad) {
        this.e110ad = e110ad;
        notifyPropertyChanged(BR.e110ad);
    }

    @Bindable
    public String getE111c() {
        return e111c;
    }

    public void setE111c(String e111c) {
        this.e111c = e111c;
        setE111c96x(e111c.equals("96") ? this.e111c96x : "");
        notifyPropertyChanged(BR.e111c);
    }

    @Bindable
    public String getE111c96x() {
        return e111c96x;
    }

    public void setE111c96x(String e111c96x) {
        this.e111c96x = e111c96x;
        notifyPropertyChanged(BR.e111c96x);
    }

    @Bindable
    public String getE112a() {
        return e112a;
    }

    public void setE112a(String e112a) {
        this.e112a = e112a;
        setE112a96x(e112a.equals("96") ? this.e112a96x : "");

        notifyPropertyChanged(BR.e112a);
    }

    @Bindable
    public String getE112a96x() {
        return e112a96x;
    }

    public void setE112a96x(String e112a96x) {
        this.e112a96x = e112a96x;
        notifyPropertyChanged(BR.e112a96x);
    }

    @Bindable
    public String getE113y() {
        return e113y;
    }

    public void setE113y(String e113y) {
        this.e113y = e113y;
        notifyPropertyChanged(BR.e113y);
    }

    @Bindable
    public String getE113m() {
        return e113m;
    }

    public void setE113m(String e113m) {
        this.e113m = e113m;
        notifyPropertyChanged(BR.e113m);
    }

    @Bindable
    public String getE114() {
        return e114;
    }

    public void setE114(String e114) {
        this.e114 = e114;
        notifyPropertyChanged(BR.e114);
    }

    @Bindable
    public String getE115() {
        return e115;
    }

    public void setE115(String e115) {
        this.e115 = e115;
        notifyPropertyChanged(BR.e115);
    }

    @Bindable
    public String getE116() {
        return e116;
    }

    public void setE116(String e116) {
        this.e116 = e116;
        notifyPropertyChanged(BR.e116);
    }

    @Bindable
    public String getE117() {
        return e117;
    }

    public void setE117(String e117) {
        this.e117 = e117;
        notifyPropertyChanged(BR.e117);
    }

    @Bindable
    public String getE118() {
        return e118;
    }

    public void setE118(String e118) {
        this.e118 = e118;
        notifyPropertyChanged(BR.e118);
    }

    @Bindable
    public String getE119d() {
        return e119d;
    }

    public void setE119d(String e119d) {
        this.e119d = e119d;
        notifyPropertyChanged(BR.e119d);
    }

    @Bindable
    public String getE119m() {
        return e119m;
    }

    public void setE119m(String e119m) {
        this.e119m = e119m;
        notifyPropertyChanged(BR.e119m);
    }

    @Bindable
    public String getE119y() {
        return e119y;
    }

    public void setE119y(String e119y) {
        this.e119y = e119y;
        notifyPropertyChanged(BR.e119y);
    }

    @Bindable
    public String getE120() {
        return e120;
    }

    public void setE120(String e120) {
        this.e120 = e120;
        notifyPropertyChanged(BR.e120);
    }

    @Bindable
    public String getE121() {
        return e121;
    }

    public void setE121(String e121) {
        this.e121 = e121;
        notifyPropertyChanged(BR.e121);
    }

    @Bindable
    public String getE122() {
        return e122;
    }

    public void setE122(String e122) {
        this.e122 = e122;
        setE12296x(e122.equals("96") ? this.e12296x : "");
        notifyPropertyChanged(BR.e122);
    }

    @Bindable
    public String getE12296x() {
        return e12296x;
    }

    public void setE12296x(String e12296x) {
        this.e12296x = e12296x;
        notifyPropertyChanged(BR.e12296x);
    }


    /*ChildImmunization*/

    @Bindable
    public String getIm01() {
        return im01;
    }

    public void setIm01(String im01) {
        this.im01 = im01;
        notifyPropertyChanged(BR.im01);
    }

    @Bindable
    public String getIm02() {
        return im02;
    }

    public void setIm02(String im02) {
        this.im02 = im02;
        notifyPropertyChanged(BR.im02);
    }

    @Bindable
    public String getIm02a() {
        return im02a;
    }

    public void setIm02a(String im02a) {
        this.im02a = im02a;
        notifyPropertyChanged(BR.im02a);
    }

    @Bindable
    public String getIm02a96x() {
        return im02a96x;
    }

    public void setIm02a96x(String im02a96x) {
        this.im02a96x = im02a96x;
        notifyPropertyChanged(BR.im02a96x);
    }

    @Bindable
    public String getIm03() {
        return im03;
    }

    public void setIm03(String im03) {
        this.im03 = im03;
        notifyPropertyChanged(BR.im03);
    }

    @Bindable
    public String getIm0396x() {
        return im0396x;
    }

    public void setIm0396x(String im0396x) {
        this.im0396x = im0396x;
        notifyPropertyChanged(BR.im0396x);
    }

    @Bindable
    public String getIm04d() {
        return im04d;
    }

    public void setIm04d(String im04d) {
        this.im04d = im04d;
        notifyPropertyChanged(BR.im04d);
    }

    @Bindable
    public String getIm04m() {
        return im04m;
    }

    public void setIm04m(String im04m) {
        this.im04m = im04m;
        notifyPropertyChanged(BR.im04m);
    }

    @Bindable
    public String getIm04y() {
        return im04y;
    }

    public void setIm04y(String im04y) {
        this.im04y = im04y;
        notifyPropertyChanged(BR.im04y);
    }

    @Bindable
    public String getIm0501d() {
        return im0501d;
    }

    public void setIm0501d(String im0501d) {
        this.im0501d = im0501d;
        notifyPropertyChanged(BR.im0501d);
    }

    @Bindable
    public String getIm0501m() {
        return im0501m;
    }

    public void setIm0501m(String im0501m) {
        this.im0501m = im0501m;
        notifyPropertyChanged(BR.im0501m);
    }

    @Bindable
    public String getIm0501y() {
        return im0501y;
    }

    public void setIm0501y(String im0501y) {
        this.im0501y = im0501y;
        notifyPropertyChanged(BR.im0501y);
    }

    @Bindable
    public String getIm0502d() {
        return im0502d;
    }

    public void setIm0502d(String im0502d) {
        this.im0502d = im0502d;
        notifyPropertyChanged(BR.im0502d);
    }

    @Bindable
    public String getIm0502m() {
        return im0502m;
    }

    public void setIm0502m(String im0502m) {
        this.im0502m = im0502m;
        notifyPropertyChanged(BR.im0502m);
    }

    @Bindable
    public String getIm0502y() {
        return im0502y;
    }

    public void setIm0502y(String im0502y) {
        this.im0502y = im0502y;
        notifyPropertyChanged(BR.im0502y);
    }

    @Bindable
    public String getIm0502ad() {
        return im0502ad;
    }

    public void setIm0502ad(String im0502ad) {
        this.im0502ad = im0502ad;
        notifyPropertyChanged(BR.im0502ad);
    }

    @Bindable
    public String getIm0502am() {
        return im0502am;
    }

    public void setIm0502am(String im0502am) {
        this.im0502am = im0502am;
        notifyPropertyChanged(BR.im0502am);
    }

    @Bindable
    public String getIm0502ay() {
        return im0502ay;
    }

    public void setIm0502ay(String im0502ay) {
        this.im0502ay = im0502ay;
        notifyPropertyChanged(BR.im0502ay);
    }

    @Bindable
    public String getIm0503d() {
        return im0503d;
    }

    public void setIm0503d(String im0503d) {
        this.im0503d = im0503d;
        notifyPropertyChanged(BR.im0503d);
    }

    @Bindable
    public String getIm0503m() {
        return im0503m;
    }

    public void setIm0503m(String im0503m) {
        this.im0503m = im0503m;
        notifyPropertyChanged(BR.im0503m);
    }

    @Bindable
    public String getIm0503y() {
        return im0503y;
    }

    public void setIm0503y(String im0503y) {
        this.im0503y = im0503y;
        notifyPropertyChanged(BR.im0503y);
    }

    @Bindable
    public String getIm0504d() {
        return im0504d;
    }

    public void setIm0504d(String im0504d) {
        this.im0504d = im0504d;
        notifyPropertyChanged(BR.im0504d);
    }

    @Bindable
    public String getIm0504m() {
        return im0504m;
    }

    public void setIm0504m(String im0504m) {
        this.im0504m = im0504m;
        notifyPropertyChanged(BR.im0504m);
    }

    @Bindable
    public String getIm0504y() {
        return im0504y;
    }

    public void setIm0504y(String im0504y) {
        this.im0504y = im0504y;
        notifyPropertyChanged(BR.im0504y);
    }

    @Bindable
    public String getIm0505d() {
        return im0505d;
    }

    public void setIm0505d(String im0505d) {
        this.im0505d = im0505d;
        notifyPropertyChanged(BR.im0505d);
    }

    @Bindable
    public String getIm0505m() {
        return im0505m;
    }

    public void setIm0505m(String im0505m) {
        this.im0505m = im0505m;
        notifyPropertyChanged(BR.im0505m);
    }

    @Bindable
    public String getIm0505y() {
        return im0505y;
    }

    public void setIm0505y(String im0505y) {
        this.im0505y = im0505y;
        notifyPropertyChanged(BR.im0505y);
    }

    @Bindable
    public String getIm0506d() {
        return im0506d;
    }

    public void setIm0506d(String im0506d) {
        this.im0506d = im0506d;
        notifyPropertyChanged(BR.im0506d);
    }

    @Bindable
    public String getIm0506m() {
        return im0506m;
    }

    public void setIm0506m(String im0506m) {
        this.im0506m = im0506m;
        notifyPropertyChanged(BR.im0506m);
    }

    @Bindable
    public String getIm0506y() {
        return im0506y;
    }

    public void setIm0506y(String im0506y) {
        this.im0506y = im0506y;
        notifyPropertyChanged(BR.im0506y);
    }

    @Bindable
    public String getIm0507d() {
        return im0507d;
    }

    public void setIm0507d(String im0507d) {
        this.im0507d = im0507d;
        notifyPropertyChanged(BR.im0507d);
    }

    @Bindable
    public String getIm0507m() {
        return im0507m;
    }

    public void setIm0507m(String im0507m) {
        this.im0507m = im0507m;
        notifyPropertyChanged(BR.im0507m);
    }

    @Bindable
    public String getIm0507y() {
        return im0507y;
    }

    public void setIm0507y(String im0507y) {
        this.im0507y = im0507y;
        notifyPropertyChanged(BR.im0507y);
    }

    @Bindable
    public String getIm0508d() {
        return im0508d;
    }

    public void setIm0508d(String im0508d) {
        this.im0508d = im0508d;
        notifyPropertyChanged(BR.im0508d);
    }

    @Bindable
    public String getIm0508m() {
        return im0508m;
    }

    public void setIm0508m(String im0508m) {
        this.im0508m = im0508m;
        notifyPropertyChanged(BR.im0508m);
    }

    @Bindable
    public String getIm0508y() {
        return im0508y;
    }

    public void setIm0508y(String im0508y) {
        this.im0508y = im0508y;
        notifyPropertyChanged(BR.im0508y);
    }

    @Bindable
    public String getIm0509d() {
        return im0509d;
    }

    public void setIm0509d(String im0509d) {
        this.im0509d = im0509d;
        notifyPropertyChanged(BR.im0509d);
    }

    @Bindable
    public String getIm0509m() {
        return im0509m;
    }

    public void setIm0509m(String im0509m) {
        this.im0509m = im0509m;
        notifyPropertyChanged(BR.im0509m);
    }

    @Bindable
    public String getIm0509y() {
        return im0509y;
    }

    public void setIm0509y(String im0509y) {
        this.im0509y = im0509y;
        notifyPropertyChanged(BR.im0509y);
    }

    @Bindable
    public String getIm0510d() {
        return im0510d;
    }

    public void setIm0510d(String im0510d) {
        this.im0510d = im0510d;
        notifyPropertyChanged(BR.im0510d);
    }

    @Bindable
    public String getIm0510m() {
        return im0510m;
    }

    public void setIm0510m(String im0510m) {
        this.im0510m = im0510m;
        notifyPropertyChanged(BR.im0510m);
    }

    @Bindable
    public String getIm0510y() {
        return im0510y;
    }

    public void setIm0510y(String im0510y) {
        this.im0510y = im0510y;
        notifyPropertyChanged(BR.im0510y);
    }

    @Bindable
    public String getIm0511d() {
        return im0511d;
    }

    public void setIm0511d(String im0511d) {
        this.im0511d = im0511d;
        notifyPropertyChanged(BR.im0511d);
    }

    @Bindable
    public String getIm0511m() {
        return im0511m;
    }

    public void setIm0511m(String im0511m) {
        this.im0511m = im0511m;
        notifyPropertyChanged(BR.im0511m);
    }

    @Bindable
    public String getIm0511y() {
        return im0511y;
    }

    public void setIm0511y(String im0511y) {
        this.im0511y = im0511y;
        notifyPropertyChanged(BR.im0511y);
    }

    @Bindable
    public String getIm0512d() {
        return im0512d;
    }

    public void setIm0512d(String im0512d) {
        this.im0512d = im0512d;
        notifyPropertyChanged(BR.im0512d);
    }

    @Bindable
    public String getIm0512m() {
        return im0512m;
    }

    public void setIm0512m(String im0512m) {
        this.im0512m = im0512m;
        notifyPropertyChanged(BR.im0512m);
    }

    @Bindable
    public String getIm0512y() {
        return im0512y;
    }

    public void setIm0512y(String im0512y) {
        this.im0512y = im0512y;
        notifyPropertyChanged(BR.im0512y);
    }

    @Bindable
    public String getIm0513d() {
        return im0513d;
    }

    public void setIm0513d(String im0513d) {
        this.im0513d = im0513d;
        notifyPropertyChanged(BR.im0513d);
    }

    @Bindable
    public String getIm0513m() {
        return im0513m;
    }

    public void setIm0513m(String im0513m) {
        this.im0513m = im0513m;
        notifyPropertyChanged(BR.im0513m);
    }

    @Bindable
    public String getIm0513y() {
        return im0513y;
    }

    public void setIm0513y(String im0513y) {
        this.im0513y = im0513y;
        notifyPropertyChanged(BR.im0513y);
    }

    @Bindable
    public String getIm0514d() {
        return im0514d;
    }

    public void setIm0514d(String im0514d) {
        this.im0514d = im0514d;
        notifyPropertyChanged(BR.im0514d);
    }

    @Bindable
    public String getIm0514m() {
        return im0514m;
    }

    public void setIm0514m(String im0514m) {
        this.im0514m = im0514m;
        notifyPropertyChanged(BR.im0514m);
    }

    @Bindable
    public String getIm0514y() {
        return im0514y;
    }

    public void setIm0514y(String im0514y) {
        this.im0514y = im0514y;
        notifyPropertyChanged(BR.im0514y);
    }

    @Bindable
    public String getIm0515d() {
        return im0515d;
    }

    public void setIm0515d(String im0515d) {
        this.im0515d = im0515d;
        notifyPropertyChanged(BR.im0515d);
    }

    @Bindable
    public String getIm0515m() {
        return im0515m;
    }

    public void setIm0515m(String im0515m) {
        this.im0515m = im0515m;
        notifyPropertyChanged(BR.im0515m);
    }

    @Bindable
    public String getIm0515y() {
        return im0515y;
    }

    public void setIm0515y(String im0515y) {
        this.im0515y = im0515y;
        notifyPropertyChanged(BR.im0515y);
    }

    @Bindable
    public String getIm0515ad() {
        return im0515ad;
    }

    public void setIm0515ad(String im0515ad) {
        this.im0515ad = im0515ad;
        notifyPropertyChanged(BR.im0515ad);
    }

    @Bindable
    public String getIm0515am() {
        return im0515am;
    }

    public void setIm0515am(String im0515am) {
        this.im0515am = im0515am;
        notifyPropertyChanged(BR.im0515am);
    }

    @Bindable
    public String getIm0515ay() {
        return im0515ay;
    }

    public void setIm0515ay(String im0515ay) {
        this.im0515ay = im0515ay;
        notifyPropertyChanged(BR.im0515ay);
    }

    @Bindable
    public String getIm0515bd() {
        return im0515bd;
    }

    public void setIm0515bd(String im0515bd) {
        this.im0515bd = im0515bd;
        notifyPropertyChanged(BR.im0515bd);
    }

    @Bindable
    public String getIm0515bm() {
        return im0515bm;
    }

    public void setIm0515bm(String im0515bm) {
        this.im0515bm = im0515bm;
        notifyPropertyChanged(BR.im0515bm);
    }

    @Bindable
    public String getIm0515by() {
        return im0515by;
    }

    public void setIm0515by(String im0515by) {
        this.im0515by = im0515by;
        notifyPropertyChanged(BR.im0515by);
    }

    @Bindable
    public String getIm0516d() {
        return im0516d;
    }

    public void setIm0516d(String im0516d) {
        this.im0516d = im0516d;
        notifyPropertyChanged(BR.im0516d);
    }

    @Bindable
    public String getIm0516m() {
        return im0516m;
    }

    public void setIm0516m(String im0516m) {
        this.im0516m = im0516m;
        notifyPropertyChanged(BR.im0516m);
    }

    @Bindable
    public String getIm0516y() {
        return im0516y;
    }

    public void setIm0516y(String im0516y) {
        this.im0516y = im0516y;
        notifyPropertyChanged(BR.im0516y);
    }

    @Bindable
    public String getIm07() {
        return im07;
    }

    public void setIm07(String im07) {
        this.im07 = im07;
        notifyPropertyChanged(BR.im07);
    }

    @Bindable
    public String getIm08() {
        return im08;
    }

    public void setIm08(String im08) {
        this.im08 = im08;
        notifyPropertyChanged(BR.im08);
    }

    @Bindable
    public String getIm09() {
        return im09;
    }

    public void setIm09(String im09) {
        this.im09 = im09;
        notifyPropertyChanged(BR.im09);
    }

    @Bindable
    public String getIm10() {
        return im10;
    }

    public void setIm10(String im10) {
        this.im10 = im10;
        notifyPropertyChanged(BR.im10);
    }

    @Bindable
    public String getIm12() {
        return im12;
    }

    public void setIm12(String im12) {
        this.im12 = im12;
        notifyPropertyChanged(BR.im12);
    }

    @Bindable
    public String getIm1201x() {
        return im1201x;
    }

    public void setIm1201x(String im1201x) {
        this.im1201x = im1201x;
        notifyPropertyChanged(BR.im1201x);
    }

    @Bindable
    public String getIm11() {
        return im11;
    }

    public void setIm11(String im11) {
        this.im11 = im11;
        notifyPropertyChanged(BR.im11);
    }

    @Bindable
    public String getIm11a() {
        return im11a;
    }

    public void setIm11a(String im11a) {
        this.im11a = im11a;
        notifyPropertyChanged(BR.im11a);
    }

    @Bindable
    public String getIm14() {
        return im14;
    }

    public void setIm14(String im14) {
        this.im14 = im14;
        notifyPropertyChanged(BR.im14);
    }

    @Bindable
    public String getIm15() {
        return im15;
    }

    public void setIm15(String im15) {
        this.im15 = im15;
        notifyPropertyChanged(BR.im15);
    }

    @Bindable
    public String getIm1501x() {
        return im1501x;
    }

    public void setIm1501x(String im1501x) {
        this.im1501x = im1501x;
        notifyPropertyChanged(BR.im1501x);
    }

    @Bindable
    public String getIm16() {
        return im16;
    }

    public void setIm16(String im16) {
        this.im16 = im16;
        notifyPropertyChanged(BR.im16);
    }

    @Bindable
    public String getIm17() {
        return im17;
    }

    public void setIm17(String im17) {
        this.im17 = im17;
        notifyPropertyChanged(BR.im17);
    }

    @Bindable
    public String getIm1701x() {
        return im1701x;
    }

    public void setIm1701x(String im1701x) {
        this.im1701x = im1701x;
        notifyPropertyChanged(BR.im1701x);
    }

    @Bindable
    public String getIm18() {
        return im18;
    }

    public void setIm18(String im18) {
        this.im18 = im18;
        notifyPropertyChanged(BR.im18);
    }

    @Bindable
    public String getIm19() {
        return im19;
    }

    public void setIm19(String im19) {
        this.im19 = im19;
        notifyPropertyChanged(BR.im19);
    }

    @Bindable
    public String getIm1901x() {
        return im1901x;
    }

    public void setIm1901x(String im1901x) {
        this.im1901x = im1901x;
        notifyPropertyChanged(BR.im1901x);
    }

    @Bindable
    public String getIm20() {
        return im20;
    }

    public void setIm20(String im20) {
        this.im20 = im20;
        notifyPropertyChanged(BR.im20);
    }

    @Bindable
    public String getIm20a() {
        return im20a;
    }

    public void setIm20a(String im20a) {
        this.im20a = im20a;
        notifyPropertyChanged(BR.im20a);
    }

    @Bindable
    public String getIm20a01x() {
        return im20a01x;
    }

    public void setIm20a01x(String im20a01x) {
        this.im20a01x = im20a01x;
        notifyPropertyChanged(BR.im20a01x);
    }

    @Bindable
    public String getIm21() {
        return im21;
    }

    public void setIm21(String im21) {
        this.im21 = im21;
        notifyPropertyChanged(BR.im21);
    }

    @Bindable
    public String getIm22() {
        return im22;
    }

    public void setIm22(String im22) {
        this.im22 = im22;
        notifyPropertyChanged(BR.im22);
    }

    @Bindable
    public String getIm2201x() {
        return im2201x;
    }

    public void setIm2201x(String im2201x) {
        this.im2201x = im2201x;
        notifyPropertyChanged(BR.im2201x);
    }

    @Bindable
    public String getIm22a() {
        return im22a;
    }

    public void setIm22a(String im22a) {
        this.im22a = im22a;
        notifyPropertyChanged(BR.im22a);
    }

    @Bindable
    public String getIm23() {
        return im23;
    }

    public void setIm23(String im23) {
        this.im23 = im23;
        notifyPropertyChanged(BR.im23);
    }

    @Bindable
    public String getIm2396x() {
        return im2396x;
    }

    public void setIm2396x(String im2396x) {
        this.im2396x = im2396x;
        notifyPropertyChanged(BR.im2396x);
    }

    @Bindable
    public String getIm24() {
        return im24;
    }

    public void setIm24(String im24) {
        this.im24 = im24;
        notifyPropertyChanged(BR.im24);
    }

    @Bindable
    public String getIm2496x() {
        return im2496x;
    }

    public void setIm2496x(String im2496x) {
        this.im2496x = im2496x;
        notifyPropertyChanged(BR.im2496x);
    }

    @Bindable
    public String getIm25() {
        return im25;
    }

    public void setIm25(String im25) {
        this.im25 = im25;
        notifyPropertyChanged(BR.im25);
    }

    @Bindable
    public String getIm2501x() {
        return im2501x;
    }

    public void setIm2501x(String im2501x) {
        this.im2501x = im2501x;
        notifyPropertyChanged(BR.im2501x);
    }

    @Bindable
    public String getIm2502x() {
        return im2502x;
    }

    public void setIm2502x(String im2502x) {
        this.im2502x = im2502x;
        notifyPropertyChanged(BR.im2502x);
    }

    @Bindable
    public String getIm26() {
        return im26;
    }

    public void setIm26(String im26) {
        this.im26 = im26;
        notifyPropertyChanged(BR.im26);
    }

    @Bindable
    public String getIm2601() {
        return im2601;
    }

    public void setIm2601(String im2601) {
        this.im2601 = im2601;
        notifyPropertyChanged(BR.im2601);
    }

    @Bindable
    public String getIm2602() {
        return im2602;
    }

    public void setIm2602(String im2602) {
        this.im2602 = im2602;
        notifyPropertyChanged(BR.im2602);
    }

    @Bindable
    public String getIm2603() {
        return im2603;
    }

    public void setIm2603(String im2603) {
        this.im2603 = im2603;
        notifyPropertyChanged(BR.im2603);
    }

    @Bindable
    public String getIm2604() {
        return im2604;
    }

    public void setIm2604(String im2604) {
        this.im2604 = im2604;
        notifyPropertyChanged(BR.im2604);
    }

    @Bindable
    public String getIm2605() {
        return im2605;
    }

    public void setIm2605(String im2605) {
        this.im2605 = im2605;
        notifyPropertyChanged(BR.im2605);
    }

    @Bindable
    public String getIm2606() {
        return im2606;
    }

    public void setIm2606(String im2606) {
        this.im2606 = im2606;
        notifyPropertyChanged(BR.im2606);
    }

    @Bindable
    public String getIm2607() {
        return im2607;
    }

    public void setIm2607(String im2607) {
        this.im2607 = im2607;
        notifyPropertyChanged(BR.im2607);
    }

    @Bindable
    public String getIm2608() {
        return im2608;
    }

    public void setIm2608(String im2608) {
        this.im2608 = im2608;
        notifyPropertyChanged(BR.im2608);
    }

    @Bindable
    public String getIm2609() {
        return im2609;
    }

    public void setIm2609(String im2609) {
        this.im2609 = im2609;
        notifyPropertyChanged(BR.im2609);
    }

    @Bindable
    public String getIm2610() {
        return im2610;
    }

    public void setIm2610(String im2610) {
        this.im2610 = im2610;
        notifyPropertyChanged(BR.im2610);
    }

    @Bindable
    public String getIm2611() {
        return im2611;
    }

    public void setIm2611(String im2611) {
        this.im2611 = im2611;
        notifyPropertyChanged(BR.im2611);
    }

    @Bindable
    public String getIm2612() {
        return im2612;
    }

    public void setIm2612(String im2612) {
        this.im2612 = im2612;
        notifyPropertyChanged(BR.im2612);
    }

    @Bindable
    public String getIm2613() {
        return im2613;
    }

    public void setIm2613(String im2613) {
        this.im2613 = im2613;
        notifyPropertyChanged(BR.im2613);
    }

    @Bindable
    public String getIm2614() {
        return im2614;
    }

    public void setIm2614(String im2614) {
        this.im2614 = im2614;
        notifyPropertyChanged(BR.im2614);
    }

    @Bindable
    public String getIm2615() {
        return im2615;
    }

    public void setIm2615(String im2615) {
        this.im2615 = im2615;
        notifyPropertyChanged(BR.im2615);
    }

    @Bindable
    public String getIm2616() {
        return im2616;
    }

    public void setIm2616(String im2616) {
        this.im2616 = im2616;
        notifyPropertyChanged(BR.im2616);
    }

    @Bindable
    public String getIm2617() {
        return im2617;
    }

    public void setIm2617(String im2617) {
        this.im2617 = im2617;
        notifyPropertyChanged(BR.im2617);
    }

    @Bindable
    public String getIm2698() {
        return im2698;
    }

    public void setIm2698(String im2698) {
        this.im2698 = im2698;
        notifyPropertyChanged(BR.im2698);
    }

    @Bindable
    public String getIm2696() {
        return im2696;
    }

    public void setIm2696(String im2696) {
        this.im2696 = im2696;
        notifyPropertyChanged(BR.im2696);
    }

    @Bindable
    public String getIm2696x() {
        return im2696x;
    }

    public void setIm2696x(String im2696x) {
        this.im2696x = im2696x;
        notifyPropertyChanged(BR.im2696x);
    }

    @Bindable
    public String getIm27() {
        return im27;
    }

    public void setIm27(String im27) {
        this.im27 = im27;
        notifyPropertyChanged(BR.im27);
    }

    @Bindable
    public String getIm28() {
        return im28;
    }

    public void setIm28(String im28) {
        this.im28 = im28;
        notifyPropertyChanged(BR.im28);
    }

    @Bindable
    public String getIm29() {
        return im29;
    }

    public void setIm29(String im29) {
        this.im29 = im29;
        notifyPropertyChanged(BR.im29);
    }

    @Bindable
    public String getIm2901x() {
        return im2901x;
    }

    public void setIm2901x(String im2901x) {
        this.im2901x = im2901x;
        notifyPropertyChanged(BR.im2901x);
    }

    @Bindable
    public String getIm30() {
        return im30;
    }

    public void setIm30(String im30) {
        this.im30 = im30;
        notifyPropertyChanged(BR.im30);
    }

    @Bindable
    public String getIm31() {
        return im31;
    }

    public void setIm31(String im31) {
        this.im31 = im31;
        notifyPropertyChanged(BR.im31);
    }

    @Bindable
    public String getIm32() {
        return im32;
    }

    public void setIm32(String im32) {
        this.im32 = im32;
        notifyPropertyChanged(BR.im32);
    }

    @Bindable
    public String getIm3201() {
        return im3201;
    }

    public void setIm3201(String im3201) {
        this.im3201 = im3201;
        notifyPropertyChanged(BR.im3201);
    }

    @Bindable
    public String getIm3202() {
        return im3202;
    }

    public void setIm3202(String im3202) {
        this.im3202 = im3202;
        notifyPropertyChanged(BR.im3202);
    }

    @Bindable
    public String getIm3203() {
        return im3203;
    }

    public void setIm3203(String im3203) {
        this.im3203 = im3203;
        notifyPropertyChanged(BR.im3203);
    }

    @Bindable
    public String getIm3204() {
        return im3204;
    }

    public void setIm3204(String im3204) {
        this.im3204 = im3204;
        notifyPropertyChanged(BR.im3204);
    }

    @Bindable
    public String getIm3205() {
        return im3205;
    }

    public void setIm3205(String im3205) {
        this.im3205 = im3205;
        notifyPropertyChanged(BR.im3205);
    }

    @Bindable
    public String getIm3206() {
        return im3206;
    }

    public void setIm3206(String im3206) {
        this.im3206 = im3206;
        notifyPropertyChanged(BR.im3206);
    }

    @Bindable
    public String getIm3207() {
        return im3207;
    }

    public void setIm3207(String im3207) {
        this.im3207 = im3207;
        notifyPropertyChanged(BR.im3207);
    }

    @Bindable
    public String getIm3208() {
        return im3208;
    }

    public void setIm3208(String im3208) {
        this.im3208 = im3208;
        notifyPropertyChanged(BR.im3208);
    }

    @Bindable
    public String getIm3209() {
        return im3209;
    }

    public void setIm3209(String im3209) {
        this.im3209 = im3209;
        notifyPropertyChanged(BR.im3209);
    }

    @Bindable
    public String getIm3210() {
        return im3210;
    }

    public void setIm3210(String im3210) {
        this.im3210 = im3210;
        notifyPropertyChanged(BR.im3210);
    }

    @Bindable
    public String getIm3211() {
        return im3211;
    }

    public void setIm3211(String im3211) {
        this.im3211 = im3211;
        notifyPropertyChanged(BR.im3211);
    }

    @Bindable
    public String getIm3212() {
        return im3212;
    }

    public void setIm3212(String im3212) {
        this.im3212 = im3212;
        notifyPropertyChanged(BR.im3212);
    }

    @Bindable
    public String getIm3213() {
        return im3213;
    }

    public void setIm3213(String im3213) {
        this.im3213 = im3213;
        notifyPropertyChanged(BR.im3213);
    }

    @Bindable
    public String getIm3298() {
        return im3298;
    }

    public void setIm3298(String im3298) {
        this.im3298 = im3298;
        notifyPropertyChanged(BR.im3298);
    }

    @Bindable
    public String getIm3296() {
        return im3296;
    }

    public void setIm3296(String im3296) {
        this.im3296 = im3296;
        notifyPropertyChanged(BR.im3296);
    }

    @Bindable
    public String getIm3296x() {
        return im3296x;
    }

    public void setIm3296x(String im3296x) {
        this.im3296x = im3296x;
        notifyPropertyChanged(BR.im3296x);
    }


    @Bindable
    public String getF101() {
        return f101;
    }

    public void setF101(String f101) {
        this.f101 = f101;
        notifyPropertyChanged(BR.f101);
    }

    @Bindable
    public String getF101a() {
        return f101a;
    }

    public void setF101a(String f101a) {
        this.f101a = f101a;
        notifyPropertyChanged(BR.f101a);
    }

    @Bindable
    public String getF101a01() {
        return f101a01;
    }

    public void setF101a01(String f101a01) {
        this.f101a01 = f101a01;
        notifyPropertyChanged(BR.f101a01);
    }

    @Bindable
    public String getF101a02() {
        return f101a02;
    }

    public void setF101a02(String f101a02) {
        this.f101a02 = f101a02;
        notifyPropertyChanged(BR.f101a02);
    }

    @Bindable
    public String getF101a03() {
        return f101a03;
    }

    public void setF101a03(String f101a03) {
        this.f101a03 = f101a03;
        notifyPropertyChanged(BR.f101a03);
    }

    @Bindable
    public String getF101a04() {
        return f101a04;
    }

    public void setF101a04(String f101a04) {
        this.f101a04 = f101a04;
        notifyPropertyChanged(BR.f101a04);
    }

    @Bindable
    public String getF101a05() {
        return f101a05;
    }

    public void setF101a05(String f101a05) {
        this.f101a05 = f101a05;
        notifyPropertyChanged(BR.f101a05);
    }

    @Bindable
    public String getF101a06() {
        return f101a06;
    }

    public void setF101a06(String f101a06) {
        this.f101a06 = f101a06;
        notifyPropertyChanged(BR.f101a06);
    }

    @Bindable
    public String getF101a07() {
        return f101a07;
    }

    public void setF101a07(String f101a07) {
        this.f101a07 = f101a07;
        notifyPropertyChanged(BR.f101a07);
    }

    @Bindable
    public String getF101a08() {
        return f101a08;
    }

    public void setF101a08(String f101a08) {
        this.f101a08 = f101a08;
        notifyPropertyChanged(BR.f101a08);
    }

    @Bindable
    public String getF101a09() {
        return f101a09;
    }

    public void setF101a09(String f101a09) {
        this.f101a09 = f101a09;
        notifyPropertyChanged(BR.f101a09);
    }

    @Bindable
    public String getF101a10() {
        return f101a10;
    }

    public void setF101a10(String f101a10) {
        this.f101a10 = f101a10;
        notifyPropertyChanged(BR.f101a10);
    }

    @Bindable
    public String getF101a11() {
        return f101a11;
    }

    public void setF101a11(String f101a11) {
        this.f101a11 = f101a11;
        notifyPropertyChanged(BR.f101a11);
    }

    @Bindable
    public String getF101a12() {
        return f101a12;
    }

    public void setF101a12(String f101a12) {
        this.f101a12 = f101a12;
        notifyPropertyChanged(BR.f101a12);
    }

    @Bindable
    public String getF101a13() {
        return f101a13;
    }

    public void setF101a13(String f101a13) {
        this.f101a13 = f101a13;
        notifyPropertyChanged(BR.f101a13);
    }

    @Bindable
    public String getF101a14() {
        return f101a14;
    }

    public void setF101a14(String f101a14) {
        this.f101a14 = f101a14;
        notifyPropertyChanged(BR.f101a14);
    }

    @Bindable
    public String getF101a15() {
        return f101a15;
    }

    public void setF101a15(String f101a15) {
        this.f101a15 = f101a15;
        notifyPropertyChanged(BR.f101a15);
    }

    @Bindable
    public String getF101a96() {
        return f101a96;
    }

    public void setF101a96(String f101a96) {
        this.f101a96 = f101a96;
        notifyPropertyChanged(BR.f101a96);
    }

    @Bindable
    public String getF101a96x() {
        return f101a96x;
    }

    public void setF101a96x(String f101a96x) {
        this.f101a96x = f101a96x;
        notifyPropertyChanged(BR.f101a96x);
    }

    @Bindable
    public String getF101b() {
        return f101b;
    }

    public void setF101b(String f101b) {
        this.f101b = f101b;
        notifyPropertyChanged(BR.f101b);
    }

    @Bindable
    public String getF101b01x() {
        return f101b01x;
    }

    public void setF101b01x(String f101b01x) {
        this.f101b01x = f101b01x;
        notifyPropertyChanged(BR.f101b01x);
    }

    @Bindable
    public String getF102() {
        return f102;
    }

    public void setF102(String f102) {
        this.f102 = f102;
        notifyPropertyChanged(BR.f102);
    }

    @Bindable
    public String getF10201() {
        return f10201;
    }

    public void setF10201(String f10201) {
        this.f10201 = f10201;
        notifyPropertyChanged(BR.f10201);
    }

    @Bindable
    public String getF10202() {
        return f10202;
    }

    public void setF10202(String f10202) {
        this.f10202 = f10202;
        notifyPropertyChanged(BR.f10202);
    }

    @Bindable
    public String getF10203() {
        return f10203;
    }

    public void setF10203(String f10203) {
        this.f10203 = f10203;
        notifyPropertyChanged(BR.f10203);
    }

    @Bindable
    public String getF10204() {
        return f10204;
    }

    public void setF10204(String f10204) {
        this.f10204 = f10204;
        notifyPropertyChanged(BR.f10204);
    }

    @Bindable
    public String getF10205() {
        return f10205;
    }

    public void setF10205(String f10205) {
        this.f10205 = f10205;
        notifyPropertyChanged(BR.f10205);
    }

    @Bindable
    public String getF10206() {
        return f10206;
    }

    public void setF10206(String f10206) {
        this.f10206 = f10206;
        notifyPropertyChanged(BR.f10206);
    }

    @Bindable
    public String getF10207() {
        return f10207;
    }

    public void setF10207(String f10207) {
        this.f10207 = f10207;
        notifyPropertyChanged(BR.f10207);
    }

    @Bindable
    public String getF10208() {
        return f10208;
    }

    public void setF10208(String f10208) {
        this.f10208 = f10208;
        notifyPropertyChanged(BR.f10208);
    }

    @Bindable
    public String getF10209() {
        return f10209;
    }

    public void setF10209(String f10209) {
        this.f10209 = f10209;
        notifyPropertyChanged(BR.f10209);
    }

    @Bindable
    public String getF10210() {
        return f10210;
    }

    public void setF10210(String f10210) {
        this.f10210 = f10210;
        notifyPropertyChanged(BR.f10210);
    }

    @Bindable
    public String getF10211() {
        return f10211;
    }

    public void setF10211(String f10211) {
        this.f10211 = f10211;
        notifyPropertyChanged(BR.f10211);
    }

    @Bindable
    public String getF10296() {
        return f10296;
    }

    public void setF10296(String f10296) {
        this.f10296 = f10296;
        notifyPropertyChanged(BR.f10296);
    }

    @Bindable
    public String getF10296x() {
        return f10296x;
    }

    public void setF10296x(String f10296x) {
        this.f10296x = f10296x;
        notifyPropertyChanged(BR.f10296x);
    }

    @Bindable
    public String getF103() {
        return f103;
    }

    public void setF103(String f103) {
        this.f103 = f103;
        notifyPropertyChanged(BR.f103);
    }

    @Bindable
    public String getF104() {
        return f104;
    }

    public void setF104(String f104) {
        this.f104 = f104;
        notifyPropertyChanged(BR.f104);
    }

    @Bindable
    public String getF105() {
        return f105;
    }

    public void setF105(String f105) {
        this.f105 = f105;
        notifyPropertyChanged(BR.f105);
    }

    @Bindable
    public String getF106() {
        return f106;
    }

    public void setF106(String f106) {
        this.f106 = f106;
        notifyPropertyChanged(BR.f106);
    }

    @Bindable
    public String getF107() {
        return f107;
    }

    public void setF107(String f107) {
        this.f107 = f107;
        notifyPropertyChanged(BR.f107);
    }

    @Bindable
    public String getF10796x() {
        return f10796x;
    }

    public void setF10796x(String f10796x) {
        this.f10796x = f10796x;
        notifyPropertyChanged(BR.f10796x);
    }

    @Bindable
    public String getF108() {
        return f108;
    }

    public void setF108(String f108) {
        this.f108 = f108;
        notifyPropertyChanged(BR.f108);
    }

    @Bindable
    public String getF10801x() {
        return f10801x;
    }

    public void setF10801x(String f10801x) {
        this.f10801x = f10801x;
        notifyPropertyChanged(BR.f10801x);
    }

    @Bindable
    public String getF10802x() {
        return f10802x;
    }

    public void setF10802x(String f10802x) {
        this.f10802x = f10802x;
        notifyPropertyChanged(BR.f10802x);
    }

    @Bindable
    public String getF110() {
        return f110;
    }

    public void setF110(String f110) {
        this.f110 = f110;
        notifyPropertyChanged(BR.f110);
    }

    @Bindable
    public String getF11001() {
        return f11001;
    }

    public void setF11001(String f11001) {
        this.f11001 = f11001;
        notifyPropertyChanged(BR.f11001);
    }

    @Bindable
    public String getF11002() {
        return f11002;
    }

    public void setF11002(String f11002) {
        this.f11002 = f11002;
        notifyPropertyChanged(BR.f11002);
    }

    @Bindable
    public String getF11003() {
        return f11003;
    }

    public void setF11003(String f11003) {
        this.f11003 = f11003;
        notifyPropertyChanged(BR.f11003);
    }

    @Bindable
    public String getF11004() {
        return f11004;
    }

    public void setF11004(String f11004) {
        this.f11004 = f11004;
        notifyPropertyChanged(BR.f11004);
    }

    @Bindable
    public String getF11005() {
        return f11005;
    }

    public void setF11005(String f11005) {
        this.f11005 = f11005;
        notifyPropertyChanged(BR.f11005);
    }

    @Bindable
    public String getF11006() {
        return f11006;
    }

    public void setF11006(String f11006) {
        this.f11006 = f11006;
        notifyPropertyChanged(BR.f11006);
    }

    @Bindable
    public String getF11007() {
        return f11007;
    }

    public void setF11007(String f11007) {
        this.f11007 = f11007;
        notifyPropertyChanged(BR.f11007);
    }

    @Bindable
    public String getF11008() {
        return f11008;
    }

    public void setF11008(String f11008) {
        this.f11008 = f11008;
        notifyPropertyChanged(BR.f11008);
    }

    @Bindable
    public String getF11009() {
        return f11009;
    }

    public void setF11009(String f11009) {
        this.f11009 = f11009;
        notifyPropertyChanged(BR.f11009);
    }

    @Bindable
    public String getF11097() {
        return f11097;
    }

    public void setF11097(String f11097) {
        this.f11097 = f11097;
        notifyPropertyChanged(BR.f11097);
    }

    @Bindable
    public String getF11096() {
        return f11096;
    }

    public void setF11096(String f11096) {
        this.f11096 = f11096;
        notifyPropertyChanged(BR.f11096);
    }

    @Bindable
    public String getF11096x() {
        return f11096x;
    }

    public void setF11096x(String f11096x) {
        this.f11096x = f11096x;
        notifyPropertyChanged(BR.f11096x);
    }

    @Bindable
    public String getF111() {
        return f111;
    }

    public void setF111(String f111) {
        this.f111 = f111;
        notifyPropertyChanged(BR.f111);
    }

    @Bindable
    public String getF112() {
        return f112;
    }

    public void setF112(String f112) {
        this.f112 = f112;
        notifyPropertyChanged(BR.f112);
    }

    @Bindable
    public String getF113() {
        return f113;
    }

    public void setF113(String f113) {
        this.f113 = f113;
        notifyPropertyChanged(BR.f113);
    }

    @Bindable
    public String getF11301x() {
        return f11301x;
    }

    public void setF11301x(String f11301x) {
        this.f11301x = f11301x;
        notifyPropertyChanged(BR.f11301x);
    }

    @Bindable
    public String getF114() {
        return f114;
    }

    public void setF114(String f114) {
        this.f114 = f114;
        notifyPropertyChanged(BR.f114);
    }

    @Bindable
    public String getF115() {
        return f115;
    }

    public void setF115(String f115) {
        this.f115 = f115;
        notifyPropertyChanged(BR.f115);
    }

    @Bindable
    public String getF116() {
        return f116;
    }

    public void setF116(String f116) {
        this.f116 = f116;
        notifyPropertyChanged(BR.f116);
    }

    @Bindable
    public String getF117() {
        return f117;
    }

    public void setF117(String f117) {
        this.f117 = f117;
        notifyPropertyChanged(BR.f117);
    }

    @Bindable
    public String getF118m() {
        return f118m;
    }

    public void setF118m(String f118m) {
        this.f118m = f118m;
        notifyPropertyChanged(BR.f118m);
    }

    @Bindable
    public String getF118d() {
        return f118d;
    }

    public void setF118d(String f118d) {
        this.f118d = f118d;
        notifyPropertyChanged(BR.f118d);
    }

    @Bindable
    public String getF119() {
        return f119;
    }

    public void setF119(String f119) {
        this.f119 = f119;
        notifyPropertyChanged(BR.f119);
    }

    @Bindable
    public String getF120() {
        return f120;
    }

    public void setF120(String f120) {
        this.f120 = f120;
        notifyPropertyChanged(BR.f120);
    }

    @Bindable
    public String getF12001x() {
        return f12001x;
    }

    public void setF12001x(String f12001x) {
        this.f12001x = f12001x;
        notifyPropertyChanged(BR.f12001x);
    }

    @Bindable
    public String getF121a() {
        return f121a;
    }

    public void setF121a(String f121a) {
        this.f121a = f121a;
        notifyPropertyChanged(BR.f121a);
    }

    @Bindable
    public String getF12101() {
        return f12101;
    }

    public void setF12101(String f12101) {
        this.f12101 = f12101;
        notifyPropertyChanged(BR.f12101);
    }

    @Bindable
    public String getF121b() {
        return f121b;
    }

    public void setF121b(String f121b) {
        this.f121b = f121b;
        notifyPropertyChanged(BR.f121b);
    }

    @Bindable
    public String getF121b96x() {
        return f121b96x;
    }

    public void setF121b96x(String f121b96x) {
        this.f121b96x = f121b96x;
        notifyPropertyChanged(BR.f121b96x);
    }

    @Bindable
    public String getF122() {
        return f122;
    }

    public void setF122(String f122) {
        this.f122 = f122;
        notifyPropertyChanged(BR.f122);
    }

    @Bindable
    public String getF12201x() {
        return f12201x;
    }

    public void setF12201x(String f12201x) {
        this.f12201x = f12201x;
        notifyPropertyChanged(BR.f12201x);
    }

    @Bindable
    public String getF123() {
        return f123;
    }

    public void setF123(String f123) {
        this.f123 = f123;
        notifyPropertyChanged(BR.f123);
    }

    @Bindable
    public String getF12301() {
        return f12301;
    }

    public void setF12301(String f12301) {
        this.f12301 = f12301;
        notifyPropertyChanged(BR.f12301);
    }

    @Bindable
    public String getF12302() {
        return f12302;
    }

    public void setF12302(String f12302) {
        this.f12302 = f12302;
        notifyPropertyChanged(BR.f12302);
    }

    @Bindable
    public String getF12303() {
        return f12303;
    }

    public void setF12303(String f12303) {
        this.f12303 = f12303;
        notifyPropertyChanged(BR.f12303);
    }

    @Bindable
    public String getF12304() {
        return f12304;
    }

    public void setF12304(String f12304) {
        this.f12304 = f12304;
        notifyPropertyChanged(BR.f12304);
    }

    @Bindable
    public String getF12305() {
        return f12305;
    }

    public void setF12305(String f12305) {
        this.f12305 = f12305;
        notifyPropertyChanged(BR.f12305);
    }

    @Bindable
    public String getF12306() {
        return f12306;
    }

    public void setF12306(String f12306) {
        this.f12306 = f12306;
        notifyPropertyChanged(BR.f12306);
    }

    @Bindable
    public String getF12307() {
        return f12307;
    }

    public void setF12307(String f12307) {
        this.f12307 = f12307;
        notifyPropertyChanged(BR.f12307);
    }

    @Bindable
    public String getF12308() {
        return f12308;
    }

    public void setF12308(String f12308) {
        this.f12308 = f12308;
        notifyPropertyChanged(BR.f12308);
    }

    @Bindable
    public String getF12309() {
        return f12309;
    }

    public void setF12309(String f12309) {
        this.f12309 = f12309;
        notifyPropertyChanged(BR.f12309);
    }

    @Bindable
    public String getF12310() {
        return f12310;
    }

    public void setF12310(String f12310) {
        this.f12310 = f12310;
        notifyPropertyChanged(BR.f12310);
    }

    @Bindable
    public String getF12396() {
        return f12396;
    }

    public void setF12396(String f12396) {
        this.f12396 = f12396;
        notifyPropertyChanged(BR.f12396);
    }

    @Bindable
    public String getF124() {
        return f124;
    }

    public void setF124(String f124) {
        this.f124 = f124;
        notifyPropertyChanged(BR.f124);
    }

    @Bindable
    public String getF125() {
        return f125;
    }

    public void setF125(String f125) {
        this.f125 = f125;
        notifyPropertyChanged(BR.f125);
    }

    @Bindable
    public String getF12501() {
        return f12501;
    }

    public void setF12501(String f12501) {
        this.f12501 = f12501;
        notifyPropertyChanged(BR.f12501);
    }

    @Bindable
    public String getF12502() {
        return f12502;
    }

    public void setF12502(String f12502) {
        this.f12502 = f12502;
        notifyPropertyChanged(BR.f12502);
    }

    @Bindable
    public String getF12503() {
        return f12503;
    }

    public void setF12503(String f12503) {
        this.f12503 = f12503;
        notifyPropertyChanged(BR.f12503);
    }

    @Bindable
    public String getF12504() {
        return f12504;
    }

    public void setF12504(String f12504) {
        this.f12504 = f12504;
        notifyPropertyChanged(BR.f12504);
    }

    @Bindable
    public String getF12505() {
        return f12505;
    }

    public void setF12505(String f12505) {
        this.f12505 = f12505;
        notifyPropertyChanged(BR.f12505);
    }

    @Bindable
    public String getF12506() {
        return f12506;
    }

    public void setF12506(String f12506) {
        this.f12506 = f12506;
        notifyPropertyChanged(BR.f12506);
    }

    @Bindable
    public String getF12507() {
        return f12507;
    }

    public void setF12507(String f12507) {
        this.f12507 = f12507;
        notifyPropertyChanged(BR.f12507);
    }

    @Bindable
    public String getF126() {
        return f126;
    }

    public void setF126(String f126) {
        this.f126 = f126;
        notifyPropertyChanged(BR.f126);
    }

    @Bindable
    public String getF12601() {
        return f12601;
    }

    public void setF12601(String f12601) {
        this.f12601 = f12601;
        notifyPropertyChanged(BR.f12601);
    }

    @Bindable
    public String getF12602() {
        return f12602;
    }

    public void setF12602(String f12602) {
        this.f12602 = f12602;
        notifyPropertyChanged(BR.f12602);
    }

    @Bindable
    public String getF12603() {
        return f12603;
    }

    public void setF12603(String f12603) {
        this.f12603 = f12603;
        notifyPropertyChanged(BR.f12603);
    }

    @Bindable
    public String getF12604() {
        return f12604;
    }

    public void setF12604(String f12604) {
        this.f12604 = f12604;
        notifyPropertyChanged(BR.f12604);
    }

    @Bindable
    public String getF12605() {
        return f12605;
    }

    public void setF12605(String f12605) {
        this.f12605 = f12605;
        notifyPropertyChanged(BR.f12605);
    }

    @Bindable
    public String getF12606() {
        return f12606;
    }

    public void setF12606(String f12606) {
        this.f12606 = f12606;
        notifyPropertyChanged(BR.f12606);
    }

    @Bindable
    public String getF12607() {
        return f12607;
    }

    public void setF12607(String f12607) {
        this.f12607 = f12607;
        notifyPropertyChanged(BR.f12607);
    }

    @Bindable
    public String getF12608() {
        return f12608;
    }

    public void setF12608(String f12608) {
        this.f12608 = f12608;
        notifyPropertyChanged(BR.f12608);
    }

    @Bindable
    public String getF127() {
        return f127;
    }

    public void setF127(String f127) {
        this.f127 = f127;
        notifyPropertyChanged(BR.f127);
    }

    @Bindable
    public String getF12796x() {
        return f12796x;
    }

    public void setF12796x(String f12796x) {
        this.f12796x = f12796x;
        notifyPropertyChanged(BR.f12796x);
    }

    @Bindable
    public String getF128() {
        return f128;
    }

    public void setF128(String f128) {
        this.f128 = f128;
        notifyPropertyChanged(BR.f128);
    }

    @Bindable
    public String getF12801() {
        return f12801;
    }

    public void setF12801(String f12801) {
        this.f12801 = f12801;
        notifyPropertyChanged(BR.f12801);
    }

    @Bindable
    public String getF12802() {
        return f12802;
    }

    public void setF12802(String f12802) {
        this.f12802 = f12802;
        notifyPropertyChanged(BR.f12802);
    }

    @Bindable
    public String getF12803() {
        return f12803;
    }

    public void setF12803(String f12803) {
        this.f12803 = f12803;
        notifyPropertyChanged(BR.f12803);
    }

    @Bindable
    public String getF12804() {
        return f12804;
    }

    public void setF12804(String f12804) {
        this.f12804 = f12804;
        notifyPropertyChanged(BR.f12804);
    }

    @Bindable
    public String getF12805() {
        return f12805;
    }

    public void setF12805(String f12805) {
        this.f12805 = f12805;
        notifyPropertyChanged(BR.f12805);
    }

    @Bindable
    public String getF12806() {
        return f12806;
    }

    public void setF12806(String f12806) {
        this.f12806 = f12806;
        notifyPropertyChanged(BR.f12806);
    }

    @Bindable
    public String getF12807() {
        return f12807;
    }

    public void setF12807(String f12807) {
        this.f12807 = f12807;
        notifyPropertyChanged(BR.f12807);
    }

    @Bindable
    public String getF12808() {
        return f12808;
    }

    public void setF12808(String f12808) {
        this.f12808 = f12808;
        notifyPropertyChanged(BR.f12808);
    }

    @Bindable
    public String getF129() {
        return f129;
    }

    public void setF129(String f129) {
        this.f129 = f129;
        notifyPropertyChanged(BR.f129);
    }

    @Bindable
    public String getF130() {
        return f130;
    }

    public void setF130(String f130) {
        this.f130 = f130;
        notifyPropertyChanged(BR.f130);
    }

    @Bindable
    public String getF13001() {
        return f13001;
    }

    public void setF13001(String f13001) {
        this.f13001 = f13001;
        notifyPropertyChanged(BR.f13001);
    }

    @Bindable
    public String getF13002() {
        return f13002;
    }

    public void setF13002(String f13002) {
        this.f13002 = f13002;
        notifyPropertyChanged(BR.f13002);
    }

    @Bindable
    public String getF13003() {
        return f13003;
    }

    public void setF13003(String f13003) {
        this.f13003 = f13003;
        notifyPropertyChanged(BR.f13003);
    }

    @Bindable
    public String getF13004() {
        return f13004;
    }

    public void setF13004(String f13004) {
        this.f13004 = f13004;
        notifyPropertyChanged(BR.f13004);
    }

    @Bindable
    public String getF13005() {
        return f13005;
    }

    public void setF13005(String f13005) {
        this.f13005 = f13005;
        notifyPropertyChanged(BR.f13005);
    }

    @Bindable
    public String getF13006() {
        return f13006;
    }

    public void setF13006(String f13006) {
        this.f13006 = f13006;
        notifyPropertyChanged(BR.f13006);
    }

    @Bindable
    public String getF13007() {
        return f13007;
    }

    public void setF13007(String f13007) {
        this.f13007 = f13007;
        notifyPropertyChanged(BR.f13007);
    }

    @Bindable
    public String getF13008() {
        return f13008;
    }

    public void setF13008(String f13008) {
        this.f13008 = f13008;
        notifyPropertyChanged(BR.f13008);
    }

    @Bindable
    public String getF13009() {
        return f13009;
    }

    public void setF13009(String f13009) {
        this.f13009 = f13009;
        notifyPropertyChanged(BR.f13009);
    }

    @Bindable
    public String getF13010() {
        return f13010;
    }

    public void setF13010(String f13010) {
        this.f13010 = f13010;
        notifyPropertyChanged(BR.f13010);
    }

    @Bindable
    public String getF13011() {
        return f13011;
    }

    public void setF13011(String f13011) {
        this.f13011 = f13011;
        notifyPropertyChanged(BR.f13011);
    }

    @Bindable
    public String getF13012() {
        return f13012;
    }

    public void setF13012(String f13012) {
        this.f13012 = f13012;
        notifyPropertyChanged(BR.f13012);
    }

    @Bindable
    public String getF13013() {
        return f13013;
    }

    public void setF13013(String f13013) {
        this.f13013 = f13013;
        notifyPropertyChanged(BR.f13013);
    }

    @Bindable
    public String getF13014() {
        return f13014;
    }

    public void setF13014(String f13014) {
        this.f13014 = f13014;
        notifyPropertyChanged(BR.f13014);
    }

    @Bindable
    public String getF13015() {
        return f13015;
    }

    public void setF13015(String f13015) {
        this.f13015 = f13015;
        notifyPropertyChanged(BR.f13015);
    }

    @Bindable
    public String getF13096() {
        return f13096;
    }

    public void setF13096(String f13096) {
        this.f13096 = f13096;
        notifyPropertyChanged(BR.f13096);
    }

    @Bindable
    public String getF131() {
        return f131;
    }

    public void setF131(String f131) {
        this.f131 = f131;
        notifyPropertyChanged(BR.f131);
    }

    @Bindable
    public String getF131a() {
        return f131a;
    }

    public void setF131a(String f131a) {
        this.f131a = f131a;
        notifyPropertyChanged(BR.f131a);
    }

    @Bindable
    public String getF134() {
        return f134;
    }

    public void setF134(String f134) {
        this.f134 = f134;
        notifyPropertyChanged(BR.f134);
    }

    @Bindable
    public String getF13401() {
        return f13401;
    }

    public void setF13401(String f13401) {
        this.f13401 = f13401;
        notifyPropertyChanged(BR.f13401);
    }

    @Bindable
    public String getF13402() {
        return f13402;
    }

    public void setF13402(String f13402) {
        this.f13402 = f13402;
        notifyPropertyChanged(BR.f13402);
    }

    @Bindable
    public String getF13403() {
        return f13403;
    }

    public void setF13403(String f13403) {
        this.f13403 = f13403;
        notifyPropertyChanged(BR.f13403);
    }

    @Bindable
    public String getF13404() {
        return f13404;
    }

    public void setF13404(String f13404) {
        this.f13404 = f13404;
        notifyPropertyChanged(BR.f13404);
    }

    @Bindable
    public String getF13405() {
        return f13405;
    }

    public void setF13405(String f13405) {
        this.f13405 = f13405;
        notifyPropertyChanged(BR.f13405);
    }

    @Bindable
    public String getF13406() {
        return f13406;
    }

    public void setF13406(String f13406) {
        this.f13406 = f13406;
        notifyPropertyChanged(BR.f13406);
    }

    @Bindable
    public String getF13407() {
        return f13407;
    }

    public void setF13407(String f13407) {
        this.f13407 = f13407;
        notifyPropertyChanged(BR.f13407);
    }

    @Bindable
    public String getF13408() {
        return f13408;
    }

    public void setF13408(String f13408) {
        this.f13408 = f13408;
        notifyPropertyChanged(BR.f13408);
    }

    @Bindable
    public String getF13409() {
        return f13409;
    }

    public void setF13409(String f13409) {
        this.f13409 = f13409;
        notifyPropertyChanged(BR.f13409);
    }

    @Bindable
    public String getF13410() {
        return f13410;
    }

    public void setF13410(String f13410) {
        this.f13410 = f13410;
        notifyPropertyChanged(BR.f13410);
    }

    @Bindable
    public String getG101() {
        return g101;
    }

    public void setG101(String g101) {
        this.g101 = g101;
        notifyPropertyChanged(BR.g101);
    }

    @Bindable
    public String getG102() {
        return g102;
    }

    public void setG102(String g102) {
        this.g102 = g102;
        notifyPropertyChanged(BR.g102);
    }

    @Bindable
    public String getG103() {
        return g103;
    }

    public void setG103(String g103) {
        this.g103 = g103;
        notifyPropertyChanged(BR.g103);
    }

    @Bindable
    public String getG10301() {
        return g10301;
    }

    public void setG10301(String g10301) {
        this.g10301 = g10301;
        notifyPropertyChanged(BR.g10301);
    }

    @Bindable
    public String getG10302() {
        return g10302;
    }

    public void setG10302(String g10302) {
        this.g10302 = g10302;
        notifyPropertyChanged(BR.g10302);
    }

    @Bindable
    public String getG10303() {
        return g10303;
    }

    public void setG10303(String g10303) {
        this.g10303 = g10303;
        notifyPropertyChanged(BR.g10303);
    }

    @Bindable
    public String getG10304() {
        return g10304;
    }

    public void setG10304(String g10304) {
        this.g10304 = g10304;
        notifyPropertyChanged(BR.g10304);
    }

    @Bindable
    public String getG10305() {
        return g10305;
    }

    public void setG10305(String g10305) {
        this.g10305 = g10305;
        notifyPropertyChanged(BR.g10305);
    }

    @Bindable
    public String getG10306() {
        return g10306;
    }

    public void setG10306(String g10306) {
        this.g10306 = g10306;
        notifyPropertyChanged(BR.g10306);
    }

    @Bindable
    public String getG10307() {
        return g10307;
    }

    public void setG10307(String g10307) {
        this.g10307 = g10307;
        notifyPropertyChanged(BR.g10307);
    }

    @Bindable
    public String getG10308() {
        return g10308;
    }

    public void setG10308(String g10308) {
        this.g10308 = g10308;
        notifyPropertyChanged(BR.g10308);
    }

    @Bindable
    public String getG10309() {
        return g10309;
    }

    public void setG10309(String g10309) {
        this.g10309 = g10309;
        notifyPropertyChanged(BR.g10309);
    }

    @Bindable
    public String getG10310() {
        return g10310;
    }

    public void setG10310(String g10310) {
        this.g10310 = g10310;
        notifyPropertyChanged(BR.g10310);
    }

    @Bindable
    public String getG10311() {
        return g10311;
    }

    public void setG10311(String g10311) {
        this.g10311 = g10311;
        notifyPropertyChanged(BR.g10311);
    }

    @Bindable
    public String getG10312() {
        return g10312;
    }

    public void setG10312(String g10312) {
        this.g10312 = g10312;
        notifyPropertyChanged(BR.g10312);
    }

    @Bindable
    public String getG10313() {
        return g10313;
    }

    public void setG10313(String g10313) {
        this.g10313 = g10313;
        notifyPropertyChanged(BR.g10313);
    }

    @Bindable
    public String getG10314() {
        return g10314;
    }

    public void setG10314(String g10314) {
        this.g10314 = g10314;
        notifyPropertyChanged(BR.g10314);
    }

    @Bindable
    public String getG10315() {
        return g10315;
    }

    public void setG10315(String g10315) {
        this.g10315 = g10315;
        notifyPropertyChanged(BR.g10315);
    }

    @Bindable
    public String getG10396() {
        return g10396;
    }

    public void setG10396(String g10396) {
        this.g10396 = g10396;
        notifyPropertyChanged(BR.g10396);
    }

    @Bindable
    public String getG10396x() {
        return g10396x;
    }

    public void setG10396x(String g10396x) {
        this.g10396x = g10396x;
        notifyPropertyChanged(BR.g10396x);
    }

    @Bindable
    public String getG104() {
        return g104;
    }

    public void setG104(String g104) {
        this.g104 = g104;
        notifyPropertyChanged(BR.g104);
    }

    @Bindable
    public String getG10496x() {
        return g10496x;
    }

    public void setG10496x(String g10496x) {
        this.g10496x = g10496x;
        notifyPropertyChanged(BR.g10496x);
    }

    @Bindable
    public String getG105() {
        return g105;
    }

    public void setG105(String g105) {
        this.g105 = g105;
        notifyPropertyChanged(BR.g105);
    }

    @Bindable
    public String getG10501x() {
        return g10501x;
    }

    public void setG10501x(String g10501x) {
        this.g10501x = g10501x;
        notifyPropertyChanged(BR.g10501x);
    }

    @Bindable
    public String getG106() {
        return g106;
    }

    public void setG106(String g106) {
        this.g106 = g106;
        notifyPropertyChanged(BR.g106);
    }

    @Bindable
    public String getG107() {
        return g107;
    }

    public void setG107(String g107) {
        this.g107 = g107;
        notifyPropertyChanged(BR.g107);
    }

    @Bindable
    public String getG10701x() {
        return g10701x;
    }

    public void setG10701x(String g10701x) {
        this.g10701x = g10701x;
        notifyPropertyChanged(BR.g10701x);
    }

    @Bindable
    public String getG108() {
        return g108;
    }

    public void setG108(String g108) {
        this.g108 = g108;
        notifyPropertyChanged(BR.g108);
    }

    @Bindable
    public String getG109() {
        return g109;
    }

    public void setG109(String g109) {
        this.g109 = g109;
        notifyPropertyChanged(BR.g109);
    }

    @Bindable
    public String getG110() {
        return g110;
    }

    public void setG110(String g110) {
        this.g110 = g110;
        notifyPropertyChanged(BR.g110);
    }

    @Bindable
    public String getG126() {
        return g126;
    }

    public void setG126(String g126) {
        this.g126 = g126;
        notifyPropertyChanged(BR.g126);
    }

    @Bindable
    public String getG127() {
        return g127;
    }

    public void setG127(String g127) {
        this.g127 = g127;
        notifyPropertyChanged(BR.g127);
    }

    @Bindable
    public String getG113() {
        return g113;
    }

    public void setG113(String g113) {
        this.g113 = g113;
        notifyPropertyChanged(BR.g113);
    }

    @Bindable
    public String getG114() {
        return g114;
    }

    public void setG114(String g114) {
        this.g114 = g114;
        notifyPropertyChanged(BR.g114);
    }

    @Bindable
    public String getG11496x() {
        return g11496x;
    }

    public void setG11496x(String g11496x) {
        this.g11496x = g11496x;
        notifyPropertyChanged(BR.g11496x);
    }

    @Bindable
    public String getG115() {
        return g115;
    }

    public void setG115(String g115) {
        this.g115 = g115;
        notifyPropertyChanged(BR.g115);
    }

    @Bindable
    public String getG116() {
        return g116;
    }

    public void setG116(String g116) {
        this.g116 = g116;
        notifyPropertyChanged(BR.g116);
    }

    @Bindable
    public String getG117() {
        return g117;
    }

    public void setG117(String g117) {
        this.g117 = g117;
        notifyPropertyChanged(BR.g117);
    }

    @Bindable
    public String getG11701x() {
        return g11701x;
    }

    public void setG11701x(String g11701x) {
        this.g11701x = g11701x;
        notifyPropertyChanged(BR.g11701x);
    }

    @Bindable
    public String getG11702x() {
        return g11702x;
    }

    public void setG11702x(String g11702x) {
        this.g11702x = g11702x;
        notifyPropertyChanged(BR.g11702x);
    }

    @Bindable
    public String getG11703x() {
        return g11703x;
    }

    public void setG11703x(String g11703x) {
        this.g11703x = g11703x;
        notifyPropertyChanged(BR.g11703x);
    }

    @Bindable
    public String getG118() {
        return g118;
    }

    public void setG118(String g118) {
        this.g118 = g118;
        notifyPropertyChanged(BR.g118);
    }

    @Bindable
    public String getG11801x() {
        return g11801x;
    }

    public void setG11801x(String g11801x) {
        this.g11801x = g11801x;
        notifyPropertyChanged(BR.g11801x);
    }

    @Bindable
    public String getG119() {
        return g119;
    }

    public void setG119(String g119) {
        this.g119 = g119;
        notifyPropertyChanged(BR.g119);
    }

    @Bindable
    public String getG120() {
        return g120;
    }

    public void setG120(String g120) {
        this.g120 = g120;
        notifyPropertyChanged(BR.g120);
    }

    @Bindable
    public String getG12096x() {
        return g12096x;
    }

    public void setG12096x(String g12096x) {
        this.g12096x = g12096x;
        notifyPropertyChanged(BR.g12096x);
    }

    @Bindable
    public String getG121() {
        return g121;
    }

    public void setG121(String g121) {
        this.g121 = g121;
        notifyPropertyChanged(BR.g121);
    }

    @Bindable
    public String getG12196x() {
        return g12196x;
    }

    public void setG12196x(String g12196x) {
        this.g12196x = g12196x;
        notifyPropertyChanged(BR.g12196x);
    }

    @Bindable
    public String getG122() {
        return g122;
    }

    public void setG122(String g122) {
        this.g122 = g122;
        notifyPropertyChanged(BR.g122);
    }

    @Bindable
    public String getG123() {
        return g123;
    }

    public void setG123(String g123) {
        this.g123 = g123;
        notifyPropertyChanged(BR.g123);
    }

    @Bindable
    public String getG12301() {
        return g12301;
    }

    public void setG12301(String g12301) {
        this.g12301 = g12301;
        notifyPropertyChanged(BR.g12301);
    }

    @Bindable
    public String getG12302() {
        return g12302;
    }

    public void setG12302(String g12302) {
        this.g12302 = g12302;
        notifyPropertyChanged(BR.g12302);
    }

    @Bindable
    public String getG12303() {
        return g12303;
    }

    public void setG12303(String g12303) {
        this.g12303 = g12303;
        notifyPropertyChanged(BR.g12303);
    }

    @Bindable
    public String getG12304() {
        return g12304;
    }

    public void setG12304(String g12304) {
        this.g12304 = g12304;
        notifyPropertyChanged(BR.g12304);
    }

    @Bindable
    public String getG12305() {
        return g12305;
    }

    public void setG12305(String g12305) {
        this.g12305 = g12305;
        notifyPropertyChanged(BR.g12305);
    }

    @Bindable
    public String getG12306() {
        return g12306;
    }

    public void setG12306(String g12306) {
        this.g12306 = g12306;
        notifyPropertyChanged(BR.g12306);
    }

    @Bindable
    public String getG12307() {
        return g12307;
    }

    public void setG12307(String g12307) {
        this.g12307 = g12307;
        notifyPropertyChanged(BR.g12307);
    }

    @Bindable
    public String getG12308() {
        return g12308;
    }

    public void setG12308(String g12308) {
        this.g12308 = g12308;
        notifyPropertyChanged(BR.g12308);
    }

    @Bindable
    public String getG124() {
        return g124;
    }

    public void setG124(String g124) {
        this.g124 = g124;
        notifyPropertyChanged(BR.g124);
    }

    @Bindable
    public String getG1241() {
        return g1241;
    }

    public void setG1241(String g1241) {
        this.g1241 = g1241;
        notifyPropertyChanged(BR.g1241);
    }

    @Bindable
    public String getG1242() {
        return g1242;
    }

    public void setG1242(String g1242) {
        this.g1242 = g1242;
        notifyPropertyChanged(BR.g1242);
    }

    @Bindable
    public String getG1243() {
        return g1243;
    }

    public void setG1243(String g1243) {
        this.g1243 = g1243;
        notifyPropertyChanged(BR.g1243);
    }

    @Bindable
    public String getG1244() {
        return g1244;
    }

    public void setG1244(String g1244) {
        this.g1244 = g1244;
        notifyPropertyChanged(BR.g1244);
    }

    @Bindable
    public String getG1245() {
        return g1245;
    }

    public void setG1245(String g1245) {
        this.g1245 = g1245;
        notifyPropertyChanged(BR.g1245);
    }

    @Bindable
    public String getG1246() {
        return g1246;
    }

    public void setG1246(String g1246) {
        this.g1246 = g1246;
        notifyPropertyChanged(BR.g1246);
    }

    @Bindable
    public String getG1247() {
        return g1247;
    }

    public void setG1247(String g1247) {
        this.g1247 = g1247;
        notifyPropertyChanged(BR.g1247);
    }

    @Bindable
    public String getG1248() {
        return g1248;
    }

    public void setG1248(String g1248) {
        this.g1248 = g1248;
        notifyPropertyChanged(BR.g1248);
    }

    @Bindable
    public String getG1249() {
        return g1249;
    }

    public void setG1249(String g1249) {
        this.g1249 = g1249;
        notifyPropertyChanged(BR.g1249);
    }

    @Bindable
    public String getG12410() {
        return g12410;
    }

    public void setG12410(String g12410) {
        this.g12410 = g12410;
        notifyPropertyChanged(BR.g12410);
    }

    @Bindable
    public String getG12411() {
        return g12411;
    }

    public void setG12411(String g12411) {
        this.g12411 = g12411;
        notifyPropertyChanged(BR.g12411);
    }

    @Bindable
    public String getG12412() {
        return g12412;
    }

    public void setG12412(String g12412) {
        this.g12412 = g12412;
        notifyPropertyChanged(BR.g12412);
    }

    @Bindable
    public String getG12413() {
        return g12413;
    }

    public void setG12413(String g12413) {
        this.g12413 = g12413;
        notifyPropertyChanged(BR.g12413);
    }

    @Bindable
    public String getG12401() {
        return g12401;
    }

    public void setG12401(String g12401) {
        this.g12401 = g12401;
        notifyPropertyChanged(BR.g12401);
    }

    @Bindable
    public String getG1240101() {
        return g1240101;
    }

    public void setG1240101(String g1240101) {
        this.g1240101 = g1240101;
        notifyPropertyChanged(BR.g1240101);
    }

    @Bindable
    public String getG1240102() {
        return g1240102;
    }

    public void setG1240102(String g1240102) {
        this.g1240102 = g1240102;
        notifyPropertyChanged(BR.g1240102);
    }

    @Bindable
    public String getG1240103() {
        return g1240103;
    }

    public void setG1240103(String g1240103) {
        this.g1240103 = g1240103;
        notifyPropertyChanged(BR.g1240103);
    }

    @Bindable
    public String getG1240104() {
        return g1240104;
    }

    public void setG1240104(String g1240104) {
        this.g1240104 = g1240104;
        notifyPropertyChanged(BR.g1240104);
    }

    @Bindable
    public String getG1240105() {
        return g1240105;
    }

    public void setG1240105(String g1240105) {
        this.g1240105 = g1240105;
        notifyPropertyChanged(BR.g1240105);
    }

    @Bindable
    public String getG1240106() {
        return g1240106;
    }

    public void setG1240106(String g1240106) {
        this.g1240106 = g1240106;
        notifyPropertyChanged(BR.g1240106);
    }

    @Bindable
    public String getG1240107() {
        return g1240107;
    }

    public void setG1240107(String g1240107) {
        this.g1240107 = g1240107;
        notifyPropertyChanged(BR.g1240107);
    }

    @Bindable
    public String getG1240108() {
        return g1240108;
    }

    public void setG1240108(String g1240108) {
        this.g1240108 = g1240108;
        notifyPropertyChanged(BR.g1240108);
    }

    @Bindable
    public String getG1240109() {
        return g1240109;
    }

    public void setG1240109(String g1240109) {
        this.g1240109 = g1240109;
        notifyPropertyChanged(BR.g1240109);
    }

    @Bindable
    public String getG1240110() {
        return g1240110;
    }

    public void setG1240110(String g1240110) {
        this.g1240110 = g1240110;
        notifyPropertyChanged(BR.g1240110);
    }

    @Bindable
    public String getG1240111() {
        return g1240111;
    }

    public void setG1240111(String g1240111) {
        this.g1240111 = g1240111;
        notifyPropertyChanged(BR.g1240111);
    }

    @Bindable
    public String getG1240112() {
        return g1240112;
    }

    public void setG1240112(String g1240112) {
        this.g1240112 = g1240112;
        notifyPropertyChanged(BR.g1240112);
    }

    @Bindable
    public String getG1240113() {
        return g1240113;
    }

    public void setG1240113(String g1240113) {
        this.g1240113 = g1240113;
        notifyPropertyChanged(BR.g1240113);
    }

    @Bindable
    public String getG1240114() {
        return g1240114;
    }

    public void setG1240114(String g1240114) {
        this.g1240114 = g1240114;
        notifyPropertyChanged(BR.g1240114);
    }

    @Bindable
    public String getG12402() {
        return g12402;
    }

    public void setG12402(String g12402) {
        this.g12402 = g12402;
        notifyPropertyChanged(BR.g12402);
    }

    @Bindable
    public String getG125() {
        return g125;
    }

    public void setG125(String g125) {
        this.g125 = g125;
        notifyPropertyChanged(BR.g125);
    }

    @Bindable
    public String getG12501() {
        return g12501;
    }

    public void setG12501(String g12501) {
        this.g12501 = g12501;
        notifyPropertyChanged(BR.g12501);
    }

    @Bindable
    public String getG1250101() {
        return g1250101;
    }

    public void setG1250101(String g1250101) {
        this.g1250101 = g1250101;
        notifyPropertyChanged(BR.g1250101);
    }

    @Bindable
    public String getG1250102() {
        return g1250102;
    }

    public void setG1250102(String g1250102) {
        this.g1250102 = g1250102;
        notifyPropertyChanged(BR.g1250102);
    }

    @Bindable
    public String getG1250103() {
        return g1250103;
    }

    public void setG1250103(String g1250103) {
        this.g1250103 = g1250103;
        notifyPropertyChanged(BR.g1250103);
    }

    @Bindable
    public String getG1250104() {
        return g1250104;
    }

    public void setG1250104(String g1250104) {
        this.g1250104 = g1250104;
        notifyPropertyChanged(BR.g1250104);
    }

    @Bindable
    public String getG1250105() {
        return g1250105;
    }

    public void setG1250105(String g1250105) {
        this.g1250105 = g1250105;
        notifyPropertyChanged(BR.g1250105);
    }

    @Bindable
    public String getG1250106() {
        return g1250106;
    }

    public void setG1250106(String g1250106) {
        this.g1250106 = g1250106;
        notifyPropertyChanged(BR.g1250106);
    }

    @Bindable
    public String getG1250107() {
        return g1250107;
    }

    public void setG1250107(String g1250107) {
        this.g1250107 = g1250107;
        notifyPropertyChanged(BR.g1250107);
    }

    @Bindable
    public String getG1250108() {
        return g1250108;
    }

    public void setG1250108(String g1250108) {
        this.g1250108 = g1250108;
        notifyPropertyChanged(BR.g1250108);
    }

    @Bindable
    public String getG128() {
        return g128;
    }

    public void setG128(String g128) {
        this.g128 = g128;
        notifyPropertyChanged(BR.g128);
    }

    @Bindable
    public String getG129() {
        return g129;
    }

    public void setG129(String g129) {
        this.g129 = g129;
        notifyPropertyChanged(BR.g129);
    }

    @Bindable
    public String getG130() {
        return g130;
    }

    public void setG130(String g130) {
        this.g130 = g130;
        notifyPropertyChanged(BR.g130);
    }

    @Bindable
    public String getH101() {
        return h101;
    }

    public void setH101(String h101) {
        this.h101 = h101;
        notifyPropertyChanged(BR.h101);
    }

    @Bindable
    public String getH10101x() {
        return h10101x;
    }

    public void setH10101x(String h10101x) {
        this.h10101x = h10101x;
        notifyPropertyChanged(BR.h10101x);
    }

    @Bindable
    public String getH10102x() {
        return h10102x;
    }

    public void setH10102x(String h10102x) {
        this.h10102x = h10102x;
        notifyPropertyChanged(BR.h10102x);
    }

    @Bindable
    public String getH102() {
        return h102;
    }

    public void setH102(String h102) {
        this.h102 = h102;
        notifyPropertyChanged(BR.h102);
    }

    @Bindable
    public String getH103() {
        return h103;
    }

    public void setH103(String h103) {
        this.h103 = h103;
        notifyPropertyChanged(BR.h103);
    }

    @Bindable
    public String getH104() {
        return h104;
    }

    public void setH104(String h104) {
        this.h104 = h104;
        notifyPropertyChanged(BR.h104);
    }

    @Bindable
    public String getH10401() {
        return h10401;
    }

    public void setH10401(String h10401) {
        this.h10401 = h10401;
        notifyPropertyChanged(BR.h10401);
    }

    @Bindable
    public String getH10402() {
        return h10402;
    }

    public void setH10402(String h10402) {
        this.h10402 = h10402;
        notifyPropertyChanged(BR.h10402);
    }

    @Bindable
    public String getH10403() {
        return h10403;
    }

    public void setH10403(String h10403) {
        this.h10403 = h10403;
        notifyPropertyChanged(BR.h10403);
    }

    @Bindable
    public String getH10496() {
        return h10496;
    }

    public void setH10496(String h10496) {
        this.h10496 = h10496;
        notifyPropertyChanged(BR.h10496);
    }

    @Bindable
    public String getH10496x() {
        return h10496x;
    }

    public void setH10496x(String h10496x) {
        this.h10496x = h10496x;
        notifyPropertyChanged(BR.h10496x);
    }

    @Bindable
    public String getH105() {
        return h105;
    }

    public void setH105(String h105) {
        this.h105 = h105;
        notifyPropertyChanged(BR.h105);
    }

    @Bindable
    public String getH106() {
        return h106;
    }

    public void setH106(String h106) {
        this.h106 = h106;
        notifyPropertyChanged(BR.h106);
    }

    @Bindable
    public String getH10601x() {
        return h10601x;
    }

    public void setH10601x(String h10601x) {
        this.h10601x = h10601x;
        notifyPropertyChanged(BR.h10601x);
    }

    @Bindable
    public String getH107() {
        return h107;
    }

    public void setH107(String h107) {
        this.h107 = h107;
        notifyPropertyChanged(BR.h107);
    }

    @Bindable
    public String getH10800() {
        return h10800;
    }

    public void setH10800(String h10800) {
        this.h10800 = h10800;
        notifyPropertyChanged(BR.h10800);
    }

    @Bindable
    public String getH108a() {
        return h108a;
    }

    public void setH108a(String h108a) {
        this.h108a = h108a;
        notifyPropertyChanged(BR.h108a);
    }

    @Bindable
    public String getH108() {
        return h108;
    }

    public void setH108(String h108) {
        this.h108 = h108;
        notifyPropertyChanged(BR.h108);
    }

    @Bindable
    public String getH10896x() {
        return h10896x;
    }

    public void setH10896x(String h10896x) {
        this.h10896x = h10896x;
        notifyPropertyChanged(BR.h10896x);
    }

    @Bindable
    public String getH10900() {
        return h10900;
    }

    public void setH10900(String h10900) {
        this.h10900 = h10900;
        notifyPropertyChanged(BR.h10900);
    }

    @Bindable
    public String getH10901() {
        return h10901;
    }

    public void setH10901(String h10901) {
        this.h10901 = h10901;
        notifyPropertyChanged(BR.h10901);
    }

    @Bindable
    public String getH109() {
        return h109;
    }

    public void setH109(String h109) {
        this.h109 = h109;
        notifyPropertyChanged(BR.h109);
    }

    @Bindable
    public String getH1091() {
        return h1091;
    }

    public void setH1091(String h1091) {
        this.h1091 = h1091;
        notifyPropertyChanged(BR.h1091);
    }

    @Bindable
    public String getH1092() {
        return h1092;
    }

    public void setH1092(String h1092) {
        this.h1092 = h1092;
        notifyPropertyChanged(BR.h1092);
    }

    @Bindable
    public String getH1093() {
        return h1093;
    }

    public void setH1093(String h1093) {
        this.h1093 = h1093;
        notifyPropertyChanged(BR.h1093);
    }

    @Bindable
    public String getH1094() {
        return h1094;
    }

    public void setH1094(String h1094) {
        this.h1094 = h1094;
        notifyPropertyChanged(BR.h1094);
    }

    @Bindable
    public String getH1095() {
        return h1095;
    }

    public void setH1095(String h1095) {
        this.h1095 = h1095;
        notifyPropertyChanged(BR.h1095);
    }

    @Bindable
    public String getH1096() {
        return h1096;
    }

    public void setH1096(String h1096) {
        this.h1096 = h1096;
        notifyPropertyChanged(BR.h1096);
    }

    @Bindable
    public String getH1097() {
        return h1097;
    }

    public void setH1097(String h1097) {
        this.h1097 = h1097;
        notifyPropertyChanged(BR.h1097);
    }

    @Bindable
    public String getH10997() {
        return h10997;
    }

    public void setH10997(String h10997) {
        this.h10997 = h10997;
        notifyPropertyChanged(BR.h10997);
    }

    @Bindable
    public String getH10996() {
        return h10996;
    }

    public void setH10996(String h10996) {
        this.h10996 = h10996;
        notifyPropertyChanged(BR.h10996);
    }

    @Bindable
    public String getH10996x() {
        return h10996x;
    }

    public void setH10996x(String h10996x) {
        this.h10996x = h10996x;
        notifyPropertyChanged(BR.h10996x);
    }

    @Bindable
    public String getH11000() {
        return h11000;
    }

    public void setH11000(String h11000) {
        this.h11000 = h11000;
        notifyPropertyChanged(BR.h11000);
    }

    @Bindable
    public String getH11001() {
        return h11001;
    }

    public void setH11001(String h11001) {
        this.h11001 = h11001;
        notifyPropertyChanged(BR.h11001);
    }

    @Bindable
    public String getH110() {
        return h110;
    }

    public void setH110(String h110) {
        this.h110 = h110;
        notifyPropertyChanged(BR.h110);
    }

    @Bindable
    public String getH111() {
        return h111;
    }

    public void setH111(String h111) {
        this.h111 = h111;
        notifyPropertyChanged(BR.h111);
    }

    @Bindable
    public String getH11200() {
        return h11200;
    }

    public void setH11200(String h11200) {
        this.h11200 = h11200;
        notifyPropertyChanged(BR.h11200);
    }

    @Bindable
    public String getH11201() {
        return h11201;
    }

    public void setH11201(String h11201) {
        this.h11201 = h11201;
        notifyPropertyChanged(BR.h11201);
    }

    @Bindable
    public String getH11202() {
        return h11202;
    }

    public void setH11202(String h11202) {
        this.h11202 = h11202;
        notifyPropertyChanged(BR.h11202);
    }

    @Bindable
    public String getH112() {
        return h112;
    }

    public void setH112(String h112) {
        this.h112 = h112;
        notifyPropertyChanged(BR.h112);
    }

    @Bindable
    public String getH113() {
        return h113;
    }

    public void setH113(String h113) {
        this.h113 = h113;
        notifyPropertyChanged(BR.h113);
    }

    @Bindable
    public String getH114() {
        return h114;
    }

    public void setH114(String h114) {
        this.h114 = h114;
        notifyPropertyChanged(BR.h114);
    }

    @Bindable
    public String getH115() {
        return h115;
    }

    public void setH115(String h115) {
        this.h115 = h115;
        notifyPropertyChanged(BR.h115);
    }

    @Bindable
    public String getH11502() {
        return h11502;
    }

    public void setH11502(String h11502) {
        this.h11502 = h11502;
        notifyPropertyChanged(BR.h11502);
    }

    @Bindable
    public String getH1150201() {
        return h1150201;
    }

    public void setH1150201(String h1150201) {
        this.h1150201 = h1150201;
        notifyPropertyChanged(BR.h1150201);
    }

    @Bindable
    public String getH1150202() {
        return h1150202;
    }

    public void setH1150202(String h1150202) {
        this.h1150202 = h1150202;
        notifyPropertyChanged(BR.h1150202);
    }

    @Bindable
    public String getH1150203() {
        return h1150203;
    }

    public void setH1150203(String h1150203) {
        this.h1150203 = h1150203;
        notifyPropertyChanged(BR.h1150203);
    }

    @Bindable
    public String getH1150204() {
        return h1150204;
    }

    public void setH1150204(String h1150204) {
        this.h1150204 = h1150204;
        notifyPropertyChanged(BR.h1150204);
    }

    @Bindable
    public String getH1150205() {
        return h1150205;
    }

    public void setH1150205(String h1150205) {
        this.h1150205 = h1150205;
        notifyPropertyChanged(BR.h1150205);
    }

    @Bindable
    public String getH1150206() {
        return h1150206;
    }

    public void setH1150206(String h1150206) {
        this.h1150206 = h1150206;
        notifyPropertyChanged(BR.h1150206);
    }

    @Bindable
    public String getH1150207() {
        return h1150207;
    }

    public void setH1150207(String h1150207) {
        this.h1150207 = h1150207;
        notifyPropertyChanged(BR.h1150207);
    }

    @Bindable
    public String getH1150208() {
        return h1150208;
    }

    public void setH1150208(String h1150208) {
        this.h1150208 = h1150208;
        notifyPropertyChanged(BR.h1150208);
    }

    @Bindable
    public String getH1150209() {
        return h1150209;
    }

    public void setH1150209(String h1150209) {
        this.h1150209 = h1150209;
        notifyPropertyChanged(BR.h1150209);
    }

    @Bindable
    public String getH1150296() {
        return h1150296;
    }

    public void setH1150296(String h1150296) {
        this.h1150296 = h1150296;
        notifyPropertyChanged(BR.h1150296);
    }

    @Bindable
    public String getH1150296x() {
        return h1150296x;
    }

    public void setH1150296x(String h1150296x) {
        this.h1150296x = h1150296x;
        notifyPropertyChanged(BR.h1150296x);
    }

    @Bindable
    public String getH116() {
        return h116;
    }

    public void setH116(String h116) {
        this.h116 = h116;
        notifyPropertyChanged(BR.h116);
    }

    @Bindable
    public String getH117() {
        return h117;
    }

    public void setH117(String h117) {
        this.h117 = h117;
        notifyPropertyChanged(BR.h117);
    }

    @Bindable
    public String getH118() {
        return h118;
    }

    public void setH118(String h118) {
        this.h118 = h118;
        notifyPropertyChanged(BR.h118);
    }

    @Bindable
    public String getH119() {
        return h119;
    }

    public void setH119(String h119) {
        this.h119 = h119;
        notifyPropertyChanged(BR.h119);
    }

    @Bindable
    public String getH120() {
        return h120;
    }

    public void setH120(String h120) {
        this.h120 = h120;
        notifyPropertyChanged(BR.h120);
    }

    @Bindable
    public String getH121() {
        return h121;
    }

    public void setH121(String h121) {
        this.h121 = h121;
        notifyPropertyChanged(BR.h121);
    }

    @Bindable
    public String getH122() {
        return h122;
    }

    public void setH122(String h122) {
        this.h122 = h122;
        notifyPropertyChanged(BR.h122);
    }

    @Bindable
    public String getH12201x() {
        return h12201x;
    }

    public void setH12201x(String h12201x) {
        this.h12201x = h12201x;
        notifyPropertyChanged(BR.h12201x);
    }

    @Bindable
    public String getH123() {
        return h123;
    }

    public void setH123(String h123) {
        this.h123 = h123;
        notifyPropertyChanged(BR.h123);
    }

    @Bindable
    public String getH124() {
        return h124;
    }

    public void setH124(String h124) {
        this.h124 = h124;
        notifyPropertyChanged(BR.h124);
    }

    @Bindable
    public String getH125() {
        return h125;
    }

    public void setH125(String h125) {
        this.h125 = h125;
        notifyPropertyChanged(BR.h125);
    }

    @Bindable
    public String getH126() {
        return h126;
    }

    public void setH126(String h126) {
        this.h126 = h126;
        notifyPropertyChanged(BR.h126);
    }

    @Bindable
    public String getH127() {
        return h127;
    }

    public void setH127(String h127) {
        this.h127 = h127;
        notifyPropertyChanged(BR.h127);
    }

    @Bindable
    public String getH12796x() {
        return h12796x;
    }

    public void setH12796x(String h12796x) {
        this.h12796x = h12796x;
        notifyPropertyChanged(BR.h12796x);
    }

    @Bindable
    public String getH128() {
        return h128;
    }

    public void setH128(String h128) {
        this.h128 = h128;
        notifyPropertyChanged(BR.h128);
    }

    @Bindable
    public String getH12896x() {
        return h12896x;
    }

    public void setH12896x(String h12896x) {
        this.h12896x = h12896x;
        notifyPropertyChanged(BR.h12896x);
    }

    @Bindable
    public String getH1291() {
        return h1291;
    }

    public void setH1291(String h1291) {
        this.h1291 = h1291;
        notifyPropertyChanged(BR.h1291);
    }

    @Bindable
    public String getH1292() {
        return h1292;
    }

    public void setH1292(String h1292) {
        this.h1292 = h1292;
        notifyPropertyChanged(BR.h1292);
    }

    @Bindable
    public String getH1293() {
        return h1293;
    }

    public void setH1293(String h1293) {
        this.h1293 = h1293;
        notifyPropertyChanged(BR.h1293);
    }

    @Bindable
    public String getH1294() {
        return h1294;
    }

    public void setH1294(String h1294) {
        this.h1294 = h1294;
        notifyPropertyChanged(BR.h1294);
    }

    @Bindable
    public String getH1295() {
        return h1295;
    }

    public void setH1295(String h1295) {
        this.h1295 = h1295;
        notifyPropertyChanged(BR.h1295);
    }

    @Bindable
    public String getH1296() {
        return h1296;
    }

    public void setH1296(String h1296) {
        this.h1296 = h1296;
        notifyPropertyChanged(BR.h1296);
    }

    @Bindable
    public String getH130() {
        return h130;
    }

    public void setH130(String h130) {
        this.h130 = h130;
        notifyPropertyChanged(BR.h130);
    }

    @Bindable
    public String getH131() {
        return h131;
    }

    public void setH131(String h131) {
        this.h131 = h131;
        notifyPropertyChanged(BR.h131);
    }

    @Bindable
    public String getH13101() {
        return h13101;
    }

    public void setH13101(String h13101) {
        this.h13101 = h13101;
        notifyPropertyChanged(BR.h13101);
    }

    @Bindable
    public String getH1310101() {
        return h1310101;
    }

    public void setH1310101(String h1310101) {
        this.h1310101 = h1310101;
        notifyPropertyChanged(BR.h1310101);
    }

    @Bindable
    public String getH1310102() {
        return h1310102;
    }

    public void setH1310102(String h1310102) {
        this.h1310102 = h1310102;
        notifyPropertyChanged(BR.h1310102);
    }

    @Bindable
    public String getH1310103() {
        return h1310103;
    }

    public void setH1310103(String h1310103) {
        this.h1310103 = h1310103;
        notifyPropertyChanged(BR.h1310103);
    }

    @Bindable
    public String getH1310104() {
        return h1310104;
    }

    public void setH1310104(String h1310104) {
        this.h1310104 = h1310104;
        notifyPropertyChanged(BR.h1310104);
    }

    @Bindable
    public String getH1310105() {
        return h1310105;
    }

    public void setH1310105(String h1310105) {
        this.h1310105 = h1310105;
        notifyPropertyChanged(BR.h1310105);
    }

    @Bindable
    public String getH1310106() {
        return h1310106;
    }

    public void setH1310106(String h1310106) {
        this.h1310106 = h1310106;
        notifyPropertyChanged(BR.h1310106);
    }

    @Bindable
    public String getH1310107() {
        return h1310107;
    }

    public void setH1310107(String h1310107) {
        this.h1310107 = h1310107;
        notifyPropertyChanged(BR.h1310107);
    }

    @Bindable
    public String getH132() {
        return h132;
    }

    public void setH132(String h132) {
        this.h132 = h132;
        notifyPropertyChanged(BR.h132);
    }

    @Bindable
    public String getH132a() {
        return h132a;
    }

    public void setH132a(String h132a) {
        this.h132a = h132a;
        notifyPropertyChanged(BR.h132a);
    }

    @Bindable
    public String getH132a96x() {
        return h132a96x;
    }

    public void setH132a96x(String h132a96x) {
        this.h132a96x = h132a96x;
        notifyPropertyChanged(BR.h132a96x);
    }

    @Bindable
    public String getH133() {
        return h133;
    }

    public void setH133(String h133) {
        this.h133 = h133;
        notifyPropertyChanged(BR.h133);
    }

    @Bindable
    public String getH13301() {
        return h13301;
    }

    public void setH13301(String h13301) {
        this.h13301 = h13301;
        notifyPropertyChanged(BR.h13301);
    }

    @Bindable
    public String getH13302() {
        return h13302;
    }

    public void setH13302(String h13302) {
        this.h13302 = h13302;
        notifyPropertyChanged(BR.h13302);
    }

    @Bindable
    public String getH13303() {
        return h13303;
    }

    public void setH13303(String h13303) {
        this.h13303 = h13303;
        notifyPropertyChanged(BR.h13303);
    }

    @Bindable
    public String getH13304() {
        return h13304;
    }

    public void setH13304(String h13304) {
        this.h13304 = h13304;
        notifyPropertyChanged(BR.h13304);
    }

    @Bindable
    public String getH13305() {
        return h13305;
    }

    public void setH13305(String h13305) {
        this.h13305 = h13305;
        notifyPropertyChanged(BR.h13305);
    }

    @Bindable
    public String getH13306() {
        return h13306;
    }

    public void setH13306(String h13306) {
        this.h13306 = h13306;
        notifyPropertyChanged(BR.h13306);
    }

    @Bindable
    public String getH13307() {
        return h13307;
    }

    public void setH13307(String h13307) {
        this.h13307 = h13307;
        notifyPropertyChanged(BR.h13307);
    }

    @Bindable
    public String getH13308() {
        return h13308;
    }

    public void setH13308(String h13308) {
        this.h13308 = h13308;
        notifyPropertyChanged(BR.h13308);
    }

    @Bindable
    public String getH13309() {
        return h13309;
    }

    public void setH13309(String h13309) {
        this.h13309 = h13309;
        notifyPropertyChanged(BR.h13309);
    }

    @Bindable
    public String getH13310() {
        return h13310;
    }

    public void setH13310(String h13310) {
        this.h13310 = h13310;
        notifyPropertyChanged(BR.h13310);
    }

    @Bindable
    public String getH134() {
        return h134;
    }

    public void setH134(String h134) {
        this.h134 = h134;
        notifyPropertyChanged(BR.h134);
    }

    @Bindable
    public String getH135() {
        return h135;
    }

    public void setH135(String h135) {
        this.h135 = h135;
        notifyPropertyChanged(BR.h135);
    }

    @Bindable
    public String getH13501() {
        return h13501;
    }

    public void setH13501(String h13501) {
        this.h13501 = h13501;
        notifyPropertyChanged(BR.h13501);
    }

    @Bindable
    public String getH13502() {
        return h13502;
    }

    public void setH13502(String h13502) {
        this.h13502 = h13502;
        notifyPropertyChanged(BR.h13502);
    }

    @Bindable
    public String getH13503() {
        return h13503;
    }

    public void setH13503(String h13503) {
        this.h13503 = h13503;
        notifyPropertyChanged(BR.h13503);
    }

    @Bindable
    public String getH13504() {
        return h13504;
    }

    public void setH13504(String h13504) {
        this.h13504 = h13504;
        notifyPropertyChanged(BR.h13504);
    }

    @Bindable
    public String getH13505() {
        return h13505;
    }

    public void setH13505(String h13505) {
        this.h13505 = h13505;
        notifyPropertyChanged(BR.h13505);
    }

    @Bindable
    public String getH13506() {
        return h13506;
    }

    public void setH13506(String h13506) {
        this.h13506 = h13506;
        notifyPropertyChanged(BR.h13506);
    }

    @Bindable
    public String getH13507() {
        return h13507;
    }

    public void setH13507(String h13507) {
        this.h13507 = h13507;
        notifyPropertyChanged(BR.h13507);
    }

    @Bindable
    public String getH13508() {
        return h13508;
    }

    public void setH13508(String h13508) {
        this.h13508 = h13508;
        notifyPropertyChanged(BR.h13508);
    }

    @Bindable
    public String getH13509() {
        return h13509;
    }

    public void setH13509(String h13509) {
        this.h13509 = h13509;
        notifyPropertyChanged(BR.h13509);
    }

    @Bindable
    public String getH13598() {
        return h13598;
    }

    public void setH13598(String h13598) {
        this.h13598 = h13598;
        notifyPropertyChanged(BR.h13598);
    }

    @Bindable
    public String getH136() {
        return h136;
    }

    public void setH136(String h136) {
        this.h136 = h136;
        notifyPropertyChanged(BR.h136);
    }

    @Bindable
    public String getH1361() {
        return h1361;
    }

    public void setH1361(String h1361) {
        this.h1361 = h1361;
        notifyPropertyChanged(BR.h1361);
    }

    @Bindable
    public String getH1362() {
        return h1362;
    }

    public void setH1362(String h1362) {
        this.h1362 = h1362;
        notifyPropertyChanged(BR.h1362);
    }

    @Bindable
    public String getH1363() {
        return h1363;
    }

    public void setH1363(String h1363) {
        this.h1363 = h1363;
        notifyPropertyChanged(BR.h1363);
    }

    @Bindable
    public String getH1364() {
        return h1364;
    }

    public void setH1364(String h1364) {
        this.h1364 = h1364;
        notifyPropertyChanged(BR.h1364);
    }

    @Bindable
    public String getH1365() {
        return h1365;
    }

    public void setH1365(String h1365) {
        this.h1365 = h1365;
        notifyPropertyChanged(BR.h1365);
    }

    @Bindable
    public String getH1366() {
        return h1366;
    }

    public void setH1366(String h1366) {
        this.h1366 = h1366;
        notifyPropertyChanged(BR.h1366);
    }

    @Bindable
    public String getH13696() {
        return h13696;
    }

    public void setH13696(String h13696) {
        this.h13696 = h13696;
        notifyPropertyChanged(BR.h13696);
    }

    @Bindable
    public String getH13696x() {
        return h13696x;
    }

    public void setH13696x(String h13696x) {
        this.h13696x = h13696x;
        notifyPropertyChanged(BR.h13696x);
    }

    @Bindable
    public String getH13601() {
        return h13601;
    }

    public void setH13601(String h13601) {
        this.h13601 = h13601;
        notifyPropertyChanged(BR.h13601);
    }

    @Bindable
    public String getH13602() {
        return h13602;
    }

    public void setH13602(String h13602) {
        this.h13602 = h13602;
        notifyPropertyChanged(BR.h13602);
    }

    @Bindable
    public String getH1360201() {
        return h1360201;
    }

    public void setH1360201(String h1360201) {
        this.h1360201 = h1360201;
        notifyPropertyChanged(BR.h1360201);
    }

    @Bindable
    public String getH1360202() {
        return h1360202;
    }

    public void setH1360202(String h1360202) {
        this.h1360202 = h1360202;
        notifyPropertyChanged(BR.h1360202);
    }

    @Bindable
    public String getH1360203() {
        return h1360203;
    }

    public void setH1360203(String h1360203) {
        this.h1360203 = h1360203;
        notifyPropertyChanged(BR.h1360203);
    }

    @Bindable
    public String getH1360204() {
        return h1360204;
    }

    public void setH1360204(String h1360204) {
        this.h1360204 = h1360204;
        notifyPropertyChanged(BR.h1360204);
    }

    @Bindable
    public String getH1360205() {
        return h1360205;
    }

    public void setH1360205(String h1360205) {
        this.h1360205 = h1360205;
        notifyPropertyChanged(BR.h1360205);
    }

    @Bindable
    public String getH1360206() {
        return h1360206;
    }

    public void setH1360206(String h1360206) {
        this.h1360206 = h1360206;
        notifyPropertyChanged(BR.h1360206);
    }

    @Bindable
    public String getH1360207() {
        return h1360207;
    }

    public void setH1360207(String h1360207) {
        this.h1360207 = h1360207;
        notifyPropertyChanged(BR.h1360207);
    }

    @Bindable
    public String getH1360208() {
        return h1360208;
    }

    public void setH1360208(String h1360208) {
        this.h1360208 = h1360208;
        notifyPropertyChanged(BR.h1360208);
    }

    @Bindable
    public String getH1360209() {
        return h1360209;
    }

    public void setH1360209(String h1360209) {
        this.h1360209 = h1360209;
        notifyPropertyChanged(BR.h1360209);
    }

    @Bindable
    public String getH1360210() {
        return h1360210;
    }

    public void setH1360210(String h1360210) {
        this.h1360210 = h1360210;
        notifyPropertyChanged(BR.h1360210);
    }

    @Bindable
    public String getH1360298() {
        return h1360298;
    }

    public void setH1360298(String h1360298) {
        this.h1360298 = h1360298;
        notifyPropertyChanged(BR.h1360298);
    }

    @Bindable
    public String getH13603() {
        return h13603;
    }

    public void setH13603(String h13603) {
        this.h13603 = h13603;
        notifyPropertyChanged(BR.h13603);
    }

    @Bindable
    public String getH137() {
        return h137;
    }

    public void setH137(String h137) {
        this.h137 = h137;
        notifyPropertyChanged(BR.h137);
    }

    @Bindable
    public String getH13701() {
        return h13701;
    }

    public void setH13701(String h13701) {
        this.h13701 = h13701;
        notifyPropertyChanged(BR.h13701);
    }

    @Bindable
    public String getH1370196x() {
        return h1370196x;
    }

    public void setH1370196x(String h1370196x) {
        this.h1370196x = h1370196x;
        notifyPropertyChanged(BR.h1370196x);
    }

    @Bindable
    public String getH13702() {
        return h13702;
    }

    public void setH13702(String h13702) {
        this.h13702 = h13702;
        notifyPropertyChanged(BR.h13702);
    }

    @Bindable
    public String getH13703() {
        return h13703;
    }

    public void setH13703(String h13703) {
        this.h13703 = h13703;
        notifyPropertyChanged(BR.h13703);
    }

    @Bindable
    public String getH1370396x() {
        return h1370396x;
    }

    public void setH1370396x(String h1370396x) {
        this.h1370396x = h1370396x;
        notifyPropertyChanged(BR.h1370396x);
    }

    @Bindable
    public String getH201() {
        return h201;
    }

    public void setH201(String h201) {
        this.h201 = h201;
        notifyPropertyChanged(BR.h201);
    }

    @Bindable
    public String getH20101x() {
        return h20101x;
    }

    public void setH20101x(String h20101x) {
        this.h20101x = h20101x;
        notifyPropertyChanged(BR.h20101x);
    }

    @Bindable
    public String getH20102x() {
        return h20102x;
    }

    public void setH20102x(String h20102x) {
        this.h20102x = h20102x;
        notifyPropertyChanged(BR.h20102x);
    }

    @Bindable
    public String getH20103x() {
        return h20103x;
    }

    public void setH20103x(String h20103x) {
        this.h20103x = h20103x;
        notifyPropertyChanged(BR.h20103x);
    }

    @Bindable
    public String getH202() {
        return h202;
    }

    public void setH202(String h202) {
        this.h202 = h202;
        notifyPropertyChanged(BR.h202);
    }

    @Bindable
    public String getH203() {
        return h203;
    }

    public void setH203(String h203) {
        this.h203 = h203;
        notifyPropertyChanged(BR.h203);
    }

    @Bindable
    public String getH20301x() {
        return h20301x;
    }

    public void setH20301x(String h20301x) {
        this.h20301x = h20301x;
        notifyPropertyChanged(BR.h20301x);
    }

    @Bindable
    public String getH20302x() {
        return h20302x;
    }

    public void setH20302x(String h20302x) {
        this.h20302x = h20302x;
        notifyPropertyChanged(BR.h20302x);
    }

    @Bindable
    public String getH20303x() {
        return h20303x;
    }

    public void setH20303x(String h20303x) {
        this.h20303x = h20303x;
        notifyPropertyChanged(BR.h20303x);
    }

    @Bindable
    public String getH204() {
        return h204;
    }

    public void setH204(String h204) {
        this.h204 = h204;
        notifyPropertyChanged(BR.h204);
    }

    @Bindable
    public String getH20496x() {
        return h20496x;
    }

    public void setH20496x(String h20496x) {
        this.h20496x = h20496x;
        notifyPropertyChanged(BR.h20496x);
    }

    @Bindable
    public String getH205() {
        return h205;
    }

    public void setH205(String h205) {
        this.h205 = h205;
        notifyPropertyChanged(BR.h205);
    }

    @Bindable
    public String getH20596x() {
        return h20596x;
    }

    public void setH20596x(String h20596x) {
        this.h20596x = h20596x;
        notifyPropertyChanged(BR.h20596x);
    }

    @Bindable
    public String getH205a() {
        return h205a;
    }

    public void setH205a(String h205a) {
        this.h205a = h205a;
        notifyPropertyChanged(BR.h205a);
    }

    @Bindable
    public String getH205a01() {
        return h205a01;
    }

    public void setH205a01(String h205a01) {
        this.h205a01 = h205a01;
        notifyPropertyChanged(BR.h205a01);
    }

    @Bindable
    public String getH205a02() {
        return h205a02;
    }

    public void setH205a02(String h205a02) {
        this.h205a02 = h205a02;
        notifyPropertyChanged(BR.h205a02);
    }

    @Bindable
    public String getH205a03() {
        return h205a03;
    }

    public void setH205a03(String h205a03) {
        this.h205a03 = h205a03;
        notifyPropertyChanged(BR.h205a03);
    }

    @Bindable
    public String getH205a04() {
        return h205a04;
    }

    public void setH205a04(String h205a04) {
        this.h205a04 = h205a04;
        notifyPropertyChanged(BR.h205a04);
    }

    @Bindable
    public String getH205a05() {
        return h205a05;
    }

    public void setH205a05(String h205a05) {
        this.h205a05 = h205a05;
        notifyPropertyChanged(BR.h205a05);
    }

    @Bindable
    public String getH205a06() {
        return h205a06;
    }

    public void setH205a06(String h205a06) {
        this.h205a06 = h205a06;
        notifyPropertyChanged(BR.h205a06);
    }

    @Bindable
    public String getH205a07() {
        return h205a07;
    }

    public void setH205a07(String h205a07) {
        this.h205a07 = h205a07;
        notifyPropertyChanged(BR.h205a07);
    }

    @Bindable
    public String getH205a08() {
        return h205a08;
    }

    public void setH205a08(String h205a08) {
        this.h205a08 = h205a08;
        notifyPropertyChanged(BR.h205a08);
    }

    @Bindable
    public String getH205a09() {
        return h205a09;
    }

    public void setH205a09(String h205a09) {
        this.h205a09 = h205a09;
        notifyPropertyChanged(BR.h205a09);
    }

    @Bindable
    public String getH205a10() {
        return h205a10;
    }

    public void setH205a10(String h205a10) {
        this.h205a10 = h205a10;
        notifyPropertyChanged(BR.h205a10);
    }

    @Bindable
    public String getH205a96() {
        return h205a96;
    }

    public void setH205a96(String h205a96) {
        this.h205a96 = h205a96;
        notifyPropertyChanged(BR.h205a96);
    }

    @Bindable
    public String getH205a96x() {
        return h205a96x;
    }

    public void setH205a96x(String h205a96x) {
        this.h205a96x = h205a96x;
        notifyPropertyChanged(BR.h205a96x);
    }

    @Bindable
    public String getH206() {
        return h206;
    }

    public void setH206(String h206) {
        this.h206 = h206;
        notifyPropertyChanged(BR.h206);
    }

    @Bindable
    public String getH207() {
        return h207;
    }

    public void setH207(String h207) {
        this.h207 = h207;
        notifyPropertyChanged(BR.h207);
    }

    @Bindable
    public String getH20701() {
        return h20701;
    }

    public void setH20701(String h20701) {
        this.h20701 = h20701;
        notifyPropertyChanged(BR.h20701);
    }

    @Bindable
    public String getH20702() {
        return h20702;
    }

    public void setH20702(String h20702) {
        this.h20702 = h20702;
        notifyPropertyChanged(BR.h20702);
    }

    @Bindable
    public String getH20703() {
        return h20703;
    }

    public void setH20703(String h20703) {
        this.h20703 = h20703;
        notifyPropertyChanged(BR.h20703);
    }

    @Bindable
    public String getH20704() {
        return h20704;
    }

    public void setH20704(String h20704) {
        this.h20704 = h20704;
        notifyPropertyChanged(BR.h20704);
    }

    @Bindable
    public String getH20705() {
        return h20705;
    }

    public void setH20705(String h20705) {
        this.h20705 = h20705;
        notifyPropertyChanged(BR.h20705);
    }

    @Bindable
    public String getH20706() {
        return h20706;
    }

    public void setH20706(String h20706) {
        this.h20706 = h20706;
        notifyPropertyChanged(BR.h20706);
    }

    @Bindable
    public String getH20707() {
        return h20707;
    }

    public void setH20707(String h20707) {
        this.h20707 = h20707;
        notifyPropertyChanged(BR.h20707);
    }

    @Bindable
    public String getH20708() {
        return h20708;
    }

    public void setH20708(String h20708) {
        this.h20708 = h20708;
        notifyPropertyChanged(BR.h20708);
    }

    @Bindable
    public String getH20798() {
        return h20798;
    }

    public void setH20798(String h20798) {
        this.h20798 = h20798;
        notifyPropertyChanged(BR.h20798);
    }

    @Bindable
    public String getH208() {
        return h208;
    }

    public void setH208(String h208) {
        this.h208 = h208;
        notifyPropertyChanged(BR.h208);
    }

    @Bindable
    public String getH20801() {
        return h20801;
    }

    public void setH20801(String h20801) {
        this.h20801 = h20801;
        notifyPropertyChanged(BR.h20801);
    }

    @Bindable
    public String getH20802() {
        return h20802;
    }

    public void setH20802(String h20802) {
        this.h20802 = h20802;
        notifyPropertyChanged(BR.h20802);
    }

    @Bindable
    public String getH20803() {
        return h20803;
    }

    public void setH20803(String h20803) {
        this.h20803 = h20803;
        notifyPropertyChanged(BR.h20803);
    }

    @Bindable
    public String getH20804() {
        return h20804;
    }

    public void setH20804(String h20804) {
        this.h20804 = h20804;
        notifyPropertyChanged(BR.h20804);
    }

    @Bindable
    public String getH20805() {
        return h20805;
    }

    public void setH20805(String h20805) {
        this.h20805 = h20805;
        notifyPropertyChanged(BR.h20805);
    }

    @Bindable
    public String getH20806() {
        return h20806;
    }

    public void setH20806(String h20806) {
        this.h20806 = h20806;
        notifyPropertyChanged(BR.h20806);
    }

    @Bindable
    public String getH20896() {
        return h20896;
    }

    public void setH20896(String h20896) {
        this.h20896 = h20896;
        notifyPropertyChanged(BR.h20896);
    }

    @Bindable
    public String getH20896x() {
        return h20896x;
    }

    public void setH20896x(String h20896x) {
        this.h20896x = h20896x;
        notifyPropertyChanged(BR.h20896x);
    }

    @Bindable
    public String getH208a() {
        return h208a;
    }

    public void setH208a(String h208a) {
        this.h208a = h208a;
        notifyPropertyChanged(BR.h208a);
    }

    @Bindable
    public String getH208b() {
        return h208b;
    }

    public void setH208b(String h208b) {
        this.h208b = h208b;
        notifyPropertyChanged(BR.h208b);
    }

    @Bindable
    public String getH208b01() {
        return h208b01;
    }

    public void setH208b01(String h208b01) {
        this.h208b01 = h208b01;
        notifyPropertyChanged(BR.h208b01);
    }

    @Bindable
    public String getH208b02() {
        return h208b02;
    }

    public void setH208b02(String h208b02) {
        this.h208b02 = h208b02;
        notifyPropertyChanged(BR.h208b02);
    }

    @Bindable
    public String getH208b03() {
        return h208b03;
    }

    public void setH208b03(String h208b03) {
        this.h208b03 = h208b03;
        notifyPropertyChanged(BR.h208b03);
    }

    @Bindable
    public String getH208b04() {
        return h208b04;
    }

    public void setH208b04(String h208b04) {
        this.h208b04 = h208b04;
        notifyPropertyChanged(BR.h208b04);
    }

    @Bindable
    public String getH208b05() {
        return h208b05;
    }

    public void setH208b05(String h208b05) {
        this.h208b05 = h208b05;
        notifyPropertyChanged(BR.h208b05);
    }

    @Bindable
    public String getH208b06() {
        return h208b06;
    }

    public void setH208b06(String h208b06) {
        this.h208b06 = h208b06;
        notifyPropertyChanged(BR.h208b06);
    }

    @Bindable
    public String getH208b07() {
        return h208b07;
    }

    public void setH208b07(String h208b07) {
        this.h208b07 = h208b07;
        notifyPropertyChanged(BR.h208b07);
    }

    @Bindable
    public String getH208b08() {
        return h208b08;
    }

    public void setH208b08(String h208b08) {
        this.h208b08 = h208b08;
        notifyPropertyChanged(BR.h208b08);
    }

    @Bindable
    public String getH208b09() {
        return h208b09;
    }

    public void setH208b09(String h208b09) {
        this.h208b09 = h208b09;
        notifyPropertyChanged(BR.h208b09);
    }

    @Bindable
    public String getH208b98() {
        return h208b98;
    }

    public void setH208b98(String h208b98) {
        this.h208b98 = h208b98;
        notifyPropertyChanged(BR.h208b98);
    }

    @Bindable
    public String getH208c() {
        return h208c;
    }

    public void setH208c(String h208c) {
        this.h208c = h208c;
        notifyPropertyChanged(BR.h208c);
    }

    @Bindable
    public String getH208d() {
        return h208d;
    }

    public void setH208d(String h208d) {
        this.h208d = h208d;
        notifyPropertyChanged(BR.h208d);
    }

    @Bindable
    public String getH208d96x() {
        return h208d96x;
    }

    public void setH208d96x(String h208d96x) {
        this.h208d96x = h208d96x;
        notifyPropertyChanged(BR.h208d96x);
    }

    @Bindable
    public String getH209() {
        return h209;
    }

    public void setH209(String h209) {
        this.h209 = h209;
        notifyPropertyChanged(BR.h209);
    }

    @Bindable
    public String getH209a() {
        return h209a;
    }

    public void setH209a(String h209a) {
        this.h209a = h209a;
        notifyPropertyChanged(BR.h209a);
    }

    @Bindable
    public String getH209a96x() {
        return h209a96x;
    }

    public void setH209a96x(String h209a96x) {
        this.h209a96x = h209a96x;
        notifyPropertyChanged(BR.h209a96x);
    }

    @Bindable
    public String getH210() {
        return h210;
    }

    public void setH210(String h210) {
        this.h210 = h210;
        notifyPropertyChanged(BR.h210);
    }

    @Bindable
    public String getH211() {
        return h211;
    }

    public void setH211(String h211) {
        this.h211 = h211;
        notifyPropertyChanged(BR.h211);
    }

    @Bindable
    public String getH21101() {
        return h21101;
    }

    public void setH21101(String h21101) {
        this.h21101 = h21101;
        notifyPropertyChanged(BR.h21101);
    }

    @Bindable
    public String getH21102() {
        return h21102;
    }

    public void setH21102(String h21102) {
        this.h21102 = h21102;
        notifyPropertyChanged(BR.h21102);
    }

    @Bindable
    public String getH21103() {
        return h21103;
    }

    public void setH21103(String h21103) {
        this.h21103 = h21103;
        notifyPropertyChanged(BR.h21103);
    }

    @Bindable
    public String getH21104() {
        return h21104;
    }

    public void setH21104(String h21104) {
        this.h21104 = h21104;
        notifyPropertyChanged(BR.h21104);
    }

    @Bindable
    public String getH21105() {
        return h21105;
    }

    public void setH21105(String h21105) {
        this.h21105 = h21105;
        notifyPropertyChanged(BR.h21105);
    }

    @Bindable
    public String getH21106() {
        return h21106;
    }

    public void setH21106(String h21106) {
        this.h21106 = h21106;
        notifyPropertyChanged(BR.h21106);
    }

    @Bindable
    public String getH21107() {
        return h21107;
    }

    public void setH21107(String h21107) {
        this.h21107 = h21107;
        notifyPropertyChanged(BR.h21107);
    }

    @Bindable
    public String getH21108() {
        return h21108;
    }

    public void setH21108(String h21108) {
        this.h21108 = h21108;
        notifyPropertyChanged(BR.h21108);
    }

    @Bindable
    public String getH21109() {
        return h21109;
    }

    public void setH21109(String h21109) {
        this.h21109 = h21109;
        notifyPropertyChanged(BR.h21109);
    }

    @Bindable
    public String getH21110() {
        return h21110;
    }

    public void setH21110(String h21110) {
        this.h21110 = h21110;
        notifyPropertyChanged(BR.h21110);
    }

    @Bindable
    public String getH212() {
        return h212;
    }

    public void setH212(String h212) {
        this.h212 = h212;
        notifyPropertyChanged(BR.h212);
    }

    @Bindable
    public String getH213() {
        return h213;
    }

    public void setH213(String h213) {
        this.h213 = h213;
        notifyPropertyChanged(BR.h213);
    }

    @Bindable
    public String getH214() {
        return h214;
    }

    public void setH214(String h214) {
        this.h214 = h214;
        notifyPropertyChanged(BR.h214);
    }

    @Bindable
    public String getH214a() {
        return h214a;
    }

    public void setH214a(String h214a) {
        this.h214a = h214a;
        notifyPropertyChanged(BR.h214a);
    }

    @Bindable
    public String getH214b() {
        return h214b;
    }

    public void setH214b(String h214b) {
        this.h214b = h214b;
        notifyPropertyChanged(BR.h214b);
    }

    @Bindable
    public String getH214b01() {
        return h214b01;
    }

    public void setH214b01(String h214b01) {
        this.h214b01 = h214b01;
        notifyPropertyChanged(BR.h214b01);
    }

    @Bindable
    public String getH214b02() {
        return h214b02;
    }

    public void setH214b02(String h214b02) {
        this.h214b02 = h214b02;
        notifyPropertyChanged(BR.h214b02);
    }

    @Bindable
    public String getH214b03() {
        return h214b03;
    }

    public void setH214b03(String h214b03) {
        this.h214b03 = h214b03;
        notifyPropertyChanged(BR.h214b03);
    }

    @Bindable
    public String getH214b04() {
        return h214b04;
    }

    public void setH214b04(String h214b04) {
        this.h214b04 = h214b04;
        notifyPropertyChanged(BR.h214b04);
    }

    @Bindable
    public String getH214b05() {
        return h214b05;
    }

    public void setH214b05(String h214b05) {
        this.h214b05 = h214b05;
        notifyPropertyChanged(BR.h214b05);
    }

    @Bindable
    public String getH214b06() {
        return h214b06;
    }

    public void setH214b06(String h214b06) {
        this.h214b06 = h214b06;
        notifyPropertyChanged(BR.h214b06);
    }

    @Bindable
    public String getH214b96() {
        return h214b96;
    }

    public void setH214b96(String h214b96) {
        this.h214b96 = h214b96;
        notifyPropertyChanged(BR.h214b96);
    }

    @Bindable
    public String getH214b96x() {
        return h214b96x;
    }

    public void setH214b96x(String h214b96x) {
        this.h214b96x = h214b96x;
        notifyPropertyChanged(BR.h214b96x);
    }

    @Bindable
    public String getH214b98() {
        return h214b98;
    }

    public void setH214b98(String h214b98) {
        this.h214b98 = h214b98;
        notifyPropertyChanged(BR.h214b98);
    }

    @Bindable
    public String getH215() {
        return h215;
    }

    public void setH215(String h215) {
        this.h215 = h215;
        notifyPropertyChanged(BR.h215);
    }

    @Bindable
    public String getH216() {
        return h216;
    }

    public void setH216(String h216) {
        this.h216 = h216;
        notifyPropertyChanged(BR.h216);
    }

    @Bindable
    public String getH216a() {
        return h216a;
    }

    public void setH216a(String h216a) {
        this.h216a = h216a;
        notifyPropertyChanged(BR.h216a);
    }

    @Bindable
    public String getH216a96x() {
        return h216a96x;
    }

    public void setH216a96x(String h216a96x) {
        this.h216a96x = h216a96x;
        notifyPropertyChanged(BR.h216a96x);
    }

    @Bindable
    public String getH217() {
        return h217;
    }

    public void setH217(String h217) {
        this.h217 = h217;
        notifyPropertyChanged(BR.h217);
    }

    @Bindable
    public String getH21796x() {
        return h21796x;
    }

    public void setH21796x(String h21796x) {
        this.h21796x = h21796x;
        notifyPropertyChanged(BR.h21796x);
    }

    @Bindable
    public String getH218() {
        return h218;
    }

    public void setH218(String h218) {
        this.h218 = h218;
        notifyPropertyChanged(BR.h218);
    }

    @Bindable
    public String getH219() {
        return h219;
    }

    public void setH219(String h219) {
        this.h219 = h219;
        notifyPropertyChanged(BR.h219);
    }

    @Bindable
    public String getH21996x() {
        return h21996x;
    }

    public void setH21996x(String h21996x) {
        this.h21996x = h21996x;
        notifyPropertyChanged(BR.h21996x);
    }

    @Bindable
    public String getH22001() {
        return h22001;
    }

    public void setH22001(String h22001) {
        this.h22001 = h22001;
        notifyPropertyChanged(BR.h22001);
    }

    @Bindable
    public String getH22002() {
        return h22002;
    }

    public void setH22002(String h22002) {
        this.h22002 = h22002;
        notifyPropertyChanged(BR.h22002);
    }

    @Bindable
    public String getH22003() {
        return h22003;
    }

    public void setH22003(String h22003) {
        this.h22003 = h22003;
        notifyPropertyChanged(BR.h22003);
    }

    @Bindable
    public String getH22004() {
        return h22004;
    }

    public void setH22004(String h22004) {
        this.h22004 = h22004;
        notifyPropertyChanged(BR.h22004);
    }

    @Bindable
    public String getH22005() {
        return h22005;
    }

    public void setH22005(String h22005) {
        this.h22005 = h22005;
        notifyPropertyChanged(BR.h22005);
    }

    @Bindable
    public String getH22006() {
        return h22006;
    }

    public void setH22006(String h22006) {
        this.h22006 = h22006;
        notifyPropertyChanged(BR.h22006);
    }

    @Bindable
    public String getH22096() {
        return h22096;
    }

    public void setH22096(String h22096) {
        this.h22096 = h22096;
        notifyPropertyChanged(BR.h22096);
    }

    @Bindable
    public String getH221() {
        return h221;
    }

    public void setH221(String h221) {
        this.h221 = h221;
        notifyPropertyChanged(BR.h221);
    }

    @Bindable
    public String getH222() {
        return h222;
    }

    public void setH222(String h222) {
        this.h222 = h222;
        notifyPropertyChanged(BR.h222);
    }

    @Bindable
    public String getH22296x() {
        return h22296x;
    }

    public void setH22296x(String h22296x) {
        this.h22296x = h22296x;
        notifyPropertyChanged(BR.h22296x);
    }

    @Bindable
    public String getH223() {
        return h223;
    }

    public void setH223(String h223) {
        this.h223 = h223;
        notifyPropertyChanged(BR.h223);
    }

    @Bindable
    public String getK101() {
        return k101;
    }

    public void setK101(String k101) {
        this.k101 = k101;
        notifyPropertyChanged(BR.k101);
    }

    @Bindable
    public String getK101a() {
        return k101a;
    }

    public void setK101a(String k101a) {
        this.k101a = k101a;
        notifyPropertyChanged(BR.k101a);
    }

    @Bindable
    public String getK101a01() {
        return k101a01;
    }

    public void setK101a01(String k101a01) {
        this.k101a01 = k101a01;
        notifyPropertyChanged(BR.k101a01);
    }

    @Bindable
    public String getK101a02() {
        return k101a02;
    }

    public void setK101a02(String k101a02) {
        this.k101a02 = k101a02;
        notifyPropertyChanged(BR.k101a02);
    }

    @Bindable
    public String getK101a03() {
        return k101a03;
    }

    public void setK101a03(String k101a03) {
        this.k101a03 = k101a03;
        notifyPropertyChanged(BR.k101a03);
    }

    @Bindable
    public String getK101a04() {
        return k101a04;
    }

    public void setK101a04(String k101a04) {
        this.k101a04 = k101a04;
        notifyPropertyChanged(BR.k101a04);
    }

    @Bindable
    public String getK101a05() {
        return k101a05;
    }

    public void setK101a05(String k101a05) {
        this.k101a05 = k101a05;
        notifyPropertyChanged(BR.k101a05);
    }

    @Bindable
    public String getK101a06() {
        return k101a06;
    }

    public void setK101a06(String k101a06) {
        this.k101a06 = k101a06;
        notifyPropertyChanged(BR.k101a06);
    }

    @Bindable
    public String getK101a07() {
        return k101a07;
    }

    public void setK101a07(String k101a07) {
        this.k101a07 = k101a07;
        notifyPropertyChanged(BR.k101a07);
    }

    @Bindable
    public String getK101a08() {
        return k101a08;
    }

    public void setK101a08(String k101a08) {
        this.k101a08 = k101a08;
        notifyPropertyChanged(BR.k101a08);
    }

    @Bindable
    public String getK101a09() {
        return k101a09;
    }

    public void setK101a09(String k101a09) {
        this.k101a09 = k101a09;
        notifyPropertyChanged(BR.k101a09);
    }

    @Bindable
    public String getK101a10() {
        return k101a10;
    }

    public void setK101a10(String k101a10) {
        this.k101a10 = k101a10;
        notifyPropertyChanged(BR.k101a10);
    }

    @Bindable
    public String getK101a11() {
        return k101a11;
    }

    public void setK101a11(String k101a11) {
        this.k101a11 = k101a11;
        notifyPropertyChanged(BR.k101a11);
    }

    @Bindable
    public String getK101a12() {
        return k101a12;
    }

    public void setK101a12(String k101a12) {
        this.k101a12 = k101a12;
        notifyPropertyChanged(BR.k101a12);
    }

    @Bindable
    public String getK101a13() {
        return k101a13;
    }

    public void setK101a13(String k101a13) {
        this.k101a13 = k101a13;
        notifyPropertyChanged(BR.k101a13);
    }

    @Bindable
    public String getK101a14() {
        return k101a14;
    }

    public void setK101a14(String k101a14) {
        this.k101a14 = k101a14;
        notifyPropertyChanged(BR.k101a14);
    }

    @Bindable
    public String getK101a15() {
        return k101a15;
    }

    public void setK101a15(String k101a15) {
        this.k101a15 = k101a15;
        notifyPropertyChanged(BR.k101a15);
    }

    @Bindable
    public String getK101a16() {
        return k101a16;
    }

    public void setK101a16(String k101a16) {
        this.k101a16 = k101a16;
        notifyPropertyChanged(BR.k101a16);
    }

    @Bindable
    public String getK101a96() {
        return k101a96;
    }

    public void setK101a96(String k101a96) {
        this.k101a96 = k101a96;
        notifyPropertyChanged(BR.k101a96);
    }

    @Bindable
    public String getK101a96x() {
        return k101a96x;
    }

    public void setK101a96x(String k101a96x) {
        this.k101a96x = k101a96x;
        notifyPropertyChanged(BR.k101a96x);
    }

    @Bindable
    public String getK101b() {
        return k101b;
    }

    public void setK101b(String k101b) {
        this.k101b = k101b;
        notifyPropertyChanged(BR.k101b);
    }

    @Bindable
    public String getK102() {
        return k102;
    }

    public void setK102(String k102) {
        this.k102 = k102;
        notifyPropertyChanged(BR.k102);
    }

    @Bindable
    public String getK103() {
        return k103;
    }

    public void setK103(String k103) {
        this.k103 = k103;
        notifyPropertyChanged(BR.k103);
    }

    @Bindable
    public String getK104() {
        return k104;
    }

    public void setK104(String k104) {
        this.k104 = k104;
        notifyPropertyChanged(BR.k104);
    }

    @Bindable
    public String getK10401() {
        return k10401;
    }

    public void setK10401(String k10401) {
        this.k10401 = k10401;
        notifyPropertyChanged(BR.k10401);
    }

    @Bindable
    public String getK10402() {
        return k10402;
    }

    public void setK10402(String k10402) {
        this.k10402 = k10402;
        notifyPropertyChanged(BR.k10402);
    }

    @Bindable
    public String getK10403() {
        return k10403;
    }

    public void setK10403(String k10403) {
        this.k10403 = k10403;
        notifyPropertyChanged(BR.k10403);
    }

    @Bindable
    public String getK10404() {
        return k10404;
    }

    public void setK10404(String k10404) {
        this.k10404 = k10404;
        notifyPropertyChanged(BR.k10404);
    }

    @Bindable
    public String getK10405() {
        return k10405;
    }

    public void setK10405(String k10405) {
        this.k10405 = k10405;
        notifyPropertyChanged(BR.k10405);
    }

    @Bindable
    public String getK10406() {
        return k10406;
    }

    public void setK10406(String k10406) {
        this.k10406 = k10406;
        notifyPropertyChanged(BR.k10406);
    }

    @Bindable
    public String getK10407() {
        return k10407;
    }

    public void setK10407(String k10407) {
        this.k10407 = k10407;
        notifyPropertyChanged(BR.k10407);
    }

    @Bindable
    public String getK10408() {
        return k10408;
    }

    public void setK10408(String k10408) {
        this.k10408 = k10408;
        notifyPropertyChanged(BR.k10408);
    }

    @Bindable
    public String getK10409() {
        return k10409;
    }

    public void setK10409(String k10409) {
        this.k10409 = k10409;
        notifyPropertyChanged(BR.k10409);
    }

    @Bindable
    public String getK10410() {
        return k10410;
    }

    public void setK10410(String k10410) {
        this.k10410 = k10410;
        notifyPropertyChanged(BR.k10410);
    }

    @Bindable
    public String getK10411() {
        return k10411;
    }

    public void setK10411(String k10411) {
        this.k10411 = k10411;
        notifyPropertyChanged(BR.k10411);
    }

    @Bindable
    public String getK10412() {
        return k10412;
    }

    public void setK10412(String k10412) {
        this.k10412 = k10412;
        notifyPropertyChanged(BR.k10412);
    }

    @Bindable
    public String getK10413() {
        return k10413;
    }

    public void setK10413(String k10413) {
        this.k10413 = k10413;
        notifyPropertyChanged(BR.k10413);
    }

    @Bindable
    public String getK105() {
        return k105;
    }

    public void setK105(String k105) {
        this.k105 = k105;
        notifyPropertyChanged(BR.k105);
    }

    @Bindable
    public String getK105a() {
        return k105a;
    }

    public void setK105a(String k105a) {
        this.k105a = k105a;
        notifyPropertyChanged(BR.k105a);
    }

    @Bindable
    public String getK105a01() {
        return k105a01;
    }

    public void setK105a01(String k105a01) {
        this.k105a01 = k105a01;
        notifyPropertyChanged(BR.k105a01);
    }

    @Bindable
    public String getK105a01x() {
        return k105a01x;
    }

    public void setK105a01x(String k105a01x) {
        this.k105a01x = k105a01x;
        notifyPropertyChanged(BR.k105a01x);
    }

    @Bindable
    public String getK105a02() {
        return k105a02;
    }

    public void setK105a02(String k105a02) {
        this.k105a02 = k105a02;
        notifyPropertyChanged(BR.k105a02);
    }

    @Bindable
    public String getK105a02x() {
        return k105a02x;
    }

    public void setK105a02x(String k105a02x) {
        this.k105a02x = k105a02x;
        notifyPropertyChanged(BR.k105a02x);
    }

    @Bindable
    public String getK105a99() {
        return k105a99;
    }

    public void setK105a99(String k105a99) {
        this.k105a99 = k105a99;
        notifyPropertyChanged(BR.k105a99);
    }

    @Bindable
    public String getK105b() {
        return k105b;
    }

    public void setK105b(String k105b) {
        this.k105b = k105b;
        notifyPropertyChanged(BR.k105b);
    }

    @Bindable
    public String getK106() {
        return k106;
    }

    public void setK106(String k106) {
        this.k106 = k106;
        notifyPropertyChanged(BR.k106);
    }

    @Bindable
    public String getK10601() {
        return k10601;
    }

    public void setK10601(String k10601) {
        this.k10601 = k10601;
        notifyPropertyChanged(BR.k10601);
    }

    @Bindable
    public String getK10602() {
        return k10602;
    }

    public void setK10602(String k10602) {
        this.k10602 = k10602;
        notifyPropertyChanged(BR.k10602);
    }

    @Bindable
    public String getK10603() {
        return k10603;
    }

    public void setK10603(String k10603) {
        this.k10603 = k10603;
        notifyPropertyChanged(BR.k10603);
    }

    @Bindable
    public String getK10604() {
        return k10604;
    }

    public void setK10604(String k10604) {
        this.k10604 = k10604;
        notifyPropertyChanged(BR.k10604);
    }

    @Bindable
    public String getK10605() {
        return k10605;
    }

    public void setK10605(String k10605) {
        this.k10605 = k10605;
        notifyPropertyChanged(BR.k10605);
    }

    @Bindable
    public String getK10606() {
        return k10606;
    }

    public void setK10606(String k10606) {
        this.k10606 = k10606;
        notifyPropertyChanged(BR.k10606);
    }

    @Bindable
    public String getK10607() {
        return k10607;
    }

    public void setK10607(String k10607) {
        this.k10607 = k10607;
        notifyPropertyChanged(BR.k10607);
    }

    @Bindable
    public String getK10608() {
        return k10608;
    }

    public void setK10608(String k10608) {
        this.k10608 = k10608;
        notifyPropertyChanged(BR.k10608);
    }

    @Bindable
    public String getK10696() {
        return k10696;
    }

    public void setK10696(String k10696) {
        this.k10696 = k10696;
        notifyPropertyChanged(BR.k10696);
    }

    @Bindable
    public String getK10696x() {
        return k10696x;
    }

    public void setK10696x(String k10696x) {
        this.k10696x = k10696x;
        notifyPropertyChanged(BR.k10696x);
    }

    @Bindable
    public String getK107() {
        return k107;
    }

    public void setK107(String k107) {
        this.k107 = k107;
        notifyPropertyChanged(BR.k107);
    }

    @Bindable
    public String getK107a() {
        return k107a;
    }

    public void setK107a(String k107a) {
        this.k107a = k107a;
        notifyPropertyChanged(BR.k107a);
    }

    @Bindable
    public String getK107a01() {
        return k107a01;
    }

    public void setK107a01(String k107a01) {
        this.k107a01 = k107a01;
        notifyPropertyChanged(BR.k107a01);
    }

    @Bindable
    public String getK107a02() {
        return k107a02;
    }

    public void setK107a02(String k107a02) {
        this.k107a02 = k107a02;
        notifyPropertyChanged(BR.k107a02);
    }

    @Bindable
    public String getK107a03() {
        return k107a03;
    }

    public void setK107a03(String k107a03) {
        this.k107a03 = k107a03;
        notifyPropertyChanged(BR.k107a03);
    }

    @Bindable
    public String getK107a04() {
        return k107a04;
    }

    public void setK107a04(String k107a04) {
        this.k107a04 = k107a04;
        notifyPropertyChanged(BR.k107a04);
    }

    @Bindable
    public String getK107a05() {
        return k107a05;
    }

    public void setK107a05(String k107a05) {
        this.k107a05 = k107a05;
        notifyPropertyChanged(BR.k107a05);
    }

    @Bindable
    public String getK107a06() {
        return k107a06;
    }

    public void setK107a06(String k107a06) {
        this.k107a06 = k107a06;
        notifyPropertyChanged(BR.k107a06);
    }

    @Bindable
    public String getK107a07() {
        return k107a07;
    }

    public void setK107a07(String k107a07) {
        this.k107a07 = k107a07;
        notifyPropertyChanged(BR.k107a07);
    }

    @Bindable
    public String getK107a08() {
        return k107a08;
    }

    public void setK107a08(String k107a08) {
        this.k107a08 = k107a08;
        notifyPropertyChanged(BR.k107a08);
    }

    @Bindable
    public String getK107a99() {
        return k107a99;
    }

    public void setK107a99(String k107a99) {
        this.k107a99 = k107a99;
        notifyPropertyChanged(BR.k107a99);
    }

    @Bindable
    public String getK108() {
        return k108;
    }

    public void setK108(String k108) {
        this.k108 = k108;
        notifyPropertyChanged(BR.k108);
    }

    @Bindable
    public String getK108a() {
        return k108a;
    }

    public void setK108a(String k108a) {
        this.k108a = k108a;
        notifyPropertyChanged(BR.k108a);
    }

    @Bindable
    public String getK109() {
        return k109;
    }

    public void setK109(String k109) {
        this.k109 = k109;
        notifyPropertyChanged(BR.k109);
    }

    @Bindable
    public String getUn01() {
        return un01;
    }

    public void setUn01(String un01) {
        this.un01 = un01;
        notifyPropertyChanged(BR.un01);
    }

    @Bindable
    public String getUn02() {
        return un02;
    }

    public void setUn02(String un02) {
        this.un02 = un02;
        notifyPropertyChanged(BR.un02);
    }

    @Bindable
    public String getUn03() {
        return un03;
    }

    public void setUn03(String un03) {
        this.un03 = un03;
        notifyPropertyChanged(BR.un03);
    }

    @Bindable
    public String getUn04() {
        return un04;
    }

    public void setUn04(String un04) {
        this.un04 = un04;
        notifyPropertyChanged(BR.un04);
    }

    @Bindable
    public String getUn0401x() {
        return un0401x;
    }

    public void setUn0401x(String un0401x) {
        this.un0401x = un0401x;
        notifyPropertyChanged(BR.un0401x);
    }

    @Bindable
    public String getUn0402x() {
        return un0402x;
    }

    public void setUn0402x(String un0402x) {
        this.un0402x = un0402x;
        notifyPropertyChanged(BR.un0402x);
    }

    @Bindable
    public String getUn05() {
        return un05;
    }

    public void setUn05(String un05) {
        this.un05 = un05;
        notifyPropertyChanged(BR.un05);
    }

    @Bindable
    public String getUn06() {
        return un06;
    }

    public void setUn06(String un06) {
        this.un06 = un06;
        notifyPropertyChanged(BR.un06);
    }

    @Bindable
    public String getUn0696x() {
        return un0696x;
    }

    public void setUn0696x(String un0696x) {
        this.un0696x = un0696x;
        notifyPropertyChanged(BR.un0696x);
    }

    @Bindable
    public String getUn07() {
        return un07;
    }

    public void setUn07(String un07) {
        this.un07 = un07;
        notifyPropertyChanged(BR.un07);
    }

    @Bindable
    public String getUn0701x() {
        return un0701x;
    }

    public void setUn0701x(String un0701x) {
        this.un0701x = un0701x;
        notifyPropertyChanged(BR.un0701x);
    }

    @Bindable
    public String getUn0702x() {
        return un0702x;
    }

    public void setUn0702x(String un0702x) {
        this.un0702x = un0702x;
        notifyPropertyChanged(BR.un0702x);
    }

    @Bindable
    public String getUn0703x() {
        return un0703x;
    }

    public void setUn0703x(String un0703x) {
        this.un0703x = un0703x;
        notifyPropertyChanged(BR.un0703x);
    }

    @Bindable
    public String getUn0704x() {
        return un0704x;
    }

    public void setUn0704x(String un0704x) {
        this.un0704x = un0704x;
        notifyPropertyChanged(BR.un0704x);
    }

    @Bindable
    public String getL101() {
        return l101;
    }

    public void setL101(String l101) {
        this.l101 = l101;
        notifyPropertyChanged(BR.l101);
    }

    @Bindable
    public String getL102() {
        return l102;
    }

    public void setL102(String l102) {
        this.l102 = l102;
        notifyPropertyChanged(BR.l102);
    }

    @Bindable
    public String getL102a() {
        return l102a;
    }

    public void setL102a(String l102a) {
        this.l102a = l102a;
        notifyPropertyChanged(BR.l102a);
    }

    @Bindable
    public String getL102a96x() {
        return l102a96x;
    }

    public void setL102a96x(String l102a96x) {
        this.l102a96x = l102a96x;
        notifyPropertyChanged(BR.l102a96x);
    }

    @Bindable
    public String getL103() {
        return l103;
    }

    public void setL103(String l103) {
        this.l103 = l103;
        notifyPropertyChanged(BR.l103);
    }

    @Bindable
    public String getL104() {
        return l104;
    }

    public void setL104(String l104) {
        this.l104 = l104;
        notifyPropertyChanged(BR.l104);
    }

    @Bindable
    public String getL10496x() {
        return l10496x;
    }

    public void setL10496x(String l10496x) {
        this.l10496x = l10496x;
        notifyPropertyChanged(BR.l10496x);
    }

    @Bindable
    public String getL105() {
        return l105;
    }

    public void setL105(String l105) {
        this.l105 = l105;
        notifyPropertyChanged(BR.l105);
    }

    @Bindable
    public String getL106() {
        return l106;
    }

    public void setL106(String l106) {
        this.l106 = l106;
        notifyPropertyChanged(BR.l106);
    }

    @Bindable
    public String getL10696x() {
        return l10696x;
    }

    public void setL10696x(String l10696x) {
        this.l10696x = l10696x;
        notifyPropertyChanged(BR.l10696x);
    }

    @Bindable
    public String getL107() {
        return l107;
    }

    public void setL107(String l107) {
        this.l107 = l107;
        notifyPropertyChanged(BR.l107);
    }

    @Bindable
    public String getL10796x() {
        return l10796x;
    }

    public void setL10796x(String l10796x) {
        this.l10796x = l10796x;
        notifyPropertyChanged(BR.l10796x);
    }

    @Bindable
    public String getL108() {
        return l108;
    }

    public void setL108(String l108) {
        this.l108 = l108;
        notifyPropertyChanged(BR.l108);
    }

    @Bindable
    public String getL10896x() {
        return l10896x;
    }

    public void setL10896x(String l10896x) {
        this.l10896x = l10896x;
        notifyPropertyChanged(BR.l10896x);
    }

    @Bindable
    public String getL109() {
        return l109;
    }

    public void setL109(String l109) {
        this.l109 = l109;
        notifyPropertyChanged(BR.l109);
    }

    @Bindable
    public String getL10996x() {
        return l10996x;
    }

    public void setL10996x(String l10996x) {
        this.l10996x = l10996x;
        notifyPropertyChanged(BR.l10996x);
    }

    @Bindable
    public String getL110() {
        return l110;
    }

    public void setL110(String l110) {
        this.l110 = l110;
        notifyPropertyChanged(BR.l110);
    }

    @Bindable
    public String getL111() {
        return l111;
    }

    public void setL111(String l111) {
        this.l111 = l111;
        notifyPropertyChanged(BR.l111);
    }

    @Bindable
    public String getL1121() {
        return l1121;
    }

    public void setL1121(String l1121) {
        this.l1121 = l1121;
        notifyPropertyChanged(BR.l1121);
    }

    @Bindable
    public String getL1122() {
        return l1122;
    }

    public void setL1122(String l1122) {
        this.l1122 = l1122;
        notifyPropertyChanged(BR.l1122);
    }

    @Bindable
    public String getL1123() {
        return l1123;
    }

    public void setL1123(String l1123) {
        this.l1123 = l1123;
        notifyPropertyChanged(BR.l1123);
    }

    @Bindable
    public String getL1124() {
        return l1124;
    }

    public void setL1124(String l1124) {
        this.l1124 = l1124;
        notifyPropertyChanged(BR.l1124);
    }

    @Bindable
    public String getL1125() {
        return l1125;
    }

    public void setL1125(String l1125) {
        this.l1125 = l1125;
        notifyPropertyChanged(BR.l1125);
    }

    @Bindable
    public String getLg101() {
        return lg101;
    }

    public void setLg101(String lg101) {
        this.lg101 = lg101;
        notifyPropertyChanged(BR.lg101);
    }

    @Bindable
    public String getLg102() {
        return lg102;
    }

    public void setLg102(String lg102) {
        this.lg102 = lg102;
        notifyPropertyChanged(BR.lg102);
    }

    @Bindable
    public String getLg10201() {
        return lg10201;
    }

    public void setLg10201(String lg10201) {
        this.lg10201 = lg10201;
        notifyPropertyChanged(BR.lg10201);
    }

    @Bindable
    public String getLg10202() {
        return lg10202;
    }

    public void setLg10202(String lg10202) {
        this.lg10202 = lg10202;
        notifyPropertyChanged(BR.lg10202);
    }

    @Bindable
    public String getLg10203() {
        return lg10203;
    }

    public void setLg10203(String lg10203) {
        this.lg10203 = lg10203;
        notifyPropertyChanged(BR.lg10203);
    }

    @Bindable
    public String getLg10204() {
        return lg10204;
    }

    public void setLg10204(String lg10204) {
        this.lg10204 = lg10204;
        notifyPropertyChanged(BR.lg10204);
    }

    @Bindable
    public String getLg10205() {
        return lg10205;
    }

    public void setLg10205(String lg10205) {
        this.lg10205 = lg10205;
        notifyPropertyChanged(BR.lg10205);
    }

    @Bindable
    public String getLg10206() {
        return lg10206;
    }

    public void setLg10206(String lg10206) {
        this.lg10206 = lg10206;
        notifyPropertyChanged(BR.lg10206);
    }

    @Bindable
    public String getLg10207() {
        return lg10207;
    }

    public void setLg10207(String lg10207) {
        this.lg10207 = lg10207;
        notifyPropertyChanged(BR.lg10207);
    }

    @Bindable
    public String getLg10208() {
        return lg10208;
    }

    public void setLg10208(String lg10208) {
        this.lg10208 = lg10208;
        notifyPropertyChanged(BR.lg10208);
    }

    @Bindable
    public String getLg10209() {
        return lg10209;
    }

    public void setLg10209(String lg10209) {
        this.lg10209 = lg10209;
        notifyPropertyChanged(BR.lg10209);
    }

    @Bindable
    public String getLg10296() {
        return lg10296;
    }

    public void setLg10296(String lg10296) {
        this.lg10296 = lg10296;
        notifyPropertyChanged(BR.lg10296);
    }

    @Bindable
    public String getLg10296x() {
        return lg10296x;
    }

    public void setLg10296x(String lg10296x) {
        this.lg10296x = lg10296x;
        notifyPropertyChanged(BR.lg10296x);
    }

    @Bindable
    public String getLg103() {
        return lg103;
    }

    public void setLg103(String lg103) {
        this.lg103 = lg103;
        notifyPropertyChanged(BR.lg103);
    }

    @Bindable
    public String getLg104() {
        return lg104;
    }

    public void setLg104(String lg104) {
        this.lg104 = lg104;
        notifyPropertyChanged(BR.lg104);
    }

    @Bindable
    public String getLg10401() {
        return lg10401;
    }

    public void setLg10401(String lg10401) {
        this.lg10401 = lg10401;
        notifyPropertyChanged(BR.lg10401);
    }

    @Bindable
    public String getLg10402() {
        return lg10402;
    }

    public void setLg10402(String lg10402) {
        this.lg10402 = lg10402;
        notifyPropertyChanged(BR.lg10402);
    }

    @Bindable
    public String getLg10403() {
        return lg10403;
    }

    public void setLg10403(String lg10403) {
        this.lg10403 = lg10403;
        notifyPropertyChanged(BR.lg10403);
    }

    @Bindable
    public String getLg10404() {
        return lg10404;
    }

    public void setLg10404(String lg10404) {
        this.lg10404 = lg10404;
        notifyPropertyChanged(BR.lg10404);
    }

    @Bindable
    public String getLg10405() {
        return lg10405;
    }

    public void setLg10405(String lg10405) {
        this.lg10405 = lg10405;
        notifyPropertyChanged(BR.lg10405);
    }

    @Bindable
    public String getLg10406() {
        return lg10406;
    }

    public void setLg10406(String lg10406) {
        this.lg10406 = lg10406;
        notifyPropertyChanged(BR.lg10406);
    }

    @Bindable
    public String getLg10407() {
        return lg10407;
    }

    public void setLg10407(String lg10407) {
        this.lg10407 = lg10407;
        notifyPropertyChanged(BR.lg10407);
    }

    @Bindable
    public String getLg10408() {
        return lg10408;
    }

    public void setLg10408(String lg10408) {
        this.lg10408 = lg10408;
        notifyPropertyChanged(BR.lg10408);
    }

    @Bindable
    public String getLg10409() {
        return lg10409;
    }

    public void setLg10409(String lg10409) {
        this.lg10409 = lg10409;
        notifyPropertyChanged(BR.lg10409);
    }

    @Bindable
    public String getLg10410() {
        return lg10410;
    }

    public void setLg10410(String lg10410) {
        this.lg10410 = lg10410;
        notifyPropertyChanged(BR.lg10410);
    }

    @Bindable
    public String getLg10411() {
        return lg10411;
    }

    public void setLg10411(String lg10411) {
        this.lg10411 = lg10411;
        notifyPropertyChanged(BR.lg10411);
    }

    @Bindable
    public String getLg10412() {
        return lg10412;
    }

    public void setLg10412(String lg10412) {
        this.lg10412 = lg10412;
        notifyPropertyChanged(BR.lg10412);
    }

    @Bindable
    public String getLg10413() {
        return lg10413;
    }

    public void setLg10413(String lg10413) {
        this.lg10413 = lg10413;
        notifyPropertyChanged(BR.lg10413);
    }

    @Bindable
    public String getLg10414() {
        return lg10414;
    }

    public void setLg10414(String lg10414) {
        this.lg10414 = lg10414;
        notifyPropertyChanged(BR.lg10414);
    }

    @Bindable
    public String getLg10415() {
        return lg10415;
    }

    public void setLg10415(String lg10415) {
        this.lg10415 = lg10415;
        notifyPropertyChanged(BR.lg10415);
    }

    @Bindable
    public String getLg10416() {
        return lg10416;
    }

    public void setLg10416(String lg10416) {
        this.lg10416 = lg10416;
        notifyPropertyChanged(BR.lg10416);
    }

    @Bindable
    public String getLg105() {
        return lg105;
    }

    public void setLg105(String lg105) {
        this.lg105 = lg105;
        notifyPropertyChanged(BR.lg105);
    }

    @Bindable
    public String getLg106() {
        return lg106;
    }

    public void setLg106(String lg106) {
        this.lg106 = lg106;
        notifyPropertyChanged(BR.lg106);
    }

    @Bindable
    public String getLg10601() {
        return lg10601;
    }

    public void setLg10601(String lg10601) {
        this.lg10601 = lg10601;
        notifyPropertyChanged(BR.lg10601);
    }

    @Bindable
    public String getLg10602() {
        return lg10602;
    }

    public void setLg10602(String lg10602) {
        this.lg10602 = lg10602;
        notifyPropertyChanged(BR.lg10602);
    }

    @Bindable
    public String getLg10603() {
        return lg10603;
    }

    public void setLg10603(String lg10603) {
        this.lg10603 = lg10603;
        notifyPropertyChanged(BR.lg10603);
    }

    @Bindable
    public String getLg10604() {
        return lg10604;
    }

    public void setLg10604(String lg10604) {
        this.lg10604 = lg10604;
        notifyPropertyChanged(BR.lg10604);
    }

    @Bindable
    public String getLg10605() {
        return lg10605;
    }

    public void setLg10605(String lg10605) {
        this.lg10605 = lg10605;
        notifyPropertyChanged(BR.lg10605);
    }

    @Bindable
    public String getLg10606() {
        return lg10606;
    }

    public void setLg10606(String lg10606) {
        this.lg10606 = lg10606;
        notifyPropertyChanged(BR.lg10606);
    }

    @Bindable
    public String getLg10607() {
        return lg10607;
    }

    public void setLg10607(String lg10607) {
        this.lg10607 = lg10607;
        notifyPropertyChanged(BR.lg10607);
    }

    @Bindable
    public String getLg10696() {
        return lg10696;
    }

    public void setLg10696(String lg10696) {
        this.lg10696 = lg10696;
        notifyPropertyChanged(BR.lg10696);
    }

    @Bindable
    public String getLg10696x() {
        return lg10696x;
    }

    public void setLg10696x(String lg10696x) {
        this.lg10696x = lg10696x;
        notifyPropertyChanged(BR.lg10696x);
    }

    @Bindable
    public String getL1131() {
        return l1131;
    }

    public void setL1131(String l1131) {
        this.l1131 = l1131;
        notifyPropertyChanged(BR.l1131);
    }

    @Bindable
    public String getL1132() {
        return l1132;
    }

    public void setL1132(String l1132) {
        this.l1132 = l1132;
        notifyPropertyChanged(BR.l1132);
    }

    @Bindable
    public String getL1133() {
        return l1133;
    }

    public void setL1133(String l1133) {
        this.l1133 = l1133;
        notifyPropertyChanged(BR.l1133);
    }

    @Bindable
    public String getL1134() {
        return l1134;
    }

    public void setL1134(String l1134) {
        this.l1134 = l1134;
        notifyPropertyChanged(BR.l1134);
    }

    @Bindable
    public String getL114() {
        return l114;
    }

    public void setL114(String l114) {
        this.l114 = l114;
        notifyPropertyChanged(BR.l114);
    }

    @Bindable
    public String getL11496x() {
        return l11496x;
    }

    public void setL11496x(String l11496x) {
        this.l11496x = l11496x;
        notifyPropertyChanged(BR.l11496x);
    }

    @Bindable
    public String getL115() {
        return l115;
    }

    public void setL115(String l115) {
        this.l115 = l115;
        notifyPropertyChanged(BR.l115);
    }

    @Bindable
    public String getL11596x() {
        return l11596x;
    }

    public void setL11596x(String l11596x) {
        this.l11596x = l11596x;
        notifyPropertyChanged(BR.l11596x);
    }

    @Bindable
    public String getL116() {
        return l116;
    }

    public void setL116(String l116) {
        this.l116 = l116;
        notifyPropertyChanged(BR.l116);
    }

    @Bindable
    public String getL11696x() {
        return l11696x;
    }

    public void setL11696x(String l11696x) {
        this.l11696x = l11696x;
        notifyPropertyChanged(BR.l11696x);
    }

    @Bindable
    public String getL117() {
        return l117;
    }

    public void setL117(String l117) {
        this.l117 = l117;
        notifyPropertyChanged(BR.l117);
    }

    @Bindable
    public String getL11796x() {
        return l11796x;
    }

    public void setL11796x(String l11796x) {
        this.l11796x = l11796x;
        notifyPropertyChanged(BR.l11796x);
    }


    public Forms Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_UID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_PROJECT_NAME));
        this.clusterCode = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_CLUSTER_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SYNC_DATE));

        sAHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SA)));
        sMHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SM)));
        sNHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SN)));
        sOHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SO)));
        sE2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(FormsTable.COLUMN_SE2)));
        return this;
    }

    public void sAHydrate(String string) throws JSONException {
        Log.d(TAG, "sAHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.a104 = json.getString("a104");
            this.a105 = json.getString("a105");
            this.a106 = json.getString("a106");
            this.a107 = json.getString("a107");
            this.a101 = json.getString("a101");
            this.a108 = json.getString("a108");
            this.a103 = json.getString("a103");
            this.a113 = json.getString("a113");
            this.a109 = json.getString("a109");
            this.a110 = json.getString("a110");
            this.a111 = json.getString("a111");
            this.a112 = json.getString("a112");
            this.a11201 = json.getString("a11201");
            this.a11201x = json.getString("a11201x");
            this.a11203 = json.getString("a11203");
            this.c101 = json.getString("c101");
            this.c102 = json.getString("c102");
            this.c103 = json.getString("c103");
        }
    }

    public void sE2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e116 = json.getString("e116");
            this.e117 = json.getString("e117");
        }
    }

    public void sMHydrate(String string) throws JSONException {
        Log.d(TAG, "sMHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.m101 = json.getString("m101");
            this.m102 = json.getString("m102");
            this.m103 = json.getString("m103");
            this.m104 = json.getString("m104");
            this.m105 = json.getString("m105");
            this.m106 = json.getString("m106");
            this.m1071 = json.getString("m1071");
            this.m1072 = json.getString("m1072");
            this.m1073 = json.getString("m1073");
            this.m1074 = json.getString("m1074");
            this.m1075 = json.getString("m1075");
            this.m1076 = json.getString("m1076");
            this.m1077 = json.getString("m1077");
            this.m1078 = json.getString("m1078");
            this.m1079 = json.getString("m1079");
            this.m018 = json.getString("m018");
            this.m109 = json.getString("m109");
            this.m110 = json.getString("m110");
            this.m11001x = json.getString("m11001x");
            this.m11002x = json.getString("m11002x");
            this.m111 = json.getString("m111");
            this.m112 = json.getString("m112");
            this.m11201 = json.getString("m11201");
            this.m11201x = json.getString("m11201x");
            this.m11202 = json.getString("m11202");
            this.m11202x = json.getString("m11202x");
            this.m11203 = json.getString("m11203");
            this.m11203x = json.getString("m11203x");
            this.m11204 = json.getString("m11204");
            this.m11204x = json.getString("m11204x");
            this.m11205 = json.getString("m11205");
            this.m11205x = json.getString("m11205x");
            this.m11206 = json.getString("m11206");
            this.m11206x = json.getString("m11206x");
            this.m11207 = json.getString("m11207");
            this.m11207x = json.getString("m11207x");
            this.m113 = json.getString("m113");
            this.m1141 = json.getString("m1141");
            this.m1142 = json.getString("m1142");
            this.m1143 = json.getString("m1143");
            this.m1144 = json.getString("m1144");
            this.m1145 = json.getString("m1145");
            this.m1146 = json.getString("m1146");
            this.m1147 = json.getString("m1147");
            this.m1148 = json.getString("m1148");
            this.m1149 = json.getString("m1149");
            this.m11410 = json.getString("m11410");
            this.m11411 = json.getString("m11411");
            this.m11412 = json.getString("m11412");
            this.m11413 = json.getString("m11413");
            this.m11414 = json.getString("m11414");
            this.m11415 = json.getString("m11415");
            this.m11416 = json.getString("m11416");
            this.m11417 = json.getString("m11417");
            this.m11418 = json.getString("m11418");
            this.m115 = json.getString("m115");
            this.m116 = json.getString("m116");
        }
    }

    public void sNHydrate(String string) throws JSONException {
        Log.d(TAG, "sNHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.n101 = json.getString("n101");
            this.n102 = json.getString("n102");
            this.n103 = json.getString("n103");
            this.n104 = json.getString("n104");
            this.n10401x = json.getString("n10401x");
            this.n105 = json.getString("n105");
            this.n106 = json.getString("n106");
            this.n107 = json.getString("n107");
            this.n108 = json.getString("n108");
            this.n109 = json.getString("n109");
            this.n10901 = json.getString("n10901");
            this.n10902 = json.getString("n10902");
            this.n10903 = json.getString("n10903");
            this.n10904 = json.getString("n10904");
            this.n10905 = json.getString("n10905");
            this.n10906 = json.getString("n10906");
            this.n10907 = json.getString("n10907");
            this.n110 = json.getString("n110");
            this.n111 = json.getString("n111");
            this.n112 = json.getString("n112");
            this.n113 = json.getString("n113");
            this.n11301x = json.getString("n11301x");
        }
    }

    public void sOHydrate(String string) throws JSONException {
        Log.d(TAG, "sOHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.o101 = json.getString("o101");
            this.o102 = json.getString("o102");
            this.o103 = json.getString("o103");
            this.o104 = json.getString("o104");
            this.o10401 = json.getString("o10401");
            this.o10402 = json.getString("o10402");
            this.o10403 = json.getString("o10403");
            this.o10404 = json.getString("o10404");
            this.o10497 = json.getString("o10497");
            this.o105 = json.getString("o105");
            this.o106 = json.getString("o106");
            this.o107 = json.getString("o107");
            this.o10701 = json.getString("o10701");
            this.o10702 = json.getString("o10702");
            this.o10703 = json.getString("o10703");
            this.o10704 = json.getString("o10704");
            this.o10797 = json.getString("o10797");
            this.o108 = json.getString("o108");
            this.o10896x = json.getString("o10896x");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(FormsTable.COLUMN_ID, this.id);
        json.put(FormsTable.COLUMN_UID, this.uid);
        json.put(FormsTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(FormsTable.COLUMN_CLUSTER_CODE, this.clusterCode);
        json.put(FormsTable.COLUMN_HHID, this.hhid);
        json.put(FormsTable.COLUMN_SNO, this.sno);
        json.put(FormsTable.COLUMN_USERNAME, this.userName);
        json.put(FormsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FormsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FormsTable.COLUMN_SYNCED, this.synced);
        json.put(FormsTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(FormsTable.COLUMN_APPVERSION, this.appver);
        json.put(FormsTable.COLUMN_SA, new JSONObject(sAtoString()));
        json.put(FormsTable.COLUMN_SM, new JSONObject(sMtoString()));
        json.put(FormsTable.COLUMN_SN, new JSONObject(sNtoString()));
        json.put(FormsTable.COLUMN_SO, new JSONObject(sOtoString()));
        json.put(FormsTable.COLUMN_SE2, new JSONObject(sE2toString()));
        return json;
    }

    public String sAtoString() throws JSONException {
        Log.d(TAG, "sAtoString: ");
        JSONObject json = new JSONObject();
        json.put("a104", a104)
                .put("a105", a105)
                .put("a106", a106)
                .put("a107", a107)
                .put("a101", a101)
                .put("a108", a108)
                .put("a103", a103)
                .put("a113", a113)
                .put("a109", a109)
                .put("a110", a110)
                .put("a111", a111)
                .put("a112", a112)
                .put("a11201", a11201)
                .put("a11201x", a11201x)
                .put("a11203", a11203)
                .put("c101", c101)
                .put("c102", c102)
                .put("c103", c103);
        return json.toString();
    }

    public String sE2toString() throws JSONException {
        Log.d(TAG, "sE2toString: ");
        JSONObject json = new JSONObject();
        json.put("e116", e116)
                .put("e117", e117);
        return json.toString();
    }

    public String sMtoString() throws JSONException {
        Log.d(TAG, "sMtoString: ");
        JSONObject json = new JSONObject();
        json.put("m101", m101)
                .put("m102", m102)
                .put("m103", m103)
                .put("m104", m104)
                .put("m105", m105)
                .put("m106", m106)
                .put("m1071", m1071)
                .put("m1072", m1072)
                .put("m1073", m1073)
                .put("m1074", m1074)
                .put("m1075", m1075)
                .put("m1076", m1076)
                .put("m1077", m1077)
                .put("m1078", m1078)
                .put("m1079", m1079)
                .put("m018", m018)
                .put("m109", m109)
                .put("m110", m110)
                .put("m11001x", m11001x)
                .put("m11002x", m11002x)
                .put("m111", m111)
                .put("m112", m112)
                .put("m11201", m11201)
                .put("m11201x", m11201x)
                .put("m11202", m11202)
                .put("m11202x", m11202x)
                .put("m11203", m11203)
                .put("m11203x", m11203x)
                .put("m11204", m11204)
                .put("m11204x", m11204x)
                .put("m11205", m11205)
                .put("m11205x", m11205x)
                .put("m11206", m11206)
                .put("m11206x", m11206x)
                .put("m11207", m11207)
                .put("m11207x", m11207x)
                .put("m113", m113)
                .put("m1141", m1141)
                .put("m1142", m1142)
                .put("m1143", m1143)
                .put("m1144", m1144)
                .put("m1145", m1145)
                .put("m1146", m1146)
                .put("m1147", m1147)
                .put("m1148", m1148)
                .put("m1149", m1149)
                .put("m11410", m11410)
                .put("m11411", m11411)
                .put("m11412", m11412)
                .put("m11413", m11413)
                .put("m11414", m11414)
                .put("m11415", m11415)
                .put("m11416", m11416)
                .put("m11417", m11417)
                .put("m11418", m11418)
                .put("m115", m115)
                .put("m116", m116);
        return json.toString();
    }

    public String sNtoString() throws JSONException {
        Log.d(TAG, "sNtoString: ");
        JSONObject json = new JSONObject();
        json.put("n101", n101)
                .put("n102", n102)
                .put("n103", n103)
                .put("n104", n104)
                .put("n10401x", n10401x)
                .put("n105", n105)
                .put("n106", n106)
                .put("n107", n107)
                .put("n108", n108)
                .put("n109", n109)
                .put("n10901", n10901)
                .put("n10902", n10902)
                .put("n10903", n10903)
                .put("n10904", n10904)
                .put("n10905", n10905)
                .put("n10906", n10906)
                .put("n10907", n10907)
                .put("n110", n110)
                .put("n111", n111)
                .put("n112", n112)
                .put("n113", n113)
                .put("n11301x", n11301x);
        return json.toString();
    }

    public String sOtoString() throws JSONException {
        Log.d(TAG, "sOtoString: ");
        JSONObject json = new JSONObject();
        json.put("o101", o101)
                .put("o101", o101)
                .put("o102", o102)
                .put("o103", o103)
                .put("o104", o104)
                .put("o10401", o10401)
                .put("o10402", o10402)
                .put("o10403", o10403)
                .put("o10404", o10404)
                .put("o10497", o10497)
                .put("o105", o105)
                .put("o106", o106)
                .put("o107", o107)
                .put("o10701", o10701)
                .put("o10702", o10702)
                .put("o10703", o10703)
                .put("o10704", o10704)
                .put("o10797", o10797)
                .put("o108", o108)
                .put("o10896x", o10896x);
        return json.toString();
    }

}