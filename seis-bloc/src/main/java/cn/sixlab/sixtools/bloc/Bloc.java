/**
 * @Copyright © Sixlab 2015
 * @author 六楼的雨/loki
 * @email <nianqinianyi@163.com>
 */
package cn.sixlab.sixtools.bloc;

import cn.sixlab.sixtools.comun.util.A;
import cn.sixlab.sixtools.comun.util.C;
import cn.sixlab.sixtools.comun.base.BaseMain;

/**
 * TODO
 *
 * @author 六楼的雨/loki
 * @date 2015/6/25 15:58
 */
public class Bloc extends BaseMain {

    public static void main(String[] args) {
        title = "Six Bloc : " + A.get();
        C.implicitExit = true;
        launch(args);
    }

}