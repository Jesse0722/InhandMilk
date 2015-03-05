package milk.inhand.com.inhandmilk.helper;

import android.content.Context;

import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;

import milk.inhand.com.inhandmilk.entity.OneDay;

/**
 * LeanCloudHelper
 * Desc:LeanCloud帮助类
 * Team: InHand
 * User:Wooxxx
 * Date: 2015-03-03
 * Time: 12:49
 */
public class LeanCloudHelper {
    /**
     * 初始化LeanCloud配置
     * @param ctx 上下文环境
     */
    public static void initLeanCloud(Context ctx){
        // 注册子类
        registerSubclass();
        AVOSCloud.initialize(ctx, "5dwer2xd20x59apeyfuq2bv5scn14078k0bzwqk6lnho6417", "65z49j48dcr57bplz9ecqlp3b8n8eq30sbkhpdawilg0z5q7");
        AVOSCloud.setDebugLogEnabled(true);
    }

    private static void registerSubclass(){
        AVObject.registerSubclass(OneDay.class);
    }
    /**
     * 与leancloud数据同步
     */
    public static void sync(){

    }

    private void save(){

    }

    private void update(){

    }
}
