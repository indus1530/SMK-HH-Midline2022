package edu.aku.hassannaqvi.smkHhMl2022.ui.sections;

import static edu.aku.hassannaqvi.smkHhMl2022.core.MainApp.familyList;
import static edu.aku.hassannaqvi.smkHhMl2022.core.MainApp.indexedPreg;
import static edu.aku.hassannaqvi.smkHhMl2022.core.MainApp.selectedChild;
import static edu.aku.hassannaqvi.smkHhMl2022.core.MainApp.selectedMWRA;
import static edu.aku.hassannaqvi.smkHhMl2022.core.MainApp.sharedPref;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.smkHhMl2022.R;
import edu.aku.hassannaqvi.smkHhMl2022.contracts.TableContracts;
import edu.aku.hassannaqvi.smkHhMl2022.core.MainApp;
import edu.aku.hassannaqvi.smkHhMl2022.database.DatabaseHelper;
import edu.aku.hassannaqvi.smkHhMl2022.databinding.ActivitySectionF2Binding;
import edu.aku.hassannaqvi.smkHhMl2022.ui.EndingActivity;

public class SectionF2Activity extends AppCompatActivity {

    private static final String TAG = "SectionF2Activity";
    ActivitySectionF2Binding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("2") ? R.style.AppThemeSindhi : sharedPref.getString("lang", "0").equals("1") ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f2);
        setSupportActionBar(bi.toolbar);
        if (indexedPreg.equals("1")) bi.toolbar.setTitle("MWRA Pregnant");
        if (!MainApp.selectedChild.isEmpty()) bi.toolbar.setTitle("MWRA with Child");
        if (indexedPreg.equals("1") && !MainApp.selectedChild.isEmpty())
            bi.toolbar.setTitle("MWRA Pregnant & Child");
        db = MainApp.appInfo.dbHelper;

        bi.sno.setText(familyList.get(Integer.parseInt(selectedMWRA) - 1).getD101());
        bi.name.setText(familyList.get(Integer.parseInt(selectedMWRA) - 1).getD102());
        bi.index.setText(familyList.get(Integer.parseInt(selectedMWRA) - 1).getIndexed());
        bi.setMwra(MainApp.mwra);
    }



    private boolean updateDB() {
        if (MainApp.superuser) return true;
        int updcount = 0;
        try {
            updcount = db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_SF2, MainApp.mwra.sF2toString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (updateDB()) {
            finish();
            if (!selectedChild.isEmpty()) {
                startActivity(new Intent(this, SectionGActivity.class));
            } else {
                startActivity(new Intent(this, SectionKActivity.class));
            }
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        setResult(RESULT_CANCELED);
    }
}