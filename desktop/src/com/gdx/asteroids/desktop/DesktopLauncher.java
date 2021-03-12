package com.gdx.asteroids.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.gdx.asteroids.Asteroids;
import com.gdx.asteroids.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Asteroids";
		config.width = 800;
		config.height = 600;
		config.foregroundFPS = 60;
		config.vSyncEnabled = true;
		config.resizable = false;

		new LwjglApplication(new Game(), config);
	}
}
