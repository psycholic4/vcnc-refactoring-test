package kr.co.vcnc.android.sample.database

import android.content.Context
import android.util.Log
import io.reactivex.functions.Consumer
import io.reactivex.functions.Function
import kr.co.vcnc.android.sample.model.DaoMaster
import kr.co.vcnc.android.sample.model.DaoSession
import org.greenrobot.greendao.database.Database

class GreenSession(val context: Context, db: Database, val databaseObservables: DatabaseObservables) {
    private val daoSession: DaoSession = DaoMaster(db).newSession()

    fun transaction(action: Consumer<DaoSession>, vararg databaseTypes: DatabaseType) {
        try {
            daoSession.runInTx { action.accept(daoSession) }
            databaseObservables.notify(*databaseTypes)
        } catch (e: Exception) {
            Log.e("fuck", e.message, e)
        }
    }

    fun <V> query(callable: Function<DaoSession, V>): V? {
        try {
            return daoSession.callInTx { callable.apply(daoSession) }
        } catch (e: Exception) {
            Log.e("fuck", e.message, e)
            return null
        }
    }
}