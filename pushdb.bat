adb push smk_hh_midline2022.db.db /sdcard/smk_hh_midline2022.db.db
adb shell "run-as edu.aku.hassannaqvi.smk_hh_midline2022 chmod 666 /data/data/edu.aku.hassannaqvi.smk_hh_midline2022/databases/smk_hh_midline2022.db
adb shell rm /data/data/edu.aku.hassannaqvi.smk_hh_midline2022/databases/smk_hh_midline2022.db
adb -d shell "run-as edu.aku.hassannaqvi.smk_hh_midline2022 cat /sdcard/smk_hh_midline2022.db > /data/data/edu.aku.hassannaqvi.smk_hh_midline2022/databases/smk_hh_midline2022.db
adb shell "run-as edu.aku.hassannaqvi.smk_hh_midline2022 chmod 600 /data/data/edu.aku.hassannaqvi.smk_hh_midline2022/databases/smk_hh_midline2022.db
@echo Databased Pulled!