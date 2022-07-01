del mccp2-gadap.db
adb -d shell "run-as edu.aku.hassannaqvi.smk_hh_midline2022 cat /data/data/edu.aku.hassannaqvi.smk_hh_midline2022/databases/smk_hh_midline2022.db > /sdcard/smk_hh_midline2022.db"
adb pull /sdcard/smk_hh_midline2022.db.db
"C:\Program Files\Google\Chrome\Application\chrome.exe"  --profile-directory=Default --app-id=bponbdjkefbmgkfiiphhabghkkfocook
@echo Databased Pulled!
