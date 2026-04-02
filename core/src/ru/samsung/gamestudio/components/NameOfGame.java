package ru.samsung.gamestudio.components;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import ru.samsung.gamestudio.MyGdxGame;

public class NameOfGame {
    int x;
    int y;

    MyGdxGame texture;
    BitmapFont font;

    int textWidth, textHeight;

    public NameOfGame(int x, int y) {
        font = new BitmapFont();
        font.getData().scale(5f);
        font.setColor(Color.WHITE);

        GlyphLayout gl = new GlyphLayout();
        textWidth = (int) gl.width;
        textHeight = (int) gl.height;
        this.x = x;
        this.y = y;
    }

    public void draw(Batch batch) {
        font.draw(batch, " Flappy Bird ", x, y);
    }

    public void dispose() {
        texture.dispose();
        font.dispose();
    }
}
