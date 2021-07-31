package com.codehunter.mygdx.game;

import com.badlogic.gdx.Game;
import com.codehunter.mygdx.game.screens.MainGameScreen;

/**
 * @author codehunter
 */
public class BloodBourneGame extends Game {
    public static final MainGameScreen _mainGameScreen = new MainGameScreen();

    @Override
    public void create() {
        setScreen(_mainGameScreen);
    }

    @Override
    public void dispose() {
        _mainGameScreen.dispose();
    }
}
