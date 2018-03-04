package cf.android666.wanandroid.base

import android.app.Application
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger



/**
 * Created by jixiaoyong on 2018/2/28.
 */
class BaseApplication:Application(){

    override fun onCreate() {
        super.onCreate()
        Logger.addLogAdapter(AndroidLogAdapter())
    }
}