package edu.aku.hassannaqvi.smkHhMl2022.ui.sections;

import static edu.aku.hassannaqvi.smkHhMl2022.core.MainApp.familyList;
import static edu.aku.hassannaqvi.smkHhMl2022.core.MainApp.selectedMWRA;

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
import edu.aku.hassannaqvi.smkHhMl2022.databinding.ActivitySectionH1bBinding;
import edu.aku.hassannaqvi.smkHhMl2022.ui.EndingActivity;


public class SectionH1BActivity extends AppCompatActivity {

    private static final String TAG = "SectionH1BActivity";
    ActivitySectionH1bBinding bi;
    int childAge;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeSindhi : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h1b);
        bi.setMwra(MainApp.mwra);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        /*String childName = MainApp.familyList.get(Integer.parseInt(selectedChild) - 1).getD102();
        String h125 = getString(R.string.h125, "SAJID");
        bi.tvh125.setText(getString(R.string.h125, "SAJID"));
        String h1t05 = getString(R.string.h1t05, MainApp.selectedChildName);
        bi.tvh1t05.setText(h1t05);
        String h126 = getString(R.string.h126, MainApp.selectedChildName);
        bi.tvh126.setText(h126);*/

        bi.sno.setText(familyList.get(Integer.parseInt(selectedMWRA) - 1).getD101());
        bi.name.setText(familyList.get(Integer.parseInt(selectedMWRA) - 1).getD102());
        bi.index.setText(familyList.get(Integer.parseInt(selectedMWRA) - 1).getIndexed());
    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;
        int updcount = 0;
        try {
            updcount = db.updatesMWRAColumn(TableContracts.MwraTable.COLUMN_SH1B, MainApp.mwra.sH1BtoString());
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
            startActivity(new Intent(this, SectionH2Activity.class).putExtra("complete", true));
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