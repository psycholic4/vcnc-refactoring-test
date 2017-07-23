package kr.co.vcnc.android.sample.database

import android.content.Context
import kr.co.vcnc.android.sample.model.DaoMaster
import org.greenrobot.greendao.database.Database

class GreenDaoOpenHelper(context: Context, name: String) : DaoMaster.OpenHelper(context, name) {
    override fun onCreate(db: Database?) {
        super.onCreate(db)
    }

    override fun onUpgrade(db: Database?, oldVersion: Int, newVersion: Int) {
        DaoMaster.dropAllTables(db, true);
        onCreate(db)
    }
}