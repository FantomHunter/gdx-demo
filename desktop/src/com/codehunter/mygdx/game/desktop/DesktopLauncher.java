package com.codehunter.mygdx.game.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.codehunter.mygdx.game.BloodBourneGame;
import com.codehunter.mygdx.game.Box2DDemo;
import com.codehunter.mygdx.game.MyGdxGame;
import com.codehunter.mygdx.game.OrthographicCameraExample;

public class DesktopLauncher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
//		new Lwjgl3Application(new MyGdxGame(), config);
//		new Lwjgl3Application(new OrthographicCameraExample(), config);
//		new Lwjgl3Application(new Box2DDemo(), config);
        config.setTitle("BloodBourne");
        config.setWindowedMode(800, 600);
        Application app = new Lwjgl3Application(new BloodBourneGame(), config);
        Gdx.app = app;
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
    }
}
