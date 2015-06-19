/**
 * @Copyright © Sixlab 2015
 * @author 六楼的雨/loki
 * @email <nianqinianyi@163.com>
 */
package cn.sixlab.sixtools.seis;

import cn.sixlab.sixtools.punto.PuntoTask;
import javafx.application.Application;
import javafx.stage.Stage;


/**
 * Seis main方法,启动所有定时器,初始化右下角界面.
 *
 * @author 六楼的雨/loki
 * @date 2015/4/14 12:21
 */
public class Seis extends Application {

    public static void main(String[] args) {
        startTimers();
        (new SeisTrayService()).initTray();
        launch(args);
    }

    private static void startTimers() {
        PuntoTask.startTask();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setOnCloseRequest(e -> {
            primaryStage.hide();
        });
    }
}
