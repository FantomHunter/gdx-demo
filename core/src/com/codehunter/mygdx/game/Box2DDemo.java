package com.codehunter.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.codehunter.mygdx.game.model.B2dModel;

/**
 * @author codehunter
 */
public class Box2DDemo extends ApplicationAdapter {
    //    World world;
    Box2DDebugRenderer debugRenderer;
    OrthographicCamera camera;
    B2dModel model;

    @Override
    public void create() {
//        world = new World(new Vector2(0, 0), true);
        model = new B2dModel();
        camera = new OrthographicCamera(32, 24);
        debugRenderer = new Box2DDebugRenderer();


    }

    @Override
    public void render() {
//        world.step(1 / 60f, 6, 2);
        model.logicStep(1 / 60f);
        Gdx.gl.glClearColor(0f, 0f, 0f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        debugRenderer.render(model.world, camera.combined);
    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
