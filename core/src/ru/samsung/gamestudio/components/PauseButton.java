package ru.samsung.gamestudio.components;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class PauseButton {

    Texture texture;

    int x, y;
    int buttonWidth, buttonHeight;

    public PauseButton(int x, int y) {
        this.x = x;
        this.y = y;

        texture = new Texture("pause_264.png");
    }

    public void draw(Batch batch) {
        batch.draw(texture, x, y, buttonWidth, buttonHeight );
    }

    public void dispose() {
        texture.dispose();
    }
}

